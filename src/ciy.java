import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ciy {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<cix> b = new Short2ObjectOpenHashMap();
   private final Map<jf<ciz>, Set<cix>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public ciy(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   ciy(Runnable $$0, boolean $$1, List<cix> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public ciy.a a() {
      return new ciy.a(this.e, this.b.values().stream().map(cix::a).toList());
   }

   public Stream<cix> a(Predicate<jf<ciz>> $$0, ciw.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((jf<ciz>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(iv $$0, jf<ciz> $$1) {
      if (this.a(new cix($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.g(), $$0);
         this.d.run();
      }
   }

   private boolean a(cix $$0) {
      iv $$1 = $$0.g();
      jf<ciz> $$2 = $$0.h();
      short $$3 = jy.b($$1);
      cix $$4 = (cix)this.b.get($$3);
      if ($$4 != null) {
         if ($$2.equals($$4.h())) {
            return false;
         }

         ag.b("POI data mismatch: already registered at " + $$1);
      }

      this.b.put($$3, $$0);
      this.c.computeIfAbsent($$2, $$0x -> Sets.newHashSet()).add($$0);
      return true;
   }

   public void a(iv $$0) {
      cix $$1 = (cix)this.b.remove(jy.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.h()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::h), LogUtils.defer($$1::g));
         this.d.run();
      }
   }

   @Deprecated
   @bax
   public int b(iv $$0) {
      return this.e($$0).map(cix::b).orElse(0);
   }

   public boolean c(iv $$0) {
      cix $$1 = (cix)this.b.get(jy.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)ag.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.d();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(iv $$0, Predicate<jf<ciz>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<jf<ciz>> d(iv $$0) {
      return this.e($$0).map(cix::h);
   }

   private Optional<cix> e(iv $$0) {
      return Optional.ofNullable((cix)this.b.get(jy.b($$0)));
   }

   public void a(Consumer<BiConsumer<iv, jf<ciz>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<cix> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.c();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = jy.b($$1x);
            cix $$4 = (cix)$$1.computeIfAbsent($$3, $$2x -> new cix($$1x, $$2, this.d));
            this.a($$4);
         });
         this.e = true;
         this.d.run();
      }
   }

   private void c() {
      this.b.clear();
      this.c.clear();
   }

   boolean b() {
      return this.e;
   }

   public static record a(boolean b, List<cix.a> c) {
      public static final Codec<ciy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.BOOL.lenientOptionalFieldOf("Valid", false).forGetter(ciy.a::a), cix.a.a.listOf().fieldOf("Records").forGetter(ciy.a::b))
               .apply($$0, ciy.a::new)
      );

      public ciy a(Runnable $$0) {
         return new ciy($$0, this.b, this.c.stream().map($$1 -> $$1.a($$0)).toList());
      }

      public boolean a() {
         return this.b;
      }

      public List<cix.a> b() {
         return this.c;
      }
   }
}

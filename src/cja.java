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

public class cja {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<ciz> b = new Short2ObjectOpenHashMap();
   private final Map<jg<cjb>, Set<ciz>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public cja(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   cja(Runnable $$0, boolean $$1, List<ciz> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public cja.a a() {
      return new cja.a(this.e, this.b.values().stream().map(ciz::a).toList());
   }

   public Stream<ciz> a(Predicate<jg<cjb>> $$0, ciy.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((jg<cjb>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(iw $$0, jg<cjb> $$1) {
      if (this.a(new ciz($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.g(), $$0);
         this.d.run();
      }
   }

   private boolean a(ciz $$0) {
      iw $$1 = $$0.g();
      jg<cjb> $$2 = $$0.h();
      short $$3 = jz.b($$1);
      ciz $$4 = (ciz)this.b.get($$3);
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

   public void a(iw $$0) {
      ciz $$1 = (ciz)this.b.remove(jz.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.h()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::h), LogUtils.defer($$1::g));
         this.d.run();
      }
   }

   @Deprecated
   @baz
   public int b(iw $$0) {
      return this.e($$0).map(ciz::b).orElse(0);
   }

   public boolean c(iw $$0) {
      ciz $$1 = (ciz)this.b.get(jz.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)ag.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.d();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(iw $$0, Predicate<jg<cjb>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<jg<cjb>> d(iw $$0) {
      return this.e($$0).map(ciz::h);
   }

   private Optional<ciz> e(iw $$0) {
      return Optional.ofNullable((ciz)this.b.get(jz.b($$0)));
   }

   public void a(Consumer<BiConsumer<iw, jg<cjb>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<ciz> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.c();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = jz.b($$1x);
            ciz $$4 = (ciz)$$1.computeIfAbsent($$3, $$2x -> new ciz($$1x, $$2, this.d));
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

   public static record a(boolean b, List<ciz.a> c) {
      public static final Codec<cja.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.BOOL.lenientOptionalFieldOf("Valid", false).forGetter(cja.a::a), ciz.a.a.listOf().fieldOf("Records").forGetter(cja.a::b))
               .apply($$0, cja.a::new)
      );

      public cja a(Runnable $$0) {
         return new cja($$0, this.b, this.c.stream().map($$1 -> $$1.a($$0)).toList());
      }

      public boolean a() {
         return this.b;
      }

      public List<ciz.a> b() {
         return this.c;
      }
   }
}

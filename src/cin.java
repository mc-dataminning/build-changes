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

public class cin {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<cim> b = new Short2ObjectOpenHashMap();
   private final Map<jf<cio>, Set<cim>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public cin(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   cin(Runnable $$0, boolean $$1, List<cim> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public cin.a a() {
      return new cin.a(this.e, this.b.values().stream().map(cim::a).toList());
   }

   public Stream<cim> a(Predicate<jf<cio>> $$0, cil.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((jf<cio>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(iv $$0, jf<cio> $$1) {
      if (this.a(new cim($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.g(), $$0);
         this.d.run();
      }
   }

   private boolean a(cim $$0) {
      iv $$1 = $$0.g();
      jf<cio> $$2 = $$0.h();
      short $$3 = jy.b($$1);
      cim $$4 = (cim)this.b.get($$3);
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
      cim $$1 = (cim)this.b.remove(jy.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.h()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::h), LogUtils.defer($$1::g));
         this.d.run();
      }
   }

   @Deprecated
   @bav
   public int b(iv $$0) {
      return this.e($$0).map(cim::b).orElse(0);
   }

   public boolean c(iv $$0) {
      cim $$1 = (cim)this.b.get(jy.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)ag.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.d();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(iv $$0, Predicate<jf<cio>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<jf<cio>> d(iv $$0) {
      return this.e($$0).map(cim::h);
   }

   private Optional<cim> e(iv $$0) {
      return Optional.ofNullable((cim)this.b.get(jy.b($$0)));
   }

   public void a(Consumer<BiConsumer<iv, jf<cio>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<cim> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.c();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = jy.b($$1x);
            cim $$4 = (cim)$$1.computeIfAbsent($$3, $$2x -> new cim($$1x, $$2, this.d));
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

   public static record a(boolean b, List<cim.a> c) {
      public static final Codec<cin.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.BOOL.lenientOptionalFieldOf("Valid", false).forGetter(cin.a::a), cim.a.a.listOf().fieldOf("Records").forGetter(cin.a::b))
               .apply($$0, cin.a::new)
      );

      public cin a(Runnable $$0) {
         return new cin($$0, this.b, this.c.stream().map($$1 -> $$1.a($$0)).toList());
      }

      public boolean a() {
         return this.b;
      }

      public List<cim.a> b() {
         return this.c;
      }
   }
}

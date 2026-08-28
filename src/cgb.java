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

public class cgb {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<cga> b = new Short2ObjectOpenHashMap();
   private final Map<jp<cgc>, Set<cga>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public cgb(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   cgb(Runnable $$0, boolean $$1, List<cga> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public cgb.a a() {
      return new cgb.a(this.e, this.b.values().stream().map(cga::a).toList());
   }

   public Stream<cga> a(Predicate<jp<cgc>> $$0, cfz.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((jp<cgc>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(jg $$0, jp<cgc> $$1) {
      if (this.a(new cga($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.g(), $$0);
         this.d.run();
      }
   }

   private boolean a(cga $$0) {
      jg $$1 = $$0.g();
      jp<cgc> $$2 = $$0.h();
      short $$3 = ki.b($$1);
      cga $$4 = (cga)this.b.get($$3);
      if ($$4 != null) {
         if ($$2.equals($$4.h())) {
            return false;
         }

         ad.b("POI data mismatch: already registered at " + $$1);
      }

      this.b.put($$3, $$0);
      this.c.computeIfAbsent($$2, $$0x -> Sets.newHashSet()).add($$0);
      return true;
   }

   public void a(jg $$0) {
      cga $$1 = (cga)this.b.remove(ki.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.h()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::h), LogUtils.defer($$1::g));
         this.d.run();
      }
   }

   @Deprecated
   @bap
   public int b(jg $$0) {
      return this.e($$0).map(cga::b).orElse(0);
   }

   public boolean c(jg $$0) {
      cga $$1 = (cga)this.b.get(ki.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)ad.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.d();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(jg $$0, Predicate<jp<cgc>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<jp<cgc>> d(jg $$0) {
      return this.e($$0).map(cga::h);
   }

   private Optional<cga> e(jg $$0) {
      return Optional.ofNullable((cga)this.b.get(ki.b($$0)));
   }

   public void a(Consumer<BiConsumer<jg, jp<cgc>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<cga> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.c();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = ki.b($$1x);
            cga $$4 = (cga)$$1.computeIfAbsent($$3, $$2x -> new cga($$1x, $$2, this.d));
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

   public static record a(boolean b, List<cga.a> c) {
      public static final Codec<cgb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.BOOL.lenientOptionalFieldOf("Valid", false).forGetter(cgb.a::a), cga.a.a.listOf().fieldOf("Records").forGetter(cgb.a::b))
               .apply($$0, cgb.a::new)
      );

      public cgb a(Runnable $$0) {
         return new cgb($$0, this.b, this.c.stream().map($$1 -> $$1.a($$0)).toList());
      }

      public boolean a() {
         return this.b;
      }

      public List<cga.a> b() {
         return this.c;
      }
   }
}

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eko {
   public static final Codec<eko> a = lu.R.q().dispatch(eko::e, ekx::codec);
   public static final Codec<jn<eko>> b = akx.a(lv.aR, a);
   protected final eko.c c;

   public static <S extends eko> RecordCodecBuilder<S, eko.c> a(Instance<S> $$0) {
      return eko.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eko> MapCodec<S> a(Function<eko.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eko(eko.c $$0) {
      this.c = $$0;
   }

   public jr<det> a() {
      return this.c.b;
   }

   public Map<bui, ekv> b() {
      return this.c.c;
   }

   public dzs.a c() {
      return this.c.d;
   }

   public ekz d() {
      return this.c.e;
   }

   public ekg a(ekg $$0) {
      return this.d() != ekz.a ? $$0.a(12) : $$0;
   }

   public ekw a(kb $$0, dvx $$1, dex $$2, eak $$3, eor $$4, long $$5, dcy $$6, int $$7, ddu $$8, Predicate<jn<det>> $$9) {
      eko.a $$10 = new eko.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<eko.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         elg $$12 = $$11.get().a();
         ekw $$13 = new ekw(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return ekw.b;
   }

   protected static Optional<eko.b> a(eko.a $$0, dzw.a $$1, Consumer<elg> $$2) {
      dcy $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eko.b(new je($$4, $$6, $$5), $$2));
   }

   private static boolean a(eko.b $$0, eko.a $$1) {
      je $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jy.a($$2.u()), jy.a($$2.v()), jy.a($$2.w()), $$1.d.b()));
   }

   public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, eld $$6) {
   }

   private static int[] c(eko.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dvx $$5 = $$0.b();
      ddu $$6 = $$0.i();
      eak $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dzw.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dzw.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dzw.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dzw.a.a, $$6, $$7)
      };
   }

   public static int a(eko.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(eko.a $$0, int $$1, int $$2) {
      dcy $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(eko.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected je a(eko.a $$0, dnj $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dnj.b) {
         $$2 = -5;
      } else if ($$1 == dnj.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dnj.d) {
         $$3 = -5;
      }

      dcy $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new je($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eko.b> a(eko.a var1);

   public Optional<eko.b> b(eko.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract ekx<?> e();

   public static record a(kb a, dvx b, dex c, eak d, eor e, eav f, long g, dcy h, ddu i, Predicate<jn<det>> j) {

      public a(kb $$0, dvx $$1, dex $$2, eak $$3, eor $$4, long $$5, dcy $$6, ddu $$7, Predicate<jn<det>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static eav a(long $$0, dcy $$1) {
         eav $$2 = new eav(new dzx(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(je a, Either<Consumer<elg>, elg> b) {
      public b(je $$0, Consumer<elg> $$1) {
         this($$0, Either.left($$1));
      }

      public elg a() {
         return (elg)this.b.map($$0 -> {
            elg $$1 = new elg();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public je b() {
         return this.a;
      }

      public Either<Consumer<elg>, elg> c() {
         return this.b;
      }
   }

   public static record c(jr<det> b, Map<bui, ekv> c, dzs.a d, ekz e) {
      static final eko.c f = new eko.c(jr.a(), Map.of(), dzs.a.e, ekz.a);
      public static final MapCodec<eko.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kc.a(lv.aF).fieldOf("biomes").forGetter(eko.c::a),
                  Codec.simpleMap(bui.i, ekv.a, azy.a(bui.values())).fieldOf("spawn_overrides").forGetter(eko.c::b),
                  dzs.a.l.fieldOf("step").forGetter(eko.c::c),
                  ekz.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(eko.c::d)
               )
               .apply($$0, eko.c::new)
      );

      public c(jr<det> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public jr<det> a() {
         return this.b;
      }

      public Map<bui, ekv> b() {
         return this.c;
      }

      public dzs.a c() {
         return this.d;
      }

      public ekz d() {
         return this.e;
      }

      public static class a {
         private final jr<det> a;
         private Map<bui, ekv> b = eko.c.f.c;
         private dzs.a c = eko.c.f.d;
         private ekz d = eko.c.f.e;

         public a(jr<det> $$0) {
            this.a = $$0;
         }

         public eko.c.a a(Map<bui, ekv> $$0) {
            this.b = $$0;
            return this;
         }

         public eko.c.a a(dzs.a $$0) {
            this.c = $$0;
            return this;
         }

         public eko.c.a a(ekz $$0) {
            this.d = $$0;
            return this;
         }

         public eko.c a() {
            return new eko.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}

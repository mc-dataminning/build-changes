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

public abstract class ejr {
   public static final Codec<ejr> a = lt.R.r().dispatch(ejr::e, eka::codec);
   public static final Codec<jm<ejr>> b = akn.a(lu.aR, a);
   protected final ejr.c c;

   public static <S extends ejr> RecordCodecBuilder<S, ejr.c> a(Instance<S> $$0) {
      return ejr.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends ejr> MapCodec<S> a(Function<ejr.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected ejr(ejr.c $$0) {
      this.c = $$0;
   }

   public jq<ddw> a() {
      return this.c.b;
   }

   public Map<btq, ejy> b() {
      return this.c.c;
   }

   public dyu.b c() {
      return this.c.d;
   }

   public ekc d() {
      return this.c.e;
   }

   public ejj a(ejj $$0) {
      return this.d() != ekc.a ? $$0.a(12) : $$0;
   }

   public ejz a(ka $$0, duz $$1, dea $$2, dzm $$3, enu $$4, long $$5, dcd $$6, int $$7, dcy $$8, Predicate<jm<ddw>> $$9) {
      ejr.a $$10 = new ejr.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<ejr.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         ekj $$12 = $$11.get().a();
         ejz $$13 = new ejz(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return ejz.b;
   }

   protected static Optional<ejr.b> a(ejr.a $$0, dyy.a $$1, Consumer<ekj> $$2) {
      dcd $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new ejr.b(new jd($$4, $$6, $$5), $$2));
   }

   private static boolean a(ejr.b $$0, ejr.a $$1) {
      jd $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jx.a($$2.u()), jx.a($$2.v()), jx.a($$2.w()), $$1.d.b()));
   }

   public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, ekg $$6) {
   }

   private static int[] c(ejr.a $$0, int $$1, int $$2, int $$3, int $$4) {
      duz $$5 = $$0.b();
      dcy $$6 = $$0.i();
      dzm $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dyy.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dyy.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dyy.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dyy.a.a, $$6, $$7)
      };
   }

   public static int a(ejr.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(ejr.a $$0, int $$1, int $$2) {
      dcd $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(ejr.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected jd a(ejr.a $$0, dmm $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dmm.b) {
         $$2 = -5;
      } else if ($$1 == dmm.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dmm.d) {
         $$3 = -5;
      }

      dcd $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new jd($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<ejr.b> a(ejr.a var1);

   public Optional<ejr.b> b(ejr.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract eka<?> e();

   public static record a(ka a, duz b, dea c, dzm d, enu e, dzx f, long g, dcd h, dcy i, Predicate<jm<ddw>> j) {

      public a(ka $$0, duz $$1, dea $$2, dzm $$3, enu $$4, long $$5, dcd $$6, dcy $$7, Predicate<jm<ddw>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dzx a(long $$0, dcd $$1) {
         dzx $$2 = new dzx(new dyz(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(jd a, Either<Consumer<ekj>, ekj> b) {
      public b(jd $$0, Consumer<ekj> $$1) {
         this($$0, Either.left($$1));
      }

      public ekj a() {
         return (ekj)this.b.map($$0 -> {
            ekj $$1 = new ekj();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public jd b() {
         return this.a;
      }

      public Either<Consumer<ekj>, ekj> c() {
         return this.b;
      }
   }

   public static record c(jq<ddw> b, Map<btq, ejy> c, dyu.b d, ekc e) {
      static final ejr.c f = new ejr.c(jq.a(), Map.of(), dyu.b.e, ekc.a);
      public static final MapCodec<ejr.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kb.a(lu.aF).fieldOf("biomes").forGetter(ejr.c::a),
                  Codec.simpleMap(btq.i, ejy.a, azk.a(btq.values())).fieldOf("spawn_overrides").forGetter(ejr.c::b),
                  dyu.b.l.fieldOf("step").forGetter(ejr.c::c),
                  ekc.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(ejr.c::d)
               )
               .apply($$0, ejr.c::new)
      );

      public c(jq<ddw> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public jq<ddw> a() {
         return this.b;
      }

      public Map<btq, ejy> b() {
         return this.c;
      }

      public dyu.b c() {
         return this.d;
      }

      public ekc d() {
         return this.e;
      }

      public static class a {
         private final jq<ddw> a;
         private Map<btq, ejy> b = ejr.c.f.c;
         private dyu.b c = ejr.c.f.d;
         private ekc d = ejr.c.f.e;

         public a(jq<ddw> $$0) {
            this.a = $$0;
         }

         public ejr.c.a a(Map<btq, ejy> $$0) {
            this.b = $$0;
            return this;
         }

         public ejr.c.a a(dyu.b $$0) {
            this.c = $$0;
            return this;
         }

         public ejr.c.a a(ekc $$0) {
            this.d = $$0;
            return this;
         }

         public ejr.c a() {
            return new ejr.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}

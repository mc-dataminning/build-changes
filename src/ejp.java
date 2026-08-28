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

public abstract class ejp {
   public static final Codec<ejp> a = lt.R.r().dispatch(ejp::e, ejy::codec);
   public static final Codec<jm<ejp>> b = akn.a(lu.aR, a);
   protected final ejp.c c;

   public static <S extends ejp> RecordCodecBuilder<S, ejp.c> a(Instance<S> $$0) {
      return ejp.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends ejp> MapCodec<S> a(Function<ejp.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected ejp(ejp.c $$0) {
      this.c = $$0;
   }

   public jq<ddw> a() {
      return this.c.b;
   }

   public Map<btq, ejw> b() {
      return this.c.c;
   }

   public dyu.b c() {
      return this.c.d;
   }

   public eka d() {
      return this.c.e;
   }

   public ejh a(ejh $$0) {
      return this.d() != eka.a ? $$0.a(12) : $$0;
   }

   public ejx a(ka $$0, duz $$1, dea $$2, dzm $$3, ens $$4, long $$5, dcd $$6, int $$7, dcy $$8, Predicate<jm<ddw>> $$9) {
      ejp.a $$10 = new ejp.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<ejp.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         ekh $$12 = $$11.get().a();
         ejx $$13 = new ejx(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return ejx.b;
   }

   protected static Optional<ejp.b> a(ejp.a $$0, dyy.a $$1, Consumer<ekh> $$2) {
      dcd $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new ejp.b(new jd($$4, $$6, $$5), $$2));
   }

   private static boolean a(ejp.b $$0, ejp.a $$1) {
      jd $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jx.a($$2.u()), jx.a($$2.v()), jx.a($$2.w()), $$1.d.b()));
   }

   public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5, eke $$6) {
   }

   private static int[] c(ejp.a $$0, int $$1, int $$2, int $$3, int $$4) {
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

   public static int a(ejp.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(ejp.a $$0, int $$1, int $$2) {
      dcd $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(ejp.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected jd a(ejp.a $$0, dmm $$1) {
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

   protected abstract Optional<ejp.b> a(ejp.a var1);

   public Optional<ejp.b> b(ejp.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract ejy<?> e();

   public static record a(ka a, duz b, dea c, dzm d, ens e, dzx f, long g, dcd h, dcy i, Predicate<jm<ddw>> j) {

      public a(ka $$0, duz $$1, dea $$2, dzm $$3, ens $$4, long $$5, dcd $$6, dcy $$7, Predicate<jm<ddw>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dzx a(long $$0, dcd $$1) {
         dzx $$2 = new dzx(new dyz(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(jd a, Either<Consumer<ekh>, ekh> b) {
      public b(jd $$0, Consumer<ekh> $$1) {
         this($$0, Either.left($$1));
      }

      public ekh a() {
         return (ekh)this.b.map($$0 -> {
            ekh $$1 = new ekh();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public jd b() {
         return this.a;
      }

      public Either<Consumer<ekh>, ekh> c() {
         return this.b;
      }
   }

   public static record c(jq<ddw> b, Map<btq, ejw> c, dyu.b d, eka e) {
      static final ejp.c f = new ejp.c(jq.a(), Map.of(), dyu.b.e, eka.a);
      public static final MapCodec<ejp.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kb.a(lu.aF).fieldOf("biomes").forGetter(ejp.c::a),
                  Codec.simpleMap(btq.i, ejw.a, azk.a(btq.values())).fieldOf("spawn_overrides").forGetter(ejp.c::b),
                  dyu.b.l.fieldOf("step").forGetter(ejp.c::c),
                  eka.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(ejp.c::d)
               )
               .apply($$0, ejp.c::new)
      );

      public c(jq<ddw> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public jq<ddw> a() {
         return this.b;
      }

      public Map<btq, ejw> b() {
         return this.c;
      }

      public dyu.b c() {
         return this.d;
      }

      public eka d() {
         return this.e;
      }

      public static class a {
         private final jq<ddw> a;
         private Map<btq, ejw> b = ejp.c.f.c;
         private dyu.b c = ejp.c.f.d;
         private eka d = ejp.c.f.e;

         public a(jq<ddw> $$0) {
            this.a = $$0;
         }

         public ejp.c.a a(Map<btq, ejw> $$0) {
            this.b = $$0;
            return this;
         }

         public ejp.c.a a(dyu.b $$0) {
            this.c = $$0;
            return this;
         }

         public ejp.c.a a(eka $$0) {
            this.d = $$0;
            return this;
         }

         public ejp.c a() {
            return new ejp.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}

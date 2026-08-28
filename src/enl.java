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

public abstract class enl {
   public static final Codec<enl> a = mb.R.q().dispatch(enl::e, enu::codec);
   public static final Codec<jr<enl>> b = akr.a(mc.aU, a);
   protected final enl.c c;

   public static <S extends enl> RecordCodecBuilder<S, enl.c> a(Instance<S> $$0) {
      return enl.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends enl> MapCodec<S> a(Function<enl.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected enl(enl.c $$0) {
      this.c = $$0;
   }

   public jv<dhj> a() {
      return this.c.b;
   }

   public Map<bvj, ens> b() {
      return this.c.c;
   }

   public ecn.a c() {
      return this.c.d;
   }

   public enw d() {
      return this.c.e;
   }

   public end a(end $$0) {
      return this.d() != enw.a ? $$0.a(12) : $$0;
   }

   public ent a(jr<enl> $$0, aku<dgh> $$1, kf $$2, dys $$3, dhn $$4, edf $$5, ero $$6, long $$7, dfn $$8, int $$9, dgj $$10, Predicate<jr<dhj>> $$11) {
      bpd $$12 = bpa.f.a($$8, $$1, $$0);
      enl.a $$13 = new enl.a($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10, $$11);
      Optional<enl.b> $$14 = this.b($$13);
      if ($$14.isPresent()) {
         eod $$15 = $$14.get().a();
         ent $$16 = new ent(this, $$8, $$9, $$15.a());
         if ($$16.b()) {
            if ($$12 != null) {
               $$12.finish(true);
            }

            return $$16;
         }
      }

      if ($$12 != null) {
         $$12.finish(false);
      }

      return ent.b;
   }

   protected static Optional<enl.b> a(enl.a $$0, ecr.a $$1, Consumer<eod> $$2) {
      dfn $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new enl.b(new ji($$4, $$6, $$5), $$2));
   }

   private static boolean a(enl.b $$0, enl.a $$1) {
      ji $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(kc.a($$2.u()), kc.a($$2.v()), kc.a($$2.w()), $$1.d.b()));
   }

   public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, eoa $$6) {
   }

   private static int[] c(enl.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dys $$5 = $$0.b();
      dgj $$6 = $$0.i();
      edf $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, ecr.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, ecr.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, ecr.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, ecr.a.a, $$6, $$7)
      };
   }

   public static int a(enl.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(enl.a $$0, int $$1, int $$2) {
      dfn $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(enl.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected ji a(enl.a $$0, dqd $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dqd.b) {
         $$2 = -5;
      } else if ($$1 == dqd.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dqd.d) {
         $$3 = -5;
      }

      dfn $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new ji($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<enl.b> a(enl.a var1);

   public Optional<enl.b> b(enl.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract enu<?> e();

   public static record a(kf a, dys b, dhn c, edf d, ero e, edq f, long g, dfn h, dgj i, Predicate<jr<dhj>> j) {

      public a(kf $$0, dys $$1, dhn $$2, edf $$3, ero $$4, long $$5, dfn $$6, dgj $$7, Predicate<jr<dhj>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static edq a(long $$0, dfn $$1) {
         edq $$2 = new edq(new ecs(0L));
         $$2.c($$0, $$1.h, $$1.i);
         return $$2;
      }
   }

   public static record b(ji a, Either<Consumer<eod>, eod> b) {
      public b(ji $$0, Consumer<eod> $$1) {
         this($$0, Either.left($$1));
      }

      public eod a() {
         return (eod)this.b.map($$0 -> {
            eod $$1 = new eod();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public ji b() {
         return this.a;
      }

      public Either<Consumer<eod>, eod> c() {
         return this.b;
      }
   }

   public static record c(jv<dhj> b, Map<bvj, ens> c, ecn.a d, enw e) {
      static final enl.c f = new enl.c(jv.a(), Map.of(), ecn.a.e, enw.a);
      public static final MapCodec<enl.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kg.a(mc.aI).fieldOf("biomes").forGetter(enl.c::a),
                  Codec.simpleMap(bvj.i, ens.a, azv.a(bvj.values())).fieldOf("spawn_overrides").forGetter(enl.c::b),
                  ecn.a.l.fieldOf("step").forGetter(enl.c::c),
                  enw.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(enl.c::d)
               )
               .apply($$0, enl.c::new)
      );

      public c(jv<dhj> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public jv<dhj> a() {
         return this.b;
      }

      public Map<bvj, ens> b() {
         return this.c;
      }

      public ecn.a c() {
         return this.d;
      }

      public enw d() {
         return this.e;
      }

      public static class a {
         private final jv<dhj> a;
         private Map<bvj, ens> b = enl.c.f.c;
         private ecn.a c = enl.c.f.d;
         private enw d = enl.c.f.e;

         public a(jv<dhj> $$0) {
            this.a = $$0;
         }

         public enl.c.a a(Map<bvj, ens> $$0) {
            this.b = $$0;
            return this;
         }

         public enl.c.a a(ecn.a $$0) {
            this.c = $$0;
            return this;
         }

         public enl.c.a a(enw $$0) {
            this.d = $$0;
            return this;
         }

         public enl.c a() {
            return new enl.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}

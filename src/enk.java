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

public abstract class enk {
   public static final Codec<enk> a = mb.R.q().dispatch(enk::e, ent::codec);
   public static final Codec<jr<enk>> b = akq.a(mc.aU, a);
   protected final enk.c c;

   public static <S extends enk> RecordCodecBuilder<S, enk.c> a(Instance<S> $$0) {
      return enk.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends enk> MapCodec<S> a(Function<enk.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected enk(enk.c $$0) {
      this.c = $$0;
   }

   public jv<dhi> a() {
      return this.c.b;
   }

   public Map<bvi, enr> b() {
      return this.c.c;
   }

   public ecm.a c() {
      return this.c.d;
   }

   public env d() {
      return this.c.e;
   }

   public enc a(enc $$0) {
      return this.d() != env.a ? $$0.a(12) : $$0;
   }

   public ens a(jr<enk> $$0, akt<dgg> $$1, kf $$2, dyr $$3, dhm $$4, ede $$5, ern $$6, long $$7, dfm $$8, int $$9, dgi $$10, Predicate<jr<dhi>> $$11) {
      bpc $$12 = boz.f.a($$8, $$1, $$0);
      enk.a $$13 = new enk.a($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10, $$11);
      Optional<enk.b> $$14 = this.b($$13);
      if ($$14.isPresent()) {
         eoc $$15 = $$14.get().a();
         ens $$16 = new ens(this, $$8, $$9, $$15.a());
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

      return ens.b;
   }

   protected static Optional<enk.b> a(enk.a $$0, ecq.a $$1, Consumer<eoc> $$2) {
      dfm $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new enk.b(new ji($$4, $$6, $$5), $$2));
   }

   private static boolean a(enk.b $$0, enk.a $$1) {
      ji $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(kc.a($$2.u()), kc.a($$2.v()), kc.a($$2.w()), $$1.d.b()));
   }

   public void a(dhe $$0, dhc $$1, dyr $$2, azg $$3, enc $$4, dfm $$5, enz $$6) {
   }

   private static int[] c(enk.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dyr $$5 = $$0.b();
      dgi $$6 = $$0.i();
      ede $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, ecq.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, ecq.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, ecq.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, ecq.a.a, $$6, $$7)
      };
   }

   public static int a(enk.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(enk.a $$0, int $$1, int $$2) {
      dfm $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(enk.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected ji a(enk.a $$0, dqc $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dqc.b) {
         $$2 = -5;
      } else if ($$1 == dqc.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dqc.d) {
         $$3 = -5;
      }

      dfm $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new ji($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<enk.b> a(enk.a var1);

   public Optional<enk.b> b(enk.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract ent<?> e();

   public static record a(kf a, dyr b, dhm c, ede d, ern e, edp f, long g, dfm h, dgi i, Predicate<jr<dhi>> j) {

      public a(kf $$0, dyr $$1, dhm $$2, ede $$3, ern $$4, long $$5, dfm $$6, dgi $$7, Predicate<jr<dhi>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static edp a(long $$0, dfm $$1) {
         edp $$2 = new edp(new ecr(0L));
         $$2.c($$0, $$1.h, $$1.i);
         return $$2;
      }
   }

   public static record b(ji a, Either<Consumer<eoc>, eoc> b) {
      public b(ji $$0, Consumer<eoc> $$1) {
         this($$0, Either.left($$1));
      }

      public eoc a() {
         return (eoc)this.b.map($$0 -> {
            eoc $$1 = new eoc();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public ji b() {
         return this.a;
      }

      public Either<Consumer<eoc>, eoc> c() {
         return this.b;
      }
   }

   public static record c(jv<dhi> b, Map<bvi, enr> c, ecm.a d, env e) {
      static final enk.c f = new enk.c(jv.a(), Map.of(), ecm.a.e, env.a);
      public static final MapCodec<enk.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kg.a(mc.aI).fieldOf("biomes").forGetter(enk.c::a),
                  Codec.simpleMap(bvi.i, enr.a, azu.a(bvi.values())).fieldOf("spawn_overrides").forGetter(enk.c::b),
                  ecm.a.l.fieldOf("step").forGetter(enk.c::c),
                  env.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(enk.c::d)
               )
               .apply($$0, enk.c::new)
      );

      public c(jv<dhi> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public jv<dhi> a() {
         return this.b;
      }

      public Map<bvi, enr> b() {
         return this.c;
      }

      public ecm.a c() {
         return this.d;
      }

      public env d() {
         return this.e;
      }

      public static class a {
         private final jv<dhi> a;
         private Map<bvi, enr> b = enk.c.f.c;
         private ecm.a c = enk.c.f.d;
         private env d = enk.c.f.e;

         public a(jv<dhi> $$0) {
            this.a = $$0;
         }

         public enk.c.a a(Map<bvi, enr> $$0) {
            this.b = $$0;
            return this;
         }

         public enk.c.a a(ecm.a $$0) {
            this.c = $$0;
            return this;
         }

         public enk.c.a a(env $$0) {
            this.d = $$0;
            return this;
         }

         public enk.c a() {
            return new enk.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}

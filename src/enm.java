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

public abstract class enm {
   public static final Codec<enm> a = mb.R.q().dispatch(enm::e, env::codec);
   public static final Codec<jr<enm>> b = akr.a(mc.aU, a);
   protected final enm.c c;

   public static <S extends enm> RecordCodecBuilder<S, enm.c> a(Instance<S> $$0) {
      return enm.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends enm> MapCodec<S> a(Function<enm.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected enm(enm.c $$0) {
      this.c = $$0;
   }

   public jv<dhk> a() {
      return this.c.b;
   }

   public Map<bvk, ent> b() {
      return this.c.c;
   }

   public eco.a c() {
      return this.c.d;
   }

   public enx d() {
      return this.c.e;
   }

   public ene a(ene $$0) {
      return this.d() != enx.a ? $$0.a(12) : $$0;
   }

   public enu a(jr<enm> $$0, aku<dgi> $$1, kf $$2, dyt $$3, dho $$4, edg $$5, erp $$6, long $$7, dfo $$8, int $$9, dgk $$10, Predicate<jr<dhk>> $$11) {
      bpe $$12 = bpb.f.a($$8, $$1, $$0);
      enm.a $$13 = new enm.a($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10, $$11);
      Optional<enm.b> $$14 = this.b($$13);
      if ($$14.isPresent()) {
         eoe $$15 = $$14.get().a();
         enu $$16 = new enu(this, $$8, $$9, $$15.a());
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

      return enu.b;
   }

   protected static Optional<enm.b> a(enm.a $$0, ecs.a $$1, Consumer<eoe> $$2) {
      dfo $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new enm.b(new ji($$4, $$6, $$5), $$2));
   }

   private static boolean a(enm.b $$0, enm.a $$1) {
      ji $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(kc.a($$2.u()), kc.a($$2.v()), kc.a($$2.w()), $$1.d.b()));
   }

   public void a(dhg $$0, dhe $$1, dyt $$2, azh $$3, ene $$4, dfo $$5, eob $$6) {
   }

   private static int[] c(enm.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dyt $$5 = $$0.b();
      dgk $$6 = $$0.i();
      edg $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, ecs.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, ecs.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, ecs.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, ecs.a.a, $$6, $$7)
      };
   }

   public static int a(enm.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(enm.a $$0, int $$1, int $$2) {
      dfo $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(enm.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected ji a(enm.a $$0, dqe $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dqe.b) {
         $$2 = -5;
      } else if ($$1 == dqe.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dqe.d) {
         $$3 = -5;
      }

      dfo $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new ji($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<enm.b> a(enm.a var1);

   public Optional<enm.b> b(enm.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract env<?> e();

   public static record a(kf a, dyt b, dho c, edg d, erp e, edr f, long g, dfo h, dgk i, Predicate<jr<dhk>> j) {

      public a(kf $$0, dyt $$1, dho $$2, edg $$3, erp $$4, long $$5, dfo $$6, dgk $$7, Predicate<jr<dhk>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static edr a(long $$0, dfo $$1) {
         edr $$2 = new edr(new ect(0L));
         $$2.c($$0, $$1.h, $$1.i);
         return $$2;
      }
   }

   public static record b(ji a, Either<Consumer<eoe>, eoe> b) {
      public b(ji $$0, Consumer<eoe> $$1) {
         this($$0, Either.left($$1));
      }

      public eoe a() {
         return (eoe)this.b.map($$0 -> {
            eoe $$1 = new eoe();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public ji b() {
         return this.a;
      }

      public Either<Consumer<eoe>, eoe> c() {
         return this.b;
      }
   }

   public static record c(jv<dhk> b, Map<bvk, ent> c, eco.a d, enx e) {
      static final enm.c f = new enm.c(jv.a(), Map.of(), eco.a.e, enx.a);
      public static final MapCodec<enm.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kg.a(mc.aI).fieldOf("biomes").forGetter(enm.c::a),
                  Codec.simpleMap(bvk.i, ent.a, azv.a(bvk.values())).fieldOf("spawn_overrides").forGetter(enm.c::b),
                  eco.a.l.fieldOf("step").forGetter(enm.c::c),
                  enx.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(enm.c::d)
               )
               .apply($$0, enm.c::new)
      );

      public c(jv<dhk> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public jv<dhk> a() {
         return this.b;
      }

      public Map<bvk, ent> b() {
         return this.c;
      }

      public eco.a c() {
         return this.d;
      }

      public enx d() {
         return this.e;
      }

      public static class a {
         private final jv<dhk> a;
         private Map<bvk, ent> b = enm.c.f.c;
         private eco.a c = enm.c.f.d;
         private enx d = enm.c.f.e;

         public a(jv<dhk> $$0) {
            this.a = $$0;
         }

         public enm.c.a a(Map<bvk, ent> $$0) {
            this.b = $$0;
            return this;
         }

         public enm.c.a a(eco.a $$0) {
            this.c = $$0;
            return this;
         }

         public enm.c.a a(enx $$0) {
            this.d = $$0;
            return this;
         }

         public enm.c a() {
            return new enm.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}

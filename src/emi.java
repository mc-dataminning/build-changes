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

public abstract class emi {
   public static final Codec<emi> a = lz.R.q().dispatch(emi::e, emr::codec);
   public static final Codec<jq<emi>> b = alf.a(ma.aS, a);
   protected final emi.c c;

   public static <S extends emi> RecordCodecBuilder<S, emi.c> a(Instance<S> $$0) {
      return emi.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends emi> MapCodec<S> a(Function<emi.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected emi(emi.c $$0) {
      this.c = $$0;
   }

   public ju<dgo> a() {
      return this.c.b;
   }

   public Map<bvk, emp> b() {
      return this.c.c;
   }

   public ebm.a c() {
      return this.c.d;
   }

   public emt d() {
      return this.c.e;
   }

   public ema a(ema $$0) {
      return this.d() != emt.a ? $$0.a(12) : $$0;
   }

   public emq a(ke $$0, dxr $$1, dgs $$2, ece $$3, eql $$4, long $$5, des $$6, int $$7, dfo $$8, Predicate<jq<dgo>> $$9) {
      emi.a $$10 = new emi.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<emi.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         ena $$12 = $$11.get().a();
         emq $$13 = new emq(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return emq.b;
   }

   protected static Optional<emi.b> a(emi.a $$0, ebq.a $$1, Consumer<ena> $$2) {
      des $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new emi.b(new jh($$4, $$6, $$5), $$2));
   }

   private static boolean a(emi.b $$0, emi.a $$1) {
      jh $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(kb.a($$2.u()), kb.a($$2.v()), kb.a($$2.w()), $$1.d.b()));
   }

   public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, emx $$6) {
   }

   private static int[] c(emi.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dxr $$5 = $$0.b();
      dfo $$6 = $$0.i();
      ece $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, ebq.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, ebq.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, ebq.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, ebq.a.a, $$6, $$7)
      };
   }

   public static int a(emi.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(emi.a $$0, int $$1, int $$2) {
      des $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(emi.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected jh a(emi.a $$0, dpd $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dpd.b) {
         $$2 = -5;
      } else if ($$1 == dpd.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dpd.d) {
         $$3 = -5;
      }

      des $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new jh($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<emi.b> a(emi.a var1);

   public Optional<emi.b> b(emi.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract emr<?> e();

   public static record a(ke a, dxr b, dgs c, ece d, eql e, ecp f, long g, des h, dfo i, Predicate<jq<dgo>> j) {

      public a(ke $$0, dxr $$1, dgs $$2, ece $$3, eql $$4, long $$5, des $$6, dfo $$7, Predicate<jq<dgo>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static ecp a(long $$0, des $$1) {
         ecp $$2 = new ecp(new ebr(0L));
         $$2.c($$0, $$1.g, $$1.h);
         return $$2;
      }
   }

   public static record b(jh a, Either<Consumer<ena>, ena> b) {
      public b(jh $$0, Consumer<ena> $$1) {
         this($$0, Either.left($$1));
      }

      public ena a() {
         return (ena)this.b.map($$0 -> {
            ena $$1 = new ena();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public jh b() {
         return this.a;
      }

      public Either<Consumer<ena>, ena> c() {
         return this.b;
      }
   }

   public static record c(ju<dgo> b, Map<bvk, emp> c, ebm.a d, emt e) {
      static final emi.c f = new emi.c(ju.a(), Map.of(), ebm.a.e, emt.a);
      public static final MapCodec<emi.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kf.a(ma.aG).fieldOf("biomes").forGetter(emi.c::a),
                  Codec.simpleMap(bvk.i, emp.a, bai.a(bvk.values())).fieldOf("spawn_overrides").forGetter(emi.c::b),
                  ebm.a.l.fieldOf("step").forGetter(emi.c::c),
                  emt.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(emi.c::d)
               )
               .apply($$0, emi.c::new)
      );

      public c(ju<dgo> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public ju<dgo> a() {
         return this.b;
      }

      public Map<bvk, emp> b() {
         return this.c;
      }

      public ebm.a c() {
         return this.d;
      }

      public emt d() {
         return this.e;
      }

      public static class a {
         private final ju<dgo> a;
         private Map<bvk, emp> b = emi.c.f.c;
         private ebm.a c = emi.c.f.d;
         private emt d = emi.c.f.e;

         public a(ju<dgo> $$0) {
            this.a = $$0;
         }

         public emi.c.a a(Map<bvk, emp> $$0) {
            this.b = $$0;
            return this;
         }

         public emi.c.a a(ebm.a $$0) {
            this.c = $$0;
            return this;
         }

         public emi.c.a a(emt $$0) {
            this.d = $$0;
            return this;
         }

         public emi.c a() {
            return new emi.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}

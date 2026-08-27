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

public abstract class ebe {
   public static final Codec<ebe> a = kf.T.q().dispatch(ebe::e, ebn::codec);
   public static final Codec<ij<ebe>> b = aiu.a(kg.aD, a);
   protected final ebe.c c;

   public static <S extends ebe> RecordCodecBuilder<S, ebe.c> a(Instance<S> $$0) {
      return ebe.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends ebe> Codec<S> a(Function<ebe.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected ebe(ebe.c $$0) {
      this.c = $$0;
   }

   public in<cwm> a() {
      return this.c.b;
   }

   public Map<boj, ebl> b() {
      return this.c.c;
   }

   public dqk.b c() {
      return this.c.d;
   }

   public ebp d() {
      return this.c.e;
   }

   public eaw a(eaw $$0) {
      return this.d() != ebp.a ? $$0.a(12) : $$0;
   }

   public ebm a(iw $$0, dnc $$1, cwq $$2, drc $$3, eff $$4, long $$5, cuu $$6, int $$7, cvp $$8, Predicate<ij<cwm>> $$9) {
      ebe.a $$10 = new ebe.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<ebe.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         ebw $$12 = $$11.get().a();
         ebm $$13 = new ebm(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return ebm.b;
   }

   protected static Optional<ebe.b> a(ebe.a $$0, dqo.a $$1, Consumer<ebw> $$2) {
      cuu $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new ebe.b(new hz($$4, $$6, $$5), $$2));
   }

   private static boolean a(ebe.b $$0, ebe.a $$1) {
      hz $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(iu.a($$2.u()), iu.a($$2.v()), iu.a($$2.w()), $$1.d.b()));
   }

   public void a(cwi $$0, cwg $$1, dnc $$2, awo $$3, eaw $$4, cuu $$5, ebt $$6) {
   }

   private static int[] b(ebe.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dnc $$5 = $$0.b();
      cvp $$6 = $$0.i();
      drc $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dqo.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dqo.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dqo.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dqo.a.a, $$6, $$7)
      };
   }

   protected static int a(ebe.a $$0, int $$1, int $$2) {
      cuu $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(ebe.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected hz a(ebe.a $$0, dfa $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dfa.b) {
         $$2 = -5;
      } else if ($$1 == dfa.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dfa.d) {
         $$3 = -5;
      }

      cuu $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new hz($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<ebe.b> a(ebe.a var1);

   public Optional<ebe.b> b(ebe.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract ebn<?> e();

   public static record a(iw a, dnc b, cwq c, drc d, eff e, drn f, long g, cuu h, cvp i, Predicate<ij<cwm>> j) {

      public a(iw $$0, dnc $$1, cwq $$2, drc $$3, eff $$4, long $$5, cuu $$6, cvp $$7, Predicate<ij<cwm>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static drn a(long $$0, cuu $$1) {
         drn $$2 = new drn(new dqp(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(hz a, Either<Consumer<ebw>, ebw> b) {
      public b(hz $$0, Consumer<ebw> $$1) {
         this($$0, Either.left($$1));
      }

      public ebw a() {
         return (ebw)this.b.map($$0 -> {
            ebw $$1 = new ebw();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public hz b() {
         return this.a;
      }

      public Either<Consumer<ebw>, ebw> c() {
         return this.b;
      }
   }

   public static record c(in<cwm> b, Map<boj, ebl> c, dqk.b d, ebp e) {
      public static final MapCodec<ebe.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ix.a(kg.at).fieldOf("biomes").forGetter(ebe.c::a),
                  Codec.simpleMap(boj.i, ebl.a, axc.a(boj.values())).fieldOf("spawn_overrides").forGetter(ebe.c::b),
                  dqk.b.l.fieldOf("step").forGetter(ebe.c::c),
                  ebp.e.optionalFieldOf("terrain_adaptation", ebp.a).forGetter(ebe.c::d)
               )
               .apply($$0, ebe.c::new)
      );

      public in<cwm> a() {
         return this.b;
      }

      public Map<boj, ebl> b() {
         return this.c;
      }

      public dqk.b c() {
         return this.d;
      }

      public ebp d() {
         return this.e;
      }
   }
}

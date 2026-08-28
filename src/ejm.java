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

public abstract class ejm {
   public static final Codec<ejm> a = lt.R.r().dispatch(ejm::e, ejv::codec);
   public static final Codec<jm<ejm>> b = akm.a(lu.aR, a);
   protected final ejm.c c;

   public static <S extends ejm> RecordCodecBuilder<S, ejm.c> a(Instance<S> $$0) {
      return ejm.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends ejm> MapCodec<S> a(Function<ejm.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected ejm(ejm.c $$0) {
      this.c = $$0;
   }

   public jq<ddu> a() {
      return this.c.b;
   }

   public Map<bto, ejt> b() {
      return this.c.c;
   }

   public dyr.b c() {
      return this.c.d;
   }

   public ejx d() {
      return this.c.e;
   }

   public eje a(eje $$0) {
      return this.d() != ejx.a ? $$0.a(12) : $$0;
   }

   public eju a(ka $$0, dux $$1, ddy $$2, dzj $$3, eno $$4, long $$5, dcb $$6, int $$7, dcw $$8, Predicate<jm<ddu>> $$9) {
      ejm.a $$10 = new ejm.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<ejm.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         eke $$12 = $$11.get().a();
         eju $$13 = new eju(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return eju.b;
   }

   protected static Optional<ejm.b> a(ejm.a $$0, dyv.a $$1, Consumer<eke> $$2) {
      dcb $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new ejm.b(new jd($$4, $$6, $$5), $$2));
   }

   private static boolean a(ejm.b $$0, ejm.a $$1) {
      jd $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jx.a($$2.u()), jx.a($$2.v()), jx.a($$2.w()), $$1.d.b()));
   }

   public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, ekb $$6) {
   }

   private static int[] c(ejm.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dux $$5 = $$0.b();
      dcw $$6 = $$0.i();
      dzj $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dyv.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dyv.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dyv.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dyv.a.a, $$6, $$7)
      };
   }

   public static int a(ejm.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(ejm.a $$0, int $$1, int $$2) {
      dcb $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(ejm.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected jd a(ejm.a $$0, dmk $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dmk.b) {
         $$2 = -5;
      } else if ($$1 == dmk.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dmk.d) {
         $$3 = -5;
      }

      dcb $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new jd($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<ejm.b> a(ejm.a var1);

   public Optional<ejm.b> b(ejm.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract ejv<?> e();

   public static record a(ka a, dux b, ddy c, dzj d, eno e, dzu f, long g, dcb h, dcw i, Predicate<jm<ddu>> j) {

      public a(ka $$0, dux $$1, ddy $$2, dzj $$3, eno $$4, long $$5, dcb $$6, dcw $$7, Predicate<jm<ddu>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dzu a(long $$0, dcb $$1) {
         dzu $$2 = new dzu(new dyw(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(jd a, Either<Consumer<eke>, eke> b) {
      public b(jd $$0, Consumer<eke> $$1) {
         this($$0, Either.left($$1));
      }

      public eke a() {
         return (eke)this.b.map($$0 -> {
            eke $$1 = new eke();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public jd b() {
         return this.a;
      }

      public Either<Consumer<eke>, eke> c() {
         return this.b;
      }
   }

   public static record c(jq<ddu> b, Map<bto, ejt> c, dyr.b d, ejx e) {
      public static final MapCodec<ejm.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kb.a(lu.aF).fieldOf("biomes").forGetter(ejm.c::a),
                  Codec.simpleMap(bto.i, ejt.a, azj.a(bto.values())).fieldOf("spawn_overrides").forGetter(ejm.c::b),
                  dyr.b.l.fieldOf("step").forGetter(ejm.c::c),
                  ejx.f.optionalFieldOf("terrain_adaptation", ejx.a).forGetter(ejm.c::d)
               )
               .apply($$0, ejm.c::new)
      );

      public jq<ddu> a() {
         return this.b;
      }

      public Map<bto, ejt> b() {
         return this.c;
      }

      public dyr.b c() {
         return this.d;
      }

      public ejx d() {
         return this.e;
      }
   }
}

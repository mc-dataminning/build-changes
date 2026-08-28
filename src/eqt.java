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

public abstract class eqt {
   public static final Codec<eqt> a = mf.R.q().dispatch(eqt::e, erc::codec);
   public static final Codec<je<eqt>> b = alc.a(mg.bd, a);
   protected final eqt.c c;

   public static <S extends eqt> RecordCodecBuilder<S, eqt.c> a(Instance<S> $$0) {
      return eqt.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eqt> MapCodec<S> a(Function<eqt.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eqt(eqt.c $$0) {
      this.c = $$0;
   }

   public ji<djy> a() {
      return this.c.b;
   }

   public Map<bxf, era> b() {
      return this.c.c;
   }

   public efu.a c() {
      return this.c.d;
   }

   public ere d() {
      return this.c.e;
   }

   public eql a(eql $$0) {
      return this.d() != ere.a ? $$0.a(12) : $$0;
   }

   public erb a(je<eqt> $$0, alf<div> $$1, js $$2, ebx $$3, dkc $$4, egm $$5, euw $$6, long $$7, dic $$8, int $$9, dix $$10, Predicate<je<djy>> $$11) {
      bqx $$12 = bqu.f.a($$8, $$1, $$0);
      eqt.a $$13 = new eqt.a($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10, $$11);
      Optional<eqt.b> $$14 = this.b($$13);
      if ($$14.isPresent()) {
         erl $$15 = $$14.get().a();
         erb $$16 = new erb(this, $$8, $$9, $$15.a());
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

      return erb.b;
   }

   protected static Optional<eqt.b> a(eqt.a $$0, efy.a $$1, Consumer<erl> $$2) {
      dic $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eqt.b(new iu($$4, $$6, $$5), $$2));
   }

   private static boolean a(eqt.b $$0, eqt.a $$1) {
      iu $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jp.a($$2.u()), jp.a($$2.v()), jp.a($$2.w()), $$1.d.b()));
   }

   public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, eri $$6) {
   }

   private static int[] c(eqt.a $$0, int $$1, int $$2, int $$3, int $$4) {
      ebx $$5 = $$0.b();
      dix $$6 = $$0.i();
      egm $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, efy.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, efy.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, efy.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, efy.a.a, $$6, $$7)
      };
   }

   public static int a(eqt.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(eqt.a $$0, int $$1, int $$2) {
      dic $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(eqt.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected iu a(eqt.a $$0, dst $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dst.b) {
         $$2 = -5;
      } else if ($$1 == dst.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dst.d) {
         $$3 = -5;
      }

      dic $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new iu($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eqt.b> a(eqt.a var1);

   public Optional<eqt.b> b(eqt.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract erc<?> e();

   public static record a(js a, ebx b, dkc c, egm d, euw e, egx f, long g, dic h, dix i, Predicate<je<djy>> j) {

      public a(js $$0, ebx $$1, dkc $$2, egm $$3, euw $$4, long $$5, dic $$6, dix $$7, Predicate<je<djy>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static egx a(long $$0, dic $$1) {
         egx $$2 = new egx(new efz(0L));
         $$2.c($$0, $$1.h, $$1.i);
         return $$2;
      }
   }

   public static record b(iu a, Either<Consumer<erl>, erl> b) {
      public b(iu $$0, Consumer<erl> $$1) {
         this($$0, Either.left($$1));
      }

      public erl a() {
         return (erl)this.b.map($$0 -> {
            erl $$1 = new erl();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public iu b() {
         return this.a;
      }

      public Either<Consumer<erl>, erl> c() {
         return this.b;
      }
   }

   public static record c(ji<djy> b, Map<bxf, era> c, efu.a d, ere e) {
      static final eqt.c f = new eqt.c(ji.a(), Map.of(), efu.a.e, ere.a);
      public static final MapCodec<eqt.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jt.a(mg.aG).fieldOf("biomes").forGetter(eqt.c::a),
                  Codec.simpleMap(bxf.i, era.a, bak.a(bxf.values())).fieldOf("spawn_overrides").forGetter(eqt.c::b),
                  efu.a.l.fieldOf("step").forGetter(eqt.c::c),
                  ere.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(eqt.c::d)
               )
               .apply($$0, eqt.c::new)
      );

      public c(ji<djy> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public ji<djy> a() {
         return this.b;
      }

      public Map<bxf, era> b() {
         return this.c;
      }

      public efu.a c() {
         return this.d;
      }

      public ere d() {
         return this.e;
      }

      public static class a {
         private final ji<djy> a;
         private Map<bxf, era> b = eqt.c.f.c;
         private efu.a c = eqt.c.f.d;
         private ere d = eqt.c.f.e;

         public a(ji<djy> $$0) {
            this.a = $$0;
         }

         public eqt.c.a a(Map<bxf, era> $$0) {
            this.b = $$0;
            return this;
         }

         public eqt.c.a a(efu.a $$0) {
            this.c = $$0;
            return this;
         }

         public eqt.c.a a(ere $$0) {
            this.d = $$0;
            return this;
         }

         public eqt.c a() {
            return new eqt.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}

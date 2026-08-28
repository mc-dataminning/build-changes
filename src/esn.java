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

public abstract class esn {
   public static final Codec<esn> a = mh.R.q().dispatch(esn::e, esw::codec);
   public static final Codec<jg<esn>> b = aln.a(mi.be, a);
   protected final esn.c c;

   public static <S extends esn> RecordCodecBuilder<S, esn.c> a(Instance<S> $$0) {
      return esn.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends esn> MapCodec<S> a(Function<esn.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected esn(esn.c $$0) {
      this.c = $$0;
   }

   public jk<dlm> a() {
      return this.c.b;
   }

   public Map<byi, esu> b() {
      return this.c.c;
   }

   public ehl.a c() {
      return this.c.d;
   }

   public esy d() {
      return this.c.e;
   }

   public esf a(esf $$0) {
      return this.d() != esy.a ? $$0.a(12) : $$0;
   }

   public esv a(jg<esn> $$0, alq<dkj> $$1, ju $$2, edo $$3, dlq $$4, eid $$5, ewq $$6, long $$7, djo $$8, int $$9, dkl $$10, Predicate<jg<dlm>> $$11) {
      brx $$12 = bru.f.a($$8, $$1, $$0);
      esn.a $$13 = new esn.a($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10, $$11);
      Optional<esn.b> $$14 = this.b($$13);
      if ($$14.isPresent()) {
         etf $$15 = $$14.get().a();
         esv $$16 = new esv(this, $$8, $$9, $$15.a());
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

      return esv.b;
   }

   protected static Optional<esn.b> a(esn.a $$0, ehp.a $$1, Consumer<etf> $$2) {
      djo $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new esn.b(new iw($$4, $$6, $$5), $$2));
   }

   private static boolean a(esn.b $$0, esn.a $$1) {
      iw $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jr.a($$2.u()), jr.a($$2.v()), jr.a($$2.w()), $$1.d.b()));
   }

   public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, etc $$6) {
   }

   private static int[] c(esn.a $$0, int $$1, int $$2, int $$3, int $$4) {
      edo $$5 = $$0.b();
      dkl $$6 = $$0.i();
      eid $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, ehp.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, ehp.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, ehp.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, ehp.a.a, $$6, $$7)
      };
   }

   public static int a(esn.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(esn.a $$0, int $$1, int $$2) {
      djo $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(esn.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected iw a(esn.a $$0, dui $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dui.b) {
         $$2 = -5;
      } else if ($$1 == dui.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dui.d) {
         $$3 = -5;
      }

      djo $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new iw($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<esn.b> a(esn.a var1);

   public Optional<esn.b> b(esn.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract esw<?> e();

   public static record a(ju a, edo b, dlq c, eid d, ewq e, eio f, long g, djo h, dkl i, Predicate<jg<dlm>> j) {

      public a(ju $$0, edo $$1, dlq $$2, eid $$3, ewq $$4, long $$5, djo $$6, dkl $$7, Predicate<jg<dlm>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static eio a(long $$0, djo $$1) {
         eio $$2 = new eio(new ehq(0L));
         $$2.c($$0, $$1.h, $$1.i);
         return $$2;
      }
   }

   public static record b(iw a, Either<Consumer<etf>, etf> b) {
      public b(iw $$0, Consumer<etf> $$1) {
         this($$0, Either.left($$1));
      }

      public etf a() {
         return (etf)this.b.map($$0 -> {
            etf $$1 = new etf();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public iw b() {
         return this.a;
      }

      public Either<Consumer<etf>, etf> c() {
         return this.b;
      }
   }

   public static record c(jk<dlm> b, Map<byi, esu> c, ehl.a d, esy e) {
      static final esn.c f = new esn.c(jk.a(), Map.of(), ehl.a.e, esy.a);
      public static final MapCodec<esn.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jv.a(mi.aG).fieldOf("biomes").forGetter(esn.c::a),
                  Codec.simpleMap(byi.i, esu.a, bax.a(byi.values())).fieldOf("spawn_overrides").forGetter(esn.c::b),
                  ehl.a.l.fieldOf("step").forGetter(esn.c::c),
                  esy.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(esn.c::d)
               )
               .apply($$0, esn.c::new)
      );

      public c(jk<dlm> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public jk<dlm> a() {
         return this.b;
      }

      public Map<byi, esu> b() {
         return this.c;
      }

      public ehl.a c() {
         return this.d;
      }

      public esy d() {
         return this.e;
      }

      public static class a {
         private final jk<dlm> a;
         private Map<byi, esu> b = esn.c.f.c;
         private ehl.a c = esn.c.f.d;
         private esy d = esn.c.f.e;

         public a(jk<dlm> $$0) {
            this.a = $$0;
         }

         public esn.c.a a(Map<byi, esu> $$0) {
            this.b = $$0;
            return this;
         }

         public esn.c.a a(ehl.a $$0) {
            this.c = $$0;
            return this;
         }

         public esn.c.a a(esy $$0) {
            this.d = $$0;
            return this;
         }

         public esn.c a() {
            return new esn.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}

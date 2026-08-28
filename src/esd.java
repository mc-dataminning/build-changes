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

public abstract class esd {
   public static final Codec<esd> a = mh.R.q().dispatch(esd::e, esm::codec);
   public static final Codec<jg<esd>> b = alg.a(mi.be, a);
   protected final esd.c c;

   public static <S extends esd> RecordCodecBuilder<S, esd.c> a(Instance<S> $$0) {
      return esd.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends esd> MapCodec<S> a(Function<esd.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected esd(esd.c $$0) {
      this.c = $$0;
   }

   public jk<dlc> a() {
      return this.c.b;
   }

   public Map<bxz, esk> b() {
      return this.c.c;
   }

   public ehb.a c() {
      return this.c.d;
   }

   public eso d() {
      return this.c.e;
   }

   public erv a(erv $$0) {
      return this.d() != eso.a ? $$0.a(12) : $$0;
   }

   public esl a(jg<esd> $$0, alj<djz> $$1, ju $$2, ede $$3, dlg $$4, eht $$5, ewg $$6, long $$7, dje $$8, int $$9, dkb $$10, Predicate<jg<dlc>> $$11) {
      bro $$12 = brl.f.a($$8, $$1, $$0);
      esd.a $$13 = new esd.a($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10, $$11);
      Optional<esd.b> $$14 = this.b($$13);
      if ($$14.isPresent()) {
         esv $$15 = $$14.get().a();
         esl $$16 = new esl(this, $$8, $$9, $$15.a());
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

      return esl.b;
   }

   protected static Optional<esd.b> a(esd.a $$0, ehf.a $$1, Consumer<esv> $$2) {
      dje $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new esd.b(new iw($$4, $$6, $$5), $$2));
   }

   private static boolean a(esd.b $$0, esd.a $$1) {
      iw $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jr.a($$2.u()), jr.a($$2.v()), jr.a($$2.w()), $$1.d.b()));
   }

   public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, ess $$6) {
   }

   private static int[] c(esd.a $$0, int $$1, int $$2, int $$3, int $$4) {
      ede $$5 = $$0.b();
      dkb $$6 = $$0.i();
      eht $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, ehf.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, ehf.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, ehf.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, ehf.a.a, $$6, $$7)
      };
   }

   public static int a(esd.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(esd.a $$0, int $$1, int $$2) {
      dje $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(esd.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected iw a(esd.a $$0, dty $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dty.b) {
         $$2 = -5;
      } else if ($$1 == dty.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dty.d) {
         $$3 = -5;
      }

      dje $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new iw($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<esd.b> a(esd.a var1);

   public Optional<esd.b> b(esd.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract esm<?> e();

   public static record a(ju a, ede b, dlg c, eht d, ewg e, eie f, long g, dje h, dkb i, Predicate<jg<dlc>> j) {

      public a(ju $$0, ede $$1, dlg $$2, eht $$3, ewg $$4, long $$5, dje $$6, dkb $$7, Predicate<jg<dlc>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static eie a(long $$0, dje $$1) {
         eie $$2 = new eie(new ehg(0L));
         $$2.c($$0, $$1.h, $$1.i);
         return $$2;
      }
   }

   public static record b(iw a, Either<Consumer<esv>, esv> b) {
      public b(iw $$0, Consumer<esv> $$1) {
         this($$0, Either.left($$1));
      }

      public esv a() {
         return (esv)this.b.map($$0 -> {
            esv $$1 = new esv();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public iw b() {
         return this.a;
      }

      public Either<Consumer<esv>, esv> c() {
         return this.b;
      }
   }

   public static record c(jk<dlc> b, Map<bxz, esk> c, ehb.a d, eso e) {
      static final esd.c f = new esd.c(jk.a(), Map.of(), ehb.a.e, eso.a);
      public static final MapCodec<esd.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jv.a(mi.aG).fieldOf("biomes").forGetter(esd.c::a),
                  Codec.simpleMap(bxz.i, esk.a, bao.a(bxz.values())).fieldOf("spawn_overrides").forGetter(esd.c::b),
                  ehb.a.l.fieldOf("step").forGetter(esd.c::c),
                  eso.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(esd.c::d)
               )
               .apply($$0, esd.c::new)
      );

      public c(jk<dlc> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public jk<dlc> a() {
         return this.b;
      }

      public Map<bxz, esk> b() {
         return this.c;
      }

      public ehb.a c() {
         return this.d;
      }

      public eso d() {
         return this.e;
      }

      public static class a {
         private final jk<dlc> a;
         private Map<bxz, esk> b = esd.c.f.c;
         private ehb.a c = esd.c.f.d;
         private eso d = esd.c.f.e;

         public a(jk<dlc> $$0) {
            this.a = $$0;
         }

         public esd.c.a a(Map<bxz, esk> $$0) {
            this.b = $$0;
            return this;
         }

         public esd.c.a a(ehb.a $$0) {
            this.c = $$0;
            return this;
         }

         public esd.c.a a(eso $$0) {
            this.d = $$0;
            return this;
         }

         public esd.c a() {
            return new esd.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}

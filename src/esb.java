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

public abstract class esb {
   public static final Codec<esb> a = mg.R.q().dispatch(esb::e, esk::codec);
   public static final Codec<jf<esb>> b = ale.a(mh.be, a);
   protected final esb.c c;

   public static <S extends esb> RecordCodecBuilder<S, esb.c> a(Instance<S> $$0) {
      return esb.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends esb> MapCodec<S> a(Function<esb.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected esb(esb.c $$0) {
      this.c = $$0;
   }

   public jj<dla> a() {
      return this.c.b;
   }

   public Map<bxx, esi> b() {
      return this.c.c;
   }

   public egz.a c() {
      return this.c.d;
   }

   public esm d() {
      return this.c.e;
   }

   public ert a(ert $$0) {
      return this.d() != esm.a ? $$0.a(12) : $$0;
   }

   public esj a(jf<esb> $$0, alh<djx> $$1, jt $$2, edc $$3, dle $$4, ehr $$5, ewe $$6, long $$7, djc $$8, int $$9, djz $$10, Predicate<jf<dla>> $$11) {
      brm $$12 = brj.f.a($$8, $$1, $$0);
      esb.a $$13 = new esb.a($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10, $$11);
      Optional<esb.b> $$14 = this.b($$13);
      if ($$14.isPresent()) {
         est $$15 = $$14.get().a();
         esj $$16 = new esj(this, $$8, $$9, $$15.a());
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

      return esj.b;
   }

   protected static Optional<esb.b> a(esb.a $$0, ehd.a $$1, Consumer<est> $$2) {
      djc $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new esb.b(new iv($$4, $$6, $$5), $$2));
   }

   private static boolean a(esb.b $$0, esb.a $$1) {
      iv $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jq.a($$2.u()), jq.a($$2.v()), jq.a($$2.w()), $$1.d.b()));
   }

   public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, esq $$6) {
   }

   private static int[] c(esb.a $$0, int $$1, int $$2, int $$3, int $$4) {
      edc $$5 = $$0.b();
      djz $$6 = $$0.i();
      ehr $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, ehd.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, ehd.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, ehd.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, ehd.a.a, $$6, $$7)
      };
   }

   public static int a(esb.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(esb.a $$0, int $$1, int $$2) {
      djc $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(esb.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected iv a(esb.a $$0, dtw $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dtw.b) {
         $$2 = -5;
      } else if ($$1 == dtw.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dtw.d) {
         $$3 = -5;
      }

      djc $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new iv($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<esb.b> a(esb.a var1);

   public Optional<esb.b> b(esb.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract esk<?> e();

   public static record a(jt a, edc b, dle c, ehr d, ewe e, eic f, long g, djc h, djz i, Predicate<jf<dla>> j) {

      public a(jt $$0, edc $$1, dle $$2, ehr $$3, ewe $$4, long $$5, djc $$6, djz $$7, Predicate<jf<dla>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static eic a(long $$0, djc $$1) {
         eic $$2 = new eic(new ehe(0L));
         $$2.c($$0, $$1.h, $$1.i);
         return $$2;
      }
   }

   public static record b(iv a, Either<Consumer<est>, est> b) {
      public b(iv $$0, Consumer<est> $$1) {
         this($$0, Either.left($$1));
      }

      public est a() {
         return (est)this.b.map($$0 -> {
            est $$1 = new est();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public iv b() {
         return this.a;
      }

      public Either<Consumer<est>, est> c() {
         return this.b;
      }
   }

   public static record c(jj<dla> b, Map<bxx, esi> c, egz.a d, esm e) {
      static final esb.c f = new esb.c(jj.a(), Map.of(), egz.a.e, esm.a);
      public static final MapCodec<esb.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ju.a(mh.aG).fieldOf("biomes").forGetter(esb.c::a),
                  Codec.simpleMap(bxx.i, esi.a, bam.a(bxx.values())).fieldOf("spawn_overrides").forGetter(esb.c::b),
                  egz.a.l.fieldOf("step").forGetter(esb.c::c),
                  esm.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(esb.c::d)
               )
               .apply($$0, esb.c::new)
      );

      public c(jj<dla> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public jj<dla> a() {
         return this.b;
      }

      public Map<bxx, esi> b() {
         return this.c;
      }

      public egz.a c() {
         return this.d;
      }

      public esm d() {
         return this.e;
      }

      public static class a {
         private final jj<dla> a;
         private Map<bxx, esi> b = esb.c.f.c;
         private egz.a c = esb.c.f.d;
         private esm d = esb.c.f.e;

         public a(jj<dla> $$0) {
            this.a = $$0;
         }

         public esb.c.a a(Map<bxx, esi> $$0) {
            this.b = $$0;
            return this;
         }

         public esb.c.a a(egz.a $$0) {
            this.c = $$0;
            return this;
         }

         public esb.c.a a(esm $$0) {
            this.d = $$0;
            return this;
         }

         public esb.c a() {
            return new esb.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}

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

public abstract class ern {
   public static final Codec<ern> a = mg.R.q().dispatch(ern::e, erw::codec);
   public static final Codec<jf<ern>> b = alc.a(mh.be, a);
   protected final ern.c c;

   public static <S extends ern> RecordCodecBuilder<S, ern.c> a(Instance<S> $$0) {
      return ern.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends ern> MapCodec<S> a(Function<ern.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected ern(ern.c $$0) {
      this.c = $$0;
   }

   public jj<dkp> a() {
      return this.c.b;
   }

   public Map<bxm, eru> b() {
      return this.c.c;
   }

   public ego.a c() {
      return this.c.d;
   }

   public ery d() {
      return this.c.e;
   }

   public erf a(erf $$0) {
      return this.d() != ery.a ? $$0.a(12) : $$0;
   }

   public erv a(jf<ern> $$0, alf<djm> $$1, jt $$2, ecr $$3, dkt $$4, ehg $$5, evq $$6, long $$7, dir $$8, int $$9, djo $$10, Predicate<jf<dkp>> $$11) {
      brb $$12 = bqy.f.a($$8, $$1, $$0);
      ern.a $$13 = new ern.a($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10, $$11);
      Optional<ern.b> $$14 = this.b($$13);
      if ($$14.isPresent()) {
         esf $$15 = $$14.get().a();
         erv $$16 = new erv(this, $$8, $$9, $$15.a());
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

      return erv.b;
   }

   protected static Optional<ern.b> a(ern.a $$0, egs.a $$1, Consumer<esf> $$2) {
      dir $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new ern.b(new iv($$4, $$6, $$5), $$2));
   }

   private static boolean a(ern.b $$0, ern.a $$1) {
      iv $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jq.a($$2.u()), jq.a($$2.v()), jq.a($$2.w()), $$1.d.b()));
   }

   public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, esc $$6) {
   }

   private static int[] c(ern.a $$0, int $$1, int $$2, int $$3, int $$4) {
      ecr $$5 = $$0.b();
      djo $$6 = $$0.i();
      ehg $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, egs.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, egs.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, egs.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, egs.a.a, $$6, $$7)
      };
   }

   public static int a(ern.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(ern.a $$0, int $$1, int $$2) {
      dir $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(ern.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected iv a(ern.a $$0, dtl $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dtl.b) {
         $$2 = -5;
      } else if ($$1 == dtl.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dtl.d) {
         $$3 = -5;
      }

      dir $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new iv($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<ern.b> a(ern.a var1);

   public Optional<ern.b> b(ern.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract erw<?> e();

   public static record a(jt a, ecr b, dkt c, ehg d, evq e, ehr f, long g, dir h, djo i, Predicate<jf<dkp>> j) {

      public a(jt $$0, ecr $$1, dkt $$2, ehg $$3, evq $$4, long $$5, dir $$6, djo $$7, Predicate<jf<dkp>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static ehr a(long $$0, dir $$1) {
         ehr $$2 = new ehr(new egt(0L));
         $$2.c($$0, $$1.h, $$1.i);
         return $$2;
      }
   }

   public static record b(iv a, Either<Consumer<esf>, esf> b) {
      public b(iv $$0, Consumer<esf> $$1) {
         this($$0, Either.left($$1));
      }

      public esf a() {
         return (esf)this.b.map($$0 -> {
            esf $$1 = new esf();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public iv b() {
         return this.a;
      }

      public Either<Consumer<esf>, esf> c() {
         return this.b;
      }
   }

   public static record c(jj<dkp> b, Map<bxm, eru> c, ego.a d, ery e) {
      static final ern.c f = new ern.c(jj.a(), Map.of(), ego.a.e, ery.a);
      public static final MapCodec<ern.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ju.a(mh.aG).fieldOf("biomes").forGetter(ern.c::a),
                  Codec.simpleMap(bxm.i, eru.a, bak.a(bxm.values())).fieldOf("spawn_overrides").forGetter(ern.c::b),
                  ego.a.l.fieldOf("step").forGetter(ern.c::c),
                  ery.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(ern.c::d)
               )
               .apply($$0, ern.c::new)
      );

      public c(jj<dkp> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public jj<dkp> a() {
         return this.b;
      }

      public Map<bxm, eru> b() {
         return this.c;
      }

      public ego.a c() {
         return this.d;
      }

      public ery d() {
         return this.e;
      }

      public static class a {
         private final jj<dkp> a;
         private Map<bxm, eru> b = ern.c.f.c;
         private ego.a c = ern.c.f.d;
         private ery d = ern.c.f.e;

         public a(jj<dkp> $$0) {
            this.a = $$0;
         }

         public ern.c.a a(Map<bxm, eru> $$0) {
            this.b = $$0;
            return this;
         }

         public ern.c.a a(ego.a $$0) {
            this.c = $$0;
            return this;
         }

         public ern.c.a a(ery $$0) {
            this.d = $$0;
            return this;
         }

         public ern.c a() {
            return new ern.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}

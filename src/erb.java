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

public abstract class erb {
   public static final Codec<erb> a = mf.R.q().dispatch(erb::e, erk::codec);
   public static final Codec<je<erb>> b = alc.a(mg.be, a);
   protected final erb.c c;

   public static <S extends erb> RecordCodecBuilder<S, erb.c> a(Instance<S> $$0) {
      return erb.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends erb> MapCodec<S> a(Function<erb.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected erb(erb.c $$0) {
      this.c = $$0;
   }

   public ji<dkd> a() {
      return this.c.b;
   }

   public Map<bxh, eri> b() {
      return this.c.c;
   }

   public egc.a c() {
      return this.c.d;
   }

   public erm d() {
      return this.c.e;
   }

   public eqt a(eqt $$0) {
      return this.d() != erm.a ? $$0.a(12) : $$0;
   }

   public erj a(je<erb> $$0, alf<dja> $$1, js $$2, ecf $$3, dkh $$4, egu $$5, eve $$6, long $$7, dih $$8, int $$9, djc $$10, Predicate<je<dkd>> $$11) {
      bqz $$12 = bqw.f.a($$8, $$1, $$0);
      erb.a $$13 = new erb.a($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10, $$11);
      Optional<erb.b> $$14 = this.b($$13);
      if ($$14.isPresent()) {
         ert $$15 = $$14.get().a();
         erj $$16 = new erj(this, $$8, $$9, $$15.a());
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

      return erj.b;
   }

   protected static Optional<erb.b> a(erb.a $$0, egg.a $$1, Consumer<ert> $$2) {
      dih $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new erb.b(new iu($$4, $$6, $$5), $$2));
   }

   private static boolean a(erb.b $$0, erb.a $$1) {
      iu $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jp.a($$2.u()), jp.a($$2.v()), jp.a($$2.w()), $$1.d.b()));
   }

   public void a(djz $$0, djw $$1, ecf $$2, azv $$3, eqt $$4, dih $$5, erq $$6) {
   }

   private static int[] c(erb.a $$0, int $$1, int $$2, int $$3, int $$4) {
      ecf $$5 = $$0.b();
      djc $$6 = $$0.i();
      egu $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, egg.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, egg.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, egg.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, egg.a.a, $$6, $$7)
      };
   }

   public static int a(erb.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(erb.a $$0, int $$1, int $$2) {
      dih $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(erb.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected iu a(erb.a $$0, dsz $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dsz.b) {
         $$2 = -5;
      } else if ($$1 == dsz.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dsz.d) {
         $$3 = -5;
      }

      dih $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new iu($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<erb.b> a(erb.a var1);

   public Optional<erb.b> b(erb.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract erk<?> e();

   public static record a(js a, ecf b, dkh c, egu d, eve e, ehf f, long g, dih h, djc i, Predicate<je<dkd>> j) {

      public a(js $$0, ecf $$1, dkh $$2, egu $$3, eve $$4, long $$5, dih $$6, djc $$7, Predicate<je<dkd>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static ehf a(long $$0, dih $$1) {
         ehf $$2 = new ehf(new egh(0L));
         $$2.c($$0, $$1.h, $$1.i);
         return $$2;
      }
   }

   public static record b(iu a, Either<Consumer<ert>, ert> b) {
      public b(iu $$0, Consumer<ert> $$1) {
         this($$0, Either.left($$1));
      }

      public ert a() {
         return (ert)this.b.map($$0 -> {
            ert $$1 = new ert();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public iu b() {
         return this.a;
      }

      public Either<Consumer<ert>, ert> c() {
         return this.b;
      }
   }

   public static record c(ji<dkd> b, Map<bxh, eri> c, egc.a d, erm e) {
      static final erb.c f = new erb.c(ji.a(), Map.of(), egc.a.e, erm.a);
      public static final MapCodec<erb.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jt.a(mg.aG).fieldOf("biomes").forGetter(erb.c::a),
                  Codec.simpleMap(bxh.i, eri.a, bak.a(bxh.values())).fieldOf("spawn_overrides").forGetter(erb.c::b),
                  egc.a.l.fieldOf("step").forGetter(erb.c::c),
                  erm.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(erb.c::d)
               )
               .apply($$0, erb.c::new)
      );

      public c(ji<dkd> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public ji<dkd> a() {
         return this.b;
      }

      public Map<bxh, eri> b() {
         return this.c;
      }

      public egc.a c() {
         return this.d;
      }

      public erm d() {
         return this.e;
      }

      public static class a {
         private final ji<dkd> a;
         private Map<bxh, eri> b = erb.c.f.c;
         private egc.a c = erb.c.f.d;
         private erm d = erb.c.f.e;

         public a(ji<dkd> $$0) {
            this.a = $$0;
         }

         public erb.c.a a(Map<bxh, eri> $$0) {
            this.b = $$0;
            return this;
         }

         public erb.c.a a(egc.a $$0) {
            this.c = $$0;
            return this;
         }

         public erb.c.a a(erm $$0) {
            this.d = $$0;
            return this;
         }

         public erb.c a() {
            return new erb.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}

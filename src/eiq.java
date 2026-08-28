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

public abstract class eiq {
   public static final Codec<eiq> a = lq.R.r().dispatch(eiq::e, eiz::codec);
   public static final Codec<jj<eiq>> b = akg.a(lr.aQ, a);
   protected final eiq.c c;

   public static <S extends eiq> RecordCodecBuilder<S, eiq.c> a(Instance<S> $$0) {
      return eiq.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eiq> MapCodec<S> a(Function<eiq.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eiq(eiq.c $$0) {
      this.c = $$0;
   }

   public jn<ddd> a() {
      return this.c.b;
   }

   public Map<btb, eix> b() {
      return this.c.c;
   }

   public dxv.b c() {
      return this.c.d;
   }

   public ejb d() {
      return this.c.e;
   }

   public eii a(eii $$0) {
      return this.d() != ejb.a ? $$0.a(12) : $$0;
   }

   public eiy a(jx $$0, due $$1, ddh $$2, dyn $$3, emr $$4, long $$5, dbk $$6, int $$7, dcf $$8, Predicate<jj<ddd>> $$9) {
      eiq.a $$10 = new eiq.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<eiq.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         eji $$12 = $$11.get().a();
         eiy $$13 = new eiy(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return eiy.b;
   }

   protected static Optional<eiq.b> a(eiq.a $$0, dxz.a $$1, Consumer<eji> $$2) {
      dbk $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eiq.b(new ja($$4, $$6, $$5), $$2));
   }

   private static boolean a(eiq.b $$0, eiq.a $$1) {
      ja $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(ju.a($$2.u()), ju.a($$2.v()), ju.a($$2.w()), $$1.d.b()));
   }

   public void a(dcz $$0, dcx $$1, due $$2, aym $$3, eii $$4, dbk $$5, ejf $$6) {
   }

   private static int[] c(eiq.a $$0, int $$1, int $$2, int $$3, int $$4) {
      due $$5 = $$0.b();
      dcf $$6 = $$0.i();
      dyn $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dxz.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dxz.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dxz.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dxz.a.a, $$6, $$7)
      };
   }

   public static int a(eiq.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(eiq.a $$0, int $$1, int $$2) {
      dbk $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(eiq.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected ja a(eiq.a $$0, dls $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dls.b) {
         $$2 = -5;
      } else if ($$1 == dls.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dls.d) {
         $$3 = -5;
      }

      dbk $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new ja($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eiq.b> a(eiq.a var1);

   public Optional<eiq.b> b(eiq.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract eiz<?> e();

   public static record a(jx a, due b, ddh c, dyn d, emr e, dyy f, long g, dbk h, dcf i, Predicate<jj<ddd>> j) {

      public a(jx $$0, due $$1, ddh $$2, dyn $$3, emr $$4, long $$5, dbk $$6, dcf $$7, Predicate<jj<ddd>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dyy a(long $$0, dbk $$1) {
         dyy $$2 = new dyy(new dya(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(ja a, Either<Consumer<eji>, eji> b) {
      public b(ja $$0, Consumer<eji> $$1) {
         this($$0, Either.left($$1));
      }

      public eji a() {
         return (eji)this.b.map($$0 -> {
            eji $$1 = new eji();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public ja b() {
         return this.a;
      }

      public Either<Consumer<eji>, eji> c() {
         return this.b;
      }
   }

   public static record c(jn<ddd> b, Map<btb, eix> c, dxv.b d, ejb e) {
      public static final MapCodec<eiq.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jy.a(lr.aE).fieldOf("biomes").forGetter(eiq.c::a),
                  Codec.simpleMap(btb.i, eix.a, ayz.a(btb.values())).fieldOf("spawn_overrides").forGetter(eiq.c::b),
                  dxv.b.l.fieldOf("step").forGetter(eiq.c::c),
                  ejb.f.optionalFieldOf("terrain_adaptation", ejb.a).forGetter(eiq.c::d)
               )
               .apply($$0, eiq.c::new)
      );

      public jn<ddd> a() {
         return this.b;
      }

      public Map<btb, eix> b() {
         return this.c;
      }

      public dxv.b c() {
         return this.d;
      }

      public ejb d() {
         return this.e;
      }
   }
}

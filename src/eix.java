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

public abstract class eix {
   public static final Codec<eix> a = lq.R.r().dispatch(eix::e, ejg::codec);
   public static final Codec<jj<eix>> b = akg.a(lr.aQ, a);
   protected final eix.c c;

   public static <S extends eix> RecordCodecBuilder<S, eix.c> a(Instance<S> $$0) {
      return eix.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eix> MapCodec<S> a(Function<eix.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eix(eix.c $$0) {
      this.c = $$0;
   }

   public jn<ddg> a() {
      return this.c.b;
   }

   public Map<btf, eje> b() {
      return this.c.c;
   }

   public dyc.b c() {
      return this.c.d;
   }

   public eji d() {
      return this.c.e;
   }

   public eip a(eip $$0) {
      return this.d() != eji.a ? $$0.a(12) : $$0;
   }

   public ejf a(jx $$0, dui $$1, ddk $$2, dyu $$3, emz $$4, long $$5, dbn $$6, int $$7, dci $$8, Predicate<jj<ddg>> $$9) {
      eix.a $$10 = new eix.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<eix.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         ejp $$12 = $$11.get().a();
         ejf $$13 = new ejf(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return ejf.b;
   }

   protected static Optional<eix.b> a(eix.a $$0, dyg.a $$1, Consumer<ejp> $$2) {
      dbn $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eix.b(new ja($$4, $$6, $$5), $$2));
   }

   private static boolean a(eix.b $$0, eix.a $$1) {
      ja $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(ju.a($$2.u()), ju.a($$2.v()), ju.a($$2.w()), $$1.d.b()));
   }

   public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ejm $$6) {
   }

   private static int[] c(eix.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dui $$5 = $$0.b();
      dci $$6 = $$0.i();
      dyu $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dyg.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dyg.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dyg.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dyg.a.a, $$6, $$7)
      };
   }

   public static int a(eix.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(eix.a $$0, int $$1, int $$2) {
      dbn $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(eix.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected ja a(eix.a $$0, dlv $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dlv.b) {
         $$2 = -5;
      } else if ($$1 == dlv.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dlv.d) {
         $$3 = -5;
      }

      dbn $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new ja($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eix.b> a(eix.a var1);

   public Optional<eix.b> b(eix.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract ejg<?> e();

   public static record a(jx a, dui b, ddk c, dyu d, emz e, dzf f, long g, dbn h, dci i, Predicate<jj<ddg>> j) {

      public a(jx $$0, dui $$1, ddk $$2, dyu $$3, emz $$4, long $$5, dbn $$6, dci $$7, Predicate<jj<ddg>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dzf a(long $$0, dbn $$1) {
         dzf $$2 = new dzf(new dyh(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(ja a, Either<Consumer<ejp>, ejp> b) {
      public b(ja $$0, Consumer<ejp> $$1) {
         this($$0, Either.left($$1));
      }

      public ejp a() {
         return (ejp)this.b.map($$0 -> {
            ejp $$1 = new ejp();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public ja b() {
         return this.a;
      }

      public Either<Consumer<ejp>, ejp> c() {
         return this.b;
      }
   }

   public static record c(jn<ddg> b, Map<btf, eje> c, dyc.b d, eji e) {
      public static final MapCodec<eix.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jy.a(lr.aE).fieldOf("biomes").forGetter(eix.c::a),
                  Codec.simpleMap(btf.i, eje.a, azc.a(btf.values())).fieldOf("spawn_overrides").forGetter(eix.c::b),
                  dyc.b.l.fieldOf("step").forGetter(eix.c::c),
                  eji.f.optionalFieldOf("terrain_adaptation", eji.a).forGetter(eix.c::d)
               )
               .apply($$0, eix.c::new)
      );

      public jn<ddg> a() {
         return this.b;
      }

      public Map<btf, eje> b() {
         return this.c;
      }

      public dyc.b c() {
         return this.d;
      }

      public eji d() {
         return this.e;
      }
   }
}

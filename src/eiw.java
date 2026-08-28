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

public abstract class eiw {
   public static final Codec<eiw> a = lq.R.r().dispatch(eiw::e, ejf::codec);
   public static final Codec<jj<eiw>> b = akg.a(lr.aQ, a);
   protected final eiw.c c;

   public static <S extends eiw> RecordCodecBuilder<S, eiw.c> a(Instance<S> $$0) {
      return eiw.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eiw> MapCodec<S> a(Function<eiw.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eiw(eiw.c $$0) {
      this.c = $$0;
   }

   public jn<ddf> a() {
      return this.c.b;
   }

   public Map<bte, ejd> b() {
      return this.c.c;
   }

   public dyb.b c() {
      return this.c.d;
   }

   public ejh d() {
      return this.c.e;
   }

   public eio a(eio $$0) {
      return this.d() != ejh.a ? $$0.a(12) : $$0;
   }

   public eje a(jx $$0, duh $$1, ddj $$2, dyt $$3, emx $$4, long $$5, dbm $$6, int $$7, dch $$8, Predicate<jj<ddf>> $$9) {
      eiw.a $$10 = new eiw.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<eiw.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         ejo $$12 = $$11.get().a();
         eje $$13 = new eje(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return eje.b;
   }

   protected static Optional<eiw.b> a(eiw.a $$0, dyf.a $$1, Consumer<ejo> $$2) {
      dbm $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eiw.b(new ja($$4, $$6, $$5), $$2));
   }

   private static boolean a(eiw.b $$0, eiw.a $$1) {
      ja $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(ju.a($$2.u()), ju.a($$2.v()), ju.a($$2.w()), $$1.d.b()));
   }

   public void a(ddb $$0, dcz $$1, duh $$2, ayo $$3, eio $$4, dbm $$5, ejl $$6) {
   }

   private static int[] c(eiw.a $$0, int $$1, int $$2, int $$3, int $$4) {
      duh $$5 = $$0.b();
      dch $$6 = $$0.i();
      dyt $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dyf.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dyf.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dyf.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dyf.a.a, $$6, $$7)
      };
   }

   public static int a(eiw.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(eiw.a $$0, int $$1, int $$2) {
      dbm $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(eiw.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected ja a(eiw.a $$0, dlu $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dlu.b) {
         $$2 = -5;
      } else if ($$1 == dlu.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dlu.d) {
         $$3 = -5;
      }

      dbm $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new ja($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eiw.b> a(eiw.a var1);

   public Optional<eiw.b> b(eiw.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract ejf<?> e();

   public static record a(jx a, duh b, ddj c, dyt d, emx e, dze f, long g, dbm h, dch i, Predicate<jj<ddf>> j) {

      public a(jx $$0, duh $$1, ddj $$2, dyt $$3, emx $$4, long $$5, dbm $$6, dch $$7, Predicate<jj<ddf>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dze a(long $$0, dbm $$1) {
         dze $$2 = new dze(new dyg(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(ja a, Either<Consumer<ejo>, ejo> b) {
      public b(ja $$0, Consumer<ejo> $$1) {
         this($$0, Either.left($$1));
      }

      public ejo a() {
         return (ejo)this.b.map($$0 -> {
            ejo $$1 = new ejo();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public ja b() {
         return this.a;
      }

      public Either<Consumer<ejo>, ejo> c() {
         return this.b;
      }
   }

   public static record c(jn<ddf> b, Map<bte, ejd> c, dyb.b d, ejh e) {
      public static final MapCodec<eiw.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jy.a(lr.aE).fieldOf("biomes").forGetter(eiw.c::a),
                  Codec.simpleMap(bte.i, ejd.a, azc.a(bte.values())).fieldOf("spawn_overrides").forGetter(eiw.c::b),
                  dyb.b.l.fieldOf("step").forGetter(eiw.c::c),
                  ejh.f.optionalFieldOf("terrain_adaptation", ejh.a).forGetter(eiw.c::d)
               )
               .apply($$0, eiw.c::new)
      );

      public jn<ddf> a() {
         return this.b;
      }

      public Map<bte, ejd> b() {
         return this.c;
      }

      public dyb.b c() {
         return this.d;
      }

      public ejh d() {
         return this.e;
      }
   }
}

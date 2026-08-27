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

public abstract class ehj {
   public static final Codec<ehj> a = le.T.q().dispatch(ehj::e, ehs::codec);
   public static final Codec<ix<ehj>> b = aki.a(lf.aJ, a);
   protected final ehj.c c;

   public static <S extends ehj> RecordCodecBuilder<S, ehj.c> a(Instance<S> $$0) {
      return ehj.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends ehj> MapCodec<S> a(Function<ehj.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected ehj(ehj.c $$0) {
      this.c = $$0;
   }

   public jb<dbw> a() {
      return this.c.b;
   }

   public Map<bsr, ehq> b() {
      return this.c.c;
   }

   public dwp.b c() {
      return this.c.d;
   }

   public ehu d() {
      return this.c.e;
   }

   public ehb a(ehb $$0) {
      return this.d() != ehu.a ? $$0.a(12) : $$0;
   }

   public ehr a(jl $$0, dsy $$1, dca $$2, dxh $$3, elk $$4, long $$5, dae $$6, int $$7, daz $$8, Predicate<ix<dbw>> $$9) {
      ehj.a $$10 = new ehj.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<ehj.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         eib $$12 = $$11.get().a();
         ehr $$13 = new ehr(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return ehr.b;
   }

   protected static Optional<ehj.b> a(ehj.a $$0, dwt.a $$1, Consumer<eib> $$2) {
      dae $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new ehj.b(new io($$4, $$6, $$5), $$2));
   }

   private static boolean a(ehj.b $$0, ehj.a $$1) {
      io $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(ji.a($$2.u()), ji.a($$2.v()), ji.a($$2.w()), $$1.d.b()));
   }

   public void a(dbs $$0, dbq $$1, dsy $$2, ayk $$3, ehb $$4, dae $$5, ehy $$6) {
   }

   private static int[] b(ehj.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dsy $$5 = $$0.b();
      daz $$6 = $$0.i();
      dxh $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dwt.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dwt.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dwt.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dwt.a.a, $$6, $$7)
      };
   }

   protected static int a(ehj.a $$0, int $$1, int $$2) {
      dae $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(ehj.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected io a(ehj.a $$0, dkl $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dkl.b) {
         $$2 = -5;
      } else if ($$1 == dkl.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dkl.d) {
         $$3 = -5;
      }

      dae $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new io($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<ehj.b> a(ehj.a var1);

   public Optional<ehj.b> b(ehj.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract ehs<?> e();

   public static record a(jl a, dsy b, dca c, dxh d, elk e, dxs f, long g, dae h, daz i, Predicate<ix<dbw>> j) {

      public a(jl $$0, dsy $$1, dca $$2, dxh $$3, elk $$4, long $$5, dae $$6, daz $$7, Predicate<ix<dbw>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dxs a(long $$0, dae $$1) {
         dxs $$2 = new dxs(new dwu(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(io a, Either<Consumer<eib>, eib> b) {
      public b(io $$0, Consumer<eib> $$1) {
         this($$0, Either.left($$1));
      }

      public eib a() {
         return (eib)this.b.map($$0 -> {
            eib $$1 = new eib();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public io b() {
         return this.a;
      }

      public Either<Consumer<eib>, eib> c() {
         return this.b;
      }
   }

   public static record c(jb<dbw> b, Map<bsr, ehq> c, dwp.b d, ehu e) {
      public static final MapCodec<ehj.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jm.a(lf.az).fieldOf("biomes").forGetter(ehj.c::a),
                  Codec.simpleMap(bsr.i, ehq.a, ayx.a(bsr.values())).fieldOf("spawn_overrides").forGetter(ehj.c::b),
                  dwp.b.l.fieldOf("step").forGetter(ehj.c::c),
                  ehu.e.optionalFieldOf("terrain_adaptation", ehu.a).forGetter(ehj.c::d)
               )
               .apply($$0, ehj.c::new)
      );

      public jb<dbw> a() {
         return this.b;
      }

      public Map<bsr, ehq> b() {
         return this.c;
      }

      public dwp.b c() {
         return this.d;
      }

      public ehu d() {
         return this.e;
      }
   }
}

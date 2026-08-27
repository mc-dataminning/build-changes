import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ejt {
   public static final Codec<ejt> a = lh.T.q().dispatch(ejt::f, ekc::codec);
   public static final Codec<ja<ejt>> b = akp.a(li.aJ, a);
   protected final ejt.d c;

   public static <S extends ejt> RecordCodecBuilder<S, ejt.d> a(Instance<S> $$0) {
      return ejt.d.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends ejt> Codec<S> a(Function<ejt.d, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected ejt(ejt.d $$0) {
      this.c = $$0;
   }

   public je<dcz> a() {
      return this.c.b;
   }

   public List<ejt.a> b() {
      return this.c.c;
   }

   public Map<bsr, eka> c() {
      return this.c.d;
   }

   public dyq.b d() {
      return this.c.e;
   }

   public eke e() {
      return this.c.f;
   }

   public ejl a(ejl $$0) {
      return this.e() != eke.a ? $$0.a(12) : $$0;
   }

   public ekb a(jo $$0, duz $$1, ddd $$2, dzi $$3, enu $$4, long $$5, dbh $$6, int $$7, dcc $$8, Predicate<ja<dcz>> $$9, List<ejt.a> $$10) {
      ejt.b $$11 = new ejt.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9, $$10);
      Optional<ejt.c> $$12 = this.b($$11);
      if ($$12.isPresent()) {
         ekl $$13 = $$12.get().a();
         ekb $$14 = new ekb(this, $$6, $$7, $$13.a());
         if ($$14.b()) {
            return $$14;
         }
      }

      return ekb.b;
   }

   protected static Optional<ejt.c> a(ejt.b $$0, dyu.a $$1, Consumer<ekl> $$2) {
      dbh $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new ejt.c(new ir($$4, $$6, $$5), $$2));
   }

   private static boolean a(ejt.c $$0, ejt.b $$1) {
      ir $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(jl.a($$2.u()), jl.a($$2.v()), jl.a($$2.w()), $$1.d.b()));
   }

   private static boolean b(ejt.c $$0, ejt.b $$1) {
      ir $$2 = $$0.b();

      for (ejt.a $$4 : $$1.k()) {
         jv $$5 = $$4.a();
         ir $$6 = $$2.b($$5.u(), $$5.v(), $$5.w());
         double $$7 = $$1.d.a().l().a(new dyn.e($$6.u(), $$6.v(), $$6.w()));
         if ($$4.b() != $$7 > 0.0) {
            return false;
         }
      }

      return true;
   }

   public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, eki $$6) {
   }

   private static int[] b(ejt.b $$0, int $$1, int $$2, int $$3, int $$4) {
      duz $$5 = $$0.b();
      dcc $$6 = $$0.i();
      dzi $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dyu.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dyu.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dyu.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dyu.a.a, $$6, $$7)
      };
   }

   protected static int a(ejt.b $$0, int $$1, int $$2) {
      dbh $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(ejt.b $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected ir a(ejt.b $$0, dmd $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dmd.b) {
         $$2 = -5;
      } else if ($$1 == dmd.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dmd.d) {
         $$3 = -5;
      }

      dbh $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new ir($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<ejt.c> a(ejt.b var1);

   public Optional<ejt.c> b(ejt.b $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0) && b($$1, $$0));
   }

   public abstract ekc<?> f();

   public static record a(jv b, boolean c) {
      public static final Codec<ejt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jv.f.fieldOf("offset").forGetter(ejt.a::a), Codec.BOOL.fieldOf("dense").forGetter(ejt.a::b)).apply($$0, ejt.a::new)
      );

      public static ejt.a a(int $$0, int $$1, int $$2, boolean $$3) {
         return new ejt.a(new jv($$0, $$1, $$2), $$3);
      }

      public jv a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }
   }

   public static record b(jo a, duz b, ddd c, dzi d, enu e, dzt f, long g, dbh h, dcc i, Predicate<ja<dcz>> j, List<ejt.a> k) {

      public b(jo $$0, duz $$1, ddd $$2, dzi $$3, enu $$4, long $$5, dbh $$6, dcc $$7, Predicate<ja<dcz>> $$8, List<ejt.a> $$9) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8, $$9);
      }

      private static dzt a(long $$0, dbh $$1) {
         dzt $$2 = new dzt(new dyv(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record c(ir a, Either<Consumer<ekl>, ekl> b) {
      public c(ir $$0, Consumer<ekl> $$1) {
         this($$0, Either.left($$1));
      }

      public ekl a() {
         return (ekl)this.b.map($$0 -> {
            ekl $$1 = new ekl();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public ir b() {
         return this.a;
      }

      public Either<Consumer<ekl>, ekl> c() {
         return this.b;
      }
   }

   public static record d(je<dcz> b, List<ejt.a> c, Map<bsr, eka> d, dyq.b e, eke f) {
      public static final MapCodec<ejt.d> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jp.a(li.az).fieldOf("biomes").forGetter(ejt.d::a),
                  Codec.list(ejt.a.a).fieldOf("density_checks").forGetter(ejt.d::b),
                  Codec.simpleMap(bsr.i, eka.a, azg.a(bsr.values())).fieldOf("spawn_overrides").forGetter(ejt.d::c),
                  dyq.b.l.fieldOf("step").forGetter(ejt.d::d),
                  eke.f.optionalFieldOf("terrain_adaptation", eke.a).forGetter(ejt.d::e)
               )
               .apply($$0, ejt.d::new)
      );

      public je<dcz> a() {
         return this.b;
      }

      public List<ejt.a> b() {
         return this.c;
      }

      public Map<bsr, eka> c() {
         return this.d;
      }

      public dyq.b d() {
         return this.e;
      }

      public eke e() {
         return this.f;
      }
   }
}

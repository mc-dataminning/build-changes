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

public abstract class ehl {
   public static final Codec<ehl> a = le.T.q().dispatch(ehl::e, ehu::codec);
   public static final Codec<ix<ehl>> b = akj.a(lf.aJ, a);
   protected final ehl.c c;

   public static <S extends ehl> RecordCodecBuilder<S, ehl.c> a(Instance<S> $$0) {
      return ehl.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends ehl> MapCodec<S> a(Function<ehl.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected ehl(ehl.c $$0) {
      this.c = $$0;
   }

   public jb<dby> a() {
      return this.c.b;
   }

   public Map<bst, ehs> b() {
      return this.c.c;
   }

   public dwr.b c() {
      return this.c.d;
   }

   public ehw d() {
      return this.c.e;
   }

   public ehd a(ehd $$0) {
      return this.d() != ehw.a ? $$0.a(12) : $$0;
   }

   public eht a(jl $$0, dta $$1, dcc $$2, dxj $$3, elm $$4, long $$5, dag $$6, int $$7, dbb $$8, Predicate<ix<dby>> $$9) {
      ehl.a $$10 = new ehl.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<ehl.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         eid $$12 = $$11.get().a();
         eht $$13 = new eht(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return eht.b;
   }

   protected static Optional<ehl.b> a(ehl.a $$0, dwv.a $$1, Consumer<eid> $$2) {
      dag $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new ehl.b(new io($$4, $$6, $$5), $$2));
   }

   private static boolean a(ehl.b $$0, ehl.a $$1) {
      io $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(ji.a($$2.u()), ji.a($$2.v()), ji.a($$2.w()), $$1.d.b()));
   }

   public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, eia $$6) {
   }

   private static int[] b(ehl.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dta $$5 = $$0.b();
      dbb $$6 = $$0.i();
      dxj $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dwv.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dwv.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dwv.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dwv.a.a, $$6, $$7)
      };
   }

   protected static int a(ehl.a $$0, int $$1, int $$2) {
      dag $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(ehl.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected io a(ehl.a $$0, dkn $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dkn.b) {
         $$2 = -5;
      } else if ($$1 == dkn.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dkn.d) {
         $$3 = -5;
      }

      dag $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new io($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<ehl.b> a(ehl.a var1);

   public Optional<ehl.b> b(ehl.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract ehu<?> e();

   public static record a(jl a, dta b, dcc c, dxj d, elm e, dxu f, long g, dag h, dbb i, Predicate<ix<dby>> j) {

      public a(jl $$0, dta $$1, dcc $$2, dxj $$3, elm $$4, long $$5, dag $$6, dbb $$7, Predicate<ix<dby>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dxu a(long $$0, dag $$1) {
         dxu $$2 = new dxu(new dww(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(io a, Either<Consumer<eid>, eid> b) {
      public b(io $$0, Consumer<eid> $$1) {
         this($$0, Either.left($$1));
      }

      public eid a() {
         return (eid)this.b.map($$0 -> {
            eid $$1 = new eid();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public io b() {
         return this.a;
      }

      public Either<Consumer<eid>, eid> c() {
         return this.b;
      }
   }

   public static record c(jb<dby> b, Map<bst, ehs> c, dwr.b d, ehw e) {
      public static final MapCodec<ehl.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jm.a(lf.az).fieldOf("biomes").forGetter(ehl.c::a),
                  Codec.simpleMap(bst.i, ehs.a, ayz.a(bst.values())).fieldOf("spawn_overrides").forGetter(ehl.c::b),
                  dwr.b.l.fieldOf("step").forGetter(ehl.c::c),
                  ehw.e.optionalFieldOf("terrain_adaptation", ehw.a).forGetter(ehl.c::d)
               )
               .apply($$0, ehl.c::new)
      );

      public jb<dby> a() {
         return this.b;
      }

      public Map<bst, ehs> b() {
         return this.c;
      }

      public dwr.b c() {
         return this.d;
      }

      public ehw d() {
         return this.e;
      }
   }
}

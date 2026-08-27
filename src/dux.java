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

public abstract class dux {
   public static final Codec<dux> a = jc.U.q().dispatch(dux::e, dvg::codec);
   public static final Codec<hf<dux>> b = ael.a(jd.az, a);
   protected final dux.c c;

   public static <S extends dux> RecordCodecBuilder<S, dux.c> a(Instance<S> $$0) {
      return dux.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends dux> Codec<S> a(Function<dux.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected dux(dux.c $$0) {
      this.c = $$0;
   }

   public hj<cqi> a() {
      return this.c.b;
   }

   public Map<biz, dve> b() {
      return this.c.c;
   }

   public dkd.b c() {
      return this.c.d;
   }

   public dvi d() {
      return this.c.e;
   }

   public dup a(dup $$0) {
      return this.d() != dvi.a ? $$0.a(12) : $$0;
   }

   public dvf a(ht $$0, dgv $$1, cqm $$2, dkv $$3, dyr $$4, long $$5, cor $$6, int $$7, cpm $$8, Predicate<hf<cqi>> $$9) {
      dux.a $$10 = new dux.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<dux.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         dvp $$12 = $$11.get().a();
         dvf $$13 = new dvf(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return dvf.b;
   }

   protected static Optional<dux.b> a(dux.a $$0, dkh.a $$1, Consumer<dvp> $$2) {
      cor $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new dux.b(new gv($$4, $$6, $$5), $$2));
   }

   private static boolean a(dux.b $$0, dux.a $$1) {
      gv $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(hr.a($$2.u()), hr.a($$2.v()), hr.a($$2.w()), $$1.d.b()));
   }

   public void a(cqe $$0, cqc $$1, dgv $$2, art $$3, dup $$4, cor $$5, dvm $$6) {
   }

   private static int[] b(dux.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dgv $$5 = $$0.b();
      cpm $$6 = $$0.i();
      dkv $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dkh.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dkh.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dkh.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dkh.a.a, $$6, $$7)
      };
   }

   protected static int a(dux.a $$0, int $$1, int $$2) {
      cor $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(dux.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected gv a(dux.a $$0, cyw $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == cyw.b) {
         $$2 = -5;
      } else if ($$1 == cyw.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == cyw.d) {
         $$3 = -5;
      }

      cor $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new gv($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<dux.b> a(dux.a var1);

   public Optional<dux.b> b(dux.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract dvg<?> e();

   public static record a(ht a, dgv b, cqm c, dkv d, dyr e, dlg f, long g, cor h, cpm i, Predicate<hf<cqi>> j) {

      public a(ht $$0, dgv $$1, cqm $$2, dkv $$3, dyr $$4, long $$5, cor $$6, cpm $$7, Predicate<hf<cqi>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dlg a(long $$0, cor $$1) {
         dlg $$2 = new dlg(new dki(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(gv a, Either<Consumer<dvp>, dvp> b) {
      public b(gv $$0, Consumer<dvp> $$1) {
         this($$0, Either.left($$1));
      }

      public dvp a() {
         return (dvp)this.b.map($$0 -> {
            dvp $$1 = new dvp();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public gv b() {
         return this.a;
      }

      public Either<Consumer<dvp>, dvp> c() {
         return this.b;
      }
   }

   public static record c(hj<cqi> b, Map<biz, dve> c, dkd.b d, dvi e) {
      public static final MapCodec<dux.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  hu.a(jd.ap).fieldOf("biomes").forGetter(dux.c::a),
                  Codec.simpleMap(biz.i, dve.a, asf.a(biz.values())).fieldOf("spawn_overrides").forGetter(dux.c::b),
                  dkd.b.l.fieldOf("step").forGetter(dux.c::c),
                  dvi.e.optionalFieldOf("terrain_adaptation", dvi.a).forGetter(dux.c::d)
               )
               .apply($$0, dux.c::new)
      );

      public hj<cqi> a() {
         return this.b;
      }

      public Map<biz, dve> b() {
         return this.c;
      }

      public dkd.b c() {
         return this.d;
      }

      public dvi d() {
         return this.e;
      }
   }
}

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

public abstract class dsa {
   public static final Codec<dsa> a = jb.U.q().dispatch(dsa::e, dsj::codec);
   public static final Codec<he<dsa>> b = acm.a(jc.az, a);
   protected final dsa.c c;

   public static <S extends dsa> RecordCodecBuilder<S, dsa.c> a(Instance<S> $$0) {
      return dsa.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends dsa> Codec<S> a(Function<dsa.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected dsa(dsa.c $$0) {
      this.c = $$0;
   }

   public hi<cnk> a() {
      return this.c.b;
   }

   public Map<bgc, dsh> b() {
      return this.c.c;
   }

   public dhg.b c() {
      return this.c.d;
   }

   public dsl d() {
      return this.c.e;
   }

   public drs a(drs $$0) {
      return this.d() != dsl.a ? $$0.a(12) : $$0;
   }

   public dsi a(hs $$0, ddy $$1, cno $$2, dhy $$3, dvu $$4, long $$5, clt $$6, int $$7, cmo $$8, Predicate<he<cnk>> $$9) {
      dsa.a $$10 = new dsa.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<dsa.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         dss $$12 = $$11.get().a();
         dsi $$13 = new dsi(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return dsi.b;
   }

   protected static Optional<dsa.b> a(dsa.a $$0, dhk.a $$1, Consumer<dss> $$2) {
      clt $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new dsa.b(new gu($$4, $$6, $$5), $$2));
   }

   private static boolean a(dsa.b $$0, dsa.a $$1) {
      gu $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(hq.a($$2.u()), hq.a($$2.v()), hq.a($$2.w()), $$1.d.b()));
   }

   public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, dsp $$6) {
   }

   private static int[] b(dsa.a $$0, int $$1, int $$2, int $$3, int $$4) {
      ddy $$5 = $$0.b();
      cmo $$6 = $$0.i();
      dhy $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dhk.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dhk.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dhk.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dhk.a.a, $$6, $$7)
      };
   }

   protected static int a(dsa.a $$0, int $$1, int $$2) {
      clt $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(dsa.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected gu a(dsa.a $$0, cvz $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == cvz.b) {
         $$2 = -5;
      } else if ($$1 == cvz.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == cvz.d) {
         $$3 = -5;
      }

      clt $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new gu($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<dsa.b> a(dsa.a var1);

   public Optional<dsa.b> b(dsa.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract dsj<?> e();

   public static record a(hs a, ddy b, cno c, dhy d, dvu e, dij f, long g, clt h, cmo i, Predicate<he<cnk>> j) {

      public a(hs $$0, ddy $$1, cno $$2, dhy $$3, dvu $$4, long $$5, clt $$6, cmo $$7, Predicate<he<cnk>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dij a(long $$0, clt $$1) {
         dij $$2 = new dij(new dhl(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(gu a, Either<Consumer<dss>, dss> b) {
      public b(gu $$0, Consumer<dss> $$1) {
         this($$0, Either.left($$1));
      }

      public dss a() {
         return (dss)this.b.map($$0 -> {
            dss $$1 = new dss();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public gu b() {
         return this.a;
      }

      public Either<Consumer<dss>, dss> c() {
         return this.b;
      }
   }

   public static record c(hi<cnk> b, Map<bgc, dsh> c, dhg.b d, dsl e) {
      public static final MapCodec<dsa.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ht.a(jc.ap).fieldOf("biomes").forGetter(dsa.c::a),
                  Codec.simpleMap(bgc.i, dsh.a, apr.a(bgc.values())).fieldOf("spawn_overrides").forGetter(dsa.c::b),
                  dhg.b.l.fieldOf("step").forGetter(dsa.c::c),
                  dsl.e.optionalFieldOf("terrain_adaptation", dsl.a).forGetter(dsa.c::d)
               )
               .apply($$0, dsa.c::new)
      );

      public hi<cnk> a() {
         return this.b;
      }

      public Map<bgc, dsh> b() {
         return this.c;
      }

      public dhg.b c() {
         return this.d;
      }

      public dsl d() {
         return this.e;
      }
   }
}

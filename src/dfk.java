import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfk extends dde {
   public static final MapCodec<dfk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqw.a.fieldOf("block_set_type").forGetter(dfk::b), u()).apply($$0, dfk::new)
   );
   public static final drb b = dha.aE;
   public static final dqy c = dqx.u;
   public static final drf<drc> d = dqx.be;
   public static final dqy e = dqx.w;
   public static final drf<drd> f = dqx.ae;
   protected static final float g = 3.0F;
   protected static final eui h = dde.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eui i = dde.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eui j = dde.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eui k = dde.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dqw l;

   @Override
   public MapCodec<? extends dfk> a() {
      return a;
   }

   protected dfk(dqw $$0, dqg.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, is.c).a(c, Boolean.valueOf(false)).a(d, drc.a).a(e, Boolean.valueOf(false)).a(f, drd.b));
   }

   public dqw b() {
      return this.l;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      is $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == drc.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      drd $$6 = $$0.c(f);
      if ($$1.o() != is.a.b || $$6 == drd.b != ($$1 == is.b)) {
         return $$6 == drd.b && $$1 == is.a && !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dfk && $$2.c(f) != $$6 ? $$2.a(f, $$6) : ddg.a.n();
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, czv $$3, BiConsumer<csz, in> $$4) {
      if ($$3.j() == czv.a.d && $$0.c(f) == drd.b && !$$1.x_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dqh a(dad $$0, in $$1, dqh $$2, clh $$3) {
      if (!$$0.B && ($$3.f() || !$$3.e($$2))) {
         dfm.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      in $$1 = $$0.a();
      dad $$2 = $$0.q();
      if ($$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.n().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, drd.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, bsa $$3, csz $$4) {
      $$0.a($$1.c(), $$2.a(f, drd.a), 3);
   }

   private drc b(cwi $$0) {
      czj $$1 = $$0.q();
      in $$2 = $$0.a();
      is $$3 = $$0.g();
      in $$4 = $$2.c();
      is $$5 = $$3.i();
      in $$6 = $$2.a($$5);
      dqh $$7 = $$1.a_($$6);
      in $$8 = $$4.a($$5);
      dqh $$9 = $$1.a_($$8);
      is $$10 = $$3.h();
      in $$11 = $$2.a($$10);
      dqh $$12 = $$1.a_($$11);
      in $$13 = $$4.a($$10);
      dqh $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == drd.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == drd.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            etp $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? drc.a : drc.b;
         } else {
            return drc.a;
         }
      } else {
         return drc.b;
      }
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if (!this.l.c()) {
         return bpm.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dva.h : dva.d, $$2);
         return bpm.a($$1.B);
      }
   }

   public boolean m(dqh $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable brh $$0, dad $$1, dqh $$2, in $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dva.h : dva.d, $$3);
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == drd.b ? is.b : is.a));
      if (!this.n().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dva.h : dva.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      in $$3 = $$2.d();
      dqh $$4 = $$1.a_($$3);
      return $$0.c(f) == drd.b ? $$4.d($$1, $$3, is.b) : $$4.a(this);
   }

   private void a(@Nullable brh $$0, dad $$1, in $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), avd.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$1 == dib.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dqh $$0, in $$1) {
      return axz.b($$1.u(), $$1.c($$0.c(f) == drd.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dad $$0, in $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dqh $$0) {
      if ($$0.b() instanceof dfk $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}

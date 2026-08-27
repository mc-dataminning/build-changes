import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfb extends dcv {
   public static final MapCodec<dfb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqn.a.fieldOf("block_set_type").forGetter(dfb::b), u()).apply($$0, dfb::new)
   );
   public static final dqs b = dgr.aE;
   public static final dqp c = dqo.u;
   public static final dqw<dqt> d = dqo.be;
   public static final dqp e = dqo.w;
   public static final dqw<dqu> f = dqo.ae;
   protected static final float g = 3.0F;
   protected static final ety h = dcv.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ety i = dcv.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ety j = dcv.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ety k = dcv.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dqn l;

   @Override
   public MapCodec<? extends dfb> a() {
      return a;
   }

   protected dfb(dqn $$0, dpx.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, ir.c).a(c, Boolean.valueOf(false)).a(d, dqt.a).a(e, Boolean.valueOf(false)).a(f, dqu.b));
   }

   public dqn b() {
      return this.l;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      ir $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dqt.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      dqu $$6 = $$0.c(f);
      if ($$1.o() != ir.a.b || $$6 == dqu.b != ($$1 == ir.b)) {
         return $$6 == dqu.b && $$1 == ir.a && !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dfb && $$2.c(f) != $$6 ? $$2.a(f, $$6) : dcx.a.n();
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, czm $$3, BiConsumer<csd, im> $$4) {
      if ($$3.j() == czm.a.d && $$0.c(f) == dqu.b && !$$1.x_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dpy a(czu $$0, im $$1, dpy $$2, ckl $$3) {
      if (!$$0.B && ($$3.f() || !$$3.e($$2))) {
         dfd.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      im $$1 = $$0.a();
      czu $$2 = $$0.q();
      if ($$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.n().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dqu.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, bre $$3, csd $$4) {
      $$0.a($$1.c(), $$2.a(f, dqu.a), 3);
   }

   private dqt b(cvl $$0) {
      cza $$1 = $$0.q();
      im $$2 = $$0.a();
      ir $$3 = $$0.g();
      im $$4 = $$2.c();
      ir $$5 = $$3.i();
      im $$6 = $$2.a($$5);
      dpy $$7 = $$1.a_($$6);
      im $$8 = $$4.a($$5);
      dpy $$9 = $$1.a_($$8);
      ir $$10 = $$3.h();
      im $$11 = $$2.a($$10);
      dpy $$12 = $$1.a_($$11);
      im $$13 = $$4.a($$10);
      dpy $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dqu.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dqu.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            etf $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dqt.a : dqt.b;
         } else {
            return dqt.a;
         }
      } else {
         return dqt.b;
      }
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if (!this.l.c()) {
         return boq.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dur.h : dur.d, $$2);
         return boq.a($$1.B);
      }
   }

   public boolean m(dpy $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bql $$0, czu $$1, dpy $$2, im $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dur.h : dur.d, $$3);
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dqu.b ? ir.b : ir.a));
      if (!this.n().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dur.h : dur.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      im $$3 = $$2.d();
      dpy $$4 = $$1.a_($$3);
      return $$0.c(f) == dqu.b ? $$4.d($$1, $$3, ir.b) : $$4.a(this);
   }

   private void a(@Nullable bql $$0, czu $$1, im $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), ava.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$1 == dhs.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dpy $$0, im $$1) {
      return axw.b($$1.u(), $$1.c($$0.c(f) == dqu.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(czu $$0, im $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dpy $$0) {
      if ($$0.b() instanceof dfb $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}

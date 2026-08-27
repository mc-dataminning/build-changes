import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class def extends dex implements dfn {
   public static final MapCodec<def> a = b(def::new);
   public static final dqw<dqr> b = dqo.bd;

   @Override
   public MapCodec<def> a() {
      return a;
   }

   public def(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ir.c).a(d, Boolean.valueOf(false)).a(b, dqr.a));
   }

   @Override
   protected int g(dpy $$0) {
      return 2;
   }

   @Override
   public dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1 == ir.a && !this.b($$3, $$5, $$2) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(cza $$0, im $$1, dpy $$2) {
      dnd $$3 = $$0.c_($$1);
      return $$3 instanceof dno ? ((dno)$$3).b() : 0;
   }

   private int e(czu $$0, im $$1, dpy $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dak)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dqr.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(czu $$0, im $$1, dpy $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dak)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dqr.a;
      }
   }

   @Override
   protected int b(czu $$0, im $$1, dpy $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ir $$4 = $$2.c(aE);
      im $$5 = $$1.a($$4);
      dpy $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cgo $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.J(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cgo a(czu $$0, ir $$1, im $$2) {
      List<cgo> $$3 = $$0.a(
         cgo.class,
         new eta((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cF() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if (!$$3.gb().e) {
         return boq.d;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dqr.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, auz.fm, ava.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return boq.a($$1.B);
      }
   }

   @Override
   protected void c(czu $$0, im $$1, dpy $$2) {
      if (!$$0.O().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dnd $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dno ? ((dno)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            eva $$6 = this.b($$0, $$1, $$2) ? eva.c : eva.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(czu $$0, im $$1, dpy $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dnd $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dno $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dqr.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(d);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dpy $$0, czu $$1, im $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dnd $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dno($$0, $$1);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(aE, b, d);
   }
}

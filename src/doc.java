import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class doc extends dou implements dpl {
   public static final MapCodec<doc> a = b(doc::new);
   public static final ebr<ebm> b = ebj.bg;

   @Override
   public MapCodec<doc> a() {
      return a;
   }

   public doc(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jb.c).b(c, Boolean.valueOf(false)).b(b, ebm.a));
   }

   @Override
   protected int h(eat $$0) {
      return 2;
   }

   @Override
   public eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return $$4 == jb.a && !this.a($$1, $$5, $$6) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(diq $$0, iv $$1, eat $$2) {
      dxr $$3 = $$0.c_($$1);
      return $$3 instanceof dyd ? ((dyd)$$3).a() : 0;
   }

   private int e(djm $$0, iv $$1, eat $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dke)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == ebm.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(djm $$0, iv $$1, eat $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dke)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == ebm.a;
      }
   }

   @Override
   protected int b(djm $$0, iv $$1, eat $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jb $$4 = $$2.c(e);
      iv $$5 = $$1.a($$4);
      eat $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cnk $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.z(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cnk a(djm $$0, jb $$1, iv $$2) {
      List<cnk> $$3 = $$0.a(
         cnk.class,
         new fex((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cN() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$3.gj().e) {
         return bug.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == ebm.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awn.fv, awo.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bug.a;
      }
   }

   @Override
   protected void c(djm $$0, iv $$1, eat $$2) {
      if (!$$0.U().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dxr $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dyd ? ((dyd)$$4).a() : 0;
         if ($$3 != $$5 || $$2.c(c) != this.a($$0, $$1, $$2)) {
            fgy $$6 = this.b($$0, $$1, $$2) ? fgy.c : fgy.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(djm $$0, iv $$1, eat $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dxr $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dyd $$6) {
         $$5 = $$6.a();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == ebm.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(c);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.b(c, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.b(c, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(eat $$0, djm $$1, iv $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dxr $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dyd($$0, $$1);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(e, b, c);
   }
}

import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dne extends dnx implements don {
   public static final MapCodec<dne> a = b(dne::new);
   public static final eam<eah> b = eae.bg;

   @Override
   public MapCodec<dne> a() {
      return a;
   }

   public dne(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, ja.c).b(c, Boolean.valueOf(false)).b(b, eah.a));
   }

   @Override
   protected int h(dzo $$0) {
      return 2;
   }

   @Override
   public dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4 == ja.a && !this.a($$1, $$5, $$6) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(dhv $$0, iu $$1, dzo $$2) {
      dwn $$3 = $$0.c_($$1);
      return $$3 instanceof dwz ? ((dwz)$$3).a() : 0;
   }

   private int e(dip $$0, iu $$1, dzo $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((djh)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == eah.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dip $$0, iu $$1, dzo $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((djh)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == eah.a;
      }
   }

   @Override
   protected int b(dip $$0, iu $$1, dzo $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ja $$4 = $$2.c(e);
      iu $$5 = $$1.a($$4);
      dzo $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cmq $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.z(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cmq a(dip $$0, ja $$1, iu $$2) {
      List<cmq> $$3 = $$0.a(
         cmq.class,
         new fdr((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cO() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$3.gj().e) {
         return bty.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == eah.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awl.ft, awm.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bty.a;
      }
   }

   @Override
   protected void c(dip $$0, iu $$1, dzo $$2) {
      if (!$$0.U().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dwn $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dwz ? ((dwz)$$4).a() : 0;
         if ($$3 != $$5 || $$2.c(c) != this.a($$0, $$1, $$2)) {
            ffs $$6 = this.b($$0, $$1, $$2) ? ffs.c : ffs.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dip $$0, iu $$1, dzo $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dwn $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dwz $$6) {
         $$5 = $$6.a();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == eah.a) {
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
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dzo $$0, dip $$1, iu $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dwn $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dwz($$0, $$1);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(e, b, c);
   }
}

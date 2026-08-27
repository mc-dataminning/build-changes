import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dfk extends dgc implements dgs {
   public static final MapCodec<dfk> a = b(dfk::new);
   public static final dsb<drw> b = drt.bd;

   @Override
   public MapCodec<dfk> a() {
      return a;
   }

   public dfk(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, it.c).a(d, Boolean.valueOf(false)).a(b, drw.a));
   }

   @Override
   protected int g(drd $$0) {
      return 2;
   }

   @Override
   public drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$1 == it.a && !this.b($$3, $$5, $$2) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(daf $$0, io $$1, drd $$2) {
      doi $$3 = $$0.c_($$1);
      return $$3 instanceof dot ? ((dot)$$3).b() : 0;
   }

   private int e(daz $$0, io $$1, drd $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dbp)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == drw.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(daz $$0, io $$1, drd $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dbp)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == drw.a;
      }
   }

   @Override
   protected int b(daz $$0, io $$1, drd $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      it $$4 = $$2.c(aE);
      io $$5 = $$1.a($$4);
      drd $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cib $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.J(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cib a(daz $$0, it $$1, io $$2) {
      List<cib> $$3 = $$0.a(
         cib.class,
         new euh((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cH() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if (!$$3.gd().e) {
         return bpw.d;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == drw.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, avi.fr, avj.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bpw.a($$1.B);
      }
   }

   @Override
   protected void c(daz $$0, io $$1, drd $$2) {
      if (!$$0.O().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         doi $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dot ? ((dot)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            ewh $$6 = this.b($$0, $$1, $$2) ? ewh.c : ewh.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(daz $$0, io $$1, drd $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      doi $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dot $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == drw.a) {
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
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(drd $$0, daz $$1, io $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      doi $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dot($$0, $$1);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(aE, b, d);
   }
}

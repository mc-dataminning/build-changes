import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dui extends dlg implements dpe {
   public static final MapCodec<dui> a = b(dui::new);
   public static final eam<eaz> b = eae.bF;

   public dui(dzn.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dyh($$0, $$1);
   }

   @Override
   public dzo a(dcl $$0) {
      das $$1 = $$0.n().a(kj.aq);
      dzo $$2 = this.m();
      if ($$1 != null) {
         eaz $$3 = $$1.a(b);
         if ($$3 != null) {
            $$2 = $$2.b(b, $$3);
         }
      }

      return $$2;
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if ($$1.c_($$2) instanceof dyh $$6) {
         if (!$$3.gF()) {
            return bty.e;
         } else {
            if ($$1.C) {
               $$3.a($$6);
            }

            return bty.a;
         }
      } else {
         return bty.e;
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      dyh $$4 = a($$1, $$2);
      if ($$4 != null) {
         $$4.f();
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      dyh $$6 = a($$1, $$2);
      if ($$6 != null) {
         if ($$6.d() != eaz.a) {
            boolean $$7 = $$1.D($$2);
            boolean $$8 = $$6.c();
            if ($$7 && !$$8) {
               $$6.a(true);
               $$6.j();
            } else if (!$$7 && $$8) {
               $$6.a(false);
            }
         }
      }
   }

   @Nullable
   private static dyh a(dip $$0, iu $$1) {
      if ($$0 instanceof aro $$2) {
         dwn var4 = $$2.c_($$1);
         if (var4 instanceof dyh) {
            return (dyh)var4;
         }
      }

      return null;
   }

   @Override
   public int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      if ($$0.c(b) != eaz.a) {
         return 0;
      } else if ($$1.c_($$2) instanceof dyh $$5) {
         return $$5.c() ? 15 : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      cys $$4 = super.a($$0, $$1, $$2, $$3);
      return a($$4, $$2.c(b));
   }

   public static cys a(cys $$0, eaz $$1) {
      $$0.b(kj.aq, $$0.a(kj.aq, das.a).a(b, $$1));
      return $$0;
   }

   @Override
   protected MapCodec<dui> a() {
      return a;
   }
}

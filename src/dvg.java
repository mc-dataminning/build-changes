import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvg extends dly implements dpy {
   public static final MapCodec<dvg> a = b(dvg::new);
   public static final ebm<ebz> b = ebe.bF;

   public dvg(ean.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dzg($$0, $$1);
   }

   @Override
   public eao a(ddd $$0) {
      dbk $$1 = $$0.n().a(kk.aq);
      eao $$2 = this.m();
      if ($$1 != null) {
         ebz $$3 = $$1.a(b);
         if ($$3 != null) {
            $$2 = $$2.b(b, $$3);
         }
      }

      return $$2;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if ($$1.c_($$2) instanceof dzg $$6) {
         if (!$$3.gF()) {
            return bug.e;
         } else {
            if ($$1.C) {
               $$3.a($$6);
            }

            return bug.a;
         }
      } else {
         return bug.e;
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      dzg $$4 = a($$1, $$2);
      if ($$4 != null) {
         $$4.f();
      }
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      dzg $$6 = a($$1, $$2);
      if ($$6 != null) {
         if ($$6.d() != ebz.a) {
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
   private static dzg a(djh $$0, iv $$1) {
      if ($$0 instanceof arq $$2) {
         dxm var4 = $$2.c_($$1);
         if (var4 instanceof dzg) {
            return (dzg)var4;
         }
      }

      return null;
   }

   @Override
   public int a(eao $$0, din $$1, iv $$2, jb $$3) {
      if ($$0.c(b) != ebz.a) {
         return 0;
      } else if ($$1.c_($$2) instanceof dzg $$5) {
         return $$5.c() ? 15 : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      czk $$4 = super.a($$0, $$1, $$2, $$3);
      return a($$4, $$2.c(b));
   }

   public static czk a(czk $$0, ebz $$1) {
      $$0.b(kk.aq, $$0.a(kk.aq, dbk.a).a(b, $$1));
      return $$0;
   }

   @Override
   protected MapCodec<dvg> a() {
      return a;
   }
}

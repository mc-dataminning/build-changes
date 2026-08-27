import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dbc extends dbt {
   public static final dqc a = dgc.aE;
   public static final dpz b = dpy.r;

   protected dbc(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ij.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dbc> a();

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.a;
      } else {
         this.a($$1, $$2, $$3);
         return bof.b;
      }
   }

   protected abstract void a(czg var1, id var2, cka var3);

   @Override
   public dpi a(cux $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dmo $$5 = $$1.c_($$2);
         if ($$5 instanceof dmc) {
            if ($$1 instanceof apu) {
               bob.a($$1, $$2, (dmc)$$5);
               ((dmc)$$5).a((apu)$$1, esj.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return cmw.a($$1.c_($$2));
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dmo> dmp<T> a(czg $$0, dmq<T> $$1, dmq<? extends dmc> $$2) {
      return $$0.B ? null : a($$1, $$2, dmc::a);
   }
}

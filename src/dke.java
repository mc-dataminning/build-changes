import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dke extends dbt implements dfp {
   public static final MapCodec<dke> a = b(dke::new);
   public static final dqg<dqs> b = dpy.bj;

   @Override
   public MapCodec<dke> a() {
      return a;
   }

   protected dke(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dqs.b));
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dod($$0, $$1);
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      dmo $$5 = $$1.c_($$2);
      if ($$5 instanceof dod) {
         return ((dod)$$5).a($$3) ? bof.a($$1.B) : bof.d;
      } else {
         return bof.d;
      }
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, @Nullable bqt $$3, crs $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dmo $$5 = $$0.c_($$1);
            if ($$5 instanceof dod) {
               ((dod)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      if ($$1 instanceof apu) {
         if ($$1.c_($$2) instanceof dod $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.C();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((apu)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(apu $$0, dod $$1) {
      switch ($$1.u()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.A();
         case d:
      }
   }
}

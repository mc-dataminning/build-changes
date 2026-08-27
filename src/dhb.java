import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dhb extends czo implements dhc {
   public static final dns f = dnr.C;
   protected static final float g = 4.0F;
   protected static final eqm h = dac.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final doo a;

   protected dhb(doo $$0, dna.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dhb> a();

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return h;
   }

   @Override
   public boolean a(dnb $$0) {
      return true;
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dlr($$0, $$1);
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      if ($$2.c_($$3) instanceof dlr $$7) {
         crl $$10 = $$0.d() instanceof crl $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gl();
         if (!$$2.B) {
            if ($$11 && !$$7.t() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(aui.c.b($$0.d()));
                  $$2.a(drp.c, $$7.aC_(), drp.a.a($$4, $$7.n()));
                  if (!$$4.f()) {
                     $$0.h(1);
                  }

                  return bnf.a;
               } else {
                  return bnf.d;
               }
            } else {
               return bnf.d;
            }
         } else {
            return !$$11 && !$$7.t() ? bnf.b : bnf.a;
         }
      } else {
         return bnf.e;
      }
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.c_($$2) instanceof dlr $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.t()) {
            $$1.a(null, $$5.aC_(), $$5.d(), atz.e);
            return bnd.a;
         } else if ($$8) {
            return bnd.a;
         } else if (!this.a($$3, $$5) && $$3.gl() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bnd.a;
         } else {
            return bnd.d;
         }
      } else {
         return bnd.d;
      }
   }

   private boolean b(ciu $$0, dlr $$1, boolean $$2) {
      dls $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(vt.a) || $$0x.b() instanceof xb);
   }

   public abstract float g(dnb var1);

   public ept m(dnb $$0) {
      return new ept(0.5, 0.5, 0.5);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(f) ? eiq.c.a(false) : super.c_($$0);
   }

   public doo d() {
      return this.a;
   }

   public static doo a(dac $$0) {
      doo $$1;
      if ($$0 instanceof dhb) {
         $$1 = ((dhb)$$0).d();
      } else {
         $$1 = doo.b;
      }

      return $$1;
   }

   public void a(ciu $$0, dlr $$1, boolean $$2) {
      $$1.a($$0.cw());
      $$0.a($$1, $$2);
   }

   private boolean a(ciu $$0, dlr $$1) {
      UUID $$2 = $$1.s();
      return $$2 != null && !$$2.equals($$0.cw());
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return a($$2, dkk.h, dlr::a);
   }
}

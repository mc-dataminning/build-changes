import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dii extends daa {
   public static final MapCodec<dii> a = b(dii::new);
   public static final dnq b = dnp.B;

   @Override
   public MapCodec<dii> a() {
      return a;
   }

   public dii(dmy.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dmz a(cwz $$0, ib $$1, dmz $$2, cis $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cwz $$0, ib $$1, cwr $$2) {
      if (!$$0.B) {
         cfe $$3 = new cfe($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.r();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(cwz $$0, ib $$1) {
      a($$0, $$1, null);
   }

   private static void a(cwz $$0, ib $$1, @Nullable bpo $$2) {
      if (!$$0.B) {
         cfe $$3 = new cfe($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dr(), $$3.dt(), $$3.dx(), aty.yU, atz.e, 1.0F, 1.0F);
         $$0.a($$2, drn.I, $$1);
      }
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      if (!$$0.a(cqn.or) && !$$0.a(cqn.tV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dac.a.o(), 11);
         cqf $$7 = $$0.d();
         if (!$$4.f()) {
            if ($$0.a(cqn.or)) {
               $$0.a(1, $$4, bpo.d($$5));
            } else {
               $$0.h(1);
            }
         }

         $$4.b(aui.c.b($$7));
         return bne.a($$2.B);
      }
   }

   @Override
   protected void a(cwz $$0, dmz $$1, epn $$2, cjk $$3) {
      if (!$$0.B) {
         ib $$4 = $$2.a();
         bow $$5 = $$3.af_();
         if ($$3.bN() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bpo ? (bpo)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(cwr $$0) {
      return false;
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }
}

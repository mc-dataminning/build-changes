import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpw extends dhm {
   public static final MapCodec<dpw> a = b(dpw::new);
   public static final dvj b = dvi.B;

   @Override
   public MapCodec<dpw> a() {
      return a;
   }

   public dpw(dur.d $$0) {
      super($$0);
      this.l(this.n().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dus a(dej $$0, jf $$1, dus $$2, cnx $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arj $$0, jf $$1, deb $$2) {
      cki $$3 = new cki($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b());
      int $$4 = $$3.o();
      $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(dej $$0, jf $$1) {
      a($$0, $$1, null);
   }

   private static void a(dej $$0, jf $$1, @Nullable bun $$2) {
      if (!$$0.B) {
         cki $$3 = new cki($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dx(), $$3.dz(), $$3.dD(), awg.zE, awh.e, 1.0F, 1.0F);
         $$0.a($$2, dzp.I, $$1);
      }
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      if (!$$0.a(cvw.ot) && !$$0.a(cvw.tY)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dho.a.n(), 11);
         cvn $$7 = $$0.h();
         if ($$0.a(cvw.ot)) {
            $$0.a(1, $$4, bun.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awq.c.b($$7));
         return brs.a;
      }
   }

   @Override
   protected void a(dej $$0, dus $$1, eys $$2, cor $$3) {
      if (!$$0.B) {
         jf $$4 = $$2.b();
         btr $$5 = $$3.s();
         if ($$3.bV() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bun ? (bun)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(deb $$0) {
      return false;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }
}

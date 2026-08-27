import com.google.common.annotations.VisibleForTesting;

public class doj extends dnd implements dut.b<doj.a> {
   private final doj.a a;

   public doj(im $$0, dpy $$1) {
      super(dnf.K, $$0, $$1);
      this.a = new doj.a($$1, new dun($$0));
   }

   public static void a(czu $$0, im $$1, dpy $$2, doj $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public doj.a b() {
      return this.a;
   }

   public static class a implements dut {
      public static final int a = 8;
      final djq b;
      private final dpy c;
      private final duv d;

      public a(dpy $$0, duv $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = djq.a();
      }

      @Override
      public duv a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dut.a c() {
         return dut.a.b;
      }

      @Override
      public boolean a(aqe $$0, iv<dur> $$1, dur.a $$2, etf $$3) {
         if ($$1.a(dur.p) && $$2.a() instanceof bre $$4) {
            if (!$$4.eG()) {
               int $$5 = $$4.eh();
               if ($$4.ef() && $$5 > 0) {
                  this.b.a(im.a($$3.a(ir.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eF();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, im.a($$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public djq d() {
         return this.b;
      }

      private void a(aqe $$0, im $$1, dpy $$2, ayd $$3) {
         $$0.a($$1, $$2.a(djn.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(kw.G, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, auz.vL, ava.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(czu $$0, bre $$1) {
         if ($$1.ek() instanceof aqf $$3) {
            bpj $$4 = $$1.eA() == null ? $$0.ai().a((ckl)$$3) : $$1.eA();
            am.Z.a($$3, $$1, $$4);
         }
      }
   }
}

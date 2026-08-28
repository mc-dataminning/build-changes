import com.mojang.serialization.MapCodec;

public class duh extends dlu {
   public static final MapCodec<duh> a = b(duh::new);
   private static final eao b = eae.aW;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<duh> a() {
      return a;
   }

   public duh(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dip $$0, dzo $$1, fds $$2, crm $$3) {
      int $$4 = a((diq)$$0, $$1, $$2, (bwa)$$3);
      if ($$3.q() instanceof arp $$6) {
         $$6.a(awv.aE);
         ap.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(diq $$0, dzo $$1, fds $$2, bwa $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof cqz ? 20 : 8;
      if (!$$0.U().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(fds $$0, fdw $$1) {
      ja $$2 = $$0.c();
      double $$3 = Math.abs(azk.e($$1.d) - 0.5);
      double $$4 = Math.abs(azk.e($$1.e) - 0.5);
      double $$5 = Math.abs(azk.e($$1.f) - 0.5);
      ja.a $$6 = $$2.o();
      double $$7;
      if ($$6 == ja.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == ja.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, azk.c(15.0 * azk.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(diq $$0, dzo $$1, int $$2, iu $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dzo $$0) {
      return true;
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}

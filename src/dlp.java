import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlp extends dgy {
   public static final MapCodec<dlp> a = b(dlp::new);
   public static final dvj b = dvi.n;

   @Override
   public MapCodec<dlp> a() {
      return a;
   }

   protected dlp(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, @Nullable bun $$3, cvs $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cyh $$5 = $$4.a(ks.T, cyh.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dsy $$5) {
         $$5.t();
         return brs.a;
      } else {
         return brs.e;
      }
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      if ($$1.c(b)) {
         return brs.f;
      } else {
         cvs $$7 = $$4.b($$5);
         brs $$8 = cvx.a($$2, $$3, $$7, $$4);
         return (brs)(!$$8.a() ? brs.f : $$8);
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dsy $$5) {
            $$5.t();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dsy($$0, $$1);
   }

   @Override
   public boolean f_(dus $$0) {
      return true;
   }

   @Override
   public int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      if ($$1.c_($$2) instanceof dsy $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return $$1.c_($$2) instanceof dsy $$3 ? $$3.u() : 0;
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return $$1.c(b) ? a($$2, drx.e, dsy::a) : null;
   }
}

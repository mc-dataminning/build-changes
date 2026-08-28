import java.util.Optional;

public class csq extends cso {
   private static final bwl a = bwl.c(0.0F, 0.0F);

   public csq(bwr<? extends csq> $$0, djm $$1) {
      super($$0, $$1);
   }

   public csq(djm $$0, bxj $$1, czn $$2) {
      super(bwr.L, $$1, $$0, $$2);
   }

   public csq(djm $$0, double $$1, double $$2, double $$3, czn $$4) {
      super(bwr.L, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dU()
               .a(
                  new lu(ly.U, this.f()),
                  this.dz(),
                  this.dB(),
                  this.dF(),
                  ((double)this.ae.i() - 0.5) * 0.08,
                  ((double)this.ae.i() - 0.5) * 0.08,
                  ((double)this.ae.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(fez $$0) {
      super.a($$0);
      $$0.a().a(this.dV().b(this, this.q()), 0.0F);
   }

   @Override
   protected void a(ffa $$0) {
      super.a($$0);
      if (!this.dU().C) {
         if (this.ae.a(8) == 0) {
            int $$1 = 1;
            if (this.ae.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               cjf $$3 = bwr.z.a(this.dU(), bwq.k);
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.dz(), this.dB(), this.dF(), this.dK(), 0.0F);
                  Optional.ofNullable(this.f().a(kk.aJ)).flatMap($$0x -> $$0x.a(this.dW())).ifPresent($$3::j);
                  if (!$$3.a(a)) {
                     break;
                  }

                  this.dU().b($$3);
               }
            }
         }

         this.dU().a(this, (byte)3);
         this.aq();
      }
   }

   @Override
   protected czj g() {
      return czr.rH;
   }
}

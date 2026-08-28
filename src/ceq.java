import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class ceq extends ceo {
   @Nullable
   private ceq b;
   private int c = 1;

   public ceq(bsm<? extends ceq> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(5, new bzv(this));
   }

   @Override
   public int fN() {
      return this.gq();
   }

   public int gq() {
      return super.fN();
   }

   @Override
   protected boolean go() {
      return !this.gr();
   }

   public boolean gr() {
      return this.b != null && this.b.bE();
   }

   public ceq a(ceq $$0) {
      this.b = $$0;
      $$0.gx();
      return $$0;
   }

   public void gs() {
      this.b.gy();
      this.b = null;
   }

   private void gx() {
      this.c++;
   }

   private void gy() {
      this.c--;
   }

   public boolean gt() {
      return this.gu() && this.c < this.gq();
   }

   @Override
   public void l() {
      super.l();
      if (this.gu() && this.dQ().z.a(200) == 1) {
         List<? extends ceo> $$0 = this.dQ().a((Class<? extends ceo>)this.getClass(), this.cL().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gu() {
      return this.c > 1;
   }

   public boolean gv() {
      return this.g(this.b) <= 121.0;
   }

   public void gw() {
      if (this.gr()) {
         this.K().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends ceq> $$0) {
      $$0.limit((long)(this.gq() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new ceq.a(this);
      } else {
         this.a(((ceq.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements btu {
      public final ceq a;

      public a(ceq $$0) {
         this.a = $$0;
      }
   }
}

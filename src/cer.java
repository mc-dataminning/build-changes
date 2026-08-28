import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cer extends cep {
   @Nullable
   private cer b;
   private int c = 1;

   public cer(bsn<? extends cer> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(5, new bzw(this));
   }

   @Override
   public int af() {
      return this.gp();
   }

   public int gp() {
      return super.af();
   }

   @Override
   protected boolean gn() {
      return !this.gq();
   }

   public boolean gq() {
      return this.b != null && this.b.bF();
   }

   public cer a(cer $$0) {
      this.b = $$0;
      $$0.gw();
      return $$0;
   }

   public void gr() {
      this.b.gx();
      this.b = null;
   }

   private void gw() {
      this.c++;
   }

   private void gx() {
      this.c--;
   }

   public boolean gs() {
      return this.gt() && this.c < this.gp();
   }

   @Override
   public void l() {
      super.l();
      if (this.gt() && this.dR().z.a(200) == 1) {
         List<? extends cep> $$0 = this.dR().a((Class<? extends cep>)this.getClass(), this.cM().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gt() {
      return this.c > 1;
   }

   public boolean gu() {
      return this.g(this.b) <= 121.0;
   }

   public void gv() {
      if (this.gq()) {
         this.J().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends cer> $$0) {
      $$0.limit((long)(this.gp() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cer.a(this);
      } else {
         this.a(((cer.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements btv {
      public final cer a;

      public a(cer $$0) {
         this.a = $$0;
      }
   }
}

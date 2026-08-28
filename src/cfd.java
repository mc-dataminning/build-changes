import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cfd extends cfb {
   @Nullable
   private cfd b;
   private int c = 1;

   public cfd(bsz<? extends cfd> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(5, new cai(this));
   }

   @Override
   public int fQ() {
      return this.gs();
   }

   public int gs() {
      return super.fQ();
   }

   @Override
   protected boolean gq() {
      return !this.gt();
   }

   public boolean gt() {
      return this.b != null && this.b.bD();
   }

   public cfd a(cfd $$0) {
      this.b = $$0;
      $$0.gz();
      return $$0;
   }

   public void gu() {
      this.b.gA();
      this.b = null;
   }

   private void gz() {
      this.c++;
   }

   private void gA() {
      this.c--;
   }

   public boolean gv() {
      return this.gw() && this.c < this.gs();
   }

   @Override
   public void l() {
      super.l();
      if (this.gw() && this.dP().z.a(200) == 1) {
         List<? extends cfb> $$0 = this.dP().a((Class<? extends cfb>)this.getClass(), this.cK().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gw() {
      return this.c > 1;
   }

   public boolean gx() {
      return this.g(this.b) <= 121.0;
   }

   public void gy() {
      if (this.gt()) {
         this.K().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends cfd> $$0) {
      $$0.limit((long)(this.gs() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cfd.a(this);
      } else {
         this.a(((cfd.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements buh {
      public final cfd a;

      public a(cfd $$0) {
         this.a = $$0;
      }
   }
}

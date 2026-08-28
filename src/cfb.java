import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cfb extends cez {
   @Nullable
   private cfb b;
   private int c = 1;

   public cfb(bsw<? extends cfb> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(5, new cag(this));
   }

   @Override
   public int af() {
      return this.go();
   }

   public int go() {
      return super.af();
   }

   @Override
   protected boolean gm() {
      return !this.gp();
   }

   public boolean gp() {
      return this.b != null && this.b.bE();
   }

   public cfb a(cfb $$0) {
      this.b = $$0;
      $$0.gv();
      return $$0;
   }

   public void gq() {
      this.b.gw();
      this.b = null;
   }

   private void gv() {
      this.c++;
   }

   private void gw() {
      this.c--;
   }

   public boolean gr() {
      return this.gs() && this.c < this.go();
   }

   @Override
   public void l() {
      super.l();
      if (this.gs() && this.dQ().z.a(200) == 1) {
         List<? extends cez> $$0 = this.dQ().a((Class<? extends cez>)this.getClass(), this.cL().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gs() {
      return this.c > 1;
   }

   public boolean gt() {
      return this.g(this.b) <= 121.0;
   }

   public void gu() {
      if (this.gp()) {
         this.J().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends cfb> $$0) {
      $$0.limit((long)(this.go() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cfb.a(this);
      } else {
         this.a(((cfb.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements buf {
      public final cfb a;

      public a(cfb $$0) {
         this.a = $$0;
      }
   }
}

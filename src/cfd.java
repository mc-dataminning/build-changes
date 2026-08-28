import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cfd extends cfb {
   @Nullable
   private cfd b;
   private int c = 1;

   public cfd(bsx<? extends cfd> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bU.a(5, new cai(this));
   }

   @Override
   public int fO() {
      return this.gn();
   }

   public int gn() {
      return super.fO();
   }

   @Override
   protected boolean gl() {
      return !this.go();
   }

   public boolean go() {
      return this.b != null && this.b.bE();
   }

   public cfd a(cfd $$0) {
      this.b = $$0;
      $$0.gu();
      return $$0;
   }

   public void gp() {
      this.b.gv();
      this.b = null;
   }

   private void gu() {
      this.c++;
   }

   private void gv() {
      this.c--;
   }

   public boolean gq() {
      return this.gr() && this.c < this.gn();
   }

   @Override
   public void l() {
      super.l();
      if (this.gr() && this.dP().z.a(200) == 1) {
         List<? extends cfb> $$0 = this.dP().a((Class<? extends cfb>)this.getClass(), this.cL().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gr() {
      return this.c > 1;
   }

   public boolean gs() {
      return this.g(this.b) <= 121.0;
   }

   public void gt() {
      if (this.go()) {
         this.N().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends cfd> $$0) {
      $$0.limit((long)(this.gn() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
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

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
   public int fN() {
      return this.gm();
   }

   public int gm() {
      return super.fN();
   }

   @Override
   protected boolean gk() {
      return !this.gn();
   }

   public boolean gn() {
      return this.b != null && this.b.bE();
   }

   public cfd a(cfd $$0) {
      this.b = $$0;
      $$0.gt();
      return $$0;
   }

   public void go() {
      this.b.gu();
      this.b = null;
   }

   private void gt() {
      this.c++;
   }

   private void gu() {
      this.c--;
   }

   public boolean gp() {
      return this.gq() && this.c < this.gm();
   }

   @Override
   public void l() {
      super.l();
      if (this.gq() && this.dO().z.a(200) == 1) {
         List<? extends cfb> $$0 = this.dO().a((Class<? extends cfb>)this.getClass(), this.cK().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gq() {
      return this.c > 1;
   }

   public boolean gr() {
      return this.g(this.b) <= 121.0;
   }

   public void gs() {
      if (this.gn()) {
         this.N().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends cfd> $$0) {
      $$0.limit((long)(this.gm() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
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

import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cal extends caj {
   @Nullable
   private cal b;
   private int c = 1;

   public cal(bol<? extends cal> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(5, new bvq(this));
   }

   @Override
   public int fM() {
      return this.gn();
   }

   public int gn() {
      return super.fM();
   }

   @Override
   protected boolean gl() {
      return !this.go();
   }

   public boolean go() {
      return this.b != null && this.b.bx();
   }

   public cal a(cal $$0) {
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
      if (this.gr() && this.dJ().z.a(200) == 1) {
         List<? extends caj> $$0 = this.dJ().a((Class<? extends caj>)this.getClass(), this.cE().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gr() {
      return this.c > 1;
   }

   public boolean gs() {
      return this.f(this.b) <= 121.0;
   }

   public void gt() {
      if (this.go()) {
         this.N().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends cal> $$0) {
      $$0.limit((long)(this.gn() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cal.a(this);
      } else {
         this.a(((cal.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bpp {
      public final cal a;

      public a(cal $$0) {
         this.a = $$0;
      }
   }
}

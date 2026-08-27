import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class ced extends ceb {
   @Nullable
   private ced b;
   private int c = 1;

   public ced(bsb<? extends ced> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void y() {
      super.y();
      this.cb.a(5, new bzh(this));
   }

   @Override
   public int ad() {
      return this.gA();
   }

   public int gA() {
      return super.ad();
   }

   @Override
   protected boolean gy() {
      return !this.gB();
   }

   public boolean gB() {
      return this.b != null && this.b.bI();
   }

   public ced a(ced $$0) {
      this.b = $$0;
      $$0.gH();
      return $$0;
   }

   public void gC() {
      this.b.gI();
      this.b = null;
   }

   private void gH() {
      this.c++;
   }

   private void gI() {
      this.c--;
   }

   public boolean gD() {
      return this.gE() && this.c < this.gA();
   }

   @Override
   public void l() {
      super.l();
      if (this.gE() && this.dU().A.a(200) == 1) {
         List<? extends ceb> $$0 = this.dU().a((Class<? extends ceb>)this.getClass(), this.cP().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gE() {
      return this.c > 1;
   }

   public boolean gF() {
      return this.g(this.b) <= 121.0;
   }

   public void gG() {
      if (this.gB()) {
         this.J().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends ced> $$0) {
      $$0.limit((long)(this.gA() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new ced.a(this);
      } else {
         this.a(((ced.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements btg {
      public final ced a;

      public a(ced $$0) {
         this.a = $$0;
      }
   }
}

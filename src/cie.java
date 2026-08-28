import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cie extends cic {
   @Nullable
   private cie a;
   private int b = 1;

   public cie(bwb<? extends cie> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bB.a(5, new cdj(this));
   }

   @Override
   public int ai() {
      return this.x();
   }

   public int x() {
      return super.ai();
   }

   @Override
   protected boolean q() {
      return !this.gq();
   }

   public boolean gq() {
      return this.a != null && this.a.bK();
   }

   public cie a(cie $$0) {
      this.a = $$0;
      $$0.gw();
      return $$0;
   }

   public void gr() {
      this.a.gx();
      this.a = null;
   }

   private void gw() {
      this.b++;
   }

   private void gx() {
      this.b--;
   }

   public boolean gs() {
      return this.gt() && this.b < this.x();
   }

   @Override
   public void h() {
      super.h();
      if (this.gt() && this.dV().A.a(200) == 1) {
         List<? extends cic> $$0 = this.dV().a((Class<? extends cic>)this.getClass(), this.cR().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.b = 1;
         }
      }
   }

   public boolean gt() {
      return this.b > 1;
   }

   public boolean gu() {
      return this.g(this.a) <= 121.0;
   }

   public void gv() {
      if (this.gq()) {
         this.O().a(this.a, 1.0);
      }
   }

   public void a(Stream<? extends cie> $$0) {
      $$0.limit((long)(this.x() - this.b)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cie.a(this);
      } else {
         this.a(((cie.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bxj {
      public final cie a;

      public a(cie $$0) {
         this.a = $$0;
      }
   }
}

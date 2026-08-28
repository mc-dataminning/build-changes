import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cim extends cik {
   @Nullable
   private cim a;
   private int b = 1;

   public cim(bwj<? extends cim> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(5, new cdr(this));
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

   public cim a(cim $$0) {
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
         List<? extends cik> $$0 = this.dV().a((Class<? extends cik>)this.getClass(), this.cR().c(8.0, 8.0, 8.0));
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

   public void a(Stream<? extends cim> $$0) {
      $$0.limit((long)(this.x() - this.b)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cim.a(this);
      } else {
         this.a(((cim.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bxr {
      public final cim a;

      public a(cim $$0) {
         this.a = $$0;
      }
   }
}

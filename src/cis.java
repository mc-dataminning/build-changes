import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cis extends ciq {
   @Nullable
   private cis a;
   private int b = 1;

   public cis(bwo<? extends cis> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(5, new cdw(this));
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
      return !this.gr();
   }

   public boolean gr() {
      return this.a != null && this.a.bK();
   }

   public cis a(cis $$0) {
      this.a = $$0;
      $$0.gx();
      return $$0;
   }

   public void gs() {
      this.a.gy();
      this.a = null;
   }

   private void gx() {
      this.b++;
   }

   private void gy() {
      this.b--;
   }

   public boolean gt() {
      return this.gu() && this.b < this.x();
   }

   @Override
   public void h() {
      super.h();
      if (this.gu() && this.dV().A.a(200) == 1) {
         List<? extends ciq> $$0 = this.dV().a((Class<? extends ciq>)this.getClass(), this.cR().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.b = 1;
         }
      }
   }

   public boolean gu() {
      return this.b > 1;
   }

   public boolean gv() {
      return this.g(this.a) <= 121.0;
   }

   public void gw() {
      if (this.gr()) {
         this.O().a(this.a, 1.0);
      }
   }

   public void a(Stream<? extends cis> $$0) {
      $$0.limit((long)(this.x() - this.b)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cis.a(this);
      } else {
         this.a(((cis.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bxw {
      public final cis a;

      public a(cis $$0) {
         this.a = $$0;
      }
   }
}

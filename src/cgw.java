import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cgw extends cgu {
   @Nullable
   private cgw a;
   private int b = 1;

   public cgw(bus<? extends cgw> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(5, new ccb(this));
   }

   @Override
   public int ad() {
      return this.go();
   }

   public int go() {
      return super.ad();
   }

   @Override
   protected boolean gm() {
      return !this.gp();
   }

   public boolean gp() {
      return this.a != null && this.a.bL();
   }

   public cgw a(cgw $$0) {
      this.a = $$0;
      $$0.gv();
      return $$0;
   }

   public void gq() {
      this.a.gw();
      this.a = null;
   }

   private void gv() {
      this.b++;
   }

   private void gw() {
      this.b--;
   }

   public boolean gr() {
      return this.gs() && this.b < this.go();
   }

   @Override
   public void h() {
      super.h();
      if (this.gs() && this.dV().A.a(200) == 1) {
         List<? extends cgu> $$0 = this.dV().a((Class<? extends cgu>)this.getClass(), this.cR().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.b = 1;
         }
      }
   }

   public boolean gs() {
      return this.b > 1;
   }

   public boolean gt() {
      return this.g(this.a) <= 121.0;
   }

   public void gu() {
      if (this.gp()) {
         this.L().a(this.a, 1.0);
      }
   }

   public void a(Stream<? extends cgw> $$0) {
      $$0.limit((long)(this.go() - this.b)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cgw.a(this);
      } else {
         this.a(((cgw.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bwa {
      public final cgw a;

      public a(cgw $$0) {
         this.a = $$0;
      }
   }
}

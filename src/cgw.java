import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cgw extends cgu {
   @Nullable
   private cgw a;
   private int b = 1;

   public cgw(bus<? extends cgw> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(5, new ccb(this));
   }

   @Override
   public int aj() {
      return this.gt();
   }

   public int gt() {
      return super.aj();
   }

   @Override
   protected boolean x() {
      return !this.gu();
   }

   public boolean gu() {
      return this.a != null && this.a.bL();
   }

   public cgw a(cgw $$0) {
      this.a = $$0;
      $$0.gA();
      return $$0;
   }

   public void gv() {
      this.a.gB();
      this.a = null;
   }

   private void gA() {
      this.b++;
   }

   private void gB() {
      this.b--;
   }

   public boolean gw() {
      return this.gx() && this.b < this.gt();
   }

   @Override
   public void h() {
      super.h();
      if (this.gx() && this.dV().A.a(200) == 1) {
         List<? extends cgu> $$0 = this.dV().a((Class<? extends cgu>)this.getClass(), this.cR().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.b = 1;
         }
      }
   }

   public boolean gx() {
      return this.b > 1;
   }

   public boolean gy() {
      return this.g(this.a) <= 121.0;
   }

   public void gz() {
      if (this.gu()) {
         this.P().a(this.a, 1.0);
      }
   }

   public void a(Stream<? extends cgw> $$0) {
      $$0.limit((long)(this.gt() - this.b)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
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

import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cgx extends cgv {
   @Nullable
   private cgx a;
   private int b = 1;

   public cgx(but<? extends cgx> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(5, new ccc(this));
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

   public cgx a(cgx $$0) {
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
         List<? extends cgv> $$0 = this.dV().a((Class<? extends cgv>)this.getClass(), this.cR().c(8.0, 8.0, 8.0));
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

   public void a(Stream<? extends cgx> $$0) {
      $$0.limit((long)(this.gt() - this.b)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cgx.a(this);
      } else {
         this.a(((cgx.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bwb {
      public final cgx a;

      public a(cgx $$0) {
         this.a = $$0;
      }
   }
}

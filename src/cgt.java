import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cgt extends cgr {
   @Nullable
   private cgt b;
   private int c = 1;

   public cgt(bup<? extends cgt> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(5, new cby(this));
   }

   @Override
   public int aj() {
      return this.gx();
   }

   public int gx() {
      return super.aj();
   }

   @Override
   protected boolean gv() {
      return !this.gy();
   }

   public boolean gy() {
      return this.b != null && this.b.bN();
   }

   public cgt a(cgt $$0) {
      this.b = $$0;
      $$0.gE();
      return $$0;
   }

   public void gz() {
      this.b.gF();
      this.b = null;
   }

   private void gE() {
      this.c++;
   }

   private void gF() {
      this.c--;
   }

   public boolean gA() {
      return this.gB() && this.c < this.gx();
   }

   @Override
   public void l() {
      super.l();
      if (this.gB() && this.dY().A.a(200) == 1) {
         List<? extends cgr> $$0 = this.dY().a((Class<? extends cgr>)this.getClass(), this.cT().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gB() {
      return this.c > 1;
   }

   public boolean gC() {
      return this.g(this.b) <= 121.0;
   }

   public void gD() {
      if (this.gy()) {
         this.P().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends cgt> $$0) {
      $$0.limit((long)(this.gx() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cgt.a(this);
      } else {
         this.a(((cgt.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bvx {
      public final cgt a;

      public a(cgt $$0) {
         this.a = $$0;
      }
   }
}

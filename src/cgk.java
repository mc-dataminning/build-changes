import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cgk extends cgi {
   @Nullable
   private cgk b;
   private int c = 1;

   public cgk(bug<? extends cgk> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(5, new cbp(this));
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
      return this.b != null && this.b.bM();
   }

   public cgk a(cgk $$0) {
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
      if (this.gB() && this.dX().A.a(200) == 1) {
         List<? extends cgi> $$0 = this.dX().a((Class<? extends cgi>)this.getClass(), this.cS().c(8.0, 8.0, 8.0));
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

   public void a(Stream<? extends cgk> $$0) {
      $$0.limit((long)(this.gx() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cgk.a(this);
      } else {
         this.a(((cgk.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bvo {
      public final cgk a;

      public a(cgk $$0) {
         this.a = $$0;
      }
   }
}

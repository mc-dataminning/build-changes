import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bul extends buj {
   @Nullable
   private bul b;
   private int c = 1;

   public bul(bip<? extends bul> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(5, new bps(this));
   }

   @Override
   public int Z() {
      return this.gc();
   }

   public int gc() {
      return super.Z();
   }

   @Override
   protected boolean ga() {
      return !this.gd();
   }

   public boolean gd() {
      return this.b != null && this.b.bv();
   }

   public bul a(bul $$0) {
      this.b = $$0;
      $$0.gj();
      return $$0;
   }

   public void ge() {
      this.b.gk();
      this.b = null;
   }

   private void gj() {
      this.c++;
   }

   private void gk() {
      this.c--;
   }

   public boolean gf() {
      return this.gg() && this.c < this.gc();
   }

   @Override
   public void l() {
      super.l();
      if (this.gg() && this.dK().z.a(200) == 1) {
         List<? extends buj> $$0 = this.dK().a((Class<? extends buj>)this.getClass(), this.cG().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gg() {
      return this.c > 1;
   }

   public boolean gh() {
      return this.f(this.b) <= 121.0;
   }

   public void gi() {
      if (this.gd()) {
         this.H().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends bul> $$0) {
      $$0.limit((long)(this.gc() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$3 == null) {
         $$3 = new bul.a(this);
      } else {
         this.a(((bul.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bju {
      public final bul a;

      public a(bul $$0) {
         this.a = $$0;
      }
   }
}

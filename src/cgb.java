import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cgb extends cfz {
   @Nullable
   private cgb b;
   private int c = 1;

   public cgb(bty<? extends cgb> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(5, new cbg(this));
   }

   @Override
   public int fS() {
      return this.gq();
   }

   public int gq() {
      return super.fS();
   }

   @Override
   protected boolean go() {
      return !this.gr();
   }

   public boolean gr() {
      return this.b != null && this.b.bI();
   }

   public cgb a(cgb $$0) {
      this.b = $$0;
      $$0.gx();
      return $$0;
   }

   public void gs() {
      this.b.gy();
      this.b = null;
   }

   private void gx() {
      this.c++;
   }

   private void gy() {
      this.c--;
   }

   public boolean gt() {
      return this.gu() && this.c < this.gq();
   }

   @Override
   public void l() {
      super.l();
      if (this.gu() && this.dS().z.a(200) == 1) {
         List<? extends cfz> $$0 = this.dS().a((Class<? extends cfz>)this.getClass(), this.cO().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gu() {
      return this.c > 1;
   }

   public boolean gv() {
      return this.g(this.b) <= 121.0;
   }

   public void gw() {
      if (this.gr()) {
         this.P().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends cgb> $$0) {
      $$0.limit((long)(this.gq() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cgb.a(this);
      } else {
         this.a(((cgb.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bvf {
      public final cgb a;

      public a(cgb $$0) {
         this.a = $$0;
      }
   }
}

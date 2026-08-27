import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class buq extends buo {
   @Nullable
   private buq b;
   private int c = 1;

   public buq(biu<? extends buq> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(5, new bpx(this));
   }

   @Override
   public int fH() {
      return this.gf();
   }

   public int gf() {
      return super.fH();
   }

   @Override
   protected boolean gd() {
      return !this.gg();
   }

   public boolean gg() {
      return this.b != null && this.b.bw();
   }

   public buq a(buq $$0) {
      this.b = $$0;
      $$0.gm();
      return $$0;
   }

   public void gh() {
      this.b.gn();
      this.b = null;
   }

   private void gm() {
      this.c++;
   }

   private void gn() {
      this.c--;
   }

   public boolean gi() {
      return this.gj() && this.c < this.gf();
   }

   @Override
   public void l() {
      super.l();
      if (this.gj() && this.dL().z.a(200) == 1) {
         List<? extends buo> $$0 = this.dL().a((Class<? extends buo>)this.getClass(), this.cH().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gj() {
      return this.c > 1;
   }

   public boolean gk() {
      return this.f(this.b) <= 121.0;
   }

   public void gl() {
      if (this.gg()) {
         this.L().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends buq> $$0) {
      $$0.limit((long)(this.gf() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qx $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$3 == null) {
         $$3 = new buq.a(this);
      } else {
         this.a(((buq.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bjz {
      public final buq a;

      public a(buq $$0) {
         this.a = $$0;
      }
   }
}

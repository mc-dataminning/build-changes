import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bus extends buq {
   @Nullable
   private bus b;
   private int c = 1;

   public bus(biw<? extends bus> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(5, new bpz(this));
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
      return this.b != null && this.b.bv();
   }

   public bus a(bus $$0) {
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
         List<? extends buq> $$0 = this.dL().a((Class<? extends buq>)this.getClass(), this.cG().c(8.0, 8.0, 8.0));
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

   public void a(Stream<? extends bus> $$0) {
      $$0.limit((long)(this.gf() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$3 == null) {
         $$3 = new bus.a(this);
      } else {
         this.a(((bus.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bkb {
      public final bus a;

      public a(bus $$0) {
         this.a = $$0;
      }
   }
}

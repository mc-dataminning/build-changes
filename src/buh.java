import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class buh extends buf {
   @Nullable
   private buh b;
   private int c = 1;

   public buh(bik<? extends buh> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(5, new bpo(this));
   }

   @Override
   public int Z() {
      return this.gb();
   }

   public int gb() {
      return super.Z();
   }

   @Override
   protected boolean fZ() {
      return !this.gc();
   }

   public boolean gc() {
      return this.b != null && this.b.bv();
   }

   public buh a(buh $$0) {
      this.b = $$0;
      $$0.gi();
      return $$0;
   }

   public void gd() {
      this.b.gj();
      this.b = null;
   }

   private void gi() {
      this.c++;
   }

   private void gj() {
      this.c--;
   }

   public boolean ge() {
      return this.gf() && this.c < this.gb();
   }

   @Override
   public void l() {
      super.l();
      if (this.gf() && this.dK().z.a(200) == 1) {
         List<? extends buf> $$0 = this.dK().a((Class<? extends buf>)this.getClass(), this.cG().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gf() {
      return this.c > 1;
   }

   public boolean gg() {
      return this.f(this.b) <= 121.0;
   }

   public void gh() {
      if (this.gc()) {
         this.H().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends buh> $$0) {
      $$0.limit((long)(this.gb() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$3 == null) {
         $$3 = new buh.a(this);
      } else {
         this.a(((buh.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bjq {
      public final buh a;

      public a(buh $$0) {
         this.a = $$0;
      }
   }
}

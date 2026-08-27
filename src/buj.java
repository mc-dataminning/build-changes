import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class buj extends buh {
   @Nullable
   private buj b;
   private int c = 1;

   public buj(bim<? extends buj> $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(5, new bpq(this));
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

   public buj a(buj $$0) {
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
         List<? extends buh> $$0 = this.dK().a((Class<? extends buh>)this.getClass(), this.cG().c(8.0, 8.0, 8.0));
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

   public void a(Stream<? extends buj> $$0) {
      $$0.limit((long)(this.gb() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$3 == null) {
         $$3 = new buj.a(this);
      } else {
         this.a(((buj.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bjs {
      public final buj a;

      public a(buj $$0) {
         this.a = $$0;
      }
   }
}

import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class ced extends ceb {
   @Nullable
   private ced b;
   private int c = 1;

   public ced(bsa<? extends ced> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(5, new bzi(this));
   }

   @Override
   public int ae() {
      return this.gr();
   }

   public int gr() {
      return super.ae();
   }

   @Override
   protected boolean gp() {
      return !this.gs();
   }

   public boolean gs() {
      return this.b != null && this.b.bD();
   }

   public ced a(ced $$0) {
      this.b = $$0;
      $$0.gy();
      return $$0;
   }

   public void gt() {
      this.b.gz();
      this.b = null;
   }

   private void gy() {
      this.c++;
   }

   private void gz() {
      this.c--;
   }

   public boolean gu() {
      return this.gv() && this.c < this.gr();
   }

   @Override
   public void l() {
      super.l();
      if (this.gv() && this.dP().z.a(200) == 1) {
         List<? extends ceb> $$0 = this.dP().a((Class<? extends ceb>)this.getClass(), this.cK().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gv() {
      return this.c > 1;
   }

   public boolean gw() {
      return this.g(this.b) <= 121.0;
   }

   public void gx() {
      if (this.gs()) {
         this.K().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends ced> $$0) {
      $$0.limit((long)(this.gr() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new ced.a(this);
      } else {
         this.a(((ced.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bth {
      public final ced a;

      public a(ced $$0) {
         this.a = $$0;
      }
   }
}

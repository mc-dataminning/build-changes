import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cdo extends cdm {
   @Nullable
   private cdo b;
   private int c = 1;

   public cdo(brn<? extends cdo> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(5, new byt(this));
   }

   @Override
   public int fP() {
      return this.gr();
   }

   public int gr() {
      return super.fP();
   }

   @Override
   protected boolean gp() {
      return !this.gs();
   }

   public boolean gs() {
      return this.b != null && this.b.bB();
   }

   public cdo a(cdo $$0) {
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
      if (this.gv() && this.dN().z.a(200) == 1) {
         List<? extends cdm> $$0 = this.dN().a((Class<? extends cdm>)this.getClass(), this.cI().c(8.0, 8.0, 8.0));
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

   public void a(Stream<? extends cdo> $$0) {
      $$0.limit((long)(this.gr() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cdo.a(this);
      } else {
         this.a(((cdo.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bss {
      public final cdo a;

      public a(cdo $$0) {
         this.a = $$0;
      }
   }
}

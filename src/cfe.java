import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cfe extends cfc {
   @Nullable
   private cfe b;
   private int c = 1;

   public cfe(bta<? extends cfe> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(5, new caj(this));
   }

   @Override
   public int fQ() {
      return this.gs();
   }

   public int gs() {
      return super.fQ();
   }

   @Override
   protected boolean gq() {
      return !this.gt();
   }

   public boolean gt() {
      return this.b != null && this.b.bD();
   }

   public cfe a(cfe $$0) {
      this.b = $$0;
      $$0.gz();
      return $$0;
   }

   public void gu() {
      this.b.gA();
      this.b = null;
   }

   private void gz() {
      this.c++;
   }

   private void gA() {
      this.c--;
   }

   public boolean gv() {
      return this.gw() && this.c < this.gs();
   }

   @Override
   public void l() {
      super.l();
      if (this.gw() && this.dP().z.a(200) == 1) {
         List<? extends cfc> $$0 = this.dP().a((Class<? extends cfc>)this.getClass(), this.cK().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gw() {
      return this.c > 1;
   }

   public boolean gx() {
      return this.g(this.b) <= 121.0;
   }

   public void gy() {
      if (this.gt()) {
         this.K().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends cfe> $$0) {
      $$0.limit((long)(this.gs() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cfe.a(this);
      } else {
         this.a(((cfe.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bui {
      public final cfe a;

      public a(cfe $$0) {
         this.a = $$0;
      }
   }
}

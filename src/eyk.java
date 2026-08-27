import javax.annotation.Nullable;

public class eyk extends eym implements asd {
   @Nullable
   private tn a;
   @Nullable
   private tn b;
   private int c;
   private boolean k;
   private final boolean l;

   public eyk(boolean $$0) {
      super(eqp.a);
      this.l = $$0;
   }

   @Override
   public boolean ay_() {
      return false;
   }

   @Override
   protected boolean aG_() {
      return false;
   }

   @Override
   public void a(tn $$0) {
      this.b($$0);
   }

   @Override
   public void b(tn $$0) {
      this.a = $$0;
      this.c(tn.c("menu.working"));
   }

   @Override
   public void c(tn $$0) {
      this.b = $$0;
      this.a(0);
   }

   @Override
   public void a(int $$0) {
      this.c = $$0;
   }

   @Override
   public void a() {
      this.k = true;
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      if (this.k) {
         if (this.l) {
            this.f.a(null);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
         if (this.a != null) {
            $$0.a(this.i, this.a, this.g / 2, 70, 16777215);
         }

         if (this.b != null && this.c != 0) {
            $$0.a(this.i, tn.h().b(this.b).f(" " + this.c + "%"), this.g / 2, 90, 16777215);
         }
      }
   }
}

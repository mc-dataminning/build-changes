import javax.annotation.Nullable;

public class fni extends fnl implements ayn {
   @Nullable
   private wu a;
   @Nullable
   private wu b;
   private int c;
   private boolean q;
   private final boolean r;

   public fni(boolean $$0) {
      super(ffo.a);
      this.r = $$0;
   }

   @Override
   public boolean aF_() {
      return false;
   }

   @Override
   protected boolean aO_() {
      return false;
   }

   @Override
   public void a(wu $$0) {
      this.b($$0);
   }

   @Override
   public void b(wu $$0) {
      this.a = $$0;
      this.c(wu.c("menu.working"));
   }

   @Override
   public void c(wu $$0) {
      this.b = $$0;
      this.a(0);
   }

   @Override
   public void a(int $$0) {
      this.c = $$0;
   }

   @Override
   public void a() {
      this.q = true;
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      if (this.q) {
         if (this.r) {
            this.l.a(null);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
         if (this.a != null) {
            $$0.a(this.o, this.a, this.m / 2, 70, 16777215);
         }

         if (this.b != null && this.c != 0) {
            $$0.a(this.o, wu.i().b(this.b).f(" " + this.c + "%"), this.m / 2, 90, 16777215);
         }
      }
   }
}

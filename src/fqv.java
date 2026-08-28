import javax.annotation.Nullable;

public class fqv extends frb {
   private static final wy a = wy.c("options.chat.title");
   @Nullable
   private fie s;

   private static fgl<?>[] a(fgm $$0) {
      return new fgl[]{
         $$0.m(),
         $$0.K(),
         $$0.L(),
         $$0.M(),
         $$0.n(),
         $$0.r(),
         $$0.w(),
         $$0.o(),
         $$0.A(),
         $$0.x(),
         $$0.z(),
         $$0.y(),
         $$0.as(),
         $$0.J(),
         $$0.ae(),
         $$0.V(),
         $$0.ag()
      };
   }

   public fqv(fnx $$0, fgm $$1) {
      super($$0, $$1, a);
   }

   @Override
   public void aP_() {
      super.aP_();
      this.s = this.q.b(this.c.as());
      if (this.s != null) {
         this.s.j = this.l.aV().a();
      }
   }

   @Override
   protected void m() {
      this.q.a(a(this.c));
   }

   public void E() {
      if (this.s instanceof fin) {
         ((fin)this.s).a(this.c.as().c());
      }
   }
}

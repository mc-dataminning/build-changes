import javax.annotation.Nullable;

public class fqf extends fql {
   private static final wu a = wu.c("options.chat.title");
   @Nullable
   private fhq s;

   private static ffw<?>[] a(ffx $$0) {
      return new ffw[]{
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

   public fqf(fnj $$0, ffx $$1) {
      super($$0, $$1, a);
   }

   @Override
   public void aP_() {
      super.aP_();
      this.s = this.q.b(this.c.as());
      if (this.s != null) {
         this.s.j = this.l.aX().a();
      }
   }

   @Override
   protected void m() {
      this.q.a(a(this.c));
   }

   public void F() {
      if (this.s instanceof fhz) {
         ((fhz)this.s).a(this.c.as().c());
      }
   }
}

import java.util.EnumSet;

public class cdi extends cdk {
   private final bvj a;
   private bun b;
   private int c;

   public cdi(bvj $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(cbk.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.q() && !this.a.go()) {
         bun $$0 = this.a.S_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ep();
            int $$1 = $$0.eq();
            return $$1 != this.c && this.a(this.b, cfd.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.h(this.b);
      bun $$0 = this.a.S_();
      if ($$0 != null) {
         this.c = $$0.eq();
      }

      super.d();
   }
}

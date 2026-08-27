import java.util.EnumSet;

public class btz extends bub {
   private final bmb a;
   private blg b;
   private int c;

   public btz(bmb $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bsb.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.u() && !this.a.gf()) {
         blg $$0 = this.a.Q_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ek();
            int $$1 = $$0.el();
            return $$1 != this.c && this.a(this.b, bvs.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      blg $$0 = this.a.Q_();
      if ($$0 != null) {
         this.c = $$0.el();
      }

      super.c();
   }
}

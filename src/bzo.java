import java.util.EnumSet;

public class bzo extends bzq {
   private final brp a;
   private bqt b;
   private int c;

   public bzo(brp $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bxq.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.r() && !this.a.gn()) {
         bqt $$0 = this.a.P_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.el();
            int $$1 = $$0.em();
            return $$1 != this.c && this.a(this.b, cbj.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bqt $$0 = this.a.P_();
      if ($$0 != null) {
         this.c = $$0.em();
      }

      super.c();
   }
}

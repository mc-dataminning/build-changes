import java.util.EnumSet;

public class cde extends cdh {
   private final bvg a;
   private buk b;
   private int c;

   public cde(bvg $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(cbh.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.q() && !this.a.gp()) {
         buk $$0 = this.a.R_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.em();
            int $$1 = $$0.en();
            return $$1 != this.c && this.a(this.b, cfa.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.h(this.b);
      buk $$0 = this.a.R_();
      if ($$0 != null) {
         this.c = $$0.en();
      }

      super.d();
   }
}

import java.util.EnumSet;

public class caa extends bzm {
   private final bsx a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public caa(bsx $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(bzm.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fW()) {
         return false;
      } else {
         euk $$0 = cdj.a(this.a, 16, 7, euk.c(this.a.fX()), (float) (Math.PI / 2));
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.c;
            this.c = $$0.d;
            this.d = $$0.e;
            return true;
         }
      }
   }

   @Override
   public boolean b() {
      return !this.a.K().l();
   }

   @Override
   public void c() {
      this.a.K().a(this.b, this.c, this.d, this.e);
   }
}

import java.util.List;
import javax.annotation.Nullable;

public class eyr implements fba {
   private static final int a = 170;
   private final vf b;
   @Nullable
   private List<aua> c;
   @Nullable
   private final vf d;
   private int e;
   private long f;
   private boolean g;

   private eyr(vf $$0, @Nullable vf $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public void a(int $$0) {
      this.e = $$0;
   }

   public static eyr a(vf $$0, @Nullable vf $$1) {
      return new eyr($$0, $$1);
   }

   public static eyr a(vf $$0) {
      return new eyr($$0, $$0);
   }

   @Override
   public void b(faz $$0) {
      if (this.d != null) {
         $$0.a(fay.c, this.d);
      }
   }

   public List<aua> a(evi $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<aua> a(evi $$0, vf $$1) {
      return $$0.h.c($$1, 170);
   }

   public void a(boolean $$0, boolean $$1, fbj $$2) {
      boolean $$3 = $$0 || $$1 && evi.O().aV().b();
      if ($$3 != this.g) {
         if ($$3) {
            this.f = ac.b();
         }

         this.g = $$3;
      }

      if ($$3 && ac.b() - this.f > (long)this.e) {
         fdb $$4 = evi.O().y;
         if ($$4 != null) {
            $$4.a(this, this.b($$0, $$1, $$2), $$1);
         }
      }
   }

   protected ffu b(boolean $$0, boolean $$1, fbj $$2) {
      return (ffu)(!$$0 && $$1 && evi.O().aV().b() ? new ffq($$2) : new ffw($$2));
   }
}

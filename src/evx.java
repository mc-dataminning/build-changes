import java.util.List;
import javax.annotation.Nullable;

public class evx implements eyg {
   private static final int a = 170;
   private final ur b;
   @Nullable
   private List<asu> c;
   @Nullable
   private final ur d;
   private int e;
   private long f;
   private boolean g;

   private evx(ur $$0, @Nullable ur $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public void a(int $$0) {
      this.e = $$0;
   }

   public static evx a(ur $$0, @Nullable ur $$1) {
      return new evx($$0, $$1);
   }

   public static evx a(ur $$0) {
      return new evx($$0, $$0);
   }

   @Override
   public void b(eyf $$0) {
      if (this.d != null) {
         $$0.a(eye.c, this.d);
      }
   }

   public List<asu> a(esr $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<asu> a(esr $$0, ur $$1) {
      return $$0.h.c($$1, 170);
   }

   public void a(boolean $$0, boolean $$1, eyp $$2) {
      boolean $$3 = $$0 || $$1 && esr.N().aT().b();
      if ($$3 != this.g) {
         if ($$3) {
            this.f = ac.b();
         }

         this.g = $$3;
      }

      if ($$3 && ac.b() - this.f > (long)this.e) {
         fah $$4 = esr.N().y;
         if ($$4 != null) {
            $$4.a(this, this.b($$0, $$1, $$2), $$1);
         }
      }
   }

   protected fda b(boolean $$0, boolean $$1, eyp $$2) {
      return (fda)(!$$0 && $$1 && esr.N().aT().b() ? new fcw($$2) : new fdc($$2));
   }
}

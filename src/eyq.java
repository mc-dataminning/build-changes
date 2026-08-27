import java.util.List;
import javax.annotation.Nullable;

public class eyq implements faz {
   private static final int a = 170;
   private final vf b;
   @Nullable
   private List<atz> c;
   @Nullable
   private final vf d;
   private int e;
   private long f;
   private boolean g;

   private eyq(vf $$0, @Nullable vf $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public void a(int $$0) {
      this.e = $$0;
   }

   public static eyq a(vf $$0, @Nullable vf $$1) {
      return new eyq($$0, $$1);
   }

   public static eyq a(vf $$0) {
      return new eyq($$0, $$0);
   }

   @Override
   public void b(fay $$0) {
      if (this.d != null) {
         $$0.a(fax.c, this.d);
      }
   }

   public List<atz> a(evh $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<atz> a(evh $$0, vf $$1) {
      return $$0.h.c($$1, 170);
   }

   public void a(boolean $$0, boolean $$1, fbi $$2) {
      boolean $$3 = $$0 || $$1 && evh.O().aU().b();
      if ($$3 != this.g) {
         if ($$3) {
            this.f = ac.b();
         }

         this.g = $$3;
      }

      if ($$3 && ac.b() - this.f > (long)this.e) {
         fda $$4 = evh.O().y;
         if ($$4 != null) {
            $$4.a(this, this.b($$0, $$1, $$2), $$1);
         }
      }
   }

   protected fft b(boolean $$0, boolean $$1, fbi $$2) {
      return (fft)(!$$0 && $$1 && evh.O().aU().b() ? new ffp($$2) : new ffv($$2));
   }
}

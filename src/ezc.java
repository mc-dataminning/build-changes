import java.util.List;
import javax.annotation.Nullable;

public class ezc implements fbl {
   private static final int a = 170;
   private final vg b;
   @Nullable
   private List<aub> c;
   @Nullable
   private final vg d;
   private int e;
   private long f;
   private boolean g;

   private ezc(vg $$0, @Nullable vg $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public void a(int $$0) {
      this.e = $$0;
   }

   public static ezc a(vg $$0, @Nullable vg $$1) {
      return new ezc($$0, $$1);
   }

   public static ezc a(vg $$0) {
      return new ezc($$0, $$0);
   }

   @Override
   public void b(fbk $$0) {
      if (this.d != null) {
         $$0.a(fbj.c, this.d);
      }
   }

   public List<aub> a(evr $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<aub> a(evr $$0, vg $$1) {
      return $$0.h.c($$1, 170);
   }

   public void a(boolean $$0, boolean $$1, fbu $$2) {
      boolean $$3 = $$0 || $$1 && evr.O().aV().b();
      if ($$3 != this.g) {
         if ($$3) {
            this.f = ac.b();
         }

         this.g = $$3;
      }

      if ($$3 && ac.b() - this.f > (long)this.e) {
         fdm $$4 = evr.O().y;
         if ($$4 != null) {
            $$4.a(this, this.b($$0, $$1, $$2), $$1);
         }
      }
   }

   protected fgf b(boolean $$0, boolean $$1, fbu $$2) {
      return (fgf)(!$$0 && $$1 && evr.O().aV().b() ? new fgb($$2) : new fgh($$2));
   }
}

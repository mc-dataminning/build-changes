import java.util.List;
import javax.annotation.Nullable;

public class eyj implements fas {
   private static final int a = 170;
   private final vd b;
   @Nullable
   private List<atu> c;
   @Nullable
   private final vd d;
   private int e;
   private long f;
   private boolean g;

   private eyj(vd $$0, @Nullable vd $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public void a(int $$0) {
      this.e = $$0;
   }

   public static eyj a(vd $$0, @Nullable vd $$1) {
      return new eyj($$0, $$1);
   }

   public static eyj a(vd $$0) {
      return new eyj($$0, $$0);
   }

   @Override
   public void b(far $$0) {
      if (this.d != null) {
         $$0.a(faq.c, this.d);
      }
   }

   public List<atu> a(eva $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<atu> a(eva $$0, vd $$1) {
      return $$0.h.c($$1, 170);
   }

   public void a(boolean $$0, boolean $$1, fbb $$2) {
      boolean $$3 = $$0 || $$1 && eva.N().aT().b();
      if ($$3 != this.g) {
         if ($$3) {
            this.f = ac.b();
         }

         this.g = $$3;
      }

      if ($$3 && ac.b() - this.f > (long)this.e) {
         fct $$4 = eva.N().y;
         if ($$4 != null) {
            $$4.a(this, this.b($$0, $$1, $$2), $$1);
         }
      }
   }

   protected ffm b(boolean $$0, boolean $$1, fbb $$2) {
      return (ffm)(!$$0 && $$1 && eva.N().aT().b() ? new ffi($$2) : new ffo($$2));
   }
}

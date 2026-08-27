import java.util.List;
import javax.annotation.Nullable;

public class euu implements exd {
   private static final int a = 170;
   private final ui b;
   @Nullable
   private List<ask> c;
   @Nullable
   private final ui d;
   private int e;
   private long f;
   private boolean g;

   private euu(ui $$0, @Nullable ui $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public void a(int $$0) {
      this.e = $$0;
   }

   public static euu a(ui $$0, @Nullable ui $$1) {
      return new euu($$0, $$1);
   }

   public static euu a(ui $$0) {
      return new euu($$0, $$0);
   }

   @Override
   public void b(exc $$0) {
      if (this.d != null) {
         $$0.a(exb.c, this.d);
      }
   }

   public List<ask> a(ero $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<ask> a(ero $$0, ui $$1) {
      return $$0.h.c($$1, 170);
   }

   public void a(boolean $$0, boolean $$1, exm $$2) {
      boolean $$3 = $$0 || $$1 && ero.O().aU().b();
      if ($$3 != this.g) {
         if ($$3) {
            this.f = ac.b();
         }

         this.g = $$3;
      }

      if ($$3 && ac.b() - this.f > (long)this.e) {
         ezd $$4 = ero.O().y;
         if ($$4 != null) {
            $$4.a(this, this.b($$0, $$1, $$2), $$1);
         }
      }
   }

   protected fbv b(boolean $$0, boolean $$1, exm $$2) {
      return (fbv)(!$$0 && $$1 && ero.O().aU().b() ? new fbr($$2) : new fbx($$2));
   }
}

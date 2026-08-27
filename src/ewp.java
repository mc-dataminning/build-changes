import java.util.List;
import javax.annotation.Nullable;

public class ewp implements eyy {
   private static final int a = 170;
   private final uv b;
   @Nullable
   private List<atc> c;
   @Nullable
   private final uv d;
   private int e;
   private long f;
   private boolean g;

   private ewp(uv $$0, @Nullable uv $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public void a(int $$0) {
      this.e = $$0;
   }

   public static ewp a(uv $$0, @Nullable uv $$1) {
      return new ewp($$0, $$1);
   }

   public static ewp a(uv $$0) {
      return new ewp($$0, $$0);
   }

   @Override
   public void b(eyx $$0) {
      if (this.d != null) {
         $$0.a(eyw.c, this.d);
      }
   }

   public List<atc> a(eti $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<atc> a(eti $$0, uv $$1) {
      return $$0.h.c($$1, 170);
   }

   public void a(boolean $$0, boolean $$1, ezh $$2) {
      boolean $$3 = $$0 || $$1 && eti.N().aT().b();
      if ($$3 != this.g) {
         if ($$3) {
            this.f = ac.b();
         }

         this.g = $$3;
      }

      if ($$3 && ac.b() - this.f > (long)this.e) {
         faz $$4 = eti.N().y;
         if ($$4 != null) {
            $$4.a(this, this.b($$0, $$1, $$2), $$1);
         }
      }
   }

   protected fds b(boolean $$0, boolean $$1, ezh $$2) {
      return (fds)(!$$0 && $$1 && eti.N().aT().b() ? new fdo($$2) : new fdu($$2));
   }
}

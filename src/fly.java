import java.time.Duration;
import javax.annotation.Nullable;

public class fly {
   @Nullable
   private flv a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable flv $$0) {
      this.a = $$0;
   }

   @Nullable
   public flv a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fos $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fil.Q().aY().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ad.c();
            }

            this.d = $$3;
         }

         if ($$3 && ad.c() - this.c > this.b.toMillis()) {
            fqd $$4 = fil.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fsn a(fos $$0, boolean $$1, boolean $$2) {
      return (fsn)(!$$1 && $$2 && fil.Q().aY().b() ? new fsi($$0) : new fsp($$0));
   }

   public void a(foh $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}

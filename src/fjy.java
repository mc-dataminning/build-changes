import java.time.Duration;
import javax.annotation.Nullable;

public class fjy {
   @Nullable
   private fjv a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fjv $$0) {
      this.a = $$0;
   }

   @Nullable
   public fjv a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fmq $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fgm.Q().aU().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ad.c();
            }

            this.d = $$3;
         }

         if ($$3 && ad.c() - this.c > this.b.toMillis()) {
            fob $$4 = fgm.Q().y;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private fqm a(fmq $$0, boolean $$1, boolean $$2) {
      return (fqm)(!$$1 && $$2 && fgm.Q().aU().b() ? new fqh($$0) : new fqo($$0));
   }

   public void a(fmg $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}

import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fcn {
   private final Consumer<fai> a;
   private final Consumer<fai> b;
   @Nullable
   private fcm c;
   @Nullable
   private fep d;

   public fcn(Consumer<fai> $$0, Consumer<fai> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fep $$0) {
      this.d = $$0;
      fcm $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fcm $$0, boolean $$1) {
      if (!Objects.equals(this.c, $$0)) {
         if (this.c != null) {
            this.c.a(this.b);
         }

         this.c = $$0;
         $$0.a(this.a);
         if (this.d != null) {
            $$0.a(this.d);
         }

         if ($$1) {
            eyk.P().aj().a(glh.a(atp.zK, 1.0F));
         }
      }
   }

   @Nullable
   public fcm a() {
      return this.c;
   }
}

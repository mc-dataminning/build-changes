import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fkn {
   private final Consumer<fii> a;
   private final Consumer<fii> b;
   @Nullable
   private fkm c;
   @Nullable
   private fmq d;

   public fkn(Consumer<fii> $$0, Consumer<fii> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fmq $$0) {
      this.d = $$0;
      fkm $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fkm $$0, boolean $$1) {
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
            fgm.Q().aj().a(gtt.a(avp.Ar, 1.0F));
         }
      }
   }

   @Nullable
   public fkm a() {
      return this.c;
   }
}

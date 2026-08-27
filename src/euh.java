import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class euh {
   private final Consumer<esf> a;
   private final Consumer<esf> b;
   @Nullable
   private eug c;
   @Nullable
   private ewh d;

   public euh(Consumer<esf> $$0, Consumer<esf> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(ewh $$0) {
      this.d = $$0;
      eug $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(eug $$0, boolean $$1) {
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
            eqm.O().ai().a(gbo.a(aow.yp, 1.0F));
         }
      }
   }

   @Nullable
   public eug a() {
      return this.c;
   }
}

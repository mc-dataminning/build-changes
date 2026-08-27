import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class euh {
   private final Consumer<ese> a;
   private final Consumer<ese> b;
   @Nullable
   private eug c;
   @Nullable
   private ewi d;

   public euh(Consumer<ese> $$0, Consumer<ese> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(ewi $$0) {
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
            eql.O().ai().a(gbx.a(aow.yu, 1.0F));
         }
      }
   }

   @Nullable
   public eug a() {
      return this.c;
   }
}

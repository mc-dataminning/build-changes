import java.util.Objects;
import javax.annotation.Nullable;

public class aey implements zg<abu> {
   public static final yx<vw, aey> a = zg.a(aey::a, aey::new);
   private final exv b;
   private final String c;

   public aey(exv $$0, @Nullable exw $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private aey(vw $$0) {
      this.b = $$0.a(exv.u);
      this.c = $$0.p();
   }

   private void a(vw $$0) {
      $$0.a(exv::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zi<aey> a() {
      return agg.aB;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public exv b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

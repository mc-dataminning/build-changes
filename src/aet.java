import java.util.Objects;
import javax.annotation.Nullable;

public class aet implements yw<abl> {
   public static final yn<vl, aet> a = yw.a(aet::a, aet::new);
   private final fct b;
   private final String c;

   public aet(fct $$0, @Nullable fcu $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private aet(vl $$0) {
      this.b = $$0.a(fct.u);
      this.c = $$0.p();
   }

   private void a(vl $$0) {
      $$0.a(fct::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public yy<aet> a() {
      return agd.aD;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public fct b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

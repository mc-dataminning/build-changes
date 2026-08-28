import java.util.Objects;
import javax.annotation.Nullable;

public class afp implements zr<acg> {
   public static final zi<wh, afp> a = zr.a(afp::a, afp::new);
   private final fcn b;
   private final String c;

   public afp(fcn $$0, @Nullable fco $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private afp(wh $$0) {
      this.b = $$0.a(fcn.u);
      this.c = $$0.p();
   }

   private void a(wh $$0) {
      $$0.a(fcn::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zt<afp> a() {
      return agz.aE;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public fcn b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

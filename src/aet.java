import java.util.Objects;
import javax.annotation.Nullable;

public class aet implements yv<abk> {
   public static final ym<vl, aet> a = yv.a(aet::a, aet::new);
   private final fbw b;
   private final String c;

   public aet(fbw $$0, @Nullable fbx $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private aet(vl $$0) {
      this.b = $$0.a(fbw.u);
      this.c = $$0.p();
   }

   private void a(vl $$0) {
      $$0.a(fbw::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public yx<aet> a() {
      return agd.aE;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public fbw b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

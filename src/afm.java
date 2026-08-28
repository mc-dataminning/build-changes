import java.util.Objects;
import javax.annotation.Nullable;

public class afm implements zw<aci> {
   public static final zn<wm, afm> a = zw.a(afm::a, afm::new);
   private final ewo b;
   private final String c;

   public afm(ewo $$0, @Nullable ewp $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private afm(wm $$0) {
      this.b = $$0.a(ewo.u);
      this.c = $$0.p();
   }

   private void a(wm $$0) {
      $$0.a(ewo::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<afm> a() {
      return agu.aB;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public ewo b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

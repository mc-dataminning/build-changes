import java.util.Objects;
import javax.annotation.Nullable;

public class aff implements zl<aca> {
   public static final zc<wb, aff> a = zl.a(aff::a, aff::new);
   private final ezs b;
   private final String c;

   public aff(ezs $$0, @Nullable ezt $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private aff(wb $$0) {
      this.b = $$0.a(ezs.u);
      this.c = $$0.p();
   }

   private void a(wb $$0) {
      $$0.a(ezs::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zn<aff> a() {
      return agp.aB;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public ezs b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

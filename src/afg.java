import java.util.Objects;
import javax.annotation.Nullable;

public class afg implements zj<aby> {
   public static final za<vy, afg> a = zj.a(afg::a, afg::new);
   private final fgo b;
   private final String c;

   public afg(fgo $$0, @Nullable fgp $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.c();
      }
   }

   private afg(vy $$0) {
      this.b = $$0.a(fgo.u);
      this.c = $$0.p();
   }

   private void a(vy $$0) {
      $$0.a(fgo::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zl<afg> a() {
      return agr.aE;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public fgo b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

import java.util.Objects;
import javax.annotation.Nullable;

public class aeu implements yw<abl> {
   public static final yn<vl, aeu> a = yw.a(aeu::a, aeu::new);
   private final fbx b;
   private final String c;

   public aeu(fbx $$0, @Nullable fby $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private aeu(vl $$0) {
      this.b = $$0.a(fbx.u);
      this.c = $$0.p();
   }

   private void a(vl $$0) {
      $$0.a(fbx::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public yy<aeu> a() {
      return age.aE;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public fbx b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

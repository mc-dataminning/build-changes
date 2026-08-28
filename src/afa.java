import java.util.Objects;
import javax.annotation.Nullable;

public class afa implements zd<abs> {
   public static final yu<vs, afa> a = zd.a(afa::a, afa::new);
   private final fes b;
   private final String c;

   public afa(fes $$0, @Nullable fet $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private afa(vs $$0) {
      this.b = $$0.a(fes.u);
      this.c = $$0.p();
   }

   private void a(vs $$0) {
      $$0.a(fes::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zf<afa> a() {
      return agl.aE;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public fes b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

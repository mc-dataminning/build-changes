import java.util.Objects;
import javax.annotation.Nullable;

public class aex implements zf<abt> {
   public static final yw<vv, aex> a = zf.a(aex::a, aex::new);
   private final exr b;
   private final String c;

   public aex(exr $$0, @Nullable exs $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private aex(vv $$0) {
      this.b = $$0.a(exr.u);
      this.c = $$0.p();
   }

   private void a(vv $$0) {
      $$0.a(exr::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zh<aex> a() {
      return agf.aB;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public exr b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

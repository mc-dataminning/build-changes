import java.util.Objects;
import javax.annotation.Nullable;

public class afc implements zf<abu> {
   public static final yw<vu, afc> a = zf.a(afc::a, afc::new);
   private final ffe b;
   private final String c;

   public afc(ffe $$0, @Nullable fff $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.c();
      }
   }

   private afc(vu $$0) {
      this.b = $$0.a(ffe.u);
      this.c = $$0.p();
   }

   private void a(vu $$0) {
      $$0.a(ffe::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zh<afc> a() {
      return agn.aE;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public ffe b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

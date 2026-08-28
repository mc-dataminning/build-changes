import java.util.Objects;
import javax.annotation.Nullable;

public class aga implements aac<acr> {
   public static final zt<ws, aga> a = aac.a(aga::a, aga::new);
   private final fco b;
   private final String c;

   public aga(fco $$0, @Nullable fcp $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private aga(ws $$0) {
      this.b = $$0.a(fco.u);
      this.c = $$0.p();
   }

   private void a(ws $$0) {
      $$0.a(fco::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public aae<aga> a() {
      return ahk.aE;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public fco b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

import java.util.Objects;
import javax.annotation.Nullable;

public class afa implements zl<abw> {
   public static final zc<we, afa> a = zl.a(afa::a, afa::new);
   private final exp b;
   private final String c;

   public afa(exp $$0, @Nullable exq $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private afa(we $$0) {
      this.b = $$0.a(exp.u);
      this.c = $$0.p();
   }

   private void a(we $$0) {
      $$0.a(exp::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zn<afa> a() {
      return agj.aC;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public exp b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

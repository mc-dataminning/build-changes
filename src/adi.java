import java.util.Objects;
import javax.annotation.Nullable;

public class adi implements xx<aag> {
   public static final xo<uq, adi> a = xx.a(adi::a, adi::new);
   private final eou b;
   private final String c;

   public adi(eou $$0, @Nullable eov $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private adi(uq $$0) {
      this.b = $$0.a(eou.u);
      this.c = $$0.r();
   }

   private void a(uq $$0) {
      $$0.a(eou::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public xz<adi> a() {
      return aeq.aA;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public eou b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

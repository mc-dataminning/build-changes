import java.util.Objects;
import javax.annotation.Nullable;

public class adp implements yb<aam> {
   public static final xs<uu, adp> a = yb.a(adp::a, adp::new);
   private final eqm b;
   private final String c;

   public adp(eqm $$0, @Nullable eqn $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private adp(uu $$0) {
      this.b = $$0.a(eqm.u);
      this.c = $$0.p();
   }

   private void a(uu $$0) {
      $$0.a(eqm::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public yd<adp> a() {
      return aex.aB;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public eqm b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

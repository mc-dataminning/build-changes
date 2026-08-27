import java.util.Objects;
import javax.annotation.Nullable;

public class aed implements yp<aba> {
   public static final yg<vi, aed> a = yp.a(aed::a, aed::new);
   private final ete b;
   private final String c;

   public aed(ete $$0, @Nullable etf $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private aed(vi $$0) {
      this.b = $$0.a(ete.u);
      this.c = $$0.p();
   }

   private void a(vi $$0) {
      $$0.a(ete::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public yr<aed> a() {
      return afl.aB;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public ete b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

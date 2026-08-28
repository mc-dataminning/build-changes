import java.util.Objects;
import javax.annotation.Nullable;

public class afn implements zo<acf> {
   public static final ze<vy, afn> a = zo.a(afn::a, afn::new);
   private final fgy b;
   private final String c;

   public afn(fgy $$0, @Nullable fgz $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.c();
      }
   }

   private afn(vy $$0) {
      this.b = $$0.a(fgy.u);
      this.c = $$0.p();
   }

   private void a(vy $$0) {
      $$0.a(fgy::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zq<afn> a() {
      return agy.aE;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public fgy b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

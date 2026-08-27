import java.util.Objects;
import javax.annotation.Nullable;

public class aen implements yz<abk> {
   public static final yq<vs, aen> a = yz.a(aen::a, aen::new);
   private final eua b;
   private final String c;

   public aen(eua $$0, @Nullable eub $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private aen(vs $$0) {
      this.b = $$0.a(eua.u);
      this.c = $$0.p();
   }

   private void a(vs $$0) {
      $$0.a(eua::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zb<aen> a() {
      return afv.aB;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public eua b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

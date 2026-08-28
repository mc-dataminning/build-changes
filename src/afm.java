import java.util.Objects;
import javax.annotation.Nullable;

public class afm implements zs<ach> {
   public static final zj<wi, afm> a = zs.a(afm::a, afm::new);
   private final fan b;
   private final String c;

   public afm(fan $$0, @Nullable fao $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private afm(wi $$0) {
      this.b = $$0.a(fan.u);
      this.c = $$0.p();
   }

   private void a(wi $$0) {
      $$0.a(fan::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<afm> a() {
      return agw.aB;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public fan b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

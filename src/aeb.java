import java.util.Objects;
import javax.annotation.Nullable;

public class aeb implements yn<aay> {
   public static final ye<vg, aeb> a = yn.a(aeb::a, aeb::new);
   private final esv b;
   private final String c;

   public aeb(esv $$0, @Nullable esw $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private aeb(vg $$0) {
      this.b = $$0.a(esv.u);
      this.c = $$0.p();
   }

   private void a(vg $$0) {
      $$0.a(esv::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public yp<aeb> a() {
      return afj.aB;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public esv b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

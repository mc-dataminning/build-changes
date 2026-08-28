import java.util.Objects;
import javax.annotation.Nullable;

public class afj implements zp<ace> {
   public static final zg<wf, afj> a = zp.a(afj::a, afj::new);
   private final faj b;
   private final String c;

   public afj(faj $$0, @Nullable fak $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private afj(wf $$0) {
      this.b = $$0.a(faj.u);
      this.c = $$0.p();
   }

   private void a(wf $$0) {
      $$0.a(faj::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zr<afj> a() {
      return agt.aB;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public faj b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

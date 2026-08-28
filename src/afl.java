import java.util.Objects;
import javax.annotation.Nullable;

public class afl implements zv<ach> {
   public static final zm<wl, afl> a = zv.a(afl::a, afl::new);
   private final ewl b;
   private final String c;

   public afl(ewl $$0, @Nullable ewm $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private afl(wl $$0) {
      this.b = $$0.a(ewl.u);
      this.c = $$0.p();
   }

   private void a(wl $$0) {
      $$0.a(ewl::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zx<afl> a() {
      return agt.aB;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public ewl b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

import java.util.Objects;
import javax.annotation.Nullable;

public class aer implements zb<abn> {
   public static final ys<vr, aer> a = zb.a(aer::a, aer::new);
   private final exa b;
   private final String c;

   public aer(exa $$0, @Nullable exb $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private aer(vr $$0) {
      this.b = $$0.a(exa.u);
      this.c = $$0.p();
   }

   private void a(vr $$0) {
      $$0.a(exa::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<aer> a() {
      return afz.aB;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public exa b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

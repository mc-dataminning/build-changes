import java.util.Objects;
import javax.annotation.Nullable;

public class aez implements zc<abr> {
   public static final yt<vr, aez> a = zc.a(aez::a, aez::new);
   private final fdq b;
   private final String c;

   public aez(fdq $$0, @Nullable fdr $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private aez(vr $$0) {
      this.b = $$0.a(fdq.u);
      this.c = $$0.p();
   }

   private void a(vr $$0) {
      $$0.a(fdq::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public ze<aez> a() {
      return agk.aE;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public fdq b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

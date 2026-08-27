import java.util.Objects;
import javax.annotation.Nullable;

public class aeu implements ze<abq> {
   public static final yv<vx, aeu> a = ze.a(aeu::a, aeu::new);
   private final evh b;
   private final String c;

   public aeu(evh $$0, @Nullable evi $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private aeu(vx $$0) {
      this.b = $$0.a(evh.u);
      this.c = $$0.p();
   }

   private void a(vx $$0) {
      $$0.a(evh::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zg<aeu> a() {
      return agc.aB;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public evh b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

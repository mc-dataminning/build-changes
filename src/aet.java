import java.util.Objects;
import javax.annotation.Nullable;

public class aet implements ze<abq> {
   public static final yv<vx, aet> a = ze.a(aet::a, aet::new);
   private final evf b;
   private final String c;

   public aet(evf $$0, @Nullable evg $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private aet(vx $$0) {
      this.b = $$0.a(evf.u);
      this.c = $$0.p();
   }

   private void a(vx $$0) {
      $$0.a(evf::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zg<aet> a() {
      return agb.aB;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public evf b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

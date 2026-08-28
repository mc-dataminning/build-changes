import java.util.Objects;
import javax.annotation.Nullable;

public class afi implements zs<ace> {
   public static final zj<wl, afi> a = zs.a(afi::a, afi::new);
   private final ewh b;
   private final String c;

   public afi(ewh $$0, @Nullable ewi $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.b();
      }
   }

   private afi(wl $$0) {
      this.b = $$0.a(ewh.u);
      this.c = $$0.p();
   }

   private void a(wl $$0) {
      $$0.a(ewh::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<afi> a() {
      return agq.aB;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public ewh b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

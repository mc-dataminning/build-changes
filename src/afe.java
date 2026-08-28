import java.util.Objects;
import javax.annotation.Nullable;

public class afe implements zh<abw> {
   public static final yy<vw, afe> a = zh.a(afe::a, afe::new);
   private final fgm b;
   private final String c;

   public afe(fgm $$0, @Nullable fgn $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.c();
      }
   }

   private afe(vw $$0) {
      this.b = $$0.a(fgm.u);
      this.c = $$0.p();
   }

   private void a(vw $$0) {
      $$0.a(fgm::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zj<afe> a() {
      return agp.aE;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public fgm b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}

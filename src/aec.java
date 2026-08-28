import java.util.List;
import java.util.UUID;

public record aec(List<UUID> b) implements zh<abw> {
   public static final yy<vw, aec> a = zh.a(aec::a, aec::new);

   private aec(vw $$0) {
      this($$0.a(jz.g));
   }

   private void a(vw $$0) {
      $$0.a(this.b, jz.g);
   }

   @Override
   public zj<aec> a() {
      return agp.af;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }
}

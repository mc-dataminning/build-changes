import java.util.List;
import javax.annotation.Nullable;

public record adr(int b, List<cuz.a> c) implements zh<abw> {
   public static final yy<vw, adr> a = yy.a(yw.h, adr::b, cuz.a.a.a(yw.a()), adr::e, adr::new);

   @Override
   public zj<adr> a() {
      return agp.T;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   @Nullable
   public bwt a(djx $$0) {
      return $$0.a(this.b);
   }

   public List<cuz.a> e() {
      return this.c;
   }
}

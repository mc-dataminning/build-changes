import java.util.List;
import javax.annotation.Nullable;

public record adp(int b, List<cuo.a> c) implements zf<abu> {
   public static final yw<vu, adp> a = yw.a(yu.h, adp::b, cuo.a.a.a(yu.a()), adp::e, adp::new);

   @Override
   public zh<adp> a() {
      return agn.T;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   @Nullable
   public bwi a(djm $$0) {
      return $$0.a(this.b);
   }

   public List<cuo.a> e() {
      return this.c;
   }
}

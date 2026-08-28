import java.util.List;
import javax.annotation.Nullable;

public record adg(int b, List<csf.a> c) implements yw<abl> {
   public static final yn<vl, adg> a = yn.a(yl.h, adg::b, csf.a.a.a(yl.a()), adg::e, adg::new);

   @Override
   public yy<adg> a() {
      return agd.S;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   @Nullable
   public bva a(dgz $$0) {
      return $$0.a(this.b);
   }

   public List<csf.a> e() {
      return this.c;
   }
}

import java.util.List;
import javax.annotation.Nullable;

public record adg(int b, List<crj.a> c) implements yv<abk> {
   public static final ym<vl, adg> a = ym.a(yk.h, adg::b, crj.a.a.a(yk.a()), adg::e, adg::new);

   @Override
   public yx<adg> a() {
      return agd.T;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   @Nullable
   public buj a(dgg $$0) {
      return $$0.a(this.b);
   }

   public List<crj.a> e() {
      return this.c;
   }
}

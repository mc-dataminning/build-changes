import java.util.List;
import javax.annotation.Nullable;

public record adg(int b, List<crl.a> c) implements yv<abk> {
   public static final ym<vl, adg> a = ym.a(yk.h, adg::b, crl.a.a.a(yk.a()), adg::e, adg::new);

   @Override
   public yx<adg> a() {
      return agd.T;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   @Nullable
   public buk a(dgi $$0) {
      return $$0.a(this.b);
   }

   public List<crl.a> e() {
      return this.c;
   }
}

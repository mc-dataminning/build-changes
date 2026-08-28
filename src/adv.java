import java.util.List;
import javax.annotation.Nullable;

public record adv(int b, List<cqj.a> c) implements zl<aca> {
   public static final zc<wb, adv> a = zc.a(za.h, adv::b, cqj.a.a.a(za.a()), adv::e, adv::new);

   @Override
   public zn<adv> a() {
      return agp.T;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   @Nullable
   public btr a(dej $$0) {
      return $$0.a(this.b);
   }

   public List<cqj.a> e() {
      return this.c;
   }
}

import java.util.Collection;
import java.util.List;

public class afv implements zb<abn> {
   public static final ys<wf, afv> a = ys.a(cyl.a.a(yq.a()), $$0 -> $$0.b, afv::new);
   private final List<cyl<?>> b;

   public afv(Collection<cyl<?>> $$0) {
      this.b = List.copyOf($$0);
   }

   @Override
   public zd<afv> a() {
      return afz.bd;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public List<cyl<?>> b() {
      return this.b;
   }
}

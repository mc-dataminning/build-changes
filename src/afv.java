import java.util.Collection;
import java.util.List;

public class afv implements zb<abn> {
   public static final ys<wf, afv> a = ys.a(cyk.a.a(yq.a()), $$0 -> $$0.b, afv::new);
   private final List<cyk<?>> b;

   public afv(Collection<cyk<?>> $$0) {
      this.b = List.copyOf($$0);
   }

   @Override
   public zd<afv> a() {
      return afz.bd;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public List<cyk<?>> b() {
      return this.b;
   }
}

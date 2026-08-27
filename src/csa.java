import java.util.List;
import javax.annotation.Nullable;

public class csa extends cuc {
   private final awt<dpr> a;

   public csa(awt<dpr> $$0, cuc.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public awt<dpr> b() {
      return this.a;
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      $$2.add(this.c().a(n.h));
   }

   public xs c() {
      return xe.c(this.a() + ".desc");
   }
}

import java.util.List;
import javax.annotation.Nullable;

public class csv extends cuc {
   public csv(cuc.a $$0) {
      super($$0);
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      $$2.add(this.c().a(n.h));
   }

   public xs c() {
      return xe.c(this.a() + ".desc");
   }
}

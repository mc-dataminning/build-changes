import java.util.List;
import javax.annotation.Nullable;

public class cdq extends cfu {
   private final anl<cze> a;

   public cdq(anl<cze> $$0, cfu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public anl<cze> b() {
      return this.a;
   }

   @Override
   public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
      $$2.add(this.d().a(n.h));
   }

   public tj d() {
      return sw.c(this.a() + ".desc");
   }
}

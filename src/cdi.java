import java.util.List;
import javax.annotation.Nullable;

public class cdi extends cfu {
   private final cpn a;

   public cdi(cpn $$0, cfu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public String a() {
      return this.a.f();
   }

   @Override
   public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, $$1, $$2, $$3);
   }
}

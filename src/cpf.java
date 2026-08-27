import java.util.List;
import javax.annotation.Nullable;

public class cpf extends crn {
   private final dch a;

   public cpf(dch $$0, crn.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public String a() {
      return this.a.g();
   }

   @Override
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, $$1, $$2, $$3, $$1 != null ? $$1.H_() : null);
   }
}

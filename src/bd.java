import java.util.List;
import java.util.Optional;

public class bd {
   private final ayb a;
   private final eoe b;

   public bd(ayb $$0, eoe $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(Optional<bc> $$0, String $$1) {
      $$0.ifPresent($$1x -> this.a($$1x, $$1));
   }

   public void a(List<bc> $$0, String $$1) {
      this.a($$0, eqs.m, $$1);
   }

   public void a(bc $$0, String $$1) {
      this.a($$0, eqs.m, $$1);
   }

   public void a(bc $$0, eqr $$1, String $$2) {
      $$0.a(new eoj(this.a.a($$2), $$1, this.b));
   }

   public void a(List<bc> $$0, eqr $$1, String $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         bc $$4 = $$0.get($$3);
         $$4.a(new eoj(this.a.a($$2 + "[" + $$3 + "]"), $$1, this.b));
      }
   }
}

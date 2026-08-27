import java.util.List;
import java.util.Optional;

public class bc {
   private final aud a;
   private final egi b;

   public bc(aud $$0, egi $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(Optional<bb> $$0, String $$1) {
      $$0.ifPresent($$1x -> this.a($$1x, $$1));
   }

   public void a(List<bb> $$0, String $$1) {
      this.a($$0, eio.l, $$1);
   }

   public void a(bb $$0, String $$1) {
      this.a($$0, eio.l, $$1);
   }

   public void a(bb $$0, ein $$1, String $$2) {
      $$0.a(new egn(this.a.a($$2), $$1, this.b));
   }

   public void a(List<bb> $$0, ein $$1, String $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         bb $$4 = $$0.get($$3);
         $$4.a(new egn(this.a.a($$2 + "[" + $$3 + "]"), $$1, this.b));
      }
   }
}

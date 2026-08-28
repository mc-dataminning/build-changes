import java.util.List;
import java.util.Optional;

public class bg {
   private final azf a;
   private final jj.a b;

   public bg(azf $$0, jj.a $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(Optional<bf> $$0, String $$1) {
      $$0.ifPresent($$1x -> this.a($$1x, $$1));
   }

   public void a(List<bf> $$0, String $$1) {
      this.a($$0, etd.n, $$1);
   }

   public void a(bf $$0, String $$1) {
      this.a($$0, etd.n, $$1);
   }

   public void a(bf $$0, etc $$1, String $$2) {
      $$0.a(new eqo(this.a.a($$2), $$1, this.b));
   }

   public void a(List<bf> $$0, etc $$1, String $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         bf $$4 = $$0.get($$3);
         $$4.a(new eqo(this.a.a($$2 + "[" + $$3 + "]"), $$1, this.b));
      }
   }
}

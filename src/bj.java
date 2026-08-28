import java.util.List;
import java.util.Optional;

public class bj {
   private final aze a;
   private final js.a b;

   public bj(aze $$0, js.a $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(Optional<bi> $$0, String $$1) {
      $$0.ifPresent($$1x -> this.a($$1x, $$1));
   }

   public void a(List<bi> $$0, String $$1) {
      this.a($$0, eyi.n, $$1);
   }

   public void a(bi $$0, String $$1) {
      this.a($$0, eyi.n, $$1);
   }

   public void a(bi $$0, bai $$1, String $$2) {
      $$0.a(new evv(this.a.a($$2), $$1, this.b));
   }

   public void a(List<bi> $$0, bai $$1, String $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         bi $$4 = $$0.get($$3);
         $$4.a(new evv(this.a.a($$2 + "[" + $$3 + "]"), $$1, this.b));
      }
   }
}

import java.util.List;
import java.util.Optional;

public class bj {
   private final azr a;
   private final jf.a b;

   public bj(azr $$0, jf.a $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(Optional<bi> $$0, String $$1) {
      $$0.ifPresent($$1x -> this.a($$1x, $$1));
   }

   public void a(List<bi> $$0, String $$1) {
      this.a($$0, fbg.n, $$1);
   }

   public void a(bi $$0, String $$1) {
      this.a($$0, fbg.n, $$1);
   }

   public void a(bi $$0, baw $$1, String $$2) {
      $$0.a(new eyt(this.a.a($$2), $$1, this.b));
   }

   public void a(List<bi> $$0, baw $$1, String $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         bi $$4 = $$0.get($$3);
         $$4.a(new eyt(this.a.a($$2 + "[" + $$3 + "]"), $$1, this.b));
      }
   }
}

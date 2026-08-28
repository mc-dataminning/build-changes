import java.util.List;
import java.util.Optional;

public class bh {
   private final ayu a;
   private final jn.a b;

   public bh(ayu $$0, jn.a $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(Optional<bg> $$0, String $$1) {
      $$0.ifPresent($$1x -> this.a($$1x, $$1));
   }

   public void a(List<bg> $$0, String $$1) {
      this.a($$0, euk.n, $$1);
   }

   public void a(bg $$0, String $$1) {
      this.a($$0, euk.n, $$1);
   }

   public void a(bg $$0, euj $$1, String $$2) {
      $$0.a(new erv(this.a.a($$2), $$1, this.b));
   }

   public void a(List<bg> $$0, euj $$1, String $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         bg $$4 = $$0.get($$3);
         $$4.a(new erv(this.a.a($$2 + "[" + $$3 + "]"), $$1, this.b));
      }
   }
}

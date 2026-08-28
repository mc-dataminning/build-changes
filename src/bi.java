import java.util.List;
import java.util.Optional;

public class bi {
   private final azt a;
   private final jr.a b;

   public bi(azt $$0, jr.a $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(Optional<bh> $$0, String $$1) {
      $$0.ifPresent($$1x -> this.a($$1x, $$1));
   }

   public void a(List<bh> $$0, String $$1) {
      this.a($$0, exb.n, $$1);
   }

   public void a(bh $$0, String $$1) {
      this.a($$0, exb.n, $$1);
   }

   public void a(bh $$0, exa $$1, String $$2) {
      $$0.a(new eum(this.a.a($$2), $$1, this.b));
   }

   public void a(List<bh> $$0, exa $$1, String $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         bh $$4 = $$0.get($$3);
         $$4.a(new eum(this.a.a($$2 + "[" + $$3 + "]"), $$1, this.b));
      }
   }
}

import java.util.List;
import java.util.Optional;

public class bk {
   private final azt a;
   private final jg.a b;

   public bk(azt $$0, jg.a $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(Optional<bj> $$0, String $$1) {
      $$0.ifPresent($$1x -> this.a($$1x, $$1));
   }

   public void a(List<bj> $$0, String $$1) {
      this.a($$0, fch.n, $$1);
   }

   public void a(bj $$0, String $$1) {
      this.a($$0, fch.n, $$1);
   }

   public void a(bj $$0, bay $$1, String $$2) {
      $$0.a(new ezu(this.a.a($$2), $$1, this.b));
   }

   public void a(List<bj> $$0, bay $$1, String $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         bj $$4 = $$0.get($$3);
         $$4.a(new ezu(this.a.a($$2 + "[" + $$3 + "]"), $$1, this.b));
      }
   }
}

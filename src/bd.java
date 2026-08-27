import java.util.List;
import java.util.Optional;

public class bd {
   private final ayk a;
   private final iy.a b;

   public bd(ayk $$0, iy.a $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(Optional<bc> $$0, String $$1) {
      $$0.ifPresent($$1x -> this.a($$1x, $$1));
   }

   public void a(List<bc> $$0, String $$1) {
      this.a($$0, ery.n, $$1);
   }

   public void a(bc $$0, String $$1) {
      this.a($$0, ery.n, $$1);
   }

   public void a(bc $$0, erx $$1, String $$2) {
      $$0.a(new epn(this.a.a($$2), $$1, this.b));
   }

   public void a(List<bc> $$0, erx $$1, String $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         bc $$4 = $$0.get($$3);
         $$4.a(new epn(this.a.a($$2 + "[" + $$3 + "]"), $$1, this.b));
      }
   }
}

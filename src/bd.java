import java.util.List;
import java.util.Optional;

public class bd {
   private final awr a;
   private final ekc b;

   public bd(awr $$0, ekc $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(Optional<bc> $$0, String $$1) {
      $$0.ifPresent($$1x -> this.a($$1x, $$1));
   }

   public void a(List<bc> $$0, String $$1) {
      this.a($$0, emi.m, $$1);
   }

   public void a(bc $$0, String $$1) {
      this.a($$0, emi.m, $$1);
   }

   public void a(bc $$0, emh $$1, String $$2) {
      $$0.a(new ekh(this.a.a($$2), $$1, this.b));
   }

   public void a(List<bc> $$0, emh $$1, String $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         bc $$4 = $$0.get($$3);
         $$4.a(new ekh(this.a.a($$2 + "[" + $$3 + "]"), $$1, this.b));
      }
   }
}

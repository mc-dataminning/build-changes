import java.util.ArrayList;
import javax.annotation.Nullable;

public class cuq extends ArrayList<cup> {
   public static final xo<vb, cuq> a = cup.a.a(xm.a(cuq::new));

   public cuq() {
   }

   private cuq(int $$0) {
      super($$0);
   }

   public cuq(sw $$0) {
      tc $$1 = $$0.c("Recipes", 10);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.add(new cup($$1.a($$2)));
      }
   }

   @Nullable
   public cup a(cpd $$0, cpd $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         cup $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            cup $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public sw a() {
      sw $$0 = new sw();
      tc $$1 = new tc();

      for (int $$2 = 0; $$2 < this.size(); $$2++) {
         cup $$3 = this.get($$2);
         $$1.add($$3.u());
      }

      $$0.a("Recipes", $$1);
      return $$0;
   }

   public cuq b() {
      cuq $$0 = new cuq(this.size());

      for (cup $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}

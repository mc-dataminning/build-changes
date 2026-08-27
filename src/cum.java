import java.util.ArrayList;
import javax.annotation.Nullable;

public class cum extends ArrayList<cul> {
   public static final xo<vb, cum> a = cul.a.a(xm.a(cum::new));

   public cum() {
   }

   private cum(int $$0) {
      super($$0);
   }

   public cum(sw $$0) {
      tc $$1 = $$0.c("Recipes", 10);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.add(new cul($$1.a($$2)));
      }
   }

   @Nullable
   public cul a(coz $$0, coz $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         cul $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            cul $$5 = this.get($$4);
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
         cul $$3 = this.get($$2);
         $$1.add($$3.u());
      }

      $$0.a("Recipes", $$1);
      return $$0;
   }

   public cum b() {
      cum $$0 = new cum(this.size());

      for (cul $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}

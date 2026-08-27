import java.util.ArrayList;
import javax.annotation.Nullable;

public class csh extends ArrayList<csg> {
   public csh() {
   }

   private csh(int $$0) {
      super($$0);
   }

   public csh(sl $$0) {
      sr $$1 = $$0.c("Recipes", 10);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.add(new csg($$1.a($$2)));
      }
   }

   @Nullable
   public csg a(cmr $$0, cmr $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         csg $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            csg $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public void a(ug $$0) {
      $$0.a(this, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.d());
         $$0x.a($$1.c());
         $$0x.a($$1.p());
         $$0x.p($$1.g());
         $$0x.p($$1.i());
         $$0x.p($$1.o());
         $$0x.p($$1.m());
         $$0x.a($$1.n());
         $$0x.p($$1.k());
      });
   }

   public static csh b(ug $$0) {
      return $$0.a(csh::new, $$0x -> {
         cmr $$1 = $$0x.r();
         cmr $$2 = $$0x.r();
         cmr $$3 = $$0x.r();
         boolean $$4 = $$0x.readBoolean();
         int $$5 = $$0x.readInt();
         int $$6 = $$0x.readInt();
         int $$7 = $$0x.readInt();
         int $$8 = $$0x.readInt();
         float $$9 = $$0x.readFloat();
         int $$10 = $$0x.readInt();
         csg $$11 = new csg($$1, $$3, $$2, $$5, $$6, $$7, $$9, $$10);
         if ($$4) {
            $$11.q();
         }

         $$11.b($$8);
         return $$11;
      });
   }

   public sl a() {
      sl $$0 = new sl();
      sr $$1 = new sr();

      for (int $$2 = 0; $$2 < this.size(); $$2++) {
         csg $$3 = this.get($$2);
         $$1.add($$3.t());
      }

      $$0.a("Recipes", $$1);
      return $$0;
   }

   public csh b() {
      csh $$0 = new csh(this.size());

      for (csg $$1 : this) {
         $$0.add($$1.u());
      }

      return $$0;
   }
}

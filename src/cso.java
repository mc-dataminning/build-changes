import java.util.ArrayList;
import javax.annotation.Nullable;

public class cso extends ArrayList<csn> {
   public cso() {
   }

   private cso(int $$0) {
      super($$0);
   }

   public cso(sn $$0) {
      st $$1 = $$0.c("Recipes", 10);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.add(new csn($$1.a($$2)));
      }
   }

   @Nullable
   public csn a(cmy $$0, cmy $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         csn $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            csn $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public void a(ui $$0) {
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

   public static cso b(ui $$0) {
      return $$0.a(cso::new, $$0x -> {
         cmy $$1 = $$0x.r();
         cmy $$2 = $$0x.r();
         cmy $$3 = $$0x.r();
         boolean $$4 = $$0x.readBoolean();
         int $$5 = $$0x.readInt();
         int $$6 = $$0x.readInt();
         int $$7 = $$0x.readInt();
         int $$8 = $$0x.readInt();
         float $$9 = $$0x.readFloat();
         int $$10 = $$0x.readInt();
         csn $$11 = new csn($$1, $$3, $$2, $$5, $$6, $$7, $$9, $$10);
         if ($$4) {
            $$11.q();
         }

         $$11.b($$8);
         return $$11;
      });
   }

   public sn a() {
      sn $$0 = new sn();
      st $$1 = new st();

      for (int $$2 = 0; $$2 < this.size(); $$2++) {
         csn $$3 = this.get($$2);
         $$1.add($$3.t());
      }

      $$0.a("Recipes", $$1);
      return $$0;
   }

   public cso b() {
      cso $$0 = new cso(this.size());

      for (csn $$1 : this) {
         $$0.add($$1.u());
      }

      return $$0;
   }
}

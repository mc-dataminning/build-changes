import java.util.ArrayList;
import javax.annotation.Nullable;

public class csn extends ArrayList<csm> {
   public csn() {
   }

   private csn(int $$0) {
      super($$0);
   }

   public csn(sn $$0) {
      st $$1 = $$0.c("Recipes", 10);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.add(new csm($$1.a($$2)));
      }
   }

   @Nullable
   public csm a(cmx $$0, cmx $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         csm $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            csm $$5 = this.get($$4);
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

   public static csn b(ui $$0) {
      return $$0.a(csn::new, $$0x -> {
         cmx $$1 = $$0x.r();
         cmx $$2 = $$0x.r();
         cmx $$3 = $$0x.r();
         boolean $$4 = $$0x.readBoolean();
         int $$5 = $$0x.readInt();
         int $$6 = $$0x.readInt();
         int $$7 = $$0x.readInt();
         int $$8 = $$0x.readInt();
         float $$9 = $$0x.readFloat();
         int $$10 = $$0x.readInt();
         csm $$11 = new csm($$1, $$3, $$2, $$5, $$6, $$7, $$9, $$10);
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
         csm $$3 = this.get($$2);
         $$1.add($$3.t());
      }

      $$0.a("Recipes", $$1);
      return $$0;
   }

   public csn b() {
      csn $$0 = new csn(this.size());

      for (csm $$1 : this) {
         $$0.add($$1.u());
      }

      return $$0;
   }
}

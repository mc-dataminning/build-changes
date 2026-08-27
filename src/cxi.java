import java.util.function.ToIntFunction;

public class cxi extends csx implements czy {
   public static final int a = 15;
   public static final dgl b = dgb.aP;
   public static final dgc c = dgb.C;
   public static final ToIntFunction<dfl> d = $$0 -> $$0.c(b);

   public cxi(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(15)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b, c);
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if (!$$1.B && $$3.go()) {
         $$1.a($$2, $$0.a(b), 2);
         return bha.a;
      } else {
         return bha.b;
      }
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return $$3.a(cjk.hg) ? eif.b() : eif.a();
   }

   @Override
   public boolean c(dfl $$0, cpd $$1, gw $$2) {
      return true;
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.a;
   }

   @Override
   public float b(dfl $$0, cpd $$1, gw $$2) {
      return 1.0F;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(c) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(b));
   }

   public static cjh a(cjh $$0, int $$1) {
      if ($$1 != 15) {
         qy $$2 = new qy();
         $$2.a(b.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}

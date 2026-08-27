import com.mojang.serialization.MapCodec;

public class dbh extends dal {
   public static final MapCodec<dbh> a = b(dbh::new);
   private static final vf b = vf.c("container.loom");

   @Override
   public MapCodec<dbh> a() {
      return a;
   }

   protected dbh(djg.d $$0) {
      super($$0);
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         return bkb.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asc.ax);
         return bkb.b;
      }
   }

   @Override
   public bke b(djh $$0, ctp $$1, hx $$2) {
      return new bkk(($$2x, $$3, $$4) -> new cjg($$2x, $$3, cim.a($$1, $$2)), b);
   }

   @Override
   public djh a(cph $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(aE);
   }
}

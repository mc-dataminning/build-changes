import com.mojang.serialization.MapCodec;

public class dba extends dae {
   public static final MapCodec<dba> a = b(dba::new);
   private static final vd b = vd.c("container.loom");

   @Override
   public MapCodec<dba> a() {
      return a;
   }

   protected dba(diz.d $$0) {
      super($$0);
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         return bjv.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arw.ax);
         return bjv.b;
      }
   }

   @Override
   public bjy b(dja $$0, cti $$1, hx $$2) {
      return new bke(($$2x, $$3, $$4) -> new ciz($$2x, $$3, cif.a($$1, $$2)), b);
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(aE);
   }
}

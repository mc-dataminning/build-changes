import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deu extends cwy {
   public static final MapCodec<deu> a = b(deu::new);
   private static final vg d = vg.c("container.stonecutter");
   public static final dkj b = dat.aE;
   protected static final emv c = cwy.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<deu> a() {
      return a;
   }

   public deu(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c));
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asd.ay);
         return bkc.b;
      }
   }

   @Nullable
   @Override
   public bkg b(djp $$0, ctx $$1, hx $$2) {
      return new bkm(($$2x, $$3, $$4) -> new cki($$2x, $$3, ciu.a($$1, $$2)), d);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return c;
   }

   @Override
   public boolean g_(djp $$0) {
      return true;
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}

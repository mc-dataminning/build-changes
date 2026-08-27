import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class def extends cwj {
   public static final MapCodec<def> a = b(def::new);
   private static final vd d = vd.c("container.stonecutter");
   public static final dju b = dae.aE;
   protected static final emf c = cwj.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<def> a() {
      return a;
   }

   public def(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c));
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         return bjv.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arw.ay);
         return bjv.b;
      }
   }

   @Nullable
   @Override
   public bjy b(dja $$0, cti $$1, hx $$2) {
      return new bke(($$2x, $$3, $$4) -> new cjt($$2x, $$3, cif.a($$1, $$2)), d);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return c;
   }

   @Override
   public boolean g_(dja $$0) {
      return true;
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}

import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcp extends cut {
   public static final MapCodec<dcp> a = b(dcp::new);
   private static final ur d = ur.c("container.stonecutter");
   public static final dhq b = cyo.aE;
   protected static final ekb c = cut.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dcp> a() {
      return a;
   }

   public dcp(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c));
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         return biq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aqx.ay);
         return biq.b;
      }
   }

   @Nullable
   @Override
   public bit b(dgw $$0, crs $$1, ht $$2) {
      return new biy(($$2x, $$3, $$4) -> new cid($$2x, $$3, cgp.a($$1, $$2)), d);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return c;
   }

   @Override
   public boolean g_(dgw $$0) {
      return true;
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}

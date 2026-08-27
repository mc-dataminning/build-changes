import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diu extends czm {
   public static final MapCodec<diu> a = b(diu::new);
   public static final doc<dmm> b = dnp.bz;
   public static final dnt c = ddv.aE;

   @Override
   public MapCodec<diu> a() {
      return a;
   }

   public diu(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ih.c).a(b, dmm.a));
   }

   @Override
   public bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      if ($$0.b() || $$1.c(b) != dmm.b) {
         return bne.d;
      } else if ($$2 instanceof apf $$7) {
         if ($$7.c_($$3) instanceof dmh $$9) {
            dmh.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bne.a;
         } else {
            return bne.d;
         }
      } else {
         return bne.b;
      }
   }

   @Nullable
   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dmh($$0, $$1);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return $$0 instanceof apf $$3
         ? a($$2, dki.R, ($$1x, $$2x, $$3x, $$4) -> dmh.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dki.R, ($$0x, $$1x, $$2x, $$3x) -> dmh.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(c, $$0.g().g());
   }

   @Override
   public dmz a(dmz $$0, dgm $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dgf b_(dmz $$0) {
      return dgf.c;
   }
}

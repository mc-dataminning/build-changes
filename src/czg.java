import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czg extends czm {
   public static final MapCodec<czg> a = b(czg::new);
   public static final dnt b = dnp.P;
   public static final dnq c = dnp.u;

   @Override
   public MapCodec<czg> a() {
      return a;
   }

   public czg(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         return bnc.a;
      } else {
         dkg $$5 = $$1.c_($$2);
         if ($$5 instanceof djz) {
            $$3.a((djz)$$5);
            $$3.a(aui.ar);
            chj.a($$3, true);
         }

         return bnc.b;
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      bmy.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      dkg $$4 = $$1.c_($$2);
      if ($$4 instanceof djz) {
         ((djz)$$4).l();
      }
   }

   @Nullable
   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new djz($$0, $$1);
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, @Nullable bpo $$3, cqk $$4) {
      if ($$4.B()) {
         dkg $$5 = $$0.c_($$1);
         if ($$5 instanceof djz) {
            ((djz)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      return clo.a($$1.c_($$2));
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(b, $$0.d().g());
   }
}

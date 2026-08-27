import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgt extends czm implements dha {
   public static final MapCodec<dgt> a = b(dgt::new);
   public static final dnq b = dnp.F;
   public static final dnq c = dnp.C;
   public static final dnq d = dnp.G;
   protected static final eqk e = daa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(ih.a.b);

   @Override
   public MapCodec<dgt> a() {
      return a;
   }

   public dgt(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bow $$3) {
      if ($$0 instanceof apf $$4) {
         apg $$5 = dln.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dki.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if ($$1 instanceof apf $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dki.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dki.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   protected eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return e;
   }

   @Override
   protected eqk f(dmz $$0, cwf $$1, ib $$2) {
      return e;
   }

   @Override
   protected boolean g_(dmz $$0) {
      return true;
   }

   @Nullable
   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dln($$0, $$1);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == eio.c));
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(c) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, cqk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bme.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return !$$0.B ? czm.a($$2, dki.L, ($$0x, $$1x, $$2x, $$3) -> drw.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }
}

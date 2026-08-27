import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbn extends czm implements dha {
   public static final MapCodec<dbn> a = b(dbn::new);
   public static final dnq b = dnp.C;
   private static final int d = 3;
   protected static final eqk c = daa.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dbn> a() {
      return a;
   }

   public dbn(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dks($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return a($$2, dki.z, $$0.B ? dks::a : dks::b);
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.b;
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(b) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return c;
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, @Nullable bpo $$3, cqk $$4) {
      if ($$4.B()) {
         dkg $$5 = $$0.c_($$1);
         if ($$5 instanceof dkb) {
            ((dkb)$$5).a($$4.z());
         }
      }
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      ein $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(aus.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}

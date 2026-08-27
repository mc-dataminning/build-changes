import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddr extends daa implements dha {
   public static final MapCodec<ddr> a = b(ddr::new);
   private static final dnq c = dnp.C;
   protected static final eqk b = daa.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<ddr> a() {
      return a;
   }

   protected ddr(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(c) ? eio.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      dmz $$1 = super.a($$0);
      if ($$1 != null) {
         ein $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == eio.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      ib $$3 = $$2.c();
      dmz $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ih.a);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && !this.a($$0, $$3, $$4)) {
         return dac.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eio.c, eio.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}

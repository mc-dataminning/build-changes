import com.mojang.serialization.MapCodec;

public class dmh extends dne implements dnh {
   public static final MapCodec<dmh> a = b(dmh::new);
   private static final fgm b = dne.b(8.0, 0.0, 12.0);

   @Override
   public MapCodec<dmh> a() {
      return a;
   }

   public dmh(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b.a($$0.a($$2));
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$3.a(3) == 0 && $$1.v($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return $$1.a_($$2.e()).a(axg.ax);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if (!$$0.a($$1, $$3)) {
         return dng.a.m();
      } else {
         return $$4 == jc.b && $$6.a(dng.nF) ? dng.nF.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return new daa(dae.ej);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      this.a($$0, $$2);
   }

   protected void a(djz $$0, iw $$1) {
      $$0.a($$1.d(), dng.nF.m().b(dmi.c, ebs.b), 3);
   }
}

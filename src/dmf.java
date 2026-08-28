import com.mojang.serialization.MapCodec;

public class dmf extends dnc implements dnf {
   public static final MapCodec<dmf> a = b(dmf::new);
   private static final fgk b = dnc.b(8.0, 0.0, 12.0);

   @Override
   public MapCodec<dmf> a() {
      return a;
   }

   public dmf(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b.a($$0.a($$2));
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$3.a(3) == 0 && $$1.v($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return $$1.a_($$2.e()).a(axe.ax);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if (!$$0.a($$1, $$3)) {
         return dne.a.m();
      } else {
         return $$4 == jb.b && $$6.a(dne.nF) ? dne.nF.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return new czy(dac.ej);
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      this.a($$0, $$2);
   }

   protected void a(djx $$0, iv $$1) {
      $$0.a($$1.d(), dne.nF.m().b(dmg.c, ebq.b), 3);
   }
}

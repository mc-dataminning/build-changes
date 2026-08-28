import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtx extends dwd implements dmu, dro {
   public static final MapCodec<dtx> a = b(dtx::new);
   private static final ffw b = dmr.b(12.0, 0.0, 12.0);

   @Override
   public MapCodec<dtx> a() {
      return a;
   }

   protected dtx(eas.d $$0) {
      super($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b;
   }

   @Override
   protected boolean b(eat $$0, diq $$1, iv $$2) {
      return $$0.c($$1, $$2, jb.b) && !$$0.a(dmt.lp);
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      exa $$1 = $$0.q().b_($$0.a());
      return $$1.a(axh.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      eat $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return $$0.a_($$1.d()).a(dmt.J);
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   protected exa b_(eat $$0) {
      return exb.c.a(false);
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      eat $$4 = dmt.bH.m();
      eat $$5 = $$4.b(dvi.d, ebp.a);
      iv $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable bxj $$0, diq $$1, iv $$2, eat $$3, ewz $$4) {
      return false;
   }

   @Override
   public boolean a(djn $$0, iv $$1, eat $$2, exa $$3) {
      return false;
   }
}

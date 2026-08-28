import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duu extends dxa implements dnr, dsl {
   public static final MapCodec<duu> a = b(duu::new);
   private static final fgw b = dno.b(12.0, 0.0, 12.0);

   @Override
   public MapCodec<duu> a() {
      return a;
   }

   protected duu(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b;
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      return $$0.c($$1, $$2, jc.b) && !$$0.a(dnq.lp);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      eya $$1 = $$0.q().b_($$0.a());
      return $$1.a(axs.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      ebq $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return $$0.a_($$1.d()).a(dnq.J);
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   protected eya b_(ebq $$0) {
      return eyb.c.a(false);
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      ebq $$4 = dnq.bH.m();
      ebq $$5 = $$4.b(dwf.d, ecm.a);
      iw $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable byf $$0, djn $$1, iw $$2, ebq $$3, exz $$4) {
      return false;
   }

   @Override
   public boolean a(dkk $$0, iw $$1, ebq $$2, eya $$3) {
      return false;
   }
}

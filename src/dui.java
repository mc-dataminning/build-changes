import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dui extends dwo implements dnf, drz {
   public static final MapCodec<dui> a = b(dui::new);
   private static final fgk b = dnc.b(12.0, 0.0, 12.0);

   @Override
   public MapCodec<dui> a() {
      return a;
   }

   protected dui(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b;
   }

   @Override
   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      return $$0.c($$1, $$2, jb.b) && !$$0.a(dne.lp);
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      exo $$1 = $$0.q().b_($$0.a());
      return $$1.a(axj.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      ebe $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return $$0.a_($$1.d()).a(dne.J);
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   protected exo b_(ebe $$0) {
      return exp.c.a(false);
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      ebe $$4 = dne.bH.m();
      ebe $$5 = $$4.b(dvt.d, eca.a);
      iv $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable bxu $$0, djb $$1, iv $$2, ebe $$3, exn $$4) {
      return false;
   }

   @Override
   public boolean a(djy $$0, iv $$1, ebe $$2, exo $$3) {
      return false;
   }
}

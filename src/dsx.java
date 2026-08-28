import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsx extends dme implements dlx, dqp {
   public static final MapCodec<dsx> a = b(dsx::new);
   private static final feq b = dlu.b(12.0, 0.0, 12.0);

   @Override
   public MapCodec<dsx> a() {
      return a;
   }

   protected dsx(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return b;
   }

   @Override
   protected boolean b(dzo $$0, dhv $$1, iu $$2) {
      return $$0.c($$1, $$2, ja.b) && !$$0.a(dlw.ll);
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      evv $$1 = $$0.q().b_($$0.a());
      return $$1.a(axf.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      dzo $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return $$0.a_($$1.d()).a(dlw.J);
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   protected evv b_(dzo $$0) {
      return evw.c.a(false);
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      dzo $$4 = dlw.bE.m();
      dzo $$5 = $$4.b(dug.d, eak.a);
      iu $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable bwz $$0, dhv $$1, iu $$2, dzo $$3, evu $$4) {
      return false;
   }

   @Override
   public boolean a(diq $$0, iu $$1, dzo $$2, evv $$3) {
      return false;
   }
}

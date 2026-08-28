import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diy extends dij implements djl {
   public static final MapCodec<diy> c = b(diy::new);
   protected static final ewf g = deu.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<diy> a() {
      return c;
   }

   protected diy(drw.d $$0) {
      super($$0, je.b, g, true, 0.14);
   }

   @Override
   protected boolean g(drx $$0) {
      return $$0.a(dew.G);
   }

   @Override
   protected deu b() {
      return dew.md;
   }

   @Override
   protected boolean m(drx $$0) {
      return !$$0.a(dew.kJ);
   }

   @Override
   public boolean a(@Nullable cms $$0, daz $$1, iz $$2, drx $$3, enp $$4) {
      return false;
   }

   @Override
   public boolean a(dbu $$0, iz $$1, drx $$2, enq $$3) {
      return false;
   }

   @Override
   protected int a(azc $$0) {
      return 1;
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      enq $$1 = $$0.q().b_($$0.a());
      return $$1.a(awr.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected enq b_(drx $$0) {
      return enr.c.a(false);
   }
}

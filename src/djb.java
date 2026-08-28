import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djb extends dim implements djo {
   public static final MapCodec<djb> c = b(djb::new);
   protected static final ewi g = dex.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<djb> a() {
      return c;
   }

   protected djb(drz.d $$0) {
      super($$0, je.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dsa $$0) {
      return $$0.a(dez.G);
   }

   @Override
   protected dex b() {
      return dez.md;
   }

   @Override
   protected boolean m(dsa $$0) {
      return !$$0.a(dez.kJ);
   }

   @Override
   public boolean a(@Nullable cmv $$0, dbc $$1, iz $$2, dsa $$3, ens $$4) {
      return false;
   }

   @Override
   public boolean a(dbx $$0, iz $$1, dsa $$2, ent $$3) {
      return false;
   }

   @Override
   protected int a(azf $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      ent $$1 = $$0.q().b_($$0.a());
      return $$1.a(awu.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected ent b_(dsa $$0) {
      return enu.c.a(false);
   }
}

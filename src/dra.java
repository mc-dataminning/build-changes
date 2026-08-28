import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dra extends dqk implements dro {
   public static final MapCodec<dra> c = b(dra::new);
   private static final double g = 0.14;
   private static final ffw h = dmr.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<dra> a() {
      return c;
   }

   protected dra(eas.d $$0) {
      super($$0, jb.b, h, true, 0.14);
   }

   @Override
   protected boolean h(eat $$0) {
      return $$0.a(dmt.J);
   }

   @Override
   protected dmr b() {
      return dmt.mJ;
   }

   @Override
   protected boolean o(eat $$0) {
      return !$$0.a(dmt.lp);
   }

   @Override
   public boolean a(@Nullable bxj $$0, diq $$1, iv $$2, eat $$3, ewz $$4) {
      return false;
   }

   @Override
   public boolean a(djn $$0, iv $$1, eat $$2, exa $$3) {
      return false;
   }

   @Override
   protected int a(azv $$0) {
      return 1;
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      exa $$1 = $$0.q().b_($$0.a());
      return $$1.a(axh.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected exa b_(eat $$0) {
      return exb.c.a(false);
   }
}

import com.mojang.serialization.MapCodec;

public class dsu extends djw {
   public static final MapCodec<dsu> a = b(dsu::new);
   protected static final fbu b = djm.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dsu> a() {
      return a;
   }

   protected dsu(dww.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, bul $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof ard && $$3 instanceof cqu) {
         $$1.a(new ji($$2), true, $$3);
      }
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return b;
   }

   @Override
   protected boolean b(dwx $$0, dfn $$1, ji $$2) {
      esz $$3 = $$1.b_($$2);
      esz $$4 = $$1.b_($$2.d());
      return ($$3.a() == eta.c || $$0.b() instanceof dnm) && $$4.a() == eta.a;
   }
}

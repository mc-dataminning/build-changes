import com.mojang.serialization.MapCodec;

public class cue extends cxk {
   public static final MapCodec<cue> a = b(cue::new);

   @Override
   public MapCodec<cue> a() {
      return a;
   }

   public cue(dfc.d $$0) {
      super($$0);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         gw $$4 = $$2.d();
         dfd $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), ha.b)) {
            ase.a($$1, $$2, $$3, iv.D);
         }
      }
   }
}

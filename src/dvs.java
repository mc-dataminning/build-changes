import com.mojang.serialization.MapCodec;

public class dvs extends dwo implements dnf {
   public static final MapCodec<dvs> a = b(dvs::new);
   private static final fgk b = dnc.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dvs> a() {
      return a;
   }

   protected dvs(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b;
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return o($$2).m().a($$0, $$1) && $$0.v($$1.d());
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      dpl.a($$0, o($$3).m(), $$2, 2);
   }

   private static dpl o(ebe $$0) {
      return (dpl)($$0.a(dne.bB) ? dne.jk : dne.jj);
   }
}

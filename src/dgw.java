import com.mojang.serialization.MapCodec;

public class dgw extends dhy {
   public static final MapCodec<dgw> a = b(dgw::new);

   @Override
   public MapCodec<? extends dgw> a() {
      return a;
   }

   public dgw(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dev $$0, dvd $$1, ezd $$2, cpb $$3) {
      if (!$$0.C) {
         jg $$4 = $$2.b();
         $$0.a(null, $$4, awk.G, awl.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
         $$0.a(null, $$4, awk.E, awl.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}

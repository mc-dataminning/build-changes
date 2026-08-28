import com.mojang.serialization.MapCodec;

public class dtq extends dlx {
   public static final MapCodec<dtq> g = b(dtq::new);

   @Override
   public MapCodec<dtq> a() {
      return g;
   }

   public dtq(dyl.d $$0) {
      super(() -> dvn.c, $$0);
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dxk($$0, $$1);
   }

   @Override
   protected awr<ald> c() {
      return awu.i.b(awu.ai);
   }

   @Override
   protected boolean f_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return azk.a(dvt.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$3 == jo.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}

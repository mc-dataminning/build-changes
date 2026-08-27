import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgl extends dfv implements dgx {
   public static final MapCodec<dgl> c = b(dgl::new);

   @Override
   public MapCodec<dgl> a() {
      return c;
   }

   protected dgl(dph.d $$0) {
      super($$0, ij.b, esz.b(), true);
   }

   @Override
   protected dfw c() {
      return (dfw)dcj.mc;
   }

   @Override
   protected elb c_(dpi $$0) {
      return elc.c.a(false);
   }

   @Override
   protected boolean m(dpi $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable cka $$0, cym $$1, id $$2, dpi $$3, ela $$4) {
      return false;
   }

   @Override
   public boolean a(czh $$0, id $$1, dpi $$2, elb $$3) {
      return false;
   }
}

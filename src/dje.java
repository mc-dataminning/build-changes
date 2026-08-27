import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dje extends dcq implements dck, dgx {
   public static final MapCodec<dje> a = b(dje::new);
   protected static final float b = 6.0F;
   protected static final etc c = dch.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dje> a() {
      return a;
   }

   protected dje(dph.d $$0) {
      super($$0);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return c;
   }

   @Override
   protected boolean b(dpi $$0, cym $$1, id $$2) {
      return $$0.d($$1, $$2, ij.b) && !$$0.a(dcj.kJ);
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      elb $$1 = $$0.q().b_($$0.a());
      return $$1.a(avj.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      dpi $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return true;
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   protected elb c_(dpi $$0) {
      return elc.c.a(false);
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      dpi $$4 = dcj.bx.n();
      dpi $$5 = $$4.a(dkm.d, dqe.a);
      id $$6 = $$2.c();
      if ($$0.a_($$6).a(dcj.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
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

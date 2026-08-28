import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dls extends djq implements dri {
   public static final MapCodec<dls> a = b(dls::new);
   public static final dye b = dyd.D;
   private static final int d = 3;
   protected static final fcm c = dke.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   public dls(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dvb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return a($$2, dur.A, $$0.C ? dvb::a : dvb::b);
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.b;
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(b) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return c;
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      etp $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(aya.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}

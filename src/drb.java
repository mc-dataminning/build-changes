import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drb extends djq implements dri {
   public static final MapCodec<drb> a = b(drb::new);
   public static final dye b = dyd.G;
   public static final dye c = dyd.D;
   public static final dye d = dyd.H;
   protected static final fcm e = dke.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jm.a.b);

   @Override
   public MapCodec<drb> a() {
      return a;
   }

   public drb(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, bvf $$3) {
      if ($$0 instanceof ash $$4) {
         asi $$5 = dwa.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dur.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if ($$1 instanceof ash $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dur.M).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dur.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return e;
   }

   @Override
   protected fcm d_(dxn $$0) {
      return e;
   }

   @Override
   protected boolean g_(dxn $$0) {
      return true;
   }

   @Nullable
   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dwa($$0, $$1);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == etq.c));
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(c) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, cxk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bsg.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return !$$0.C ? djq.a($$2, dur.M, ($$0x, $$1x, $$2x, $$3) -> ecs.c.a($$0x, $$3.gn(), $$3.go())) : null;
   }
}

import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drq extends dke {
   public static final MapCodec<drq> a = b(drq::new);
   public static final int b = 8;
   public static final dym c = dyd.aG;
   protected static final fcm[] d = new fcm[]{
      fcj.a(),
      dke.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<drq> a() {
      return a;
   }

   protected drq(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      switch ($$1) {
         case a:
            return $$0.c(c) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected fcm b_(dxn $$0, dgf $$1, jh $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected fcm c(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dxn $$0) {
      return true;
   }

   @Override
   protected float c(dxn $$0, dgf $$1, jh $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      dxn $$3 = $$1.a_($$2.e());
      if ($$3.a(axu.cr)) {
         return false;
      } else {
         return $$3.a(axu.cs) ? true : dke.a($$3.g($$1, $$2.e()), jm.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.a(dhj.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dxn $$0, dbb $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.j()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jm.b : true;
      }
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c);
   }
}

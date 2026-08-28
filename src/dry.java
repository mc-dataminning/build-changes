import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dry extends dkm {
   public static final MapCodec<dry> a = b(dry::new);
   public static final int b = 8;
   public static final dyu c = dyl.aG;
   protected static final fcs[] d = new fcs[]{
      fcp.a(),
      dkm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dry> a() {
      return a;
   }

   protected dry(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
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
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected fcs b_(dxv $$0, dgn $$1, jh $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected fcs c(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dxv $$0) {
      return true;
   }

   @Override
   protected float c(dxv $$0, dgn $$1, jh $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      dxv $$3 = $$1.a_($$2.e());
      if ($$3.a(axu.cr)) {
         return false;
      } else {
         return $$3.a(axu.cs) ? true : dkm.a($$3.g($$1, $$2.e()), jm.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return !$$0.a($$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.a(dhr.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dxv $$0, dbg $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.j()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jm.b : true;
      }
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c);
   }
}

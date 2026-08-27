import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlh extends ddy {
   public static final MapCodec<dlh> a = b(dlh::new);
   public static final int b = 8;
   public static final dsb c = drr.aF;
   protected static final evd[] d = new evd[]{
      eva.a(),
      ddy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dlh> a() {
      return a;
   }

   protected dlh(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
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
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected evd b_(drb $$0, dad $$1, io $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected evd c(drb $$0, dad $$1, io $$2, eup $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean f_(drb $$0) {
      return true;
   }

   @Override
   protected float d(drb $$0, dad $$1, io $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      drb $$3 = $$1.a_($$2.d());
      if ($$3.a(avw.co)) {
         return false;
      } else {
         return $$3.a(avw.cp) ? true : ddy.a($$3.k($$1, $$2.d()), it.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return !$$0.a($$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$1.a(dbg.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(drb $$0, cwz $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.q()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == it.b : true;
      }
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      drb $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c);
   }
}

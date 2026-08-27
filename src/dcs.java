import com.mojang.serialization.MapCodec;

public class dcs extends dch {
   public static final MapCodec<dcs> a = b(dcs::new);
   public static final dqi b = dpy.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final etc e = dch.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final etc f = dch.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dcs> a() {
      return a;
   }

   protected dcs(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      id $$4 = $$2.c();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.n());
               dpi $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      return e;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return f;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      for (ij $$3 : ij.c.a) {
         dpi $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(avj.b)) {
            return false;
         }
      }

      dpi $$5 = $$1.a_($$2.d());
      return ($$5.a(dcj.dQ) || $$5.a(ave.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      $$3.a($$1.ai().j(), 1.0F);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}

import com.mojang.serialization.MapCodec;

public class dkg extends dch {
   public static final MapCodec<dkg> a = b(dkg::new);
   public static final dqi b = dpy.aw;
   protected static final float c = 6.0F;
   protected static final etc d = dch.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dkg> a() {
      return a;
   }

   protected dkg(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return d;
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$1.u($$2.c())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.b($$2.c(), this.n());
               $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 4);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$5 + 1)), 4);
            }
         }
      }
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
      dpi $$3 = $$1.a_($$2.d());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(ave.af) || $$3.a(ave.H)) {
            id $$4 = $$2.d();

            for (ij $$5 : ij.c.a) {
               dpi $$6 = $$1.a_($$4.a($$5));
               elb $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(avj.a) || $$6.a(dcj.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }
}

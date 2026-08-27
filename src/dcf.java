import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dcf extends dgc implements dck, djh {
   public static final MapCodec<dcf> a = b(dcf::new);
   private static final dpz f = dpy.C;
   private static final int g = 6;
   protected static final etc b = dch.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final etc c = dch.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final etc d = dch.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final etc e = dch.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dcf> a() {
      return a;
   }

   protected dcf(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, ij.c));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      switch ((ij)$$0.c(aE)) {
         case d:
            return c;
         case c:
         default:
            return b;
         case e:
            return e;
         case f:
            return d;
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(f) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      id $$3 = $$2.d();
      dpi $$4 = $$1.a_($$3);
      dpi $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(ave.by)) && ($$5.a(this) || $$5.a(dcj.sD));
   }

   protected static boolean a(czh $$0, id $$1, elb $$2, ij $$3) {
      dpi $$4 = dcj.sE.n().a(f, Boolean.valueOf($$2.a(elc.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if (($$1 == ij.a || $$1 == ij.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      Optional<id> $$3 = l.a($$0, $$1, $$2.b(), ij.b, dcj.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         id $$4 = $$3.get().c();
         dpi $$5 = $$0.a_($$4);
         return dce.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      Optional<id> $$4 = l.a($$0, $$2, $$3.b(), ij.b, dcj.sD);
      if (!$$4.isEmpty()) {
         id $$5 = $$4.get();
         id $$6 = $$5.c();
         ij $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         dce.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return new crs(dcj.sD);
   }
}

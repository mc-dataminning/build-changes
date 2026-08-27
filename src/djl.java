import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djl extends dep implements dck, djh {
   public static final MapCodec<djl> c = b(djl::new);
   private static final dpz g = dpy.C;
   public static final dqc d = dpy.R;
   protected static final float e = 6.0F;
   protected static final etc f = dch.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<djl> a() {
      return c;
   }

   public djl(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dqe.b).a(g, Boolean.valueOf(false)).a(d, ij.c));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return f;
   }

   @Override
   protected boolean b(dpi $$0, cym $$1, id $$2) {
      return $$0.a(ave.bx) || $$1.b_($$2.c()).a(elc.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      dpi $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, bqt $$3, crs $$4) {
      if (!$$0.x_()) {
         id $$5 = $$1.c();
         dpi $$6 = dep.c($$0, $$5, this.n().a(b, dqe.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(g) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      if ($$0.c(b) == dqe.a) {
         return super.a($$0, $$1, $$2);
      } else {
         id $$3 = $$2.d();
         dpi $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, g, d);
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
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      if ($$3.c(dep.b) == dqe.b) {
         id $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dce.a($$0, $$1, $$2, $$3.c(d));
      } else {
         id $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float at_() {
      return 0.1F;
   }
}

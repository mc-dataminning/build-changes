import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgm extends dch implements djh {
   public static final MapCodec<dgm> a = b(dgm::new);
   public static final dqc b = dgc.aE;
   public static final dpz c = dpy.C;
   protected static final float d = 3.0F;
   protected static final etc e = dch.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final etc f = dch.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final etc g = dch.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final etc h = dch.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   protected dgm(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      switch ((ij)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(cym $$0, id $$1, ij $$2) {
      dpi $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      ij $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dcj.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, elc.c, elc.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      if (!$$0.c()) {
         dpi $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dpi $$2 = this.n();
      czj $$3 = $$0.q();
      id $$4 = $$0.a();
      elb $$5 = $$0.q().b_($$0.a());

      for (ij $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == elc.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(c) ? elc.c.a(false) : super.c_($$0);
   }
}

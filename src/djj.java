import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djj extends dch implements djh {
   public static final MapCodec<djj> a = b(djj::new);
   public static final dqg<dqq> b = dpy.bh;
   public static final dpz c = dpy.C;
   protected static final etc d = dch.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final etc e = dch.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends djj> a() {
      return a;
   }

   public djj(dph.d $$0) {
      super($$0);
      this.k(this.n().a(b, dqq.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dpi $$0) {
      return $$0.c(b) != dqq.c;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      dqq $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return esz.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      id $$1 = $$0.a();
      dpi $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dqq.c).a(c, Boolean.valueOf(false));
      } else {
         elb $$3 = $$0.q().b_($$1);
         dpi $$4 = this.n().a(b, dqq.b).a(c, Boolean.valueOf($$3.a() == elc.c));
         ij $$5 = $$0.k();
         return $$5 != ij.a && ($$5 == ij.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dqq.a);
      }
   }

   @Override
   protected boolean a(dpi $$0, cux $$1) {
      crs $$2 = $$1.n();
      dqq $$3 = $$0.c(b);
      if ($$3 == dqq.c || !$$2.a(this.p())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ij $$5 = $$1.k();
         return $$3 == dqq.b ? $$5 == ij.b || $$4 && $$5.o().d() : $$5 == ij.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(c) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(czh $$0, id $$1, dpi $$2, elb $$3) {
      return $$2.c(b) != dqq.c ? djh.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cka $$0, cym $$1, id $$2, dpi $$3, ela $$4) {
      return $$3.c(b) != dqq.c ? djh.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.u().a(avj.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}

import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgn extends dch implements djh {
   public static final MapCodec<dgn> a = b(dgn::new);
   public static final dpz b = dpy.j;
   public static final dpz c = dpy.C;
   protected static final etc d = esz.a(dch.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dch.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final etc e = esz.a(dch.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dch.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dgn> a() {
      return a;
   }

   public dgn(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      elb $$1 = $$0.q().b_($$0.a());

      for (ij $$2 : $$0.f()) {
         if ($$2.o() == ij.a.b) {
            dpi $$3 = this.n().a(b, Boolean.valueOf($$2 == ij.b));
            if ($$3.a((czj)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == elc.c));
            }
         }
      }

      return null;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      ij $$3 = m($$0).g();
      return dch.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ij m(dpi $$0) {
      return $$0.c(b) ? ij.a : ij.b;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(c) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}

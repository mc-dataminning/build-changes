import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfy extends dch implements djh {
   public static final MapCodec<dfy> a = b(dfy::new);
   private static final dpz c = dpy.C;
   protected static final etc b = dch.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dfy> a() {
      return a;
   }

   protected dfy(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(c) ? elc.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      dpi $$1 = super.a($$0);
      if ($$1 != null) {
         elb $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == elc.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      id $$3 = $$2.c();
      dpi $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ij.a);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return b;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$1 == ij.b && !this.a($$0, $$3, $$4)) {
         return dcj.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, elc.c, elc.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}

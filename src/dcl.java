import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcl extends dbt {
   public static final MapCodec<dcl> a = b(dcl::new);
   public static final dpz[] b = new dpz[]{dpy.k, dpy.l, dpy.m};
   protected static final etc c = esz.a(dch.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dch.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dcl> a() {
      return a;
   }

   public dcl(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dmr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return $$0.B ? null : a($$2, dmq.l, dmr::a);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return c;
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.a;
      } else {
         dmo $$5 = $$1.c_($$2);
         if ($$5 instanceof dmr) {
            $$3.a((dmr)$$5);
            $$3.a(auz.aa);
         }

         return bof.b;
      }
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(kn.ac, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      bob.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return cmw.a($$1.c_($$2));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}

import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmk extends dhn implements dfi, dmg {
   public static final MapCodec<dmk> c = b(dmk::new);
   private static final dsy g = dsx.C;
   public static final dtb d = dsx.R;
   protected static final float e = 6.0F;
   protected static final ews f = dff.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dmk> a() {
      return c;
   }

   public dmk(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtd.b).a(g, Boolean.valueOf(false)).a(d, jf.c));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return f;
   }

   @Override
   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      return $$0.a(avu.bx) || $$1.b_($$2.c()).a(eoc.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, bsy $$3, cua $$4) {
      if (!$$0.x_()) {
         ja $$5 = $$1.c();
         dsh $$6 = dhn.c($$0, $$5, this.o().a(b, dtd.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(g) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      if ($$0.c(b) == dtd.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ja $$3 = $$2.d();
         dsh $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return true;
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      if ($$3.c(dhn.b) == dtd.b) {
         ja $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dfc.a($$0, $$1, $$2, $$3.c(d));
      } else {
         ja $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float at_() {
      return 0.1F;
   }
}

import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlz extends dhc implements dex, dlv {
   public static final MapCodec<dlz> c = b(dlz::new);
   private static final dso g = dsn.C;
   public static final dsr d = dsn.R;
   protected static final float e = 6.0F;
   protected static final ewf f = deu.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dlz> a() {
      return c;
   }

   public dlz(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dst.b).a(g, Boolean.valueOf(false)).a(d, je.c));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return f;
   }

   @Override
   protected boolean b(drx $$0, daz $$1, iz $$2) {
      return $$0.a(awl.bx) || $$1.b_($$2.c()).a(enr.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      drx $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, btk $$3, cuk $$4) {
      if (!$$0.x_()) {
         iz $$5 = $$1.c();
         drx $$6 = dhc.c($$0, $$5, this.n().a(b, dst.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(g) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      if ($$0.c(b) == dst.a) {
         return super.a($$0, $$1, $$2);
      } else {
         iz $$3 = $$2.d();
         drx $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return true;
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      if ($$3.c(dhc.b) == dst.b) {
         iz $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         der.a($$0, $$1, $$2, $$3.c(d));
      } else {
         iz $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float au_() {
      return 0.1F;
   }
}

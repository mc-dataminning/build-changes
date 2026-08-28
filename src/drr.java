import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class drr extends dgx {
   public static final MapCodec<drr> b = b(drr::new);
   public static final dsv<dsz> c = dsn.bg;
   public static final dso d = dsn.x;
   public static final float e = 4.0F;
   protected static final ewf f = deu.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewf g = deu.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final ewf h = deu.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final ewf i = deu.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final ewf j = deu.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewf k = deu.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final ewf o = deu.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ewf F = deu.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final ewf G = deu.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final ewf H = deu.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final ewf I = deu.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ewf J = deu.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final ewf K = deu.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ewf L = deu.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ewf M = deu.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final ewf N = deu.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final ewf O = deu.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ewf P = deu.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final ewf[] Q = a(true);
   private static final ewf[] R = a(false);

   @Override
   protected MapCodec<drr> a() {
      return b;
   }

   private static ewf[] a(boolean $$0) {
      return Arrays.stream(je.values()).map($$1 -> a($$1, $$0)).toArray(ewf[]::new);
   }

   private static ewf a(je $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ewc.a(k, $$1 ? L : F);
         case b:
            return ewc.a(j, $$1 ? K : o);
         case c:
            return ewc.a(i, $$1 ? N : H);
         case d:
            return ewc.a(h, $$1 ? M : G);
         case e:
            return ewc.a(g, $$1 ? P : J);
         case f:
            return ewc.a(f, $$1 ? O : I);
      }
   }

   public drr(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.c).a(c, dsz.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(drx $$0) {
      return true;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(drx $$0, drx $$1) {
      deu $$2 = $$0.c(c) == dsz.a ? dew.by : dew.br;
      return $$1.a($$2) && $$1.c(drq.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public drx a(dbt $$0, iz $$1, drx $$2, cms $$3) {
      if (!$$0.B && $$3.gd().d) {
         iz $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         iz $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      drx $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dew.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      if ($$0.a((dbw)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return new cuk($$2.c(c) == dsz.b ? dew.br : dew.by);
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}

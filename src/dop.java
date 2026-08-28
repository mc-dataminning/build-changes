import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dop extends djr implements dhm, dol {
   public static final MapCodec<dop> c = b(dop::new);
   private static final dvf g = dve.C;
   public static final dvi d = dve.R;
   protected static final float e = 6.0F;
   protected static final ezm f = dhj.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dop> a() {
      return c;
   }

   public dop(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dvk.b).b(g, Boolean.valueOf(false)).b(d, jj.c));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return f;
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return $$0.a(awt.by) || $$1.b_($$2.d()).a(eqq.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      duo $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, buk $$3, cvp $$4) {
      if (!$$0.w_()) {
         je $$5 = $$1.d();
         duo $$6 = djr.c($$0, $$5, this.o().b(b, dvk.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(g) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      if ($$0.c(b) == dvk.a) {
         return super.a($$0, $$1, $$2);
      } else {
         je $$3 = $$2.e();
         duo $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return true;
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      if ($$3.c(djr.b) == dvk.b) {
         je $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dhg.a($$0, $$1, $$2, $$3.c(d));
      } else {
         je $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float au_() {
      return 0.1F;
   }
}

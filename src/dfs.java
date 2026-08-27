import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfs extends daw implements cyr, dfo {
   public static final MapCodec<dfs> c = b(dfs::new);
   private static final dlw g = dlv.C;
   public static final dlz d = dlv.R;
   protected static final float e = 6.0F;
   protected static final eol f = cyo.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dfs> a() {
      return c;
   }

   public dfs(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dmb.b).a(g, Boolean.valueOf(false)).a(d, ie.c));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return f;
   }

   @Override
   protected boolean b(dlf $$0, cut $$1, hz $$2) {
      return $$0.a(atz.bw) || $$1.b_($$2.c()).a(egq.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      dlf $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bog $$3, coz $$4) {
      if (!$$0.y_()) {
         hz $$5 = $$1.c();
         dlf $$6 = daw.c($$0, $$5, this.o().a(b, dmb.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(g) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      if ($$0.c(b) == dmb.a) {
         return super.a($$0, $$1, $$2);
      } else {
         hz $$3 = $$2.d();
         dlf $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return true;
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      if ($$3.c(daw.b) == dmb.b) {
         hz $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         cyl.a($$0, $$1, $$2, $$3.c(d));
      } else {
         hz $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float ay_() {
      return 0.1F;
   }
}

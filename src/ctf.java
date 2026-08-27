import javax.annotation.Nullable;

public class ctf extends cpa {
   public static final dcv a = dcr.Q;
   public static final dcs b = dcr.f;
   private static final efb c = cpn.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final efb d = cpn.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final efb e = eey.a(d, c);
   private static final efb f = eey.a(e, dak.c, eem.e);
   private static final efb g = eey.a(f, cpn.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final efb h = eey.a(f, cpn.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final efb i = eey.a(f, cpn.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final efb j = eey.a(f, cpn.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final efb k = eey.a(f, cpn.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final efb l = dak.c;
   private static final efb m = eey.a(dak.c, cpn.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final efb n = eey.a(dak.c, cpn.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final efb D = eey.a(dak.c, cpn.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final efb E = eey.a(dak.c, cpn.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   public ctf(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.a).a(b, Boolean.valueOf(true)));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      switch ((ha)$$0.c(a)) {
         case a:
            return g;
         case c:
            return i;
         case d:
            return j;
         case e:
            return k;
         case f:
            return h;
         default:
            return f;
      }
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2) {
      switch ((ha)$$0.c(a)) {
         case a:
            return l;
         case c:
            return n;
         case d:
            return D;
         case e:
            return E;
         case f:
            return m;
         default:
            return dak.c;
      }
   }

   @Override
   public dcb a(cih $$0) {
      ha $$1 = $$0.k().g();
      return this.n().a(a, $$1.o() == ha.a.b ? ha.a : $$1).a(b, Boolean.valueOf(true));
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new dal($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      return $$0.B ? null : a($$2, czp.r, dal::a);
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, bfz $$3, cfz $$4) {
      if ($$4.A()) {
         czn $$5 = $$0.c_($$1);
         if ($$5 instanceof dal) {
            ((dal)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0, 2);
      }
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$1.B) {
         return bdx.a;
      } else {
         czn $$6 = $$1.c_($$2);
         if ($$6 instanceof dal) {
            $$3.a((dal)$$6);
            $$3.a(amr.ad);
         }

         return bdx.b;
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
      this.a($$1, $$2, $$0, 4);
   }

   private void a(cmm $$0, gu $$1, dcb $$2, int $$3) {
      boolean $$4 = !$$0.B($$1);
      if ($$4 != $$2.c(b)) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf($$4)), $$3);
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         czn $$5 = $$1.c_($$2);
         if ($$5 instanceof dal) {
            bdt.a($$1, $$2, (dal)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   public boolean d_(dcb $$0) {
      return true;
   }

   @Override
   public int a(dcb $$0, cmm $$1, gu $$2) {
      return cbf.a($$1.c_($$2));
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
      czn $$4 = $$1.c_($$2);
      if ($$4 instanceof dal) {
         dal.a($$1, $$2, $$0, $$3, (dal)$$4);
      }
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }
}

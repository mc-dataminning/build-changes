import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.util.Map;

public class ctf extends cri {
   public static final dfv c = cri.b;
   protected static final float d = 1.0F;
   protected static final eib e = csq.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final eib f = csq.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final eib g = ehy.a(e, f);
   private static final Map<csq, ctf> h = Maps.newHashMap();
   private static final Iterable<ehi> i = ImmutableList.of(new ehi(0.5, 1.0, 0.5));

   protected ctf(csq $$0, dfd.d $$1) {
      super($$1);
      this.k(this.C.b().a(c, Boolean.valueOf(false)));
      h.put($$0, this);
   }

   @Override
   protected Iterable<ehi> b(dfe $$0) {
      return i;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return g;
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      cja $$6 = $$3.b($$4);
      if ($$6.a(cjd.nE) || $$6.a(cjd.tf)) {
         return bgt.d;
      } else if (a($$5) && $$3.b($$4).b() && $$0.c(c)) {
         a($$3, $$0, $$1, $$2);
         return bgt.a($$1.B);
      } else {
         bgt $$7 = ctb.a($$1, $$2, csr.eh.n(), $$3);
         if ($$7.a()) {
            c($$0, $$1, $$2);
         }

         return $$7;
      }
   }

   private static boolean a(ehe $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(c);
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return new cja(csr.eh);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return $$1 == hc.a && !$$0.a($$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public int a(dfe $$0, cpq $$1, gw $$2) {
      return ctb.c;
   }

   @Override
   public boolean d_(dfe $$0) {
      return true;
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }

   public static dfe a(csq $$0) {
      return h.get($$0).n();
   }

   public static boolean g(dfe $$0) {
      return $$0.a(apo.bj, $$1 -> $$1.b(c) && !$$0.c(c));
   }
}

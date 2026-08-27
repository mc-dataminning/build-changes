import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.util.Map;

public class csz extends crc {
   public static final dfp c = crc.b;
   protected static final float d = 1.0F;
   protected static final ehy e = csk.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final ehy f = csk.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final ehy g = ehv.a(e, f);
   private static final Map<csk, csz> h = Maps.newHashMap();
   private static final Iterable<ehf> i = ImmutableList.of(new ehf(0.5, 1.0, 0.5));

   protected csz(csk $$0, dex.d $$1) {
      super($$1);
      this.k(this.C.b().a(c, Boolean.valueOf(false)));
      h.put($$0, this);
   }

   @Override
   protected Iterable<ehf> b(dey $$0) {
      return i;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return g;
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      ciw $$6 = $$3.b($$4);
      if ($$6.a(ciz.nE) || $$6.a(ciz.tf)) {
         return bgo.d;
      } else if (a($$5) && $$3.b($$4).b() && $$0.c(c)) {
         a($$3, $$0, $$1, $$2);
         return bgo.a($$1.B);
      } else {
         bgo $$7 = csv.a($$1, $$2, csl.eh.n(), $$3);
         if ($$7.a()) {
            c($$0, $$1, $$2);
         }

         return $$7;
      }
   }

   private static boolean a(ehb $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(c);
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return new ciw(csl.eh);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$1 == hb.a && !$$0.a($$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      return csv.c;
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   public static dey a(csk $$0) {
      return h.get($$0).n();
   }

   public static boolean g(dey $$0) {
      return $$0.a(apj.bj, $$1 -> $$1.b(c) && !$$0.c(c));
   }
}

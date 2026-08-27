import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bxe extends buj<cll> {
   private Set<ctl> c = ImmutableSet.of();

   public bxe() {
      super(ImmutableMap.of(cbu.q, cbv.a, cbu.h, cbv.a));
   }

   protected boolean a(aqn $$0, cll $$1) {
      return bul.a($$1.dS(), cbu.q, bsc.bj);
   }

   protected boolean a(aqn $$0, cll $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqn $$0, cll $$1, long $$2) {
      cll $$3 = (cll)$$1.dS().c(cbu.q).get();
      bul.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(aqn $$0, cll $$1, long $$2) {
      cll $$3 = (cll)$$1.dS().c(cbu.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bul.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gH() && ($$1.gA().b() == clo.g || $$3.gI())) {
            a($$1, cll.cb.keySet(), $$3);
         }

         if ($$3.gA().b() == clo.g && $$1.y().a_(ctt.pw) > ctt.pw.q() / 2) {
            a($$1, ImmutableSet.of(ctt.pw), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(aqn $$0, cll $$1, long $$2) {
      $$1.dS().b(cbu.q);
   }

   private static Set<ctl> a(cll $$0, cll $$1) {
      ImmutableSet<ctl> $$2 = $$1.gA().b().d();
      ImmutableSet<ctl> $$3 = $$0.gA().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cll $$0, Set<ctl> $$1, bsq $$2) {
      bqf $$3 = $$0.y();
      ctq $$4 = ctq.i;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         ctq $$6;
         ctl $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.e()) {
               $$7 = $$6.g();
               if ($$1.contains($$7)) {
                  if ($$6.I() > $$6.j() / 2) {
                     $$8 = $$6.I() / 2;
                     break label28;
                  }

                  if ($$6.I() > 24) {
                     $$8 = $$6.I() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new ctq($$7, $$8);
         break;
      }

      if (!$$4.e()) {
         bul.a($$0, $$4, $$2.dn());
      }
   }
}

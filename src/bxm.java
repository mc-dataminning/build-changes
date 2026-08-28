import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bxm extends bur<clu> {
   private Set<ctv> c = ImmutableSet.of();

   public bxm() {
      super(ImmutableMap.of(ccc.q, ccd.a, ccc.h, ccd.a));
   }

   protected boolean a(aqk $$0, clu $$1) {
      return but.a($$1.dT(), ccc.q, bsj.bj);
   }

   protected boolean a(aqk $$0, clu $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqk $$0, clu $$1, long $$2) {
      clu $$3 = (clu)$$1.dT().c(ccc.q).get();
      but.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(aqk $$0, clu $$1, long $$2) {
      clu $$3 = (clu)$$1.dT().c(ccc.q).get();
      if (!($$1.g($$3) > 5.0)) {
         but.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gF() && ($$1.gy().b() == clx.g || $$3.gG())) {
            a($$1, clu.cd.keySet(), $$3);
         }

         if ($$3.gy().b() == clx.g && $$1.y().a_(cud.pw) > cud.pw.q() / 2) {
            a($$1, ImmutableSet.of(cud.pw), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(aqk $$0, clu $$1, long $$2) {
      $$1.dT().b(ccc.q);
   }

   private static Set<ctv> a(clu $$0, clu $$1) {
      ImmutableSet<ctv> $$2 = $$1.gy().b().d();
      ImmutableSet<ctv> $$3 = $$0.gy().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(clu $$0, Set<ctv> $$1, bsy $$2) {
      bqm $$3 = $$0.y();
      cua $$4 = cua.l;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cua $$6;
         ctv $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.e()) {
               $$7 = $$6.g();
               if ($$1.contains($$7)) {
                  if ($$6.H() > $$6.j() / 2) {
                     $$8 = $$6.H() / 2;
                     break label28;
                  }

                  if ($$6.H() > 24) {
                     $$8 = $$6.H() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new cua($$7, $$8);
         break;
      }

      if (!$$4.e()) {
         but.a($$0, $$4, $$2.dn());
      }
   }
}

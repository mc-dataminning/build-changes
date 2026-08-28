import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bzj extends bwo<cnt> {
   private Set<cvt> c = ImmutableSet.of();

   public bzj() {
      super(ImmutableMap.of(cdz.q, cea.a, cdz.h, cea.a));
   }

   protected boolean a(arm $$0, cnt $$1) {
      return bwq.a($$1.ed(), cdz.q, bug.bj);
   }

   protected boolean a(arm $$0, cnt $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arm $$0, cnt $$1, long $$2) {
      cnt $$3 = (cnt)$$1.ed().c(cdz.q).get();
      bwq.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arm $$0, cnt $$1, long $$2) {
      cnt $$3 = (cnt)$$1.ed().c(cdz.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bwq.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gM() && ($$1.gF().b() == cnw.g || $$3.gN())) {
            a($$1, cnt.cb.keySet(), $$3);
         }

         if ($$3.gF().b() == cnw.g && $$1.y().a_(cwb.px) > cwb.px.h() / 2) {
            a($$1, ImmutableSet.of(cwb.px), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a_(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arm $$0, cnt $$1, long $$2) {
      $$1.ed().b(cdz.q);
   }

   private static Set<cvt> a(cnt $$0, cnt $$1) {
      ImmutableSet<cvt> $$2 = $$1.gF().b().d();
      ImmutableSet<cvt> $$3 = $$0.gF().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cnt $$0, Set<cvt> $$1, buv $$2) {
      bsf $$3 = $$0.y();
      cvx $$4 = cvx.k;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cvx $$6;
         cvt $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.f()) {
               $$7 = $$6.h();
               if ($$1.contains($$7)) {
                  if ($$6.L() > $$6.k() / 2) {
                     $$8 = $$6.L() / 2;
                     break label28;
                  }

                  if ($$6.L() > 24) {
                     $$8 = $$6.L() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new cvx($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bwq.a($$0, $$4, $$2.dv());
      }
   }
}

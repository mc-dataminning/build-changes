import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bzs extends bwx<coc> {
   private Set<cwb> c = ImmutableSet.of();

   public bzs() {
      super(ImmutableMap.of(cei.q, cej.a, cei.h, cej.a));
   }

   protected boolean a(arq $$0, coc $$1) {
      return bwz.a($$1.ee(), cei.q, bup.bj);
   }

   protected boolean a(arq $$0, coc $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arq $$0, coc $$1, long $$2) {
      coc $$3 = (coc)$$1.ee().c(cei.q).get();
      bwz.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arq $$0, coc $$1, long $$2) {
      coc $$3 = (coc)$$1.ee().c(cei.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bwz.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gM() && ($$1.gF().b() == cof.g || $$3.gN())) {
            a($$1, coc.cb.keySet(), $$3);
         }

         if ($$3.gF().b() == cof.g && $$1.y().a_(cwj.px) > cwj.px.h() / 2) {
            a($$1, ImmutableSet.of(cwj.px), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arq $$0, coc $$1, long $$2) {
      $$1.ee().b(cei.q);
   }

   private static Set<cwb> a(coc $$0, coc $$1) {
      ImmutableSet<cwb> $$2 = $$1.gF().b().d();
      ImmutableSet<cwb> $$3 = $$0.gF().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(coc $$0, Set<cwb> $$1, bve $$2) {
      bso $$3 = $$0.y();
      cwf $$4 = cwf.k;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cwf $$6;
         cwb $$7;
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
         $$4 = new cwf($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bwz.a($$0, $$4, $$2.dw());
      }
   }
}

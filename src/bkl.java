import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bkl extends bhr<byb> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private Set<cfu> e = ImmutableSet.of();

   public bkl() {
      super(ImmutableMap.of(bpb.q, bpc.a, bpb.h, bpc.a));
   }

   protected boolean a(aif $$0, byb $$1) {
      return bht.a($$1.dK(), bpb.q, bfn.bf);
   }

   protected boolean a(aif $$0, byb $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aif $$0, byb $$1, long $$2) {
      byb $$3 = (byb)$$1.dK().c(bpb.q).get();
      bht.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(aif $$0, byb $$1, long $$2) {
      byb $$3 = (byb)$$1.dK().c(bpb.q).get();
      if (!($$1.f($$3) > 5.0)) {
         bht.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gq() && ($$1.gj().b() == bye.g || $$3.gr())) {
            a($$1, byb.bW.keySet(), $$3);
         }

         if ($$3.gj().b() == bye.g && $$1.w().a_(cgc.oI) > cgc.oI.l() / 2) {
            a($$1, ImmutableSet.of(cgc.oI), $$3);
         }

         if (!this.e.isEmpty() && $$1.w().a(this.e)) {
            a($$1, this.e, $$3);
         }
      }
   }

   protected void d(aif $$0, byb $$1, long $$2) {
      $$1.dK().b(bpb.q);
   }

   private static Set<cfu> a(byb $$0, byb $$1) {
      ImmutableSet<cfu> $$2 = $$1.gj().b().d();
      ImmutableSet<cfu> $$3 = $$0.gj().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(byb $$0, Set<cfu> $$1, bfz $$2) {
      bee $$3 = $$0.w();
      cfz $$4 = cfz.b;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cfz $$6;
         cfu $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.b()) {
               $$7 = $$6.d();
               if ($$1.contains($$7)) {
                  if ($$6.L() > $$6.g() / 2) {
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
         $$4 = new cfz($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bht.a($$0, $$4, $$2.dg());
      }
   }
}

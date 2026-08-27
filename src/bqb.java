import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bqb extends bqf<bfz> {
   @Override
   public Set<bpb<?>> a() {
      return ImmutableSet.of(bpb.h, bpb.g, bpb.L, bpb.al, bpb.at, bpb.aj, new bpb[]{bpb.ak, bpb.an, bpb.am, bpb.ar, bpb.as, bpb.av});
   }

   @Override
   protected void a(aif $$0, bfz $$1) {
      bha<?> $$2 = $$1.dK();
      $$2.a(bpb.av, c($$0, $$1));
      Optional<bgb> $$3 = Optional.empty();
      Optional<bwy> $$4 = Optional.empty();
      Optional<bwy> $$5 = Optional.empty();
      Optional<bxe> $$6 = Optional.empty();
      Optional<bfz> $$7 = Optional.empty();
      Optional<byo> $$8 = Optional.empty();
      Optional<byo> $$9 = Optional.empty();
      int $$10 = 0;
      List<bxd> $$11 = Lists.newArrayList();
      List<bxd> $$12 = Lists.newArrayList();
      bpd $$13 = $$2.c(bpb.h).orElse(bpd.a());

      for (bfz $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof bwy) {
            bwy $$15 = (bwy)$$14;
            if ($$15.h_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.r()) {
               $$10++;
               if ($$4.isEmpty() && $$15.ge()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof bxh $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof bxe) {
            bxe $$17 = (bxe)$$14;
            if ($$17.h_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.fZ()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof byo) {
            byo $$18 = (byo)$$14;
            if ($$8.isEmpty() && !bxf.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.G_() && bxf.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof bwt) && !($$14 instanceof buv)) {
            if ($$7.isEmpty() && bxf.a($$14.ae())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bgb)$$14);
         }
      }

      for (bfz $$20 : $$2.c(bpb.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof bxd) {
            bxd $$21 = (bxd)$$20;
            if ($$21.fZ()) {
               $$12.add($$21);
            }
         }
      }

      $$2.a(bpb.L, $$3);
      $$2.a(bpb.aj, $$4);
      $$2.a(bpb.ak, $$5);
      $$2.a(bpb.aq, $$7);
      $$2.a(bpb.al, $$8);
      $$2.a(bpb.at, $$9);
      $$2.a(bpb.am, $$12);
      $$2.a(bpb.an, $$11);
      $$2.a(bpb.ar, $$11.size());
      $$2.a(bpb.as, $$10);
   }

   private static Optional<gu> c(aif $$0, bfz $$1) {
      return gu.a($$1.di(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aif $$0, gu $$1) {
      dcb $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(amw.V);
      return $$3 && $$2.a(cpo.oh) ? cqa.g($$2) : $$3;
   }
}

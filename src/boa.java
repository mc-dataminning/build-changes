import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class boa<E extends bli> extends bmx<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final bii p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<boa.a> h = Lists.newArrayList();
   protected Optional<eju> i = Optional.empty();
   @Nullable
   protected eju j;
   protected int k;
   protected long l;
   private final Function<E, aqq> q;
   private final BiPredicate<E, ht> r;

   public boa(bii $$0, int $$1, int $$2, float $$3, Function<E, aqq> $$4) {
      this($$0, $$1, $$2, $$3, $$4, boa::a);
   }

   public static <E extends bli> boolean a(E $$0, ht $$1) {
      csa $$2 = $$0.dN();
      ht $$3 = $$1.d();
      return $$2.a_($$3).i($$2, $$3) && $$0.a(edm.a($$2, $$1.j())) == 0.0F;
   }

   public boa(bii $$0, int $$1, int $$2, float $$3, Function<E, aqq> $$4, BiPredicate<E, ht> $$5) {
      super(ImmutableMap.of(buh.n, bui.c, buh.R, bui.b, buh.S, bui.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(ame $$0, bli $$1) {
      boolean $$2 = $$1.aC() && !$$1.aZ() && !$$1.bn() && !$$0.a_($$1.dn()).a(cvc.pg);
      if (!$$2) {
         $$1.dP().a(buh.R, this.p.a($$0.z) / 2);
      }

      return $$2;
   }

   protected boolean b(ame $$0, bli $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dl()) && this.k > 0 && !$$1.bc() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.dP().c(buh.S).isEmpty()) {
         $$1.dP().a(buh.R, this.p.a($$0.z) / 2);
         $$1.dP().b(buh.n);
      }

      return $$3;
   }

   protected void a(ame $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dl());
      ht $$3 = $$1.dn();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = ht.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new boa.a($$1x.i(), atm.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(ame $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.r($$1.aU);
            $$1.p(true);
            double $$3 = this.j.f();
            double $$4 = $$3 + (double)$$1.fb();
            $$1.g(this.j.a($$4 / $$3));
            $$1.dP().a(buh.S, true);
            $$0.a(null, $$1, this.q.apply($$1), aqs.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(ame $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<boa.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            boa.a $$4 = $$3.get();
            ht $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               eju $$6 = eju.b($$5);
               eju $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.dP().a(buh.n, new bna($$5));
                  bup $$8 = $$1.N();
                  edh $$9 = $$8.a($$5, 0, 8);
                  if ($$9 == null || !$$9.j()) {
                     this.j = $$7;
                     this.l = $$2;
                     return;
                  }
               }
            }
         }
      }
   }

   protected Optional<boa.a> a(ame $$0) {
      Optional<boa.a> $$1 = bhk.a($$0.z, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(ame $$0, E $$1, ht $$2) {
      ht $$3 = $$1.dn();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected eju a(bli $$0, eju $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);

      for (int $$3 : $$2) {
         eju $$4 = this.a($$0, $$1, $$3);
         if ($$4 != null) {
            return $$4;
         }
      }

      return null;
   }

   @Nullable
   private eju a(bli $$0, eju $$1, int $$2) {
      eju $$3 = $$0.dl();
      eju $$4 = new eju($$1.c - $$3.c, 0.0, $$1.e - $$3.e).d().a(0.5);
      $$1 = $$1.d($$4);
      eju $$5 = $$1.d($$3);
      float $$6 = (float)$$2 * (float) Math.PI / 180.0F;
      double $$7 = Math.atan2($$5.e, $$5.c);
      double $$8 = $$5.a(0.0, $$5.d, 0.0).g();
      double $$9 = Math.sqrt($$8);
      double $$10 = $$5.d;
      double $$11 = Math.sin((double)(2.0F * $$6));
      double $$12 = 0.08;
      double $$13 = Math.pow(Math.cos((double)$$6), 2.0);
      double $$14 = Math.sin((double)$$6);
      double $$15 = Math.cos((double)$$6);
      double $$16 = Math.sin($$7);
      double $$17 = Math.cos($$7);
      double $$18 = $$8 * 0.08 / ($$9 * $$11 - 2.0 * $$10 * $$13);
      if ($$18 < 0.0) {
         return null;
      } else {
         double $$19 = Math.sqrt($$18);
         if ($$19 > (double)this.g) {
            return null;
         } else {
            double $$20 = $$19 * $$15;
            double $$21 = $$19 * $$14;
            int $$22 = atm.c($$9 / $$20) * 2;
            double $$23 = 0.0;
            eju $$24 = null;
            bkr $$25 = $$0.a(bls.g);

            for (int $$26 = 0; $$26 < $$22 - 1; $$26++) {
               $$23 += $$9 / (double)$$22;
               double $$27 = $$14 / $$15 * $$23 - Math.pow($$23, 2.0) * 0.08 / (2.0 * $$18 * Math.pow($$15, 2.0));
               double $$28 = $$23 * $$17;
               double $$29 = $$23 * $$16;
               eju $$30 = new eju($$3.c + $$28, $$3.d + $$27, $$3.e + $$29);
               if ($$24 != null && !this.a($$0, $$25, $$24, $$30)) {
                  return null;
               }

               $$24 = $$30;
            }

            return new eju($$20 * $$17, $$21, $$20 * $$16).a(0.95F);
         }
      }
   }

   private boolean a(bli $$0, bkr $$1, eju $$2, eju $$3) {
      eju $$4 = $$3.d($$2);
      double $$5 = (double)Math.min($$1.a, $$1.b);
      int $$6 = atm.c($$4.f() / $$5);
      eju $$7 = $$4.d();
      eju $$8 = $$2;

      for (int $$9 = 0; $$9 < $$6; $$9++) {
         $$8 = $$9 == $$6 - 1 ? $$3 : $$8.e($$7.a($$5 * 0.9F));
         if (!$$0.dN().a($$0, $$1.a($$8))) {
            return false;
         }
      }

      return true;
   }

   public static class a extends bhj.a {
      private final ht a;

      public a(ht $$0, int $$1) {
         super($$1);
         this.a = $$0;
      }

      public ht b() {
         return this.a;
      }
   }
}

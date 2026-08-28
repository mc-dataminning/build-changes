import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bwn<E extends btt> extends bvk<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final bqh p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bwn.a> h = Lists.newArrayList();
   protected Optional<evt> i = Optional.empty();
   @Nullable
   protected evt j;
   protected int k;
   protected long l;
   private final Function<E, avz> q;
   private final BiPredicate<E, iz> r;

   public bwn(bqh $$0, int $$1, int $$2, float $$3, Function<E, avz> $$4) {
      this($$0, $$1, $$2, $$3, $$4, bwn::a);
   }

   public static <E extends btt> boolean a(E $$0, iz $$1) {
      dca $$2 = $$0.dP();
      iz $$3 = $$1.d();
      return $$2.a_($$3).i($$2, $$3) && $$0.a(eot.b($$0, $$1)) == 0.0F;
   }

   public bwn(bqh $$0, int $$1, int $$2, float $$3, Function<E, avz> $$4, BiPredicate<E, iz> $$5) {
      super(ImmutableMap.of(ccv.n, ccw.c, ccv.S, ccw.b, ccv.T, ccw.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(arf $$0, btt $$1) {
      boolean $$2 = $$1.aE() && !$$1.be() && !$$1.bs() && !$$0.a_($$1.dp()).a(dfd.pg);
      if (!$$2) {
         $$1.dS().a(ccv.S, this.p.a($$0.z) / 2);
      }

      return $$2;
   }

   protected boolean b(arf $$0, btt $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dn()) && this.k > 0 && !$$1.bh() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.dS().c(ccv.T).isEmpty()) {
         $$1.dS().a(ccv.S, this.p.a($$0.z) / 2);
         $$1.dS().b(ccv.n);
      }

      return $$3;
   }

   protected void a(arf $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dn());
      iz $$3 = $$1.dp();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = iz.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new bwn.a($$1x.i(), ayz.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(arf $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.r($$1.aY);
            $$1.q(true);
            double $$3 = this.j.f();
            double $$4 = $$3 + (double)$$1.fi();
            $$1.h(this.j.a($$4 / $$3));
            $$1.dS().a(ccv.T, true);
            $$0.a(null, $$1, this.q.apply($$1), awb.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(arf $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<bwn.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bwn.a $$4 = $$3.get();
            iz $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               evt $$6 = evt.b($$5);
               evt $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.dS().a(ccv.n, new bvn($$5));
                  cdd $$8 = $$1.K();
                  eol $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<bwn.a> a(arf $$0) {
      Optional<bwn.a> $$1 = bpj.a($$0.z, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(arf $$0, E $$1, iz $$2) {
      iz $$3 = $$1.dp();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected evt a(btt $$0, evt $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.g(buz.m) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<evt> $$5 = bwo.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static class a extends bpi.a {
      private final iz a;

      public a(iz $$0, int $$1) {
         super($$1);
         this.a = $$0;
      }

      public iz b() {
         return this.a;
      }
   }
}

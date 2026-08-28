import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bwl<E extends btr> extends bvi<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final bqf p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bwl.a> h = Lists.newArrayList();
   protected Optional<evr> i = Optional.empty();
   @Nullable
   protected evr j;
   protected int k;
   protected long l;
   private final Function<E, avz> q;
   private final BiPredicate<E, iz> r;

   public bwl(bqf $$0, int $$1, int $$2, float $$3, Function<E, avz> $$4) {
      this($$0, $$1, $$2, $$3, $$4, bwl::a);
   }

   public static <E extends btr> boolean a(E $$0, iz $$1) {
      dby $$2 = $$0.dP();
      iz $$3 = $$1.d();
      return $$2.a_($$3).i($$2, $$3) && $$0.a(eor.b($$0, $$1)) == 0.0F;
   }

   public bwl(bqf $$0, int $$1, int $$2, float $$3, Function<E, avz> $$4, BiPredicate<E, iz> $$5) {
      super(ImmutableMap.of(cct.n, ccu.c, cct.S, ccu.b, cct.T, ccu.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(arf $$0, btr $$1) {
      boolean $$2 = $$1.aE() && !$$1.be() && !$$1.bs() && !$$0.a_($$1.dp()).a(dfb.pg);
      if (!$$2) {
         $$1.dS().a(cct.S, this.p.a($$0.z) / 2);
      }

      return $$2;
   }

   protected boolean b(arf $$0, btr $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dn()) && this.k > 0 && !$$1.bh() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.dS().c(cct.T).isEmpty()) {
         $$1.dS().a(cct.S, this.p.a($$0.z) / 2);
         $$1.dS().b(cct.n);
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
         .map($$1x -> new bwl.a($$1x.i(), ayz.c($$3.j($$1x))))
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
            $$1.dS().a(cct.T, true);
            $$0.a(null, $$1, this.q.apply($$1), awb.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(arf $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<bwl.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bwl.a $$4 = $$3.get();
            iz $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               evr $$6 = evr.b($$5);
               evr $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.dS().a(cct.n, new bvl($$5));
                  cdb $$8 = $$1.K();
                  eoj $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<bwl.a> a(arf $$0) {
      Optional<bwl.a> $$1 = bph.a($$0.z, this.h);
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
   protected evr a(btr $$0, evr $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.g(bux.m) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<evr> $$5 = bwm.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static class a extends bpg.a {
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

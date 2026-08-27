import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class buv<E extends bsc> extends bts<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final box p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<buv.a> h = Lists.newArrayList();
   protected Optional<etp> i = Optional.empty();
   @Nullable
   protected etp j;
   protected int k;
   protected long l;
   private final Function<E, avb> q;
   private final BiPredicate<E, in> r;

   public buv(box $$0, int $$1, int $$2, float $$3, Function<E, avb> $$4) {
      this($$0, $$1, $$2, $$3, $$4, buv::a);
   }

   public static <E extends bsc> boolean a(E $$0, in $$1) {
      dad $$2 = $$0.dN();
      in $$3 = $$1.d();
      return $$2.a_($$3).i($$2, $$3) && $$0.a(emw.b($$0, $$1)) == 0.0F;
   }

   public buv(box $$0, int $$1, int $$2, float $$3, Function<E, avb> $$4, BiPredicate<E, in> $$5) {
      super(ImmutableMap.of(cbd.n, cbe.c, cbd.S, cbe.b, cbd.T, cbe.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(aqh $$0, bsc $$1) {
      boolean $$2 = $$1.aC() && !$$1.bc() && !$$1.bq() && !$$0.a_($$1.dn()).a(ddg.pg);
      if (!$$2) {
         $$1.dQ().a(cbd.S, this.p.a($$0.z) / 2);
      }

      return $$2;
   }

   protected boolean b(aqh $$0, bsc $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dl()) && this.k > 0 && !$$1.bf() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.dQ().c(cbd.T).isEmpty()) {
         $$1.dQ().a(cbd.S, this.p.a($$0.z) / 2);
         $$1.dQ().b(cbd.n);
      }

      return $$3;
   }

   protected void a(aqh $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dl());
      in $$3 = $$1.dn();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = in.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new buv.a($$1x.i(), axz.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(aqh $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.r($$1.aZ);
            $$1.q(true);
            double $$3 = this.j.f();
            double $$4 = $$3 + (double)$$1.fg();
            $$1.g(this.j.a($$4 / $$3));
            $$1.dQ().a(cbd.T, true);
            $$0.a(null, $$1, this.q.apply($$1), avd.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(aqh $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<buv.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            buv.a $$4 = $$3.get();
            in $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               etp $$6 = etp.b($$5);
               etp $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.dQ().a(cbd.n, new btv($$5));
                  cbl $$8 = $$1.K();
                  emo $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<buv.a> a(aqh $$0) {
      Optional<buv.a> $$1 = bnz.a($$0.z, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(aqh $$0, E $$1, in $$2) {
      in $$3 = $$1.dn();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected etp a(bsc $$0, etp $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.g(bth.m) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<etp> $$5 = buw.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static class a extends bny.a {
      private final in a;

      public a(in $$0, int $$1) {
         super($$1);
         this.a = $$0;
      }

      public in b() {
         return this.a;
      }
   }
}

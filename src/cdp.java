import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cdp(String q, Predicate<ig<bwn>> r, Predicate<ig<bwn>> s, ImmutableSet<clj> t, ImmutableSet<cvf> u, @Nullable aqu v) {
   public static final Predicate<ig<bwn>> a = $$0 -> $$0.a(aru.a);
   public static final cdp b = a("none", bwn.a, a, null);
   public static final cdp c = a("armorer", bwo.a, aqv.zt);
   public static final cdp d = a("butcher", bwo.b, aqv.zu);
   public static final cdp e = a("cartographer", bwo.c, aqv.zv);
   public static final cdp f = a("cleric", bwo.d, aqv.zw);
   public static final cdp g = a("farmer", bwo.e, ImmutableSet.of(clr.pt, clr.ps, clr.vd, clr.rv), ImmutableSet.of(cvh.cC), aqv.zx);
   public static final cdp h = a("fisherman", bwo.f, aqv.zy);
   public static final cdp i = a("fletcher", bwo.g, aqv.zz);
   public static final cdp j = a("leatherworker", bwo.h, aqv.zA);
   public static final cdp k = a("librarian", bwo.i, aqv.zB);
   public static final cdp l = a("mason", bwo.j, aqv.zC);
   public static final cdp m = a("nitwit", bwn.a, bwn.a, null);
   public static final cdp n = a("shepherd", bwo.k, aqv.zD);
   public static final cdp o = a("toolsmith", bwo.l, aqv.zE);
   public static final cdp p = a("weaponsmith", bwo.m, aqv.zF);

   @Override
   public String toString() {
      return this.q;
   }

   private static cdp a(String $$0, agl<bwn> $$1, @Nullable aqu $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cdp a(String $$0, Predicate<ig<bwn>> $$1, Predicate<ig<bwn>> $$2, @Nullable aqu $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cdp a(String $$0, agl<bwn> $$1, ImmutableSet<clj> $$2, ImmutableSet<cvf> $$3, @Nullable aqu $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cdp a(String $$0, Predicate<ig<bwn>> $$1, Predicate<ig<bwn>> $$2, ImmutableSet<clj> $$3, ImmutableSet<cvf> $$4, @Nullable aqu $$5) {
      return is.a(kc.A, new agm($$0), new cdp($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ig<bwn>> b() {
      return this.r;
   }

   public Predicate<ig<bwn>> c() {
      return this.s;
   }

   public ImmutableSet<clj> d() {
      return this.t;
   }

   public ImmutableSet<cvf> e() {
      return this.u;
   }

   @Nullable
   public aqu f() {
      return this.v;
   }
}

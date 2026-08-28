import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cpx(wv q, Predicate<js<chw>> r, Predicate<js<chw>> s, ImmutableSet<cxu> t, ImmutableSet<dku> u, @Nullable awj v) {
   public static final Predicate<js<chw>> a = $$0 -> $$0.a(axk.a);
   public static final alc<cpx> b = a("none");
   public static final alc<cpx> c = a("armorer");
   public static final alc<cpx> d = a("butcher");
   public static final alc<cpx> e = a("cartographer");
   public static final alc<cpx> f = a("cleric");
   public static final alc<cpx> g = a("farmer");
   public static final alc<cpx> h = a("fisherman");
   public static final alc<cpx> i = a("fletcher");
   public static final alc<cpx> j = a("leatherworker");
   public static final alc<cpx> k = a("librarian");
   public static final alc<cpx> l = a("mason");
   public static final alc<cpx> m = a("nitwit");
   public static final alc<cpx> n = a("shepherd");
   public static final alc<cpx> o = a("toolsmith");
   public static final alc<cpx> p = a("weaponsmith");

   private static alc<cpx> a(String $$0) {
      return alc.a(me.av, ald.b($$0));
   }

   private static cpx a(kf<cpx> $$0, alc<cpx> $$1, alc<chw> $$2, @Nullable awj $$3) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3);
   }

   private static cpx a(kf<cpx> $$0, alc<cpx> $$1, Predicate<js<chw>> $$2, Predicate<js<chw>> $$3, @Nullable awj $$4) {
      return a($$0, $$1, $$2, $$3, ImmutableSet.of(), ImmutableSet.of(), $$4);
   }

   private static cpx a(kf<cpx> $$0, alc<cpx> $$1, alc<chw> $$2, ImmutableSet<cxu> $$3, ImmutableSet<dku> $$4, @Nullable awj $$5) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3, $$4, $$5);
   }

   private static cpx a(
      kf<cpx> $$0, alc<cpx> $$1, Predicate<js<chw>> $$2, Predicate<js<chw>> $$3, ImmutableSet<cxu> $$4, ImmutableSet<dku> $$5, @Nullable awj $$6
   ) {
      return kf.a($$0, $$1, new cpx(wv.c("entity." + $$1.a().b() + ".villager." + $$1.a().a()), $$2, $$3, $$4, $$5, $$6));
   }

   public static cpx a(kf<cpx> $$0) {
      a($$0, b, chw.a, a, null);
      a($$0, c, chx.a, awk.BX);
      a($$0, d, chx.b, awk.BY);
      a($$0, e, chx.c, awk.BZ);
      a($$0, f, chx.d, awk.Ca);
      a($$0, g, chx.e, ImmutableSet.of(cyc.qf, cyc.qe, cyc.wp, cyc.sz), ImmutableSet.of(dkw.cK), awk.Cb);
      a($$0, h, chx.f, awk.Cc);
      a($$0, i, chx.g, awk.Cd);
      a($$0, j, chx.h, awk.Ce);
      a($$0, k, chx.i, awk.Cf);
      a($$0, l, chx.j, awk.Cg);
      a($$0, m, chw.a, chw.a, null);
      a($$0, n, chx.k, awk.Ch);
      a($$0, o, chx.l, awk.Ci);
      return a($$0, p, chx.m, awk.Cj);
   }

   public wv a() {
      return this.q;
   }

   public Predicate<js<chw>> b() {
      return this.r;
   }

   public Predicate<js<chw>> c() {
      return this.s;
   }

   public ImmutableSet<cxu> d() {
      return this.t;
   }

   public ImmutableSet<dku> e() {
      return this.u;
   }

   @Nullable
   public awj f() {
      return this.v;
   }
}

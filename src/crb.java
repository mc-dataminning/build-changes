import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record crb(wy q, Predicate<jf<cio>> r, Predicate<jf<cio>> s, ImmutableSet<czj> t, ImmutableSet<dmr> u, @Nullable awm v) {
   public static final Predicate<jf<cio>> a = $$0 -> $$0.a(axm.a);
   public static final alf<crb> b = a("none");
   public static final alf<crb> c = a("armorer");
   public static final alf<crb> d = a("butcher");
   public static final alf<crb> e = a("cartographer");
   public static final alf<crb> f = a("cleric");
   public static final alf<crb> g = a("farmer");
   public static final alf<crb> h = a("fisherman");
   public static final alf<crb> i = a("fletcher");
   public static final alf<crb> j = a("leatherworker");
   public static final alf<crb> k = a("librarian");
   public static final alf<crb> l = a("mason");
   public static final alf<crb> m = a("nitwit");
   public static final alf<crb> n = a("shepherd");
   public static final alf<crb> o = a("toolsmith");
   public static final alf<crb> p = a("weaponsmith");

   private static alf<crb> a(String $$0) {
      return alf.a(mh.aD, alg.b($$0));
   }

   private static crb a(js<crb> $$0, alf<crb> $$1, alf<cio> $$2, @Nullable awm $$3) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3);
   }

   private static crb a(js<crb> $$0, alf<crb> $$1, Predicate<jf<cio>> $$2, Predicate<jf<cio>> $$3, @Nullable awm $$4) {
      return a($$0, $$1, $$2, $$3, ImmutableSet.of(), ImmutableSet.of(), $$4);
   }

   private static crb a(js<crb> $$0, alf<crb> $$1, alf<cio> $$2, ImmutableSet<czj> $$3, ImmutableSet<dmr> $$4, @Nullable awm $$5) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3, $$4, $$5);
   }

   private static crb a(
      js<crb> $$0, alf<crb> $$1, Predicate<jf<cio>> $$2, Predicate<jf<cio>> $$3, ImmutableSet<czj> $$4, ImmutableSet<dmr> $$5, @Nullable awm $$6
   ) {
      return js.a($$0, $$1, new crb(wy.c("entity." + $$1.a().b() + ".villager." + $$1.a().a()), $$2, $$3, $$4, $$5, $$6));
   }

   public static crb a(js<crb> $$0) {
      a($$0, b, cio.a, a, null);
      a($$0, c, cip.a, awn.Cd);
      a($$0, d, cip.b, awn.Ce);
      a($$0, e, cip.c, awn.Cf);
      a($$0, f, cip.d, awn.Cg);
      a($$0, g, cip.e, ImmutableSet.of(czr.qk, czr.qj, czr.ww, czr.sG), ImmutableSet.of(dmt.cN), awn.Ch);
      a($$0, h, cip.f, awn.Ci);
      a($$0, i, cip.g, awn.Cj);
      a($$0, j, cip.h, awn.Ck);
      a($$0, k, cip.i, awn.Cl);
      a($$0, l, cip.j, awn.Cm);
      a($$0, m, cio.a, cio.a, null);
      a($$0, n, cip.k, awn.Cn);
      a($$0, o, cip.l, awn.Co);
      return a($$0, p, cip.m, awn.Cp);
   }

   public wy a() {
      return this.q;
   }

   public Predicate<jf<cio>> b() {
      return this.r;
   }

   public Predicate<jf<cio>> c() {
      return this.s;
   }

   public ImmutableSet<czj> d() {
      return this.t;
   }

   public ImmutableSet<dmr> e() {
      return this.u;
   }

   @Nullable
   public awm f() {
      return this.v;
   }
}

import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cqn(wy q, Predicate<je<cih>> r, Predicate<je<cih>> s, ImmutableSet<cyu> t, ImmutableSet<dma> u, @Nullable awm v) {
   public static final Predicate<je<cih>> a = $$0 -> $$0.a(axm.a);
   public static final alf<cqn> b = a("none");
   public static final alf<cqn> c = a("armorer");
   public static final alf<cqn> d = a("butcher");
   public static final alf<cqn> e = a("cartographer");
   public static final alf<cqn> f = a("cleric");
   public static final alf<cqn> g = a("farmer");
   public static final alf<cqn> h = a("fisherman");
   public static final alf<cqn> i = a("fletcher");
   public static final alf<cqn> j = a("leatherworker");
   public static final alf<cqn> k = a("librarian");
   public static final alf<cqn> l = a("mason");
   public static final alf<cqn> m = a("nitwit");
   public static final alf<cqn> n = a("shepherd");
   public static final alf<cqn> o = a("toolsmith");
   public static final alf<cqn> p = a("weaponsmith");

   private static alf<cqn> a(String $$0) {
      return alf.a(mg.aD, alg.b($$0));
   }

   private static cqn a(jr<cqn> $$0, alf<cqn> $$1, alf<cih> $$2, @Nullable awm $$3) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3);
   }

   private static cqn a(jr<cqn> $$0, alf<cqn> $$1, Predicate<je<cih>> $$2, Predicate<je<cih>> $$3, @Nullable awm $$4) {
      return a($$0, $$1, $$2, $$3, ImmutableSet.of(), ImmutableSet.of(), $$4);
   }

   private static cqn a(jr<cqn> $$0, alf<cqn> $$1, alf<cih> $$2, ImmutableSet<cyu> $$3, ImmutableSet<dma> $$4, @Nullable awm $$5) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3, $$4, $$5);
   }

   private static cqn a(
      jr<cqn> $$0, alf<cqn> $$1, Predicate<je<cih>> $$2, Predicate<je<cih>> $$3, ImmutableSet<cyu> $$4, ImmutableSet<dma> $$5, @Nullable awm $$6
   ) {
      return jr.a($$0, $$1, new cqn(wy.c("entity." + $$1.a().b() + ".villager." + $$1.a().a()), $$2, $$3, $$4, $$5, $$6));
   }

   public static cqn a(jr<cqn> $$0) {
      a($$0, b, cih.a, a, null);
      a($$0, c, cii.a, awn.Ca);
      a($$0, d, cii.b, awn.Cb);
      a($$0, e, cii.c, awn.Cc);
      a($$0, f, cii.d, awn.Cd);
      a($$0, g, cii.e, ImmutableSet.of(czc.qh, czc.qg, czc.wr, czc.sB), ImmutableSet.of(dmc.cL), awn.Ce);
      a($$0, h, cii.f, awn.Cf);
      a($$0, i, cii.g, awn.Cg);
      a($$0, j, cii.h, awn.Ch);
      a($$0, k, cii.i, awn.Ci);
      a($$0, l, cii.j, awn.Cj);
      a($$0, m, cih.a, cih.a, null);
      a($$0, n, cii.k, awn.Ck);
      a($$0, o, cii.l, awn.Cl);
      return a($$0, p, cii.m, awn.Cm);
   }

   public wy a() {
      return this.q;
   }

   public Predicate<je<cih>> b() {
      return this.r;
   }

   public Predicate<je<cih>> c() {
      return this.s;
   }

   public ImmutableSet<cyu> d() {
      return this.t;
   }

   public ImmutableSet<dma> e() {
      return this.u;
   }

   @Nullable
   public awm f() {
      return this.v;
   }
}

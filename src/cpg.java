import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cpg(String q, Predicate<jr<chf>> r, Predicate<jr<chf>> s, ImmutableSet<cxd> t, ImmutableSet<dke> u, @Nullable avz v) {
   public static final Predicate<jr<chf>> a = $$0 -> $$0.a(axa.a);
   public static final cpg b = a("none", chf.a, a, null);
   public static final cpg c = a("armorer", chg.a, awa.BX);
   public static final cpg d = a("butcher", chg.b, awa.BY);
   public static final cpg e = a("cartographer", chg.c, awa.BZ);
   public static final cpg f = a("cleric", chg.d, awa.Ca);
   public static final cpg g = a("farmer", chg.e, ImmutableSet.of(cxl.qd, cxl.qc, cxl.wn, cxl.sx), ImmutableSet.of(dkg.cK), awa.Cb);
   public static final cpg h = a("fisherman", chg.f, awa.Cc);
   public static final cpg i = a("fletcher", chg.g, awa.Cd);
   public static final cpg j = a("leatherworker", chg.h, awa.Ce);
   public static final cpg k = a("librarian", chg.i, awa.Cf);
   public static final cpg l = a("mason", chg.j, awa.Cg);
   public static final cpg m = a("nitwit", chf.a, chf.a, null);
   public static final cpg n = a("shepherd", chg.k, awa.Ch);
   public static final cpg o = a("toolsmith", chg.l, awa.Ci);
   public static final cpg p = a("weaponsmith", chg.m, awa.Cj);

   @Override
   public String toString() {
      return this.q;
   }

   private static cpg a(String $$0, akt<chf> $$1, @Nullable avz $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cpg a(String $$0, Predicate<jr<chf>> $$1, Predicate<jr<chf>> $$2, @Nullable avz $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cpg a(String $$0, akt<chf> $$1, ImmutableSet<cxd> $$2, ImmutableSet<dke> $$3, @Nullable avz $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cpg a(String $$0, Predicate<jr<chf>> $$1, Predicate<jr<chf>> $$2, ImmutableSet<cxd> $$3, ImmutableSet<dke> $$4, @Nullable avz $$5) {
      return ke.a(mb.x, aku.b($$0), new cpg($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jr<chf>> b() {
      return this.r;
   }

   public Predicate<jr<chf>> c() {
      return this.s;
   }

   public ImmutableSet<cxd> d() {
      return this.t;
   }

   public ImmutableSet<dke> e() {
      return this.u;
   }

   @Nullable
   public avz f() {
      return this.v;
   }
}

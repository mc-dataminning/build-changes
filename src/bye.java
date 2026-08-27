import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record bye(String q, Predicate<he<brc>> r, Predicate<he<brc>> s, ImmutableSet<cfu> t, ImmutableSet<cpn> u, @Nullable amg v) {
   public static final Predicate<he<brc>> a = $$0 -> $$0.a(ang.a);
   public static final bye b = a("none", brc.a, a, null);
   public static final bye c = a("armorer", brd.a, amh.yI);
   public static final bye d = a("butcher", brd.b, amh.yJ);
   public static final bye e = a("cartographer", brd.c, amh.yK);
   public static final bye f = a("cleric", brd.d, amh.yL);
   public static final bye g = a("farmer", brd.e, ImmutableSet.of(cgc.oI, cgc.oH, cgc.ur, cgc.qK), ImmutableSet.of(cpo.cC), amh.yM);
   public static final bye h = a("fisherman", brd.f, amh.yN);
   public static final bye i = a("fletcher", brd.g, amh.yO);
   public static final bye j = a("leatherworker", brd.h, amh.yP);
   public static final bye k = a("librarian", brd.i, amh.yQ);
   public static final bye l = a("mason", brd.j, amh.yR);
   public static final bye m = a("nitwit", brc.a, brc.a, null);
   public static final bye n = a("shepherd", brd.k, amh.yS);
   public static final bye o = a("toolsmith", brd.l, amh.yT);
   public static final bye p = a("weaponsmith", brd.m, amh.yU);

   @Override
   public String toString() {
      return this.q;
   }

   private static bye a(String $$0, acp<brc> $$1, @Nullable amg $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static bye a(String $$0, Predicate<he<brc>> $$1, Predicate<he<brc>> $$2, @Nullable amg $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static bye a(String $$0, acp<brc> $$1, ImmutableSet<cfu> $$2, ImmutableSet<cpn> $$3, @Nullable amg $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static bye a(String $$0, Predicate<he<brc>> $$1, Predicate<he<brc>> $$2, ImmutableSet<cfu> $$3, ImmutableSet<cpn> $$4, @Nullable amg $$5) {
      return hr.a(jb.A, new acq($$0), new bye($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<he<brc>> b() {
      return this.r;
   }

   public Predicate<he<brc>> c() {
      return this.s;
   }

   public ImmutableSet<cfu> d() {
      return this.t;
   }

   public ImmutableSet<cpn> e() {
      return this.u;
   }

   @Nullable
   public amg f() {
      return this.v;
   }
}

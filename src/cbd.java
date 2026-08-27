import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cbd(String q, Predicate<he<bub>> r, Predicate<he<bub>> s, ImmutableSet<cit> t, ImmutableSet<csm> u, @Nullable aov v) {
   public static final Predicate<he<bub>> a = $$0 -> $$0.a(apv.a);
   public static final cbd b = a("none", bub.a, a, null);
   public static final cbd c = a("armorer", buc.a, aow.yJ);
   public static final cbd d = a("butcher", buc.b, aow.yK);
   public static final cbd e = a("cartographer", buc.c, aow.yL);
   public static final cbd f = a("cleric", buc.d, aow.yM);
   public static final cbd g = a("farmer", buc.e, ImmutableSet.of(cjb.oI, cjb.oH, cjb.ur, cjb.qK), ImmutableSet.of(csn.cC), aow.yN);
   public static final cbd h = a("fisherman", buc.f, aow.yO);
   public static final cbd i = a("fletcher", buc.g, aow.yP);
   public static final cbd j = a("leatherworker", buc.h, aow.yQ);
   public static final cbd k = a("librarian", buc.i, aow.yR);
   public static final cbd l = a("mason", buc.j, aow.yS);
   public static final cbd m = a("nitwit", bub.a, bub.a, null);
   public static final cbd n = a("shepherd", buc.k, aow.yT);
   public static final cbd o = a("toolsmith", buc.l, aow.yU);
   public static final cbd p = a("weaponsmith", buc.m, aow.yV);

   @Override
   public String toString() {
      return this.q;
   }

   private static cbd a(String $$0, aeq<bub> $$1, @Nullable aov $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cbd a(String $$0, Predicate<he<bub>> $$1, Predicate<he<bub>> $$2, @Nullable aov $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cbd a(String $$0, aeq<bub> $$1, ImmutableSet<cit> $$2, ImmutableSet<csm> $$3, @Nullable aov $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cbd a(String $$0, Predicate<he<bub>> $$1, Predicate<he<bub>> $$2, ImmutableSet<cit> $$3, ImmutableSet<csm> $$4, @Nullable aov $$5) {
      return hr.a(jb.A, new aer($$0), new cbd($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<he<bub>> b() {
      return this.r;
   }

   public Predicate<he<bub>> c() {
      return this.s;
   }

   public ImmutableSet<cit> d() {
      return this.t;
   }

   public ImmutableSet<csm> e() {
      return this.u;
   }

   @Nullable
   public aov f() {
      return this.v;
   }
}

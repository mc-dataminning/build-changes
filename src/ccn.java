import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record ccn(String q, Predicate<ib<bvl>> r, Predicate<ib<bvl>> s, ImmutableSet<cke> t, ImmutableSet<cua> u, @Nullable aqc v) {
   public static final Predicate<ib<bvl>> a = $$0 -> $$0.a(arc.a);
   public static final ccn b = a("none", bvl.a, a, null);
   public static final ccn c = a("armorer", bvm.a, aqd.yQ);
   public static final ccn d = a("butcher", bvm.b, aqd.yR);
   public static final ccn e = a("cartographer", bvm.c, aqd.yS);
   public static final ccn f = a("cleric", bvm.d, aqd.yT);
   public static final ccn g = a("farmer", bvm.e, ImmutableSet.of(ckm.oI, ckm.oH, ckm.ur, ckm.qK), ImmutableSet.of(cuc.cC), aqd.yU);
   public static final ccn h = a("fisherman", bvm.f, aqd.yV);
   public static final ccn i = a("fletcher", bvm.g, aqd.yW);
   public static final ccn j = a("leatherworker", bvm.h, aqd.yX);
   public static final ccn k = a("librarian", bvm.i, aqd.yY);
   public static final ccn l = a("mason", bvm.j, aqd.yZ);
   public static final ccn m = a("nitwit", bvl.a, bvl.a, null);
   public static final ccn n = a("shepherd", bvm.k, aqd.za);
   public static final ccn o = a("toolsmith", bvm.l, aqd.zb);
   public static final ccn p = a("weaponsmith", bvm.m, aqd.zc);

   @Override
   public String toString() {
      return this.q;
   }

   private static ccn a(String $$0, afv<bvl> $$1, @Nullable aqc $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static ccn a(String $$0, Predicate<ib<bvl>> $$1, Predicate<ib<bvl>> $$2, @Nullable aqc $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static ccn a(String $$0, afv<bvl> $$1, ImmutableSet<cke> $$2, ImmutableSet<cua> $$3, @Nullable aqc $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static ccn a(String $$0, Predicate<ib<bvl>> $$1, Predicate<ib<bvl>> $$2, ImmutableSet<cke> $$3, ImmutableSet<cua> $$4, @Nullable aqc $$5) {
      return io.a(jy.A, new afw($$0), new ccn($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ib<bvl>> b() {
      return this.r;
   }

   public Predicate<ib<bvl>> c() {
      return this.s;
   }

   public ImmutableSet<cke> d() {
      return this.t;
   }

   public ImmutableSet<cua> e() {
      return this.u;
   }

   @Nullable
   public aqc f() {
      return this.v;
   }
}

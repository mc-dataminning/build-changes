import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cdc(String q, Predicate<ib<bwa>> r, Predicate<ib<bwa>> s, ImmutableSet<ckw> t, ImmutableSet<cut> u, @Nullable aqm v) {
   public static final Predicate<ib<bwa>> a = $$0 -> $$0.a(arm.a);
   public static final cdc b = a("none", bwa.a, a, null);
   public static final cdc c = a("armorer", bwb.a, aqn.yS);
   public static final cdc d = a("butcher", bwb.b, aqn.yT);
   public static final cdc e = a("cartographer", bwb.c, aqn.yU);
   public static final cdc f = a("cleric", bwb.d, aqn.yV);
   public static final cdc g = a("farmer", bwb.e, ImmutableSet.of(cle.oI, cle.oH, cle.us, cle.qK), ImmutableSet.of(cuv.cC), aqn.yW);
   public static final cdc h = a("fisherman", bwb.f, aqn.yX);
   public static final cdc i = a("fletcher", bwb.g, aqn.yY);
   public static final cdc j = a("leatherworker", bwb.h, aqn.yZ);
   public static final cdc k = a("librarian", bwb.i, aqn.za);
   public static final cdc l = a("mason", bwb.j, aqn.zb);
   public static final cdc m = a("nitwit", bwa.a, bwa.a, null);
   public static final cdc n = a("shepherd", bwb.k, aqn.zc);
   public static final cdc o = a("toolsmith", bwb.l, aqn.zd);
   public static final cdc p = a("weaponsmith", bwb.m, aqn.ze);

   @Override
   public String toString() {
      return this.q;
   }

   private static cdc a(String $$0, agf<bwa> $$1, @Nullable aqm $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cdc a(String $$0, Predicate<ib<bwa>> $$1, Predicate<ib<bwa>> $$2, @Nullable aqm $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cdc a(String $$0, agf<bwa> $$1, ImmutableSet<ckw> $$2, ImmutableSet<cut> $$3, @Nullable aqm $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cdc a(String $$0, Predicate<ib<bwa>> $$1, Predicate<ib<bwa>> $$2, ImmutableSet<ckw> $$3, ImmutableSet<cut> $$4, @Nullable aqm $$5) {
      return io.a(jy.A, new agg($$0), new cdc($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ib<bwa>> b() {
      return this.r;
   }

   public Predicate<ib<bwa>> c() {
      return this.s;
   }

   public ImmutableSet<ckw> d() {
      return this.t;
   }

   public ImmutableSet<cut> e() {
      return this.u;
   }

   @Nullable
   public aqm f() {
      return this.v;
   }
}

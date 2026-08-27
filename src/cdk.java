import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cdk(String q, Predicate<ib<bwi>> r, Predicate<ib<bwi>> s, ImmutableSet<cle> t, ImmutableSet<cva> u, @Nullable aqq v) {
   public static final Predicate<ib<bwi>> a = $$0 -> $$0.a(arq.a);
   public static final cdk b = a("none", bwi.a, a, null);
   public static final cdk c = a("armorer", bwj.a, aqr.zt);
   public static final cdk d = a("butcher", bwj.b, aqr.zu);
   public static final cdk e = a("cartographer", bwj.c, aqr.zv);
   public static final cdk f = a("cleric", bwj.d, aqr.zw);
   public static final cdk g = a("farmer", bwj.e, ImmutableSet.of(clm.pt, clm.ps, clm.vd, clm.rv), ImmutableSet.of(cvc.cC), aqr.zx);
   public static final cdk h = a("fisherman", bwj.f, aqr.zy);
   public static final cdk i = a("fletcher", bwj.g, aqr.zz);
   public static final cdk j = a("leatherworker", bwj.h, aqr.zA);
   public static final cdk k = a("librarian", bwj.i, aqr.zB);
   public static final cdk l = a("mason", bwj.j, aqr.zC);
   public static final cdk m = a("nitwit", bwi.a, bwi.a, null);
   public static final cdk n = a("shepherd", bwj.k, aqr.zD);
   public static final cdk o = a("toolsmith", bwj.l, aqr.zE);
   public static final cdk p = a("weaponsmith", bwj.m, aqr.zF);

   @Override
   public String toString() {
      return this.q;
   }

   private static cdk a(String $$0, agh<bwi> $$1, @Nullable aqq $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cdk a(String $$0, Predicate<ib<bwi>> $$1, Predicate<ib<bwi>> $$2, @Nullable aqq $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cdk a(String $$0, agh<bwi> $$1, ImmutableSet<cle> $$2, ImmutableSet<cva> $$3, @Nullable aqq $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cdk a(String $$0, Predicate<ib<bwi>> $$1, Predicate<ib<bwi>> $$2, ImmutableSet<cle> $$3, ImmutableSet<cva> $$4, @Nullable aqq $$5) {
      return io.a(jy.A, new agi($$0), new cdk($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ib<bwi>> b() {
      return this.r;
   }

   public Predicate<ib<bwi>> c() {
      return this.s;
   }

   public ImmutableSet<cle> d() {
      return this.t;
   }

   public ImmutableSet<cva> e() {
      return this.u;
   }

   @Nullable
   public aqq f() {
      return this.v;
   }
}

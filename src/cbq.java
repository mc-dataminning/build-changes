import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cbq(String q, Predicate<he<buo>> r, Predicate<he<buo>> s, ImmutableSet<cjg> t, ImmutableSet<ctc> u, @Nullable apf v) {
   public static final Predicate<he<buo>> a = $$0 -> $$0.a(aqf.a);
   public static final cbq b = a("none", buo.a, a, null);
   public static final cbq c = a("armorer", bup.a, apg.yO);
   public static final cbq d = a("butcher", bup.b, apg.yP);
   public static final cbq e = a("cartographer", bup.c, apg.yQ);
   public static final cbq f = a("cleric", bup.d, apg.yR);
   public static final cbq g = a("farmer", bup.e, ImmutableSet.of(cjo.oI, cjo.oH, cjo.ur, cjo.qK), ImmutableSet.of(cte.cC), apg.yS);
   public static final cbq h = a("fisherman", bup.f, apg.yT);
   public static final cbq i = a("fletcher", bup.g, apg.yU);
   public static final cbq j = a("leatherworker", bup.h, apg.yV);
   public static final cbq k = a("librarian", bup.i, apg.yW);
   public static final cbq l = a("mason", bup.j, apg.yX);
   public static final cbq m = a("nitwit", buo.a, buo.a, null);
   public static final cbq n = a("shepherd", bup.k, apg.yY);
   public static final cbq o = a("toolsmith", bup.l, apg.yZ);
   public static final cbq p = a("weaponsmith", bup.m, apg.za);

   @Override
   public String toString() {
      return this.q;
   }

   private static cbq a(String $$0, aey<buo> $$1, @Nullable apf $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cbq a(String $$0, Predicate<he<buo>> $$1, Predicate<he<buo>> $$2, @Nullable apf $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cbq a(String $$0, aey<buo> $$1, ImmutableSet<cjg> $$2, ImmutableSet<ctc> $$3, @Nullable apf $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cbq a(String $$0, Predicate<he<buo>> $$1, Predicate<he<buo>> $$2, ImmutableSet<cjg> $$3, ImmutableSet<ctc> $$4, @Nullable apf $$5) {
      return hq.a(jb.A, new aez($$0), new cbq($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<he<buo>> b() {
      return this.r;
   }

   public Predicate<he<buo>> c() {
      return this.s;
   }

   public ImmutableSet<cjg> d() {
      return this.t;
   }

   public ImmutableSet<ctc> e() {
      return this.u;
   }

   @Nullable
   public apf f() {
      return this.v;
   }
}

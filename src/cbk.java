import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cbk(String q, Predicate<he<bui>> r, Predicate<he<bui>> s, ImmutableSet<cja> t, ImmutableSet<csv> u, @Nullable apc v) {
   public static final Predicate<he<bui>> a = $$0 -> $$0.a(aqc.a);
   public static final cbk b = a("none", bui.a, a, null);
   public static final cbk c = a("armorer", buj.a, apd.yO);
   public static final cbk d = a("butcher", buj.b, apd.yP);
   public static final cbk e = a("cartographer", buj.c, apd.yQ);
   public static final cbk f = a("cleric", buj.d, apd.yR);
   public static final cbk g = a("farmer", buj.e, ImmutableSet.of(cji.oI, cji.oH, cji.ur, cji.qK), ImmutableSet.of(csw.cC), apd.yS);
   public static final cbk h = a("fisherman", buj.f, apd.yT);
   public static final cbk i = a("fletcher", buj.g, apd.yU);
   public static final cbk j = a("leatherworker", buj.h, apd.yV);
   public static final cbk k = a("librarian", buj.i, apd.yW);
   public static final cbk l = a("mason", buj.j, apd.yX);
   public static final cbk m = a("nitwit", bui.a, bui.a, null);
   public static final cbk n = a("shepherd", buj.k, apd.yY);
   public static final cbk o = a("toolsmith", buj.l, apd.yZ);
   public static final cbk p = a("weaponsmith", buj.m, apd.za);

   @Override
   public String toString() {
      return this.q;
   }

   private static cbk a(String $$0, aev<bui> $$1, @Nullable apc $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cbk a(String $$0, Predicate<he<bui>> $$1, Predicate<he<bui>> $$2, @Nullable apc $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cbk a(String $$0, aev<bui> $$1, ImmutableSet<cja> $$2, ImmutableSet<csv> $$3, @Nullable apc $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cbk a(String $$0, Predicate<he<bui>> $$1, Predicate<he<bui>> $$2, ImmutableSet<cja> $$3, ImmutableSet<csv> $$4, @Nullable apc $$5) {
      return hq.a(jb.A, new aew($$0), new cbk($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<he<bui>> b() {
      return this.r;
   }

   public Predicate<he<bui>> c() {
      return this.s;
   }

   public ImmutableSet<cja> d() {
      return this.t;
   }

   public ImmutableSet<csv> e() {
      return this.u;
   }

   @Nullable
   public apc f() {
      return this.v;
   }
}

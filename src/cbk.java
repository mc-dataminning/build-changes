import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cbk(String q, Predicate<hg<bui>> r, Predicate<hg<bui>> s, ImmutableSet<cja> t, ImmutableSet<csv> u, @Nullable apd v) {
   public static final Predicate<hg<bui>> a = $$0 -> $$0.a(aqd.a);
   public static final cbk b = a("none", bui.a, a, null);
   public static final cbk c = a("armorer", buj.a, ape.yO);
   public static final cbk d = a("butcher", buj.b, ape.yP);
   public static final cbk e = a("cartographer", buj.c, ape.yQ);
   public static final cbk f = a("cleric", buj.d, ape.yR);
   public static final cbk g = a("farmer", buj.e, ImmutableSet.of(cji.oI, cji.oH, cji.ur, cji.qK), ImmutableSet.of(csw.cC), ape.yS);
   public static final cbk h = a("fisherman", buj.f, ape.yT);
   public static final cbk i = a("fletcher", buj.g, ape.yU);
   public static final cbk j = a("leatherworker", buj.h, ape.yV);
   public static final cbk k = a("librarian", buj.i, ape.yW);
   public static final cbk l = a("mason", buj.j, ape.yX);
   public static final cbk m = a("nitwit", bui.a, bui.a, null);
   public static final cbk n = a("shepherd", buj.k, ape.yY);
   public static final cbk o = a("toolsmith", buj.l, ape.yZ);
   public static final cbk p = a("weaponsmith", buj.m, ape.za);

   @Override
   public String toString() {
      return this.q;
   }

   private static cbk a(String $$0, aew<bui> $$1, @Nullable apd $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cbk a(String $$0, Predicate<hg<bui>> $$1, Predicate<hg<bui>> $$2, @Nullable apd $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cbk a(String $$0, aew<bui> $$1, ImmutableSet<cja> $$2, ImmutableSet<csv> $$3, @Nullable apd $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cbk a(String $$0, Predicate<hg<bui>> $$1, Predicate<hg<bui>> $$2, ImmutableSet<cja> $$3, ImmutableSet<csv> $$4, @Nullable apd $$5) {
      return ht.a(jd.A, new aex($$0), new cbk($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<hg<bui>> b() {
      return this.r;
   }

   public Predicate<hg<bui>> c() {
      return this.s;
   }

   public ImmutableSet<cja> d() {
      return this.t;
   }

   public ImmutableSet<csv> e() {
      return this.u;
   }

   @Nullable
   public apd f() {
      return this.v;
   }
}

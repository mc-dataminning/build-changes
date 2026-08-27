import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cex(String q, Predicate<ih<bxo>> r, Predicate<ih<bxo>> s, ImmutableSet<cms> t, ImmutableSet<cwp> u, @Nullable arq v) {
   public static final Predicate<ih<bxo>> a = $$0 -> $$0.a(asq.a);
   public static final cex b = a("none", bxo.a, a, null);
   public static final cex c = a("armorer", bxp.a, arr.zO);
   public static final cex d = a("butcher", bxp.b, arr.zP);
   public static final cex e = a("cartographer", bxp.c, arr.zQ);
   public static final cex f = a("cleric", bxp.d, arr.zR);
   public static final cex g = a("farmer", bxp.e, ImmutableSet.of(cna.pt, cna.ps, cna.ve, cna.rv), ImmutableSet.of(cwr.cC), arr.zS);
   public static final cex h = a("fisherman", bxp.f, arr.zT);
   public static final cex i = a("fletcher", bxp.g, arr.zU);
   public static final cex j = a("leatherworker", bxp.h, arr.zV);
   public static final cex k = a("librarian", bxp.i, arr.zW);
   public static final cex l = a("mason", bxp.j, arr.zX);
   public static final cex m = a("nitwit", bxo.a, bxo.a, null);
   public static final cex n = a("shepherd", bxp.k, arr.zY);
   public static final cex o = a("toolsmith", bxp.l, arr.zZ);
   public static final cex p = a("weaponsmith", bxp.m, arr.Aa);

   @Override
   public String toString() {
      return this.q;
   }

   private static cex a(String $$0, ahf<bxo> $$1, @Nullable arq $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cex a(String $$0, Predicate<ih<bxo>> $$1, Predicate<ih<bxo>> $$2, @Nullable arq $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cex a(String $$0, ahf<bxo> $$1, ImmutableSet<cms> $$2, ImmutableSet<cwp> $$3, @Nullable arq $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cex a(String $$0, Predicate<ih<bxo>> $$1, Predicate<ih<bxo>> $$2, ImmutableSet<cms> $$3, ImmutableSet<cwp> $$4, @Nullable arq $$5) {
      return it.a(kd.z, new ahg($$0), new cex($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ih<bxo>> b() {
      return this.r;
   }

   public Predicate<ih<bxo>> c() {
      return this.s;
   }

   public ImmutableSet<cms> d() {
      return this.t;
   }

   public ImmutableSet<cwp> e() {
      return this.u;
   }

   @Nullable
   public arq f() {
      return this.v;
   }
}

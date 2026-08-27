import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cer(String q, Predicate<ih<bxj>> r, Predicate<ih<bxj>> s, ImmutableSet<cmm> t, ImmutableSet<cwj> u, @Nullable arl v) {
   public static final Predicate<ih<bxj>> a = $$0 -> $$0.a(asl.a);
   public static final cer b = a("none", bxj.a, a, null);
   public static final cer c = a("armorer", bxk.a, arm.zO);
   public static final cer d = a("butcher", bxk.b, arm.zP);
   public static final cer e = a("cartographer", bxk.c, arm.zQ);
   public static final cer f = a("cleric", bxk.d, arm.zR);
   public static final cer g = a("farmer", bxk.e, ImmutableSet.of(cmu.pt, cmu.ps, cmu.ve, cmu.rv), ImmutableSet.of(cwl.cC), arm.zS);
   public static final cer h = a("fisherman", bxk.f, arm.zT);
   public static final cer i = a("fletcher", bxk.g, arm.zU);
   public static final cer j = a("leatherworker", bxk.h, arm.zV);
   public static final cer k = a("librarian", bxk.i, arm.zW);
   public static final cer l = a("mason", bxk.j, arm.zX);
   public static final cer m = a("nitwit", bxj.a, bxj.a, null);
   public static final cer n = a("shepherd", bxk.k, arm.zY);
   public static final cer o = a("toolsmith", bxk.l, arm.zZ);
   public static final cer p = a("weaponsmith", bxk.m, arm.Aa);

   @Override
   public String toString() {
      return this.q;
   }

   private static cer a(String $$0, ahc<bxj> $$1, @Nullable arl $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cer a(String $$0, Predicate<ih<bxj>> $$1, Predicate<ih<bxj>> $$2, @Nullable arl $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cer a(String $$0, ahc<bxj> $$1, ImmutableSet<cmm> $$2, ImmutableSet<cwj> $$3, @Nullable arl $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cer a(String $$0, Predicate<ih<bxj>> $$1, Predicate<ih<bxj>> $$2, ImmutableSet<cmm> $$3, ImmutableSet<cwj> $$4, @Nullable arl $$5) {
      return it.a(kd.z, new ahd($$0), new cer($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ih<bxj>> b() {
      return this.r;
   }

   public Predicate<ih<bxj>> c() {
      return this.s;
   }

   public ImmutableSet<cmm> d() {
      return this.t;
   }

   public ImmutableSet<cwj> e() {
      return this.u;
   }

   @Nullable
   public arl f() {
      return this.v;
   }
}

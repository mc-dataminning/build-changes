import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record clo(String q, Predicate<ix<cdx>> r, Predicate<ix<cdx>> s, ImmutableSet<ctl> t, ImmutableSet<dea> u, @Nullable avh v) {
   public static final Predicate<ix<cdx>> a = $$0 -> $$0.a(awh.a);
   public static final clo b = a("none", cdx.a, a, null);
   public static final clo c = a("armorer", cdy.a, avi.AV);
   public static final clo d = a("butcher", cdy.b, avi.AW);
   public static final clo e = a("cartographer", cdy.c, avi.AX);
   public static final clo f = a("cleric", cdy.d, avi.AY);
   public static final clo g = a("farmer", cdy.e, ImmutableSet.of(ctt.pw, ctt.pv, ctt.vl, ctt.ry), ImmutableSet.of(dec.cC), avi.AZ);
   public static final clo h = a("fisherman", cdy.f, avi.Ba);
   public static final clo i = a("fletcher", cdy.g, avi.Bb);
   public static final clo j = a("leatherworker", cdy.h, avi.Bc);
   public static final clo k = a("librarian", cdy.i, avi.Bd);
   public static final clo l = a("mason", cdy.j, avi.Be);
   public static final clo m = a("nitwit", cdx.a, cdx.a, null);
   public static final clo n = a("shepherd", cdy.k, avi.Bf);
   public static final clo o = a("toolsmith", cdy.l, avi.Bg);
   public static final clo p = a("weaponsmith", cdy.m, avi.Bh);

   @Override
   public String toString() {
      return this.q;
   }

   private static clo a(String $$0, akm<cdx> $$1, @Nullable avh $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static clo a(String $$0, Predicate<ix<cdx>> $$1, Predicate<ix<cdx>> $$2, @Nullable avh $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static clo a(String $$0, akm<cdx> $$1, ImmutableSet<ctl> $$2, ImmutableSet<dea> $$3, @Nullable avh $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static clo a(String $$0, Predicate<ix<cdx>> $$1, Predicate<ix<cdx>> $$2, ImmutableSet<ctl> $$3, ImmutableSet<dea> $$4, @Nullable avh $$5) {
      return jk.a(le.z, new akn($$0), new clo($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ix<cdx>> b() {
      return this.r;
   }

   public Predicate<ix<cdx>> c() {
      return this.s;
   }

   public ImmutableSet<ctl> d() {
      return this.t;
   }

   public ImmutableSet<dea> e() {
      return this.u;
   }

   @Nullable
   public avh f() {
      return this.v;
   }
}

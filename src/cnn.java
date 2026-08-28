import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cnn(String q, Predicate<jo<cft>> r, Predicate<jo<cft>> s, ImmutableSet<cvn> t, ImmutableSet<dhm> u, @Nullable awf v) {
   public static final Predicate<jo<cft>> a = $$0 -> $$0.a(axg.a);
   public static final cnn b = a("none", cft.a, a, null);
   public static final cnn c = a("armorer", cfu.a, awg.Bf);
   public static final cnn d = a("butcher", cfu.b, awg.Bg);
   public static final cnn e = a("cartographer", cfu.c, awg.Bh);
   public static final cnn f = a("cleric", cfu.d, awg.Bi);
   public static final cnn g = a("farmer", cfu.e, ImmutableSet.of(cvw.px, cvw.pw, cvw.vn, cvw.rz), ImmutableSet.of(dho.cC), awg.Bj);
   public static final cnn h = a("fisherman", cfu.f, awg.Bk);
   public static final cnn i = a("fletcher", cfu.g, awg.Bl);
   public static final cnn j = a("leatherworker", cfu.h, awg.Bm);
   public static final cnn k = a("librarian", cfu.i, awg.Bn);
   public static final cnn l = a("mason", cfu.j, awg.Bo);
   public static final cnn m = a("nitwit", cft.a, cft.a, null);
   public static final cnn n = a("shepherd", cfu.k, awg.Bp);
   public static final cnn o = a("toolsmith", cfu.l, awg.Bq);
   public static final cnn p = a("weaponsmith", cfu.m, awg.Br);

   @Override
   public String toString() {
      return this.q;
   }

   private static cnn a(String $$0, ald<cft> $$1, @Nullable awf $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cnn a(String $$0, Predicate<jo<cft>> $$1, Predicate<jo<cft>> $$2, @Nullable awf $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cnn a(String $$0, ald<cft> $$1, ImmutableSet<cvn> $$2, ImmutableSet<dhm> $$3, @Nullable awf $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cnn a(String $$0, Predicate<jo<cft>> $$1, Predicate<jo<cft>> $$2, ImmutableSet<cvn> $$3, ImmutableSet<dhm> $$4, @Nullable awf $$5) {
      return kb.a(lv.x, ale.b($$0), new cnn($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jo<cft>> b() {
      return this.r;
   }

   public Predicate<jo<cft>> c() {
      return this.s;
   }

   public ImmutableSet<cvn> d() {
      return this.t;
   }

   public ImmutableSet<dhm> e() {
      return this.u;
   }

   @Nullable
   public awf f() {
      return this.v;
   }
}

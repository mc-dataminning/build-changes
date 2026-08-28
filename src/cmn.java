import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cmn(String q, Predicate<jm<cev>> r, Predicate<jm<cev>> s, ImmutableSet<cul> t, ImmutableSet<dfy> u, @Nullable avo v) {
   public static final Predicate<jm<cev>> a = $$0 -> $$0.a(awp.a);
   public static final cmn b = a("none", cev.a, a, null);
   public static final cmn c = a("armorer", cew.a, avp.AZ);
   public static final cmn d = a("butcher", cew.b, avp.Ba);
   public static final cmn e = a("cartographer", cew.c, avp.Bb);
   public static final cmn f = a("cleric", cew.d, avp.Bc);
   public static final cmn g = a("farmer", cew.e, ImmutableSet.of(cut.pw, cut.pv, cut.vl, cut.ry), ImmutableSet.of(dga.cC), avp.Bd);
   public static final cmn h = a("fisherman", cew.f, avp.Be);
   public static final cmn i = a("fletcher", cew.g, avp.Bf);
   public static final cmn j = a("leatherworker", cew.h, avp.Bg);
   public static final cmn k = a("librarian", cew.i, avp.Bh);
   public static final cmn l = a("mason", cew.j, avp.Bi);
   public static final cmn m = a("nitwit", cev.a, cev.a, null);
   public static final cmn n = a("shepherd", cew.k, avp.Bj);
   public static final cmn o = a("toolsmith", cew.l, avp.Bk);
   public static final cmn p = a("weaponsmith", cew.m, avp.Bl);

   @Override
   public String toString() {
      return this.q;
   }

   private static cmn a(String $$0, akq<cev> $$1, @Nullable avo $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cmn a(String $$0, Predicate<jm<cev>> $$1, Predicate<jm<cev>> $$2, @Nullable avo $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cmn a(String $$0, akq<cev> $$1, ImmutableSet<cul> $$2, ImmutableSet<dfy> $$3, @Nullable avo $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cmn a(String $$0, Predicate<jm<cev>> $$1, Predicate<jm<cev>> $$2, ImmutableSet<cul> $$3, ImmutableSet<dfy> $$4, @Nullable avo $$5) {
      return jz.a(lt.x, akr.b($$0), new cmn($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jm<cev>> b() {
      return this.r;
   }

   public Predicate<jm<cev>> c() {
      return this.s;
   }

   public ImmutableSet<cul> d() {
      return this.t;
   }

   public ImmutableSet<dfy> e() {
      return this.u;
   }

   @Nullable
   public avo f() {
      return this.v;
   }
}

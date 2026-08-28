import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cpl(String q, Predicate<jq<chm>> r, Predicate<jq<chm>> s, ImmutableSet<cxk> t, ImmutableSet<dkl> u, @Nullable axe v) {
   public static final Predicate<jq<chm>> a = $$0 -> $$0.a(ayf.a);
   public static final cpl b = a("none", chm.a, a, null);
   public static final cpl c = a("armorer", chn.a, axf.By);
   public static final cpl d = a("butcher", chn.b, axf.Bz);
   public static final cpl e = a("cartographer", chn.c, axf.BA);
   public static final cpl f = a("cleric", chn.d, axf.BB);
   public static final cpl g = a("farmer", chn.e, ImmutableSet.of(cxs.pS, cxs.pR, cxs.wb, cxs.sm), ImmutableSet.of(dkn.cK), axf.BC);
   public static final cpl h = a("fisherman", chn.f, axf.BD);
   public static final cpl i = a("fletcher", chn.g, axf.BE);
   public static final cpl j = a("leatherworker", chn.h, axf.BF);
   public static final cpl k = a("librarian", chn.i, axf.BG);
   public static final cpl l = a("mason", chn.j, axf.BH);
   public static final cpl m = a("nitwit", chm.a, chm.a, null);
   public static final cpl n = a("shepherd", chn.k, axf.BI);
   public static final cpl o = a("toolsmith", chn.l, axf.BJ);
   public static final cpl p = a("weaponsmith", chn.m, axf.BK);

   @Override
   public String toString() {
      return this.q;
   }

   private static cpl a(String $$0, aly<chm> $$1, @Nullable axe $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cpl a(String $$0, Predicate<jq<chm>> $$1, Predicate<jq<chm>> $$2, @Nullable axe $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cpl a(String $$0, aly<chm> $$1, ImmutableSet<cxk> $$2, ImmutableSet<dkl> $$3, @Nullable axe $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cpl a(String $$0, Predicate<jq<chm>> $$1, Predicate<jq<chm>> $$2, ImmutableSet<cxk> $$3, ImmutableSet<dkl> $$4, @Nullable axe $$5) {
      return kd.a(ma.x, alz.b($$0), new cpl($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jq<chm>> b() {
      return this.r;
   }

   public Predicate<jq<chm>> c() {
      return this.s;
   }

   public ImmutableSet<cxk> d() {
      return this.t;
   }

   public ImmutableSet<dkl> e() {
      return this.u;
   }

   @Nullable
   public axe f() {
      return this.v;
   }
}

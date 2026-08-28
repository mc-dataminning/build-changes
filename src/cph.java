import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cph(String q, Predicate<jq<chi>> r, Predicate<jq<chi>> s, ImmutableSet<cxg> t, ImmutableSet<dke> u, @Nullable axe v) {
   public static final Predicate<jq<chi>> a = $$0 -> $$0.a(ayf.a);
   public static final cph b = a("none", chi.a, a, null);
   public static final cph c = a("armorer", chj.a, axf.Bx);
   public static final cph d = a("butcher", chj.b, axf.By);
   public static final cph e = a("cartographer", chj.c, axf.Bz);
   public static final cph f = a("cleric", chj.d, axf.BA);
   public static final cph g = a("farmer", chj.e, ImmutableSet.of(cxo.pS, cxo.pR, cxo.wb, cxo.sm), ImmutableSet.of(dkg.cK), axf.BB);
   public static final cph h = a("fisherman", chj.f, axf.BC);
   public static final cph i = a("fletcher", chj.g, axf.BD);
   public static final cph j = a("leatherworker", chj.h, axf.BE);
   public static final cph k = a("librarian", chj.i, axf.BF);
   public static final cph l = a("mason", chj.j, axf.BG);
   public static final cph m = a("nitwit", chi.a, chi.a, null);
   public static final cph n = a("shepherd", chj.k, axf.BH);
   public static final cph o = a("toolsmith", chj.l, axf.BI);
   public static final cph p = a("weaponsmith", chj.m, axf.BJ);

   @Override
   public String toString() {
      return this.q;
   }

   private static cph a(String $$0, aly<chi> $$1, @Nullable axe $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cph a(String $$0, Predicate<jq<chi>> $$1, Predicate<jq<chi>> $$2, @Nullable axe $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cph a(String $$0, aly<chi> $$1, ImmutableSet<cxg> $$2, ImmutableSet<dke> $$3, @Nullable axe $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cph a(String $$0, Predicate<jq<chi>> $$1, Predicate<jq<chi>> $$2, ImmutableSet<cxg> $$3, ImmutableSet<dke> $$4, @Nullable axe $$5) {
      return kd.a(ma.x, alz.b($$0), new cph($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jq<chi>> b() {
      return this.r;
   }

   public Predicate<jq<chi>> c() {
      return this.s;
   }

   public ImmutableSet<cxg> d() {
      return this.t;
   }

   public ImmutableSet<dke> e() {
      return this.u;
   }

   @Nullable
   public axe f() {
      return this.v;
   }
}

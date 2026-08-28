import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cpm(String q, Predicate<jq<chn>> r, Predicate<jq<chn>> s, ImmutableSet<cxl> t, ImmutableSet<dkm> u, @Nullable axe v) {
   public static final Predicate<jq<chn>> a = $$0 -> $$0.a(ayf.a);
   public static final cpm b = a("none", chn.a, a, null);
   public static final cpm c = a("armorer", cho.a, axf.By);
   public static final cpm d = a("butcher", cho.b, axf.Bz);
   public static final cpm e = a("cartographer", cho.c, axf.BA);
   public static final cpm f = a("cleric", cho.d, axf.BB);
   public static final cpm g = a("farmer", cho.e, ImmutableSet.of(cxt.pS, cxt.pR, cxt.wb, cxt.sm), ImmutableSet.of(dko.cK), axf.BC);
   public static final cpm h = a("fisherman", cho.f, axf.BD);
   public static final cpm i = a("fletcher", cho.g, axf.BE);
   public static final cpm j = a("leatherworker", cho.h, axf.BF);
   public static final cpm k = a("librarian", cho.i, axf.BG);
   public static final cpm l = a("mason", cho.j, axf.BH);
   public static final cpm m = a("nitwit", chn.a, chn.a, null);
   public static final cpm n = a("shepherd", cho.k, axf.BI);
   public static final cpm o = a("toolsmith", cho.l, axf.BJ);
   public static final cpm p = a("weaponsmith", cho.m, axf.BK);

   @Override
   public String toString() {
      return this.q;
   }

   private static cpm a(String $$0, aly<chn> $$1, @Nullable axe $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cpm a(String $$0, Predicate<jq<chn>> $$1, Predicate<jq<chn>> $$2, @Nullable axe $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cpm a(String $$0, aly<chn> $$1, ImmutableSet<cxl> $$2, ImmutableSet<dkm> $$3, @Nullable axe $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cpm a(String $$0, Predicate<jq<chn>> $$1, Predicate<jq<chn>> $$2, ImmutableSet<cxl> $$3, ImmutableSet<dkm> $$4, @Nullable axe $$5) {
      return kd.a(ma.x, alz.b($$0), new cpm($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jq<chn>> b() {
      return this.r;
   }

   public Predicate<jq<chn>> c() {
      return this.s;
   }

   public ImmutableSet<cxl> d() {
      return this.t;
   }

   public ImmutableSet<dkm> e() {
      return this.u;
   }

   @Nullable
   public axe f() {
      return this.v;
   }
}

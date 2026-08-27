import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record clo(String q, Predicate<ja<cdu>> r, Predicate<ja<cdu>> s, ImmutableSet<cuc> t, ImmutableSet<dfc> u, @Nullable avn v) {
   public static final Predicate<ja<cdu>> a = $$0 -> $$0.a(awo.a);
   public static final clo b = a("none", cdu.a, a, null);
   public static final clo c = a("armorer", cdv.a, avo.Bt);
   public static final clo d = a("butcher", cdv.b, avo.Bu);
   public static final clo e = a("cartographer", cdv.c, avo.Bv);
   public static final clo f = a("cleric", cdv.d, avo.Bw);
   public static final clo g = a("farmer", cdv.e, ImmutableSet.of(cuk.qP, cuk.qO, cuk.wW, cuk.sV), ImmutableSet.of(dfe.dn, dfe.do), avo.Bx);
   public static final clo h = a("fisherman", cdv.f, avo.By);
   public static final clo i = a("fletcher", cdv.g, avo.Bz);
   public static final clo j = a("leatherworker", cdv.h, avo.BA);
   public static final clo k = a("librarian", cdv.i, avo.BB);
   public static final clo l = a("mason", cdv.j, avo.BC);
   public static final clo m = a("nitwit", cdu.a, cdu.a, null);
   public static final clo n = a("shepherd", cdv.k, avo.BD);
   public static final clo o = a("toolsmith", cdv.l, avo.BE);
   public static final clo p = a("weaponsmith", cdv.m, avo.BF);

   @Override
   public String toString() {
      return this.q;
   }

   private static clo a(String $$0, aks<cdu> $$1, @Nullable avn $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static clo a(String $$0, Predicate<ja<cdu>> $$1, Predicate<ja<cdu>> $$2, @Nullable avn $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static clo a(String $$0, aks<cdu> $$1, ImmutableSet<cuc> $$2, ImmutableSet<dfc> $$3, @Nullable avn $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static clo a(String $$0, Predicate<ja<cdu>> $$1, Predicate<ja<cdu>> $$2, ImmutableSet<cuc> $$3, ImmutableSet<dfc> $$4, @Nullable avn $$5) {
      return jn.a(lh.z, new akt($$0), new clo($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ja<cdu>> b() {
      return this.r;
   }

   public Predicate<ja<cdu>> c() {
      return this.s;
   }

   public ImmutableSet<cuc> d() {
      return this.t;
   }

   public ImmutableSet<dfc> e() {
      return this.u;
   }

   @Nullable
   public avn f() {
      return this.v;
   }
}

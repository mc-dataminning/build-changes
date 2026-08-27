import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record chq(String q, Predicate<il<cad>> r, Predicate<il<cad>> s, ImmutableSet<cpl> t, ImmutableSet<czf> u, @Nullable ato v) {
   public static final Predicate<il<cad>> a = $$0 -> $$0.a(auo.a);
   public static final chq b = a("none", cad.a, a, null);
   public static final chq c = a("armorer", cae.a, atp.Ar);
   public static final chq d = a("butcher", cae.b, atp.As);
   public static final chq e = a("cartographer", cae.c, atp.At);
   public static final chq f = a("cleric", cae.d, atp.Au);
   public static final chq g = a("farmer", cae.e, ImmutableSet.of(cpt.pv, cpt.pu, cpt.vh, cpt.rx), ImmutableSet.of(czh.cC), atp.Av);
   public static final chq h = a("fisherman", cae.f, atp.Aw);
   public static final chq i = a("fletcher", cae.g, atp.Ax);
   public static final chq j = a("leatherworker", cae.h, atp.Ay);
   public static final chq k = a("librarian", cae.i, atp.Az);
   public static final chq l = a("mason", cae.j, atp.AA);
   public static final chq m = a("nitwit", cad.a, cad.a, null);
   public static final chq n = a("shepherd", cae.k, atp.AB);
   public static final chq o = a("toolsmith", cae.l, atp.AC);
   public static final chq p = a("weaponsmith", cae.m, atp.AD);

   @Override
   public String toString() {
      return this.q;
   }

   private static chq a(String $$0, ajb<cad> $$1, @Nullable ato $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static chq a(String $$0, Predicate<il<cad>> $$1, Predicate<il<cad>> $$2, @Nullable ato $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static chq a(String $$0, ajb<cad> $$1, ImmutableSet<cpl> $$2, ImmutableSet<czf> $$3, @Nullable ato $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static chq a(String $$0, Predicate<il<cad>> $$1, Predicate<il<cad>> $$2, ImmutableSet<cpl> $$3, ImmutableSet<czf> $$4, @Nullable ato $$5) {
      return ix.a(kh.z, new ajc($$0), new chq($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<il<cad>> b() {
      return this.r;
   }

   public Predicate<il<cad>> c() {
      return this.s;
   }

   public ImmutableSet<cpl> d() {
      return this.t;
   }

   public ImmutableSet<czf> e() {
      return this.u;
   }

   @Nullable
   public ato f() {
      return this.v;
   }
}

import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record crm(xa q, Predicate<jf<ciz>> r, Predicate<jf<ciz>> s, ImmutableSet<czu> t, ImmutableSet<dnc> u, @Nullable awo v) {
   public static final Predicate<jf<ciz>> a = $$0 -> $$0.a(axo.a);
   public static final alh<crm> b = a("none");
   public static final alh<crm> c = a("armorer");
   public static final alh<crm> d = a("butcher");
   public static final alh<crm> e = a("cartographer");
   public static final alh<crm> f = a("cleric");
   public static final alh<crm> g = a("farmer");
   public static final alh<crm> h = a("fisherman");
   public static final alh<crm> i = a("fletcher");
   public static final alh<crm> j = a("leatherworker");
   public static final alh<crm> k = a("librarian");
   public static final alh<crm> l = a("mason");
   public static final alh<crm> m = a("nitwit");
   public static final alh<crm> n = a("shepherd");
   public static final alh<crm> o = a("toolsmith");
   public static final alh<crm> p = a("weaponsmith");

   private static alh<crm> a(String $$0) {
      return alh.a(mh.aD, ali.b($$0));
   }

   private static crm a(js<crm> $$0, alh<crm> $$1, alh<ciz> $$2, @Nullable awo $$3) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3);
   }

   private static crm a(js<crm> $$0, alh<crm> $$1, Predicate<jf<ciz>> $$2, Predicate<jf<ciz>> $$3, @Nullable awo $$4) {
      return a($$0, $$1, $$2, $$3, ImmutableSet.of(), ImmutableSet.of(), $$4);
   }

   private static crm a(js<crm> $$0, alh<crm> $$1, alh<ciz> $$2, ImmutableSet<czu> $$3, ImmutableSet<dnc> $$4, @Nullable awo $$5) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3, $$4, $$5);
   }

   private static crm a(
      js<crm> $$0, alh<crm> $$1, Predicate<jf<ciz>> $$2, Predicate<jf<ciz>> $$3, ImmutableSet<czu> $$4, ImmutableSet<dnc> $$5, @Nullable awo $$6
   ) {
      return js.a($$0, $$1, new crm(xa.c("entity." + $$1.a().b() + ".villager." + $$1.a().a()), $$2, $$3, $$4, $$5, $$6));
   }

   public static crm a(js<crm> $$0) {
      a($$0, b, ciz.a, a, null);
      a($$0, c, cja.a, awp.Cd);
      a($$0, d, cja.b, awp.Ce);
      a($$0, e, cja.c, awp.Cf);
      a($$0, f, cja.d, awp.Cg);
      a($$0, g, cja.e, ImmutableSet.of(dac.qk, dac.qj, dac.ww, dac.sG), ImmutableSet.of(dne.cN), awp.Ch);
      a($$0, h, cja.f, awp.Ci);
      a($$0, i, cja.g, awp.Cj);
      a($$0, j, cja.h, awp.Ck);
      a($$0, k, cja.i, awp.Cl);
      a($$0, l, cja.j, awp.Cm);
      a($$0, m, ciz.a, ciz.a, null);
      a($$0, n, cja.k, awp.Cn);
      a($$0, o, cja.l, awp.Co);
      return a($$0, p, cja.m, awp.Cp);
   }

   public xa a() {
      return this.q;
   }

   public Predicate<jf<ciz>> b() {
      return this.r;
   }

   public Predicate<jf<ciz>> c() {
      return this.s;
   }

   public ImmutableSet<czu> d() {
      return this.t;
   }

   public ImmutableSet<dnc> e() {
      return this.u;
   }

   @Nullable
   public awo f() {
      return this.v;
   }
}

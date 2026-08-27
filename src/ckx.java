import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record ckx(String q, Predicate<iw<cdg>> r, Predicate<iw<cdg>> s, ImmutableSet<csu> t, ImmutableSet<dde> u, @Nullable avb v) {
   public static final Predicate<iw<cdg>> a = $$0 -> $$0.a(awb.a);
   public static final ckx b = a("none", cdg.a, a, null);
   public static final ckx c = a("armorer", cdh.a, avc.AK);
   public static final ckx d = a("butcher", cdh.b, avc.AL);
   public static final ckx e = a("cartographer", cdh.c, avc.AM);
   public static final ckx f = a("cleric", cdh.d, avc.AN);
   public static final ckx g = a("farmer", cdh.e, ImmutableSet.of(ctc.pw, ctc.pv, ctc.vl, ctc.ry), ImmutableSet.of(ddg.cC), avc.AO);
   public static final ckx h = a("fisherman", cdh.f, avc.AP);
   public static final ckx i = a("fletcher", cdh.g, avc.AQ);
   public static final ckx j = a("leatherworker", cdh.h, avc.AR);
   public static final ckx k = a("librarian", cdh.i, avc.AS);
   public static final ckx l = a("mason", cdh.j, avc.AT);
   public static final ckx m = a("nitwit", cdg.a, cdg.a, null);
   public static final ckx n = a("shepherd", cdh.k, avc.AU);
   public static final ckx o = a("toolsmith", cdh.l, avc.AV);
   public static final ckx p = a("weaponsmith", cdh.m, avc.AW);

   @Override
   public String toString() {
      return this.q;
   }

   private static ckx a(String $$0, akg<cdg> $$1, @Nullable avb $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static ckx a(String $$0, Predicate<iw<cdg>> $$1, Predicate<iw<cdg>> $$2, @Nullable avb $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static ckx a(String $$0, akg<cdg> $$1, ImmutableSet<csu> $$2, ImmutableSet<dde> $$3, @Nullable avb $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static ckx a(String $$0, Predicate<iw<cdg>> $$1, Predicate<iw<cdg>> $$2, ImmutableSet<csu> $$3, ImmutableSet<dde> $$4, @Nullable avb $$5) {
      return jj.a(ld.z, new akh($$0), new ckx($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<iw<cdg>> b() {
      return this.r;
   }

   public Predicate<iw<cdg>> c() {
      return this.s;
   }

   public ImmutableSet<csu> d() {
      return this.t;
   }

   public ImmutableSet<dde> e() {
      return this.u;
   }

   @Nullable
   public avb f() {
      return this.v;
   }
}

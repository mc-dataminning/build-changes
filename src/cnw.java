import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cnw(String q, Predicate<jp<cgc>> r, Predicate<jp<cgc>> s, ImmutableSet<cvt> t, ImmutableSet<dhy> u, @Nullable awj v) {
   public static final Predicate<jp<cgc>> a = $$0 -> $$0.a(axk.a);
   public static final cnw b = a("none", cgc.a, a, null);
   public static final cnw c = a("armorer", cgd.a, awk.Bd);
   public static final cnw d = a("butcher", cgd.b, awk.Be);
   public static final cnw e = a("cartographer", cgd.c, awk.Bf);
   public static final cnw f = a("cleric", cgd.d, awk.Bg);
   public static final cnw g = a("farmer", cgd.e, ImmutableSet.of(cwb.px, cwb.pw, cwb.vn, cwb.rz), ImmutableSet.of(dia.cC), awk.Bh);
   public static final cnw h = a("fisherman", cgd.f, awk.Bi);
   public static final cnw i = a("fletcher", cgd.g, awk.Bj);
   public static final cnw j = a("leatherworker", cgd.h, awk.Bk);
   public static final cnw k = a("librarian", cgd.i, awk.Bl);
   public static final cnw l = a("mason", cgd.j, awk.Bm);
   public static final cnw m = a("nitwit", cgc.a, cgc.a, null);
   public static final cnw n = a("shepherd", cgd.k, awk.Bn);
   public static final cnw o = a("toolsmith", cgd.l, awk.Bo);
   public static final cnw p = a("weaponsmith", cgd.m, awk.Bp);

   @Override
   public String toString() {
      return this.q;
   }

   private static cnw a(String $$0, alg<cgc> $$1, @Nullable awj $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cnw a(String $$0, Predicate<jp<cgc>> $$1, Predicate<jp<cgc>> $$2, @Nullable awj $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cnw a(String $$0, alg<cgc> $$1, ImmutableSet<cvt> $$2, ImmutableSet<dhy> $$3, @Nullable awj $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cnw a(String $$0, Predicate<jp<cgc>> $$1, Predicate<jp<cgc>> $$2, ImmutableSet<cvt> $$3, ImmutableSet<dhy> $$4, @Nullable awj $$5) {
      return kc.a(lx.x, alh.b($$0), new cnw($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jp<cgc>> b() {
      return this.r;
   }

   public Predicate<jp<cgc>> c() {
      return this.s;
   }

   public ImmutableSet<cvt> d() {
      return this.t;
   }

   public ImmutableSet<dhy> e() {
      return this.u;
   }

   @Nullable
   public awj f() {
      return this.v;
   }
}

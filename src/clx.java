import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record clx(String q, Predicate<jj<cef>> r, Predicate<jj<cef>> s, ImmutableSet<ctv> t, ImmutableSet<dff> u, @Nullable ave v) {
   public static final Predicate<jj<cef>> a = $$0 -> $$0.a(awf.a);
   public static final clx b = a("none", cef.a, a, null);
   public static final clx c = a("armorer", ceg.a, avf.AY);
   public static final clx d = a("butcher", ceg.b, avf.AZ);
   public static final clx e = a("cartographer", ceg.c, avf.Ba);
   public static final clx f = a("cleric", ceg.d, avf.Bb);
   public static final clx g = a("farmer", ceg.e, ImmutableSet.of(cud.pw, cud.pv, cud.vl, cud.ry), ImmutableSet.of(dfh.cC), avf.Bc);
   public static final clx h = a("fisherman", ceg.f, avf.Bd);
   public static final clx i = a("fletcher", ceg.g, avf.Be);
   public static final clx j = a("leatherworker", ceg.h, avf.Bf);
   public static final clx k = a("librarian", ceg.i, avf.Bg);
   public static final clx l = a("mason", ceg.j, avf.Bh);
   public static final clx m = a("nitwit", cef.a, cef.a, null);
   public static final clx n = a("shepherd", ceg.k, avf.Bi);
   public static final clx o = a("toolsmith", ceg.l, avf.Bj);
   public static final clx p = a("weaponsmith", ceg.m, avf.Bk);

   @Override
   public String toString() {
      return this.q;
   }

   private static clx a(String $$0, akj<cef> $$1, @Nullable ave $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static clx a(String $$0, Predicate<jj<cef>> $$1, Predicate<jj<cef>> $$2, @Nullable ave $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static clx a(String $$0, akj<cef> $$1, ImmutableSet<ctv> $$2, ImmutableSet<dff> $$3, @Nullable ave $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static clx a(String $$0, Predicate<jj<cef>> $$1, Predicate<jj<cef>> $$2, ImmutableSet<ctv> $$3, ImmutableSet<dff> $$4, @Nullable ave $$5) {
      return jw.a(lq.x, new akk($$0), new clx($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jj<cef>> b() {
      return this.r;
   }

   public Predicate<jj<cef>> c() {
      return this.s;
   }

   public ImmutableSet<ctv> d() {
      return this.t;
   }

   public ImmutableSet<dff> e() {
      return this.u;
   }

   @Nullable
   public ave f() {
      return this.v;
   }
}

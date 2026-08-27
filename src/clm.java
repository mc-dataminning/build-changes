import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record clm(String q, Predicate<ix<cdv>> r, Predicate<ix<cdv>> s, ImmutableSet<ctj> t, ImmutableSet<ddy> u, @Nullable avg v) {
   public static final Predicate<ix<cdv>> a = $$0 -> $$0.a(awg.a);
   public static final clm b = a("none", cdv.a, a, null);
   public static final clm c = a("armorer", cdw.a, avh.AV);
   public static final clm d = a("butcher", cdw.b, avh.AW);
   public static final clm e = a("cartographer", cdw.c, avh.AX);
   public static final clm f = a("cleric", cdw.d, avh.AY);
   public static final clm g = a("farmer", cdw.e, ImmutableSet.of(ctr.pw, ctr.pv, ctr.vl, ctr.ry), ImmutableSet.of(dea.cC), avh.AZ);
   public static final clm h = a("fisherman", cdw.f, avh.Ba);
   public static final clm i = a("fletcher", cdw.g, avh.Bb);
   public static final clm j = a("leatherworker", cdw.h, avh.Bc);
   public static final clm k = a("librarian", cdw.i, avh.Bd);
   public static final clm l = a("mason", cdw.j, avh.Be);
   public static final clm m = a("nitwit", cdv.a, cdv.a, null);
   public static final clm n = a("shepherd", cdw.k, avh.Bf);
   public static final clm o = a("toolsmith", cdw.l, avh.Bg);
   public static final clm p = a("weaponsmith", cdw.m, avh.Bh);

   @Override
   public String toString() {
      return this.q;
   }

   private static clm a(String $$0, akl<cdv> $$1, @Nullable avg $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static clm a(String $$0, Predicate<ix<cdv>> $$1, Predicate<ix<cdv>> $$2, @Nullable avg $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static clm a(String $$0, akl<cdv> $$1, ImmutableSet<ctj> $$2, ImmutableSet<ddy> $$3, @Nullable avg $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static clm a(String $$0, Predicate<ix<cdv>> $$1, Predicate<ix<cdv>> $$2, ImmutableSet<ctj> $$3, ImmutableSet<ddy> $$4, @Nullable avg $$5) {
      return jk.a(le.z, new akm($$0), new clm($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ix<cdv>> b() {
      return this.r;
   }

   public Predicate<ix<cdv>> c() {
      return this.s;
   }

   public ImmutableSet<ctj> d() {
      return this.t;
   }

   public ImmutableSet<ddy> e() {
      return this.u;
   }

   @Nullable
   public avg f() {
      return this.v;
   }
}

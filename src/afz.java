import java.util.Set;

public record afz(int b, bxe c, Set<bxf> d, boolean e) implements zc<abr> {
   public static final yt<vr, afz> a = yt.a(yr.h, afz::b, bxe.a, afz::e, bxf.m, afz::f, yr.b, afz::g, afz::new);

   public static afz a(int $$0, bxe $$1, Set<bxf> $$2, boolean $$3) {
      return new afz($$0, $$1, $$2, $$3);
   }

   @Override
   public ze<afz> a() {
      return agk.bd;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public bxe e() {
      return this.c;
   }

   public Set<bxf> f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}

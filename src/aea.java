import java.util.Set;

public record aea(int b, bxe c, Set<bxf> d) implements zc<abr> {
   public static final yt<vr, aea> a = yt.a(yr.h, aea::b, bxe.a, aea::e, bxf.m, aea::f, aea::new);

   public static aea a(int $$0, bxe $$1, Set<bxf> $$2) {
      return new aea($$0, $$1, $$2);
   }

   @Override
   public ze<aea> a() {
      return agk.ai;
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
}

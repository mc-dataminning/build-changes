import java.util.Set;

public record agp(int b, bwk c, Set<bwl> d, boolean e) implements zr<acg> {
   public static final zi<wh, agp> a = zi.a(zg.h, agp::b, bwk.a, agp::e, bwl.m, agp::f, zg.b, agp::g, agp::new);

   public static agp a(int $$0, bwk $$1, Set<bwl> $$2, boolean $$3) {
      return new agp($$0, $$1, $$2, $$3);
   }

   @Override
   public zt<agp> a() {
      return agz.bd;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public bwk e() {
      return this.c;
   }

   public Set<bwl> f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}

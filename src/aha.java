import java.util.Set;

public record aha(int b, bwt c, Set<bwu> d, boolean e) implements aac<acr> {
   public static final zt<ws, aha> a = zt.a(zr.h, aha::b, bwt.a, aha::e, bwu.m, aha::f, zr.b, aha::g, aha::new);

   public static aha a(int $$0, bwt $$1, Set<bwu> $$2, boolean $$3) {
      return new aha($$0, $$1, $$2, $$3);
   }

   @Override
   public aae<aha> a() {
      return ahk.bd;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public bwt e() {
      return this.c;
   }

   public Set<bwu> f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}

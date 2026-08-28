import java.util.Set;

public record afb(int b, bwt c, Set<bwu> d) implements aac<acr> {
   public static final zt<ws, afb> a = zt.a(zr.h, afb::b, bwt.a, afb::e, bwu.m, afb::f, afb::new);

   public static afb a(int $$0, bwt $$1, Set<bwu> $$2) {
      return new afb($$0, $$1, $$2);
   }

   @Override
   public aae<afb> a() {
      return ahk.ai;
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
}

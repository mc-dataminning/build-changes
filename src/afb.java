import java.util.Set;

public record afb(int b, bws c, Set<bwt> d) implements aac<acr> {
   public static final zt<ws, afb> a = zt.a(zr.h, afb::b, bws.a, afb::e, bwt.m, afb::f, afb::new);

   public static afb a(int $$0, bws $$1, Set<bwt> $$2) {
      return new afb($$0, $$1, $$2);
   }

   @Override
   public aae<afb> a() {
      return ahk.ai;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public bws e() {
      return this.c;
   }

   public Set<bwt> f() {
      return this.d;
   }
}

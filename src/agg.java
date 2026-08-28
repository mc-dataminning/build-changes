import java.util.Set;

public record agg(int b, byj c, Set<byk> d, boolean e) implements zj<aby> {
   public static final za<vy, agg> a = za.a(yy.h, agg::b, byj.a, agg::e, byk.m, agg::f, yy.b, agg::g, agg::new);

   public static agg a(int $$0, byj $$1, Set<byk> $$2, boolean $$3) {
      return new agg($$0, $$1, $$2, $$3);
   }

   @Override
   public zl<agg> a() {
      return agr.bd;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public byj e() {
      return this.c;
   }

   public Set<byk> f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}

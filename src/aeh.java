import java.util.Set;

public record aeh(int b, byj c, Set<byk> d) implements zj<aby> {
   public static final za<vy, aeh> a = za.a(yy.h, aeh::b, byj.a, aeh::e, byk.m, aeh::f, aeh::new);

   public static aeh a(int $$0, byj $$1, Set<byk> $$2) {
      return new aeh($$0, $$1, $$2);
   }

   @Override
   public zl<aeh> a() {
      return agr.ai;
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
}

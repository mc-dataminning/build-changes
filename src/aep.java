import javax.annotation.Nullable;

public record aep(String b, @Nullable String c) implements zj<aby> {
   public static final za<vy, aep> a = zj.a(aep::a, aep::new);

   private aep(vy $$0) {
      this($$0.p(), $$0.c(vy::p));
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vy::a);
   }

   @Override
   public zl<aep> a() {
      return agr.cp;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}

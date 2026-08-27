import com.mojang.serialization.Codec;

public record euz(ci b) implements euu {
   public static final Codec<euz> a = ci.a.xmap(euz::new, euz::c);

   @Override
   public euv b() {
      return euw.u;
   }

   public boolean a(erp $$0) {
      bqt $$1 = $$0.c(eug.c);
      if ($$1 != null) {
         brv $$2 = $$1.d();
         return $$2 != null && $$2 instanceof bso $$3 ? this.b.a($$3.fg()) : false;
      } else {
         return false;
      }
   }

   public static euu.a a(dbz $$0) {
      return () -> new euz(ci.a.a().a($$0).b());
   }

   public ci c() {
      return this.b;
   }
}

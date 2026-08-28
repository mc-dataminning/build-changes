import com.mojang.serialization.Codec;

public record buu(cn d) {
   public static final buu a = new buu(cn.a.a().b());
   public static final Codec<buu> b = cn.a.xmap(buu::new, buu::a);
   public static final String c = "lock";

   public boolean a(daa $$0) {
      return this.d.a($$0);
   }

   public void a(ua $$0, ji.a $$1) {
      if (this != a) {
         $$0.a("lock", b, $$1.a(uo.a), this);
      }
   }

   public static buu b(ua $$0, ji.a $$1) {
      return $$0.<buu>a("lock", b, $$1.a(uo.a)).orElse(a);
   }

   public cn a() {
      return this.d;
   }
}

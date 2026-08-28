import com.mojang.serialization.Codec;

public record bvd(cn d) {
   public static final bvd a = new bvd(cn.a.a().b());
   public static final Codec<bvd> b = cn.a.xmap(bvd::new, bvd::a);
   public static final String c = "lock";

   public boolean a(dak $$0) {
      return this.d.a($$0);
   }

   public void a(ua $$0, ji.a $$1) {
      if (this != a) {
         $$0.a("lock", b, $$1.a(uo.a), this);
      }
   }

   public static bvd b(ua $$0, ji.a $$1) {
      return $$0.<bvd>a("lock", b, $$1.a(uo.a)).orElse(a);
   }

   public cn a() {
      return this.d;
   }
}

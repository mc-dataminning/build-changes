import com.mojang.serialization.Codec;

public record buh(cm d) {
   public static final buh a = new buh(cm.a.a().b());
   public static final Codec<buh> b = cm.a.xmap(buh::new, buh::a);
   public static final String c = "lock";

   public boolean a(czn $$0) {
      return this.d.a($$0);
   }

   public void a(tz $$0, jh.a $$1) {
      if (this != a) {
         $$0.a("lock", b, $$1.a(un.a), this);
      }
   }

   public static buh b(tz $$0, jh.a $$1) {
      return $$0.<buh>a("lock", b, $$1.a(un.a)).orElse(a);
   }

   public cm a() {
      return this.d;
   }
}

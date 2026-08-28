import com.mojang.serialization.Codec;

public record bus(cm d) {
   public static final bus a = new bus(cm.a.a().b());
   public static final Codec<bus> b = cm.a.xmap(bus::new, bus::a);
   public static final String c = "lock";

   public boolean a(czy $$0) {
      return this.d.a($$0);
   }

   public void a(tz $$0, jh.a $$1) {
      if (this != a) {
         $$0.a("lock", b, $$1.a(un.a), this);
      }
   }

   public static bus b(tz $$0, jh.a $$1) {
      return $$0.<bus>a("lock", b, $$1.a(un.a)).orElse(a);
   }

   public cm a() {
      return this.d;
   }
}

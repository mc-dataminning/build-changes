import java.util.EnumMap;

public class fsf {
   public static final int a = 5000;
   private final fsb b;
   private final fbq c;
   private final EnumMap<biy, Long> d;

   public fsf(fsb $$0, fbq $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(biy.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(biy.a);
      }
   }

   private void a(biy $$0) {
      long $$1 = ac.b();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new afq($$0));
         this.d.put($$0, $$1);
      }
   }
}

import java.util.EnumMap;

public class fsd {
   public static final int a = 5000;
   private final frz b;
   private final fbo c;
   private final EnumMap<bix, Long> d;

   public fsd(frz $$0, fbo $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bix.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bix.a);
      }
   }

   private void a(bix $$0) {
      long $$1 = ac.b();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new afq($$0));
         this.d.put($$0, $$1);
      }
   }
}

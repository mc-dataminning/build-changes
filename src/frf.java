import java.util.EnumMap;

public class frf {
   public static final int a = 5000;
   private final frb b;
   private final fas c;
   private final EnumMap<bij, Long> d;

   public frf(frb $$0, fas $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(bij.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(bij.a);
      }
   }

   private void a(bij $$0) {
      long $$1 = ac.b();
      if ($$1 > this.d.getOrDefault($$0, Long.valueOf(0L)) + 5000L) {
         this.b.b(new afm($$0));
         this.d.put($$0, $$1);
      }
   }
}

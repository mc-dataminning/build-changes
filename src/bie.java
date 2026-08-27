import java.util.function.Consumer;

public class bie {
   private static final long a = Long.MAX_VALUE;
   private long b = Long.MAX_VALUE;
   private long c;

   public void a(int $$0) {
      this.b = (long)$$0 * 1000L / 20L;
      this.c = 0L;
   }

   public void b(int $$0) {
      if (!this.c()) {
         this.a($$0);
      }
   }

   public void a(boolean $$0, int $$1) {
      if ($$0) {
         this.b($$1);
      } else {
         this.a();
      }
   }

   public void a() {
      this.b = Long.MAX_VALUE;
   }

   public void a(Consumer<bie> $$0) {
      if (this.c()) {
         $$0.accept(this);
      }
   }

   public void a(float $$0, float $$1) {
      if (this.c()) {
         long $$2 = arp.b((double)($$0 * 1000.0F / 20.0F));
         this.c = this.c + (long)((float)($$2 - this.b) * $$1);
         this.b = $$2;
      }
   }

   public long b() {
      return this.c;
   }

   public boolean c() {
      return this.b != Long.MAX_VALUE;
   }
}

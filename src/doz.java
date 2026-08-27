import com.google.common.annotations.VisibleForTesting;
import java.util.concurrent.atomic.AtomicLong;

public class doz implements don {
   private static final int d = 48;
   private static final long e = 281474976710655L;
   private static final long f = 25214903917L;
   private static final long g = 11L;
   private final AtomicLong h = new AtomicLong();
   private final dpa i = new dpa(this);

   public doz(long $$0) {
      this.b($$0);
   }

   @Override
   public auw d() {
      return new doz(this.g());
   }

   @Override
   public dpl e() {
      return new doz.a(this.g());
   }

   @Override
   public void b(long $$0) {
      if (!this.h.compareAndSet(this.h.get(), ($$0 ^ 25214903917L) & 281474976710655L)) {
         throw avo.a("LegacyRandomSource", null);
      } else {
         this.i.a();
      }
   }

   @Override
   public int c(int $$0) {
      long $$1 = this.h.get();
      long $$2 = $$1 * 25214903917L + 11L & 281474976710655L;
      if (!this.h.compareAndSet($$1, $$2)) {
         throw avo.a("LegacyRandomSource", null);
      } else {
         return (int)($$2 >> 48 - $$0);
      }
   }

   @Override
   public double k() {
      return this.i.b();
   }

   public static class a implements dpl {
      private final long a;

      public a(long $$0) {
         this.a = $$0;
      }

      @Override
      public auw a(int $$0, int $$1, int $$2) {
         long $$3 = aup.b($$0, $$1, $$2);
         long $$4 = $$3 ^ this.a;
         return new doz($$4);
      }

      @Override
      public auw a(String $$0) {
         int $$1 = $$0.hashCode();
         return new doz((long)$$1 ^ this.a);
      }

      @VisibleForTesting
      @Override
      public void a(StringBuilder $$0) {
         $$0.append("LegacyPositionalRandomFactory{").append(this.a).append("}");
      }
   }
}

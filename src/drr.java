import com.google.common.annotations.VisibleForTesting;
import java.util.concurrent.atomic.AtomicLong;

public class drr implements drf {
   private static final int d = 48;
   private static final long e = 281474976710655L;
   private static final long f = 25214903917L;
   private static final long g = 11L;
   private final AtomicLong h = new AtomicLong();
   private final drs i = new drs(this);

   public drr(long $$0) {
      this.b($$0);
   }

   @Override
   public awt d() {
      return new drr(this.g());
   }

   @Override
   public dsd e() {
      return new drr.a(this.g());
   }

   @Override
   public void b(long $$0) {
      if (!this.h.compareAndSet(this.h.get(), ($$0 ^ 25214903917L) & 281474976710655L)) {
         throw axj.a("LegacyRandomSource", null);
      } else {
         this.i.a();
      }
   }

   @Override
   public int c(int $$0) {
      long $$1 = this.h.get();
      long $$2 = $$1 * 25214903917L + 11L & 281474976710655L;
      if (!this.h.compareAndSet($$1, $$2)) {
         throw axj.a("LegacyRandomSource", null);
      } else {
         return (int)($$2 >> 48 - $$0);
      }
   }

   @Override
   public double k() {
      return this.i.b();
   }

   public static class a implements dsd {
      private final long a;

      public a(long $$0) {
         this.a = $$0;
      }

      @Override
      public awt a(int $$0, int $$1, int $$2) {
         long $$3 = awm.b($$0, $$1, $$2);
         long $$4 = $$3 ^ this.a;
         return new drr($$4);
      }

      @Override
      public awt a(String $$0) {
         int $$1 = $$0.hashCode();
         return new drr((long)$$1 ^ this.a);
      }

      @VisibleForTesting
      @Override
      public void a(StringBuilder $$0) {
         $$0.append("LegacyPositionalRandomFactory{").append(this.a).append("}");
      }
   }
}

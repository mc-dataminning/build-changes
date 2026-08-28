import java.nio.ByteBuffer;

public abstract class fii implements AutoCloseable {
   private final fig b;
   private final fih c;
   public int a;

   public fii(fig $$0, fih $$1, int $$2) {
      this.b = $$0;
      this.a = $$2;
      this.c = $$1;
   }

   public int a() {
      return this.a;
   }

   public fig b() {
      return this.b;
   }

   public fih c() {
      return this.c;
   }

   public abstract boolean d();

   @Override
   public abstract void close();

   public interface a extends AutoCloseable {
      ByteBuffer a();

      @Override
      void close();
   }
}

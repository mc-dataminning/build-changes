import java.nio.ByteBuffer;

public abstract class fig implements AutoCloseable {
   private final fie b;
   private final fif c;
   public int a;

   public fig(fie $$0, fif $$1, int $$2) {
      this.b = $$0;
      this.a = $$2;
      this.c = $$1;
   }

   public int a() {
      return this.a;
   }

   public fie b() {
      return this.b;
   }

   public fif c() {
      return this.c;
   }

   @Override
   public abstract void close();

   public interface a extends AutoCloseable {
      ByteBuffer a();

      @Override
      void close();
   }
}

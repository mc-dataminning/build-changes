import java.util.stream.Stream;

public abstract class ehw extends ehx {
   @Override
   public final Stream<ja> a_(ehv $$0, aym $$1, ja $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(ehv var1, aym var2, ja var3);
}

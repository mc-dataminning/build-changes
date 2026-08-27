import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dvl<T extends dvb> implements dvk<T> {
   private final dvd<T> a;
   private final dvg<T> b;

   public dvl(dvd<T> $$0, dvg<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return this.a.a($$0);
   }

   @Nullable
   @Override
   public T a(UUID $$0) {
      return this.a.a($$0);
   }

   @Override
   public Iterable<T> a() {
      return this.a.a();
   }

   @Override
   public <U extends T> void a(dvi<T, U> $$0, awr<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(euf $$0, Consumer<T> $$1) {
      this.b.b($$0, awr.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dvi<T, U> $$0, euf $$1, awr<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}

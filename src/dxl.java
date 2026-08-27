import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dxl<T extends dxc> {
   dxl<?> a = new dxl<dxc>() {
      @Nullable
      @Override
      public dxc a(int $$0) {
         return null;
      }

      @Nullable
      @Override
      public dxc a(UUID $$0) {
         return null;
      }

      @Override
      public Iterable<dxc> b() {
         return List.of();
      }

      @Override
      public <U extends dxc> void a(dxj<dxc, U> $$0, awz<U> $$1) {
      }

      @Override
      public void a(ewp $$0, Consumer<dxc> $$1) {
      }

      @Override
      public <U extends dxc> void a(dxj<dxc, U> $$0, ewp $$1, awz<U> $$2) {
      }
   };

   static <T extends dxc> dxl<T> a() {
      return (dxl<T>)a;
   }

   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> b();

   <U extends T> void a(dxj<T, U> var1, awz<U> var2);

   void a(ewp var1, Consumer<T> var2);

   <U extends T> void a(dxj<T, U> var1, ewp var2, awz<U> var3);
}

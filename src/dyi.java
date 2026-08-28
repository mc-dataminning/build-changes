import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dyi<T extends dye> {
   private static final Logger a = LogUtils.getLogger();
   private final axu<T> b;
   private dyr c;

   public dyi(Class<T> $$0, dyr $$1) {
      this.c = $$1;
      this.b = new axu<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public axo.a a(exz $$0, axo<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cO().c($$0) && $$1.accept($$2).a()) {
            return axo.a.b;
         }
      }

      return axo.a.a;
   }

   public <U extends T> axo.a a(dyl<T, U> $$0, exz $$1, axo<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return axo.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cO().c($$1) && $$2.accept($$5).a()) {
               return axo.a.b;
            }
         }

         return axo.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dyr c() {
      return this.c;
   }

   public dyr a(dyr $$0) {
      dyr $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @bai
   public int d() {
      return this.b.size();
   }
}

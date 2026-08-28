import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class eby<T extends ebu> {
   private static final Logger a = LogUtils.getLogger();
   private final axr<T> b;
   private ecj c;

   public eby(Class<T> $$0, ecj $$1) {
      this.c = $$1;
      this.b = new axr<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public axl.a a(fbs $$0, axl<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cQ().c($$0) && $$1.accept($$2).a()) {
            return axl.a.b;
         }
      }

      return axl.a.a;
   }

   public <U extends T> axl.a a(ecb<T, U> $$0, fbs $$1, axl<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return axl.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cQ().c($$1) && $$2.accept($$5).a()) {
               return axl.a.b;
            }
         }

         return axl.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public ecj c() {
      return this.c;
   }

   public ecj a(ecj $$0) {
      ecj $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @bag
   public int d() {
      return this.b.size();
   }
}

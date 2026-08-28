import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dza<T extends dyw> {
   private static final Logger a = LogUtils.getLogger();
   private final axx<T> b;
   private dzj c;

   public dza(Class<T> $$0, dzj $$1) {
      this.c = $$1;
      this.b = new axx<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public axr.a a(eyr $$0, axr<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cO().c($$0) && $$1.accept($$2).a()) {
            return axr.a.b;
         }
      }

      return axr.a.a;
   }

   public <U extends T> axr.a a(dzd<T, U> $$0, eyr $$1, axr<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return axr.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cO().c($$1) && $$2.accept($$5).a()) {
               return axr.a.b;
            }
         }

         return axr.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dzj c() {
      return this.c;
   }

   public dzj a(dzj $$0) {
      dzj $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @bal
   public int d() {
      return this.b.size();
   }
}

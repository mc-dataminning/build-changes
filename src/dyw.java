import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dyw<T extends dys> {
   private static final Logger a = LogUtils.getLogger();
   private final axv<T> b;
   private dzf c;

   public dyw(Class<T> $$0, dzf $$1) {
      this.c = $$1;
      this.b = new axv<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public axp.a a(eyn $$0, axp<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cO().c($$0) && $$1.accept($$2).a()) {
            return axp.a.b;
         }
      }

      return axp.a.a;
   }

   public <U extends T> axp.a a(dyz<T, U> $$0, eyn $$1, axp<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return axp.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cO().c($$1) && $$2.accept($$5).a()) {
               return axp.a.b;
            }
         }

         return axp.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dzf c() {
      return this.c;
   }

   public dzf a(dzf $$0) {
      dzf $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @baj
   public int d() {
      return this.b.size();
   }
}

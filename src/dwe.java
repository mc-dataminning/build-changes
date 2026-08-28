import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dwe<T extends dwa> {
   private static final Logger a = LogUtils.getLogger();
   private final axp<T> b;
   private dwn c;

   public dwe(Class<T> $$0, dwn $$1) {
      this.c = $$1;
      this.b = new axp<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public axk.a a(evk $$0, axk<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cK().c($$0) && $$1.accept($$2).a()) {
            return axk.a.b;
         }
      }

      return axk.a.a;
   }

   public <U extends T> axk.a a(dwh<T, U> $$0, evk $$1, axk<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return axk.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cK().c($$1) && $$2.accept($$5).a()) {
               return axk.a.b;
            }
         }

         return axk.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dwn c() {
      return this.c;
   }

   public dwn a(dwn $$0) {
      dwn $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @bab
   public int d() {
      return this.b.size();
   }
}

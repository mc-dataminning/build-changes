import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dli<T extends dle> {
   private static final Logger a = LogUtils.getLogger();
   private final ask<T> b;
   private dlr c;

   public dli(Class<T> $$0, dlr $$1) {
      this.c = $$1;
      this.b = new ask<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public asf.a a(eju $$0, asf<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cH().c($$0) && $$1.accept($$2).a()) {
            return asf.a.b;
         }
      }

      return asf.a.a;
   }

   public <U extends T> asf.a a(dll<T, U> $$0, eju $$1, asf<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return asf.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cH().c($$1) && $$2.accept($$5).a()) {
               return asf.a.b;
            }
         }

         return asf.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dlr c() {
      return this.c;
   }

   public dlr a(dlr $$0) {
      dlr $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @aut
   public int d() {
      return this.b.size();
   }
}

import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dxk<T extends dxg> {
   private static final Logger a = LogUtils.getLogger();
   private final axf<T> b;
   private dxt c;

   public dxk(Class<T> $$0, dxt $$1) {
      this.c = $$1;
      this.b = new axf<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public axa.a a(ewx $$0, axa<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cK().c($$0) && $$1.accept($$2).a()) {
            return axa.a.b;
         }
      }

      return axa.a.a;
   }

   public <U extends T> axa.a a(dxn<T, U> $$0, ewx $$1, axa<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return axa.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cK().c($$1) && $$2.accept($$5).a()) {
               return axa.a.b;
            }
         }

         return axa.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dxt c() {
      return this.c;
   }

   public dxt a(dxt $$0) {
      dxt $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @azt
   public int d() {
      return this.b.size();
   }
}

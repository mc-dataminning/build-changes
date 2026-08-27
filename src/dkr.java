import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dkr<T extends dkn> {
   private static final Logger a = LogUtils.getLogger();
   private final asc<T> b;
   private dla c;

   public dkr(Class<T> $$0, dla $$1) {
      this.c = $$1;
      this.b = new asc<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public arx.a a(ejd $$0, arx<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cG().c($$0) && $$1.accept($$2).a()) {
            return arx.a.b;
         }
      }

      return arx.a.a;
   }

   public <U extends T> arx.a a(dku<T, U> $$0, ejd $$1, arx<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return arx.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cG().c($$1) && $$2.accept($$5).a()) {
               return arx.a.b;
            }
         }

         return arx.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dla c() {
      return this.c;
   }

   public dla a(dla $$0) {
      dla $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @auk
   public int d() {
      return this.b.size();
   }
}

import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dph<T extends dpd> {
   private static final Logger a = LogUtils.getLogger();
   private final avb<T> b;
   private dpq c;

   public dph(Class<T> $$0, dpq $$1) {
      this.c = $$1;
      this.b = new avb<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public auv.a a(enu $$0, auv<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cH().c($$0) && $$1.accept($$2).a()) {
            return auv.a.b;
         }
      }

      return auv.a.a;
   }

   public <U extends T> auv.a a(dpk<T, U> $$0, enu $$1, auv<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return auv.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cH().c($$1) && $$2.accept($$5).a()) {
               return auv.a.b;
            }
         }

         return auv.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dpq c() {
      return this.c;
   }

   public dpq a(dpq $$0) {
      dpq $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @axl
   public int d() {
      return this.b.size();
   }
}

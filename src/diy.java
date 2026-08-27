import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class diy<T extends diu> {
   private static final Logger a = LogUtils.getLogger();
   private final aqv<T> b;
   private djh c;

   public diy(Class<T> $$0, djh $$1) {
      this.c = $$1;
      this.b = new aqv<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public aqq.a a(ehc $$0, aqq<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cG().c($$0) && $$1.accept($$2).a()) {
            return aqq.a.b;
         }
      }

      return aqq.a.a;
   }

   public <U extends T> aqq.a a(djb<T, U> $$0, ehc $$1, aqq<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return aqq.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cG().c($$1) && $$2.accept($$5).a()) {
               return aqq.a.b;
            }
         }

         return aqq.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public djh c() {
      return this.c;
   }

   public djh a(djh $$0) {
      djh $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @atd
   public int d() {
      return this.b.size();
   }
}

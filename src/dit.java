import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dit<T extends dip> {
   private static final Logger a = LogUtils.getLogger();
   private final aqj<T> b;
   private djc c;

   public dit(Class<T> $$0, djc $$1) {
      this.c = $$1;
      this.b = new aqj<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public aqe.a a(eha $$0, aqe<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cG().c($$0) && $$1.accept($$2).a()) {
            return aqe.a.b;
         }
      }

      return aqe.a.a;
   }

   public <U extends T> aqe.a a(diw<T, U> $$0, eha $$1, aqe<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return aqe.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cG().c($$1) && $$2.accept($$5).a()) {
               return aqe.a.b;
            }
         }

         return aqe.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public djc c() {
      return this.c;
   }

   public djc a(djc $$0) {
      djc $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @aso
   public int d() {
      return this.b.size();
   }
}

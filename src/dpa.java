import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dpa<T extends dow> {
   private static final Logger a = LogUtils.getLogger();
   private final ava<T> b;
   private dpj c;

   public dpa(Class<T> $$0, dpj $$1) {
      this.c = $$1;
      this.b = new ava<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public auu.a a(enn $$0, auu<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cH().c($$0) && $$1.accept($$2).a()) {
            return auu.a.b;
         }
      }

      return auu.a.a;
   }

   public <U extends T> auu.a a(dpd<T, U> $$0, enn $$1, auu<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return auu.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cH().c($$1) && $$2.accept($$5).a()) {
               return auu.a.b;
            }
         }

         return auu.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dpj c() {
      return this.c;
   }

   public dpj a(dpj $$0) {
      dpj $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @axl
   public int d() {
      return this.b.size();
   }
}

import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dzv<T extends dzr> {
   private static final Logger a = LogUtils.getLogger();
   private final ayf<T> b;
   private eae c;

   public dzv(Class<T> $$0, eae $$1) {
      this.c = $$1;
      this.b = new ayf<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public axz.a a(ezm $$0, axz<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cT().c($$0) && $$1.accept($$2).a()) {
            return axz.a.b;
         }
      }

      return axz.a.a;
   }

   public <U extends T> axz.a a(dzy<T, U> $$0, ezm $$1, axz<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return axz.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cT().c($$1) && $$2.accept($$5).a()) {
               return axz.a.b;
            }
         }

         return axz.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public eae c() {
      return this.c;
   }

   public eae a(eae $$0) {
      eae $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @bau
   public int d() {
      return this.b.size();
   }
}

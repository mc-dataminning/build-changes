import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dzr<T extends dzn> {
   private static final Logger a = LogUtils.getLogger();
   private final ayc<T> b;
   private eaa c;

   public dzr(Class<T> $$0, eaa $$1) {
      this.c = $$1;
      this.b = new ayc<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public axw.a a(ezi $$0, axw<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cS().c($$0) && $$1.accept($$2).a()) {
            return axw.a.b;
         }
      }

      return axw.a.a;
   }

   public <U extends T> axw.a a(dzu<T, U> $$0, ezi $$1, axw<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return axw.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cS().c($$1) && $$2.accept($$5).a()) {
               return axw.a.b;
            }
         }

         return axw.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public eaa c() {
      return this.c;
   }

   public eaa a(eaa $$0) {
      eaa $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @baq
   public int d() {
      return this.b.size();
   }
}

import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dwb<T extends dvx> {
   private static final Logger a = LogUtils.getLogger();
   private final axm<T> b;
   private dwk c;

   public dwb(Class<T> $$0, dwk $$1) {
      this.c = $$1;
      this.b = new axm<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public axh.a a(evh $$0, axh<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cK().c($$0) && $$1.accept($$2).a()) {
            return axh.a.b;
         }
      }

      return axh.a.a;
   }

   public <U extends T> axh.a a(dwe<T, U> $$0, evh $$1, axh<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return axh.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cK().c($$1) && $$2.accept($$5).a()) {
               return axh.a.b;
            }
         }

         return axh.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dwk c() {
      return this.c;
   }

   public dwk a(dwk $$0) {
      dwk $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @azy
   public int d() {
      return this.b.size();
   }
}

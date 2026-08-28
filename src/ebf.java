import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ebf<T extends ebb> {
   private static final Logger a = LogUtils.getLogger();
   private final axr<T> b;
   private ebo c;

   public ebf(Class<T> $$0, ebo $$1) {
      this.c = $$1;
      this.b = new axr<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public axl.a a(faw $$0, axl<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cR().c($$0) && $$1.accept($$2).a()) {
            return axl.a.b;
         }
      }

      return axl.a.a;
   }

   public <U extends T> axl.a a(ebi<T, U> $$0, faw $$1, axl<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return axl.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cR().c($$1) && $$2.accept($$5).a()) {
               return axl.a.b;
            }
         }

         return axl.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public ebo c() {
      return this.c;
   }

   public ebo a(ebo $$0) {
      ebo $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @bag
   public int d() {
      return this.b.size();
   }
}

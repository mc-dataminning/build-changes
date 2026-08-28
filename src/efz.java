import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class efz<T extends efv> {
   private static final Logger a = LogUtils.getLogger();
   private final ayp<T> b;
   private egk c;

   public efz(Class<T> $$0, egk $$1) {
      this.c = $$1;
      this.b = new ayp<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public ayi.a a(ffx $$0, ayi<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cR().c($$0) && $$1.accept($$2).a()) {
            return ayi.a.b;
         }
      }

      return ayi.a.a;
   }

   public <U extends T> ayi.a a(egc<T, U> $$0, ffx $$1, ayi<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return ayi.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cR().c($$1) && $$2.accept($$5).a()) {
               return ayi.a.b;
            }
         }

         return ayi.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public egk c() {
      return this.c;
   }

   public egk a(egk $$0) {
      egk $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @bbi
   public int d() {
      return this.b.size();
   }
}

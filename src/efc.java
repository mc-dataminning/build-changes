import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class efc<T extends eey> {
   private static final Logger a = LogUtils.getLogger();
   private final ayd<T> b;
   private efn c;

   public efc(Class<T> $$0, efn $$1) {
      this.c = $$1;
      this.b = new ayd<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public axx.a a(fex $$0, axx<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cQ().c($$0) && $$1.accept($$2).a()) {
            return axx.a.b;
         }
      }

      return axx.a.a;
   }

   public <U extends T> axx.a a(eff<T, U> $$0, fex $$1, axx<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return axx.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cQ().c($$1) && $$2.accept($$5).a()) {
               return axx.a.b;
            }
         }

         return axx.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public efn c() {
      return this.c;
   }

   public efn a(efn $$0) {
      efn $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @bav
   public int d() {
      return this.b.size();
   }
}

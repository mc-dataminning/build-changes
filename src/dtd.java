import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dtd<T extends dsz> {
   private static final Logger a = LogUtils.getLogger();
   private final awc<T> b;
   private dtm c;

   public dtd(Class<T> $$0, dtm $$1) {
      this.c = $$1;
      this.b = new awc<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public avx.a a(erv $$0, avx<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cH().c($$0) && $$1.accept($$2).a()) {
            return avx.a.b;
         }
      }

      return avx.a.a;
   }

   public <U extends T> avx.a a(dtg<T, U> $$0, erv $$1, avx<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return avx.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cH().c($$1) && $$2.accept($$5).a()) {
               return avx.a.b;
            }
         }

         return avx.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dtm c() {
      return this.c;
   }

   public dtm a(dtm $$0) {
      dtm $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @ayn
   public int d() {
      return this.b.size();
   }
}

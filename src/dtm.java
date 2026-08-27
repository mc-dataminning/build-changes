import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dtm<T extends dti> {
   private static final Logger a = LogUtils.getLogger();
   private final awe<T> b;
   private dtv c;

   public dtm(Class<T> $$0, dtv $$1) {
      this.c = $$1;
      this.b = new awe<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public avz.a a(ese $$0, avz<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cH().c($$0) && $$1.accept($$2).a()) {
            return avz.a.b;
         }
      }

      return avz.a.a;
   }

   public <U extends T> avz.a a(dtp<T, U> $$0, ese $$1, avz<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return avz.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cH().c($$1) && $$2.accept($$5).a()) {
               return avz.a.b;
            }
         }

         return avz.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dtv c() {
      return this.c;
   }

   public dtv a(dtv $$0) {
      dtv $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @ayp
   public int d() {
      return this.b.size();
   }
}

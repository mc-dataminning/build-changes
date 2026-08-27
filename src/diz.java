import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class diz<T extends div> {
   private static final Logger a = LogUtils.getLogger();
   private final aqo<T> b;
   private dji c;

   public diz(Class<T> $$0, dji $$1) {
      this.c = $$1;
      this.b = new aqo<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public aqj.a a(ehd $$0, aqj<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cG().c($$0) && $$1.accept($$2).a()) {
            return aqj.a.b;
         }
      }

      return aqj.a.a;
   }

   public <U extends T> aqj.a a(djc<T, U> $$0, ehd $$1, aqj<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return aqj.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cG().c($$1) && $$2.accept($$5).a()) {
               return aqj.a.b;
            }
         }

         return aqj.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dji c() {
      return this.c;
   }

   public dji a(dji $$0) {
      dji $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @ast
   public int d() {
      return this.b.size();
   }
}

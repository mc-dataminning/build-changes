import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class diu<T extends diq> {
   private static final Logger a = LogUtils.getLogger();
   private final aql<T> b;
   private djd c;

   public diu(Class<T> $$0, djd $$1) {
      this.c = $$1;
      this.b = new aql<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public aqg.a a(egy $$0, aqg<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cG().c($$0) && $$1.accept($$2).a()) {
            return aqg.a.b;
         }
      }

      return aqg.a.a;
   }

   public <U extends T> aqg.a a(dix<T, U> $$0, egy $$1, aqg<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return aqg.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cG().c($$1) && $$2.accept($$5).a()) {
               return aqg.a.b;
            }
         }

         return aqg.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public djd c() {
      return this.c;
   }

   public djd a(djd $$0) {
      djd $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @asq
   public int d() {
      return this.b.size();
   }
}

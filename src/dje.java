import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dje<T extends dja> {
   private static final Logger a = LogUtils.getLogger();
   private final aqs<T> b;
   private djn c;

   public dje(Class<T> $$0, djn $$1) {
      this.c = $$1;
      this.b = new aqs<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public aqn.a a(ehi $$0, aqn<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cG().c($$0) && $$1.accept($$2).a()) {
            return aqn.a.b;
         }
      }

      return aqn.a.a;
   }

   public <U extends T> aqn.a a(djh<T, U> $$0, ehi $$1, aqn<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return aqn.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cG().c($$1) && $$2.accept($$5).a()) {
               return aqn.a.b;
            }
         }

         return aqn.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public djn c() {
      return this.c;
   }

   public djn a(djn $$0) {
      djn $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @asy
   public int d() {
      return this.b.size();
   }
}

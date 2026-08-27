import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dfw<T extends dfs> {
   private static final Logger a = LogUtils.getLogger();
   private final anv<T> b;
   private dgf c;

   public dfw(Class<T> $$0, dgf $$1) {
      this.c = $$1;
      this.b = new anv<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public anr.a a(eed $$0, anr<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cE().c($$0) && $$1.accept($$2).a()) {
            return anr.a.b;
         }
      }

      return anr.a.a;
   }

   public <U extends T> anr.a a(dfz<T, U> $$0, eed $$1, anr<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return anr.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cE().c($$1) && $$2.accept($$5).a()) {
               return anr.a.b;
            }
         }

         return anr.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dgf c() {
      return this.c;
   }

   public dgf a(dgf $$0) {
      dgf $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @aqa
   public int d() {
      return this.b.size();
   }
}

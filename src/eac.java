import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class eac<T extends dzy> {
   private static final Logger a = LogUtils.getLogger();
   private final aye<T> b;
   private eal c;

   public eac(Class<T> $$0, eal $$1) {
      this.c = $$1;
      this.b = new aye<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public axy.a a(ezt $$0, axy<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cR().c($$0) && $$1.accept($$2).a()) {
            return axy.a.b;
         }
      }

      return axy.a.a;
   }

   public <U extends T> axy.a a(eaf<T, U> $$0, ezt $$1, axy<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return axy.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cR().c($$1) && $$2.accept($$5).a()) {
               return axy.a.b;
            }
         }

         return axy.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public eal c() {
      return this.c;
   }

   public eal a(eal $$0) {
      eal $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @bat
   public int d() {
      return this.b.size();
   }
}

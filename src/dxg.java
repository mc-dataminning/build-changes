import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dxg<T extends dxc> {
   private static final Logger a = LogUtils.getLogger();
   private final axe<T> b;
   private dxp c;

   public dxg(Class<T> $$0, dxp $$1) {
      this.c = $$1;
      this.b = new axe<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public awz.a a(ewp $$0, awz<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cP().c($$0) && $$1.accept($$2).a()) {
            return awz.a.b;
         }
      }

      return awz.a.a;
   }

   public <U extends T> awz.a a(dxj<T, U> $$0, ewp $$1, awz<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return awz.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cP().c($$1) && $$2.accept($$5).a()) {
               return awz.a.b;
            }
         }

         return awz.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dxp c() {
      return this.c;
   }

   public dxp a(dxp $$0) {
      dxp $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @azp
   public int d() {
      return this.b.size();
   }
}

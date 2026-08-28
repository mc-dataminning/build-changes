import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dwl<T extends dwh> {
   private static final Logger a = LogUtils.getLogger();
   private final awv<T> b;
   private dwu c;

   public dwl(Class<T> $$0, dwu $$1) {
      this.c = $$1;
      this.b = new awv<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public awq.a a(evu $$0, awq<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cK().c($$0) && $$1.accept($$2).a()) {
            return awq.a.b;
         }
      }

      return awq.a.a;
   }

   public <U extends T> awq.a a(dwo<T, U> $$0, evu $$1, awq<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return awq.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cK().c($$1) && $$2.accept($$5).a()) {
               return awq.a.b;
            }
         }

         return awq.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dwu c() {
      return this.c;
   }

   public dwu a(dwu $$0) {
      dwu $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @azi
   public int d() {
      return this.b.size();
   }
}

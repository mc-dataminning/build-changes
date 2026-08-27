import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dnb<T extends dmx> {
   private static final Logger a = LogUtils.getLogger();
   private final atg<T> b;
   private dnk c;

   public dnb(Class<T> $$0, dnk $$1) {
      this.c = $$1;
      this.b = new atg<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public atb.a a(eln $$0, atb<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cH().c($$0) && $$1.accept($$2).a()) {
            return atb.a.b;
         }
      }

      return atb.a.a;
   }

   public <U extends T> atb.a a(dne<T, U> $$0, eln $$1, atb<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return atb.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cH().c($$1) && $$2.accept($$5).a()) {
               return atb.a.b;
            }
         }

         return atb.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dnk c() {
      return this.c;
   }

   public dnk a(dnk $$0) {
      dnk $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @avs
   public int d() {
      return this.b.size();
   }
}

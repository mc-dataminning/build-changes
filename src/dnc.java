import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dnc<T extends dmy> {
   private static final Logger a = LogUtils.getLogger();
   private final ath<T> b;
   private dnl c;

   public dnc(Class<T> $$0, dnl $$1) {
      this.c = $$1;
      this.b = new ath<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public atc.a a(elo $$0, atc<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cH().c($$0) && $$1.accept($$2).a()) {
            return atc.a.b;
         }
      }

      return atc.a.a;
   }

   public <U extends T> atc.a a(dnf<T, U> $$0, elo $$1, atc<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return atc.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cH().c($$1) && $$2.accept($$5).a()) {
               return atc.a.b;
            }
         }

         return atc.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dnl c() {
      return this.c;
   }

   public dnl a(dnl $$0) {
      dnl $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @avt
   public int d() {
      return this.b.size();
   }
}

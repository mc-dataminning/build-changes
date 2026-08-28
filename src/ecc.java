import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ecc<T extends eby> {
   private static final Logger a = LogUtils.getLogger();
   private final ayw<T> b;
   private ecl c;

   public ecc(Class<T> $$0, ecl $$1) {
      this.c = $$1;
      this.b = new ayw<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public ayq.a a(fbt $$0, ayq<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cR().c($$0) && $$1.accept($$2).a()) {
            return ayq.a.b;
         }
      }

      return ayq.a.a;
   }

   public <U extends T> ayq.a a(ecf<T, U> $$0, fbt $$1, ayq<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return ayq.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cR().c($$1) && $$2.accept($$5).a()) {
               return ayq.a.b;
            }
         }

         return ayq.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public ecl c() {
      return this.c;
   }

   public ecl a(ecl $$0) {
      ecl $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @bbl
   public int d() {
      return this.b.size();
   }
}

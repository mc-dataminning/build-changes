import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dzl<T extends dzh> {
   private static final Logger a = LogUtils.getLogger();
   private final ayb<T> b;
   private dzu c;

   public dzl(Class<T> $$0, dzu $$1) {
      this.c = $$1;
      this.b = new ayb<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public axv.a a(ezc $$0, axv<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cS().c($$0) && $$1.accept($$2).a()) {
            return axv.a.b;
         }
      }

      return axv.a.a;
   }

   public <U extends T> axv.a a(dzo<T, U> $$0, ezc $$1, axv<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return axv.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cS().c($$1) && $$2.accept($$5).a()) {
               return axv.a.b;
            }
         }

         return axv.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dzu c() {
      return this.c;
   }

   public dzu a(dzu $$0) {
      dzu $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @bap
   public int d() {
      return this.b.size();
   }
}

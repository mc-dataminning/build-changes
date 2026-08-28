import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ebv<T extends ebr> {
   private static final Logger a = LogUtils.getLogger();
   private final aym<T> b;
   private ece c;

   public ebv(Class<T> $$0, ece $$1) {
      this.c = $$1;
      this.b = new aym<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public ayg.a a(fbm $$0, ayg<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cR().c($$0) && $$1.accept($$2).a()) {
            return ayg.a.b;
         }
      }

      return ayg.a.a;
   }

   public <U extends T> ayg.a a(eby<T, U> $$0, fbm $$1, ayg<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return ayg.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cR().c($$1) && $$2.accept($$5).a()) {
               return ayg.a.b;
            }
         }

         return ayg.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public ece c() {
      return this.c;
   }

   public ece a(ece $$0) {
      ece $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @bbb
   public int d() {
      return this.b.size();
   }
}

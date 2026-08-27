import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dqc<T extends dpy> {
   private static final Logger a = LogUtils.getLogger();
   private final avf<T> b;
   private dql c;

   public dqc(Class<T> $$0, dql $$1) {
      this.c = $$1;
      this.b = new avf<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public ava.a a(eoq $$0, ava<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cE().c($$0) && $$1.accept($$2).a()) {
            return ava.a.b;
         }
      }

      return ava.a.a;
   }

   public <U extends T> ava.a a(dqf<T, U> $$0, eoq $$1, ava<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return ava.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cE().c($$1) && $$2.accept($$5).a()) {
               return ava.a.b;
            }
         }

         return ava.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dql c() {
      return this.c;
   }

   public dql a(dql $$0) {
      dql $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @axp
   public int d() {
      return this.b.size();
   }
}

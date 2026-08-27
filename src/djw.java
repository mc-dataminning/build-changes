import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class djw<T extends djs> {
   private static final Logger a = LogUtils.getLogger();
   private final ars<T> b;
   private dkf c;

   public djw(Class<T> $$0, dkf $$1) {
      this.c = $$1;
      this.b = new ars<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public arn.a a(eia $$0, arn<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cG().c($$0) && $$1.accept($$2).a()) {
            return arn.a.b;
         }
      }

      return arn.a.a;
   }

   public <U extends T> arn.a a(djz<T, U> $$0, eia $$1, arn<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return arn.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cG().c($$1) && $$2.accept($$5).a()) {
               return arn.a.b;
            }
         }

         return arn.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dkf c() {
      return this.c;
   }

   public dkf a(dkf $$0) {
      dkf $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @aua
   public int d() {
      return this.b.size();
   }
}

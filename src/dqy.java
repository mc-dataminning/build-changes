import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dqy<T extends dqu> {
   private static final Logger a = LogUtils.getLogger();
   private final avo<T> b;
   private drh c;

   public dqy(Class<T> $$0, drh $$1) {
      this.c = $$1;
      this.b = new avo<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public avj.a a(epm $$0, avj<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cH().c($$0) && $$1.accept($$2).a()) {
            return avj.a.b;
         }
      }

      return avj.a.a;
   }

   public <U extends T> avj.a a(drb<T, U> $$0, epm $$1, avj<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return avj.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cH().c($$1) && $$2.accept($$5).a()) {
               return avj.a.b;
            }
         }

         return avj.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public drh c() {
      return this.c;
   }

   public drh a(drh $$0) {
      drh $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @axz
   public int d() {
      return this.b.size();
   }
}

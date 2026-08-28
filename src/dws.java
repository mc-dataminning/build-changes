import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dws<T extends dwo> {
   private static final Logger a = LogUtils.getLogger();
   private final awx<T> b;
   private dxb c;

   public dws(Class<T> $$0, dxb $$1) {
      this.c = $$1;
      this.b = new awx<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public aws.a a(ewc $$0, aws<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cM().c($$0) && $$1.accept($$2).a()) {
            return aws.a.b;
         }
      }

      return aws.a.a;
   }

   public <U extends T> aws.a a(dwv<T, U> $$0, ewc $$1, aws<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return aws.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cM().c($$1) && $$2.accept($$5).a()) {
               return aws.a.b;
            }
         }

         return aws.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dxb c() {
      return this.c;
   }

   public dxb a(dxb $$0) {
      dxb $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @azl
   public int d() {
      return this.b.size();
   }
}

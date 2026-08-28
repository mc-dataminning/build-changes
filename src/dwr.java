import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dwr<T extends dwn> {
   private static final Logger a = LogUtils.getLogger();
   private final awx<T> b;
   private dxa c;

   public dwr(Class<T> $$0, dxa $$1) {
      this.c = $$1;
      this.b = new awx<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public aws.a a(ewa $$0, aws<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cL().c($$0) && $$1.accept($$2).a()) {
            return aws.a.b;
         }
      }

      return aws.a.a;
   }

   public <U extends T> aws.a a(dwu<T, U> $$0, ewa $$1, aws<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return aws.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cL().c($$1) && $$2.accept($$5).a()) {
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

   public dxa c() {
      return this.c;
   }

   public dxa a(dxa $$0) {
      dxa $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @azl
   public int d() {
      return this.b.size();
   }
}

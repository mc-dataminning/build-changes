import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dul<T extends duh> {
   private static final Logger a = LogUtils.getLogger();
   private final awr<T> b;
   private duu c;

   public dul(Class<T> $$0, duu $$1) {
      this.c = $$1;
      this.b = new awr<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public awm.a a(etk $$0, awm<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cI().c($$0) && $$1.accept($$2).a()) {
            return awm.a.b;
         }
      }

      return awm.a.a;
   }

   public <U extends T> awm.a a(duo<T, U> $$0, etk $$1, awm<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return awm.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cI().c($$1) && $$2.accept($$5).a()) {
               return awm.a.b;
            }
         }

         return awm.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public duu c() {
      return this.c;
   }

   public duu a(duu $$0) {
      duu $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @azc
   public int d() {
      return this.b.size();
   }
}

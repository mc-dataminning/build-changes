import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class duc<T extends dty> {
   private static final Logger a = LogUtils.getLogger();
   private final awo<T> b;
   private dul c;

   public duc(Class<T> $$0, dul $$1) {
      this.c = $$1;
      this.b = new awo<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public awj.a a(eta $$0, awj<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cI().c($$0) && $$1.accept($$2).a()) {
            return awj.a.b;
         }
      }

      return awj.a.a;
   }

   public <U extends T> awj.a a(duf<T, U> $$0, eta $$1, awj<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return awj.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cI().c($$1) && $$2.accept($$5).a()) {
               return awj.a.b;
            }
         }

         return awj.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dul c() {
      return this.c;
   }

   public dul a(dul $$0) {
      dul $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @ayz
   public int d() {
      return this.b.size();
   }
}

import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class djg<T extends djc> {
   private static final Logger a = LogUtils.getLogger();
   private final aqu<T> b;
   private djp c;

   public djg(Class<T> $$0, djp $$1) {
      this.c = $$1;
      this.b = new aqu<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public aqp.a a(ehk $$0, aqp<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cG().c($$0) && $$1.accept($$2).a()) {
            return aqp.a.b;
         }
      }

      return aqp.a.a;
   }

   public <U extends T> aqp.a a(djj<T, U> $$0, ehk $$1, aqp<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return aqp.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cG().c($$1) && $$2.accept($$5).a()) {
               return aqp.a.b;
            }
         }

         return aqp.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public djp c() {
      return this.c;
   }

   public djp a(djp $$0) {
      djp $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @ata
   public int d() {
      return this.b.size();
   }
}

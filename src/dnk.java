import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dnk<T extends dng> {
   private static final Logger a = LogUtils.getLogger();
   private final ati<T> b;
   private dnt c;

   public dnk(Class<T> $$0, dnt $$1) {
      this.c = $$1;
      this.b = new ati<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public atd.a a(elx $$0, atd<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cH().c($$0) && $$1.accept($$2).a()) {
            return atd.a.b;
         }
      }

      return atd.a.a;
   }

   public <U extends T> atd.a a(dnn<T, U> $$0, elx $$1, atd<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return atd.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cH().c($$1) && $$2.accept($$5).a()) {
               return atd.a.b;
            }
         }

         return atd.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dnt c() {
      return this.c;
   }

   public dnt a(dnt $$0) {
      dnt $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @avu
   public int d() {
      return this.b.size();
   }
}

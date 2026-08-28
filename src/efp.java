import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class efp<T extends efl> {
   private static final Logger a = LogUtils.getLogger();
   private final ayh<T> b;
   private ega c;

   public efp(Class<T> $$0, ega $$1) {
      this.c = $$1;
      this.b = new ayh<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public ayb.a a(ffn $$0, ayb<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cR().c($$0) && $$1.accept($$2).a()) {
            return ayb.a.b;
         }
      }

      return ayb.a.a;
   }

   public <U extends T> ayb.a a(efs<T, U> $$0, ffn $$1, ayb<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return ayb.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cR().c($$1) && $$2.accept($$5).a()) {
               return ayb.a.b;
            }
         }

         return ayb.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public ega c() {
      return this.c;
   }

   public ega a(ega $$0) {
      ega $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @baz
   public int d() {
      return this.b.size();
   }
}

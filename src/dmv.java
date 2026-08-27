import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dmv<T extends dmr> {
   private static final Logger a = LogUtils.getLogger();
   private final atb<T> b;
   private dne c;

   public dmv(Class<T> $$0, dne $$1) {
      this.c = $$1;
      this.b = new atb<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public asw.a a(elh $$0, asw<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cH().c($$0) && $$1.accept($$2).a()) {
            return asw.a.b;
         }
      }

      return asw.a.a;
   }

   public <U extends T> asw.a a(dmy<T, U> $$0, elh $$1, asw<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return asw.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cH().c($$1) && $$2.accept($$5).a()) {
               return asw.a.b;
            }
         }

         return asw.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dne c() {
      return this.c;
   }

   public dne a(dne $$0) {
      dne $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @avn
   public int d() {
      return this.b.size();
   }
}

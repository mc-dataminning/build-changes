import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dmk<T extends dmg> {
   private static final Logger a = LogUtils.getLogger();
   private final asr<T> b;
   private dmt c;

   public dmk(Class<T> $$0, dmt $$1) {
      this.c = $$1;
      this.b = new asr<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public asm.a a(ekw $$0, asm<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cH().c($$0) && $$1.accept($$2).a()) {
            return asm.a.b;
         }
      }

      return asm.a.a;
   }

   public <U extends T> asm.a a(dmn<T, U> $$0, ekw $$1, asm<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return asm.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cH().c($$1) && $$2.accept($$5).a()) {
               return asm.a.b;
            }
         }

         return asm.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dmt c() {
      return this.c;
   }

   public dmt a(dmt $$0) {
      dmt $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @avd
   public int d() {
      return this.b.size();
   }
}

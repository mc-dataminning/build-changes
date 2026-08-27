import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dld<T extends dkz> {
   private static final Logger a = LogUtils.getLogger();
   private final asg<T> b;
   private dlm c;

   public dld(Class<T> $$0, dlm $$1) {
      this.c = $$1;
      this.b = new asg<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public asb.a a(ejp $$0, asb<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cH().c($$0) && $$1.accept($$2).a()) {
            return asb.a.b;
         }
      }

      return asb.a.a;
   }

   public <U extends T> asb.a a(dlg<T, U> $$0, ejp $$1, asb<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return asb.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cH().c($$1) && $$2.accept($$5).a()) {
               return asb.a.b;
            }
         }

         return asb.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public dlm c() {
      return this.c;
   }

   public dlm a(dlm $$0) {
      dlm $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @aup
   public int d() {
      return this.b.size();
   }
}

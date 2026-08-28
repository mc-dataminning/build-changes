import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class dvb<T> implements duw<T> {
   private final jo<T> a;
   @Nullable
   private T b;
   private final dux<T> c;

   public dvb(jo<T> $$0, dux<T> $$1, List<T> $$2) {
      this.a = $$0;
      this.c = $$1;
      if ($$2.size() > 0) {
         Validate.isTrue($$2.size() <= 1, "Can't initialize SingleValuePalette with %d values.", (long)$$2.size());
         this.b = $$2.get(0);
      }
   }

   public static <A> duw<A> a(int $$0, jo<A> $$1, dux<A> $$2, List<A> $$3) {
      return new dvb<>($$1, $$2, $$3);
   }

   @Override
   public int a(T $$0) {
      if (this.b != null && this.b != $$0) {
         return this.c.onResize(1, $$0);
      } else {
         this.b = $$0;
         return 0;
      }
   }

   @Override
   public boolean a(Predicate<T> $$0) {
      if (this.b == null) {
         throw new IllegalStateException("Use of an uninitialized palette");
      } else {
         return $$0.test(this.b);
      }
   }

   @Override
   public T a(int $$0) {
      if (this.b != null && $$0 == 0) {
         return this.b;
      } else {
         throw new IllegalStateException("Missing Palette entry for id " + $$0 + ".");
      }
   }

   @Override
   public void a(vr $$0) {
      this.b = this.a.b($$0.l());
   }

   @Override
   public void b(vr $$0) {
      if (this.b == null) {
         throw new IllegalStateException("Use of an uninitialized palette");
      } else {
         $$0.c(this.a.a(this.b));
      }
   }

   @Override
   public int a() {
      if (this.b == null) {
         throw new IllegalStateException("Use of an uninitialized palette");
      } else {
         return wl.a(this.a.a(this.b));
      }
   }

   @Override
   public int b() {
      return 1;
   }

   @Override
   public duw<T> c() {
      if (this.b == null) {
         throw new IllegalStateException("Use of an uninitialized palette");
      } else {
         return this;
      }
   }
}

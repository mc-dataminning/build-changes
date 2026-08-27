import com.mojang.logging.LogUtils;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;

public class ajc {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 254;
   static final awd c = new awd();
   private final ajb d;
   private final ajc.b<?>[] e;
   private boolean f;

   ajc(ajb $$0, ajc.b<?>[] $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static <T> aiy<T> a(Class<? extends ajb> $$0, aiz<T> $$1) {
      if (a.isDebugEnabled()) {
         try {
            Class<?> $$2 = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
            if (!$$2.equals($$0)) {
               a.debug("defineId called for: {} from {}", new Object[]{$$0, $$2, new RuntimeException()});
            }
         } catch (ClassNotFoundException var3) {
         }
      }

      int $$3 = c.c($$0);
      if ($$3 > 254) {
         throw new IllegalArgumentException("Data value id is too big with " + $$3 + "! (Max is 254)");
      } else {
         return $$1.a($$3);
      }
   }

   private <T> ajc.b<T> b(aiy<T> $$0) {
      return (ajc.b<T>)this.e[$$0.a()];
   }

   public <T> T a(aiy<T> $$0) {
      return this.b($$0).b();
   }

   public <T> void a(aiy<T> $$0, T $$1) {
      this.a($$0, $$1, false);
   }

   public <T> void a(aiy<T> $$0, T $$1, boolean $$2) {
      ajc.b<T> $$3 = this.b($$0);
      if ($$2 || ObjectUtils.notEqual($$1, $$3.b())) {
         $$3.a($$1);
         this.d.a($$0);
         $$3.a(true);
         this.f = true;
      }
   }

   public boolean a() {
      return this.f;
   }

   @Nullable
   public List<ajc.c<?>> b() {
      if (!this.f) {
         return null;
      } else {
         this.f = false;
         List<ajc.c<?>> $$0 = new ArrayList<>();

         for (ajc.b<?> $$1 : this.e) {
            if ($$1.c()) {
               $$1.a(false);
               $$0.add($$1.e());
            }
         }

         return $$0;
      }
   }

   @Nullable
   public List<ajc.c<?>> c() {
      List<ajc.c<?>> $$0 = null;

      for (ajc.b<?> $$1 : this.e) {
         if (!$$1.d()) {
            if ($$0 == null) {
               $$0 = new ArrayList<>();
            }

            $$0.add($$1.e());
         }
      }

      return $$0;
   }

   public void a(List<ajc.c<?>> $$0) {
      for (ajc.c<?> $$1 : $$0) {
         ajc.b<?> $$2 = this.e[$$1.a];
         this.a($$2, $$1);
         this.d.a($$2.a());
      }

      this.d.a($$0);
   }

   private <T> void a(ajc.b<T> $$0, ajc.c<?> $$1) {
      if (!Objects.equals($$1.b(), $$0.a.b())) {
         throw new IllegalStateException(
            String.format(
               Locale.ROOT,
               "Invalid entity data item type for field %d on entity %s: old=%s(%s), new=%s(%s)",
               $$0.a.a(),
               this.d,
               $$0.b,
               $$0.b.getClass(),
               $$1.c,
               $$1.c.getClass()
            )
         );
      } else {
         $$0.a((T)$$1.c);
      }
   }

   public static class a {
      private final ajb a;
      private final ajc.b<?>[] b;

      public a(ajb $$0) {
         this.a = $$0;
         this.b = new ajc.b[ajc.c.b($$0.getClass())];
      }

      public <T> ajc.a a(aiy<T> $$0, T $$1) {
         int $$2 = $$0.a();
         if ($$2 > this.b.length) {
            throw new IllegalArgumentException("Data value id is too big with " + $$2 + "! (Max is " + this.b.length + ")");
         } else if (this.b[$$2] != null) {
            throw new IllegalArgumentException("Duplicate id value for " + $$2 + "!");
         } else if (aja.b($$0.b()) < 0) {
            throw new IllegalArgumentException("Unregistered serializer " + $$0.b() + " for " + $$2 + "!");
         } else {
            this.b[$$0.a()] = new ajc.b<>($$0, $$1);
            return this;
         }
      }

      public ajc a() {
         for (int $$0 = 0; $$0 < this.b.length; $$0++) {
            if (this.b[$$0] == null) {
               throw new IllegalStateException("Entity " + this.a.getClass() + " has not defined synched data value " + $$0);
            }
         }

         return new ajc(this.a, this.b);
      }
   }

   public static class b<T> {
      final aiy<T> a;
      T b;
      private final T c;
      private boolean d;

      public b(aiy<T> $$0, T $$1) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$1;
      }

      public aiy<T> a() {
         return this.a;
      }

      public void a(T $$0) {
         this.b = $$0;
      }

      public T b() {
         return this.b;
      }

      public boolean c() {
         return this.d;
      }

      public void a(boolean $$0) {
         this.d = $$0;
      }

      public boolean d() {
         return this.c.equals(this.b);
      }

      public ajc.c<T> e() {
         return ajc.c.a(this.a, this.b);
      }
   }

   public static record c<T>(int a, aiz<T> b, T c) {

      public static <T> ajc.c<T> a(aiy<T> $$0, T $$1) {
         aiz<T> $$2 = $$0.b();
         return new ajc.c<>($$0.a(), $$2, $$2.copy($$1));
      }

      public void a(vr $$0) {
         int $$1 = aja.b(this.b);
         if ($$1 < 0) {
            throw new EncoderException("Unknown serializer type " + this.b);
         } else {
            $$0.k(this.a);
            $$0.c($$1);
            this.b.codec().encode($$0, this.c);
         }
      }

      public static ajc.c<?> a(vr $$0, int $$1) {
         int $$2 = $$0.l();
         aiz<?> $$3 = aja.a($$2);
         if ($$3 == null) {
            throw new DecoderException("Unknown serializer type " + $$2);
         } else {
            return a($$0, $$1, $$3);
         }
      }

      private static <T> ajc.c<T> a(vr $$0, int $$1, aiz<T> $$2) {
         return new ajc.c<>($$1, $$2, $$2.codec().decode($$0));
      }
   }
}

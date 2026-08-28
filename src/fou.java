import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fou extends foj {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fou.b q = $$0 -> $$0.get();
   protected final fou.c r;
   protected final fou.b s;

   public static fou.a a(wp $$0, fou.c $$1) {
      return new fou.a($$0, $$1);
   }

   protected fou(int $$0, int $$1, int $$2, int $$3, wp $$4, fou.c $$5, fou.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xd d() {
      return this.s.createNarrationMessage(() -> super.d());
   }

   @Override
   public void a(fsr $$0) {
      this.c($$0);
   }

   public static class a {
      private final wp a;
      private final fou.c b;
      @Nullable
      private fqf c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fou.b h = fou.q;

      public a(wp $$0, fou.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fou.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fou.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fou.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fou.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fou.a a(@Nullable fqf $$0) {
         this.c = $$0;
         return this;
      }

      public fou.a a(fou.b $$0) {
         this.h = $$0;
         return this;
      }

      public fou a() {
         fou $$0 = new fou(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xd createNarrationMessage(Supplier<xd> var1);
   }

   public interface c {
      void onPress(fou var1);
   }
}

import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fin extends fie {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fin.b q = $$0 -> $$0.get();
   protected final fin.c r;
   protected final fin.b s;

   public static fin.a a(xe $$0, fin.c $$1) {
      return new fin.a($$0, $$1);
   }

   protected fin(int $$0, int $$1, int $$2, int $$3, xe $$4, fin.c $$5, fin.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xs aK_() {
      return this.s.createNarrationMessage(() -> super.aK_());
   }

   @Override
   public void a(fmj $$0) {
      this.c($$0);
   }

   public static class a {
      private final xe a;
      private final fin.c b;
      @Nullable
      private fjy c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fin.b h = fin.q;

      public a(xe $$0, fin.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fin.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fin.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fin.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fin.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fin.a a(@Nullable fjy $$0) {
         this.c = $$0;
         return this;
      }

      public fin.a a(fin.b $$0) {
         this.h = $$0;
         return this;
      }

      public fin a() {
         fin $$0 = new fin(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xs createNarrationMessage(Supplier<xs> var1);
   }

   public interface c {
      void onPress(fin var1);
   }
}

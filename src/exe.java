import java.util.function.Supplier;
import javax.annotation.Nullable;

public class exe extends ewv {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 20;
   public static final int o = 8;
   protected static final exe.b p = $$0 -> $$0.get();
   protected final exe.c q;
   protected final exe.b r;

   public static exe.a a(vf $$0, exe.c $$1) {
      return new exe.a($$0, $$1);
   }

   protected exe(int $$0, int $$1, int $$2, int $$3, vf $$4, exe.c $$5, exe.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.q = $$5;
      this.r = $$6;
   }

   @Override
   public void b() {
      this.q.onPress(this);
   }

   @Override
   protected vt aK_() {
      return this.r.createNarrationMessage(() -> super.aK_());
   }

   @Override
   public void a(fax $$0) {
      this.c($$0);
   }

   public static class a {
      private final vf a;
      private final exe.c b;
      @Nullable
      private eyp c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private exe.b h = exe.p;

      public a(vf $$0, exe.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public exe.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public exe.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public exe.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public exe.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public exe.a a(@Nullable eyp $$0) {
         this.c = $$0;
         return this;
      }

      public exe.a a(exe.b $$0) {
         this.h = $$0;
         return this;
      }

      public exe a() {
         exe $$0 = new exe(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      vt createNarrationMessage(Supplier<vt> var1);
   }

   public interface c {
      void onPress(exe var1);
   }
}

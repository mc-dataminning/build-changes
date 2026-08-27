import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ezo extends ezf {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 20;
   public static final int o = 8;
   protected static final ezo.b p = $$0 -> $$0.get();
   protected final ezo.c q;
   protected final ezo.b r;

   public static ezo.a a(vq $$0, ezo.c $$1) {
      return new ezo.a($$0, $$1);
   }

   protected ezo(int $$0, int $$1, int $$2, int $$3, vq $$4, ezo.c $$5, ezo.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.q = $$5;
      this.r = $$6;
   }

   @Override
   public void b() {
      this.q.onPress(this);
   }

   @Override
   protected we aN_() {
      return this.r.createNarrationMessage(() -> super.aN_());
   }

   @Override
   public void a(fdj $$0) {
      this.c($$0);
   }

   public static class a {
      private final vq a;
      private final ezo.c b;
      @Nullable
      private faz c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private ezo.b h = ezo.p;

      public a(vq $$0, ezo.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ezo.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public ezo.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public ezo.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public ezo.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public ezo.a a(@Nullable faz $$0) {
         this.c = $$0;
         return this;
      }

      public ezo.a a(ezo.b $$0) {
         this.h = $$0;
         return this;
      }

      public ezo a() {
         ezo $$0 = new ezo(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      we createNarrationMessage(Supplier<we> var1);
   }

   public interface c {
      void onPress(ezo var1);
   }
}

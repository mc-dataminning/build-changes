import java.util.function.Supplier;
import javax.annotation.Nullable;

public class euz extends eur {
   public static final int l = 120;
   public static final int m = 150;
   public static final int n = 20;
   public static final int o = 8;
   protected static final euz.b p = $$0 -> $$0.get();
   protected final euz.c q;
   protected final euz.b r;

   public static euz.a a(ur $$0, euz.c $$1) {
      return new euz.a($$0, $$1);
   }

   protected euz(int $$0, int $$1, int $$2, int $$3, ur $$4, euz.c $$5, euz.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.q = $$5;
      this.r = $$6;
   }

   @Override
   public void b() {
      this.q.onPress(this);
   }

   @Override
   protected vf aM_() {
      return this.r.createNarrationMessage(() -> super.aM_());
   }

   @Override
   public void a(eys $$0) {
      this.c($$0);
   }

   public static class a {
      private final ur a;
      private final euz.c b;
      @Nullable
      private ewk c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private euz.b h = euz.p;

      public a(ur $$0, euz.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public euz.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public euz.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public euz.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public euz.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public euz.a a(@Nullable ewk $$0) {
         this.c = $$0;
         return this;
      }

      public euz.a a(euz.b $$0) {
         this.h = $$0;
         return this;
      }

      public euz a() {
         euz $$0 = new euz(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      vf createNarrationMessage(Supplier<vf> var1);
   }

   public interface c {
      void onPress(euz var1);
   }
}

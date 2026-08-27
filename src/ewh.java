import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ewh extends evz {
   public static final int l = 120;
   public static final int m = 150;
   public static final int n = 20;
   public static final int o = 8;
   protected static final ewh.b p = $$0 -> $$0.get();
   protected final ewh.c q;
   protected final ewh.b r;

   public static ewh.a a(vb $$0, ewh.c $$1) {
      return new ewh.a($$0, $$1);
   }

   protected ewh(int $$0, int $$1, int $$2, int $$3, vb $$4, ewh.c $$5, ewh.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.q = $$5;
      this.r = $$6;
   }

   @Override
   public void b() {
      this.q.onPress(this);
   }

   @Override
   protected vp aM_() {
      return this.r.createNarrationMessage(() -> super.aM_());
   }

   @Override
   public void a(faa $$0) {
      this.c($$0);
   }

   public static class a {
      private final vb a;
      private final ewh.c b;
      @Nullable
      private exs c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private ewh.b h = ewh.p;

      public a(vb $$0, ewh.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ewh.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public ewh.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public ewh.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public ewh.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public ewh.a a(@Nullable exs $$0) {
         this.c = $$0;
         return this;
      }

      public ewh.a a(ewh.b $$0) {
         this.h = $$0;
         return this;
      }

      public ewh a() {
         ewh $$0 = new ewh(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      vp createNarrationMessage(Supplier<vp> var1);
   }

   public interface c {
      void onPress(ewh var1);
   }
}

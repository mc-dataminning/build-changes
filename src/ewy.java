import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ewy extends ewp {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 20;
   public static final int o = 8;
   protected static final ewy.b p = $$0 -> $$0.get();
   protected final ewy.c q;
   protected final ewy.b r;

   public static ewy.a a(vd $$0, ewy.c $$1) {
      return new ewy.a($$0, $$1);
   }

   protected ewy(int $$0, int $$1, int $$2, int $$3, vd $$4, ewy.c $$5, ewy.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.q = $$5;
      this.r = $$6;
   }

   @Override
   public void b() {
      this.q.onPress(this);
   }

   @Override
   protected vr aK_() {
      return this.r.createNarrationMessage(() -> super.aK_());
   }

   @Override
   public void a(far $$0) {
      this.c($$0);
   }

   public static class a {
      private final vd a;
      private final ewy.c b;
      @Nullable
      private eyj c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private ewy.b h = ewy.p;

      public a(vd $$0, ewy.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ewy.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public ewy.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public ewy.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public ewy.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public ewy.a a(@Nullable eyj $$0) {
         this.c = $$0;
         return this;
      }

      public ewy.a a(ewy.b $$0) {
         this.h = $$0;
         return this;
      }

      public ewy a() {
         ewy $$0 = new ewy(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      vr createNarrationMessage(Supplier<vr> var1);
   }

   public interface c {
      void onPress(ewy var1);
   }
}

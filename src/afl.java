import java.util.function.Function;
import javax.annotation.Nullable;

public class afl implements xx<aes> {
   public static final xo<uq, afl> a = xx.a(afl::a, afl::new);
   private final int b;
   private final afl.a c;
   private final boolean d;
   static final afl.a e = new afl.a() {
      @Override
      public afl.b a() {
         return afl.b.b;
      }

      @Override
      public void a(afl.c $$0) {
         $$0.a();
      }

      @Override
      public void a(uq $$0) {
      }
   };

   private afl(int $$0, boolean $$1, afl.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static afl a(bno $$0, boolean $$1) {
      return new afl($$0.aj(), $$1, e);
   }

   public static afl a(bno $$0, boolean $$1, blt $$2) {
      return new afl($$0.aj(), $$1, new afl.d($$2));
   }

   public static afl a(bno $$0, boolean $$1, blt $$2, ens $$3) {
      return new afl($$0.aj(), $$1, new afl.e($$2, $$3));
   }

   private afl(uq $$0) {
      this.b = $$0.n();
      afl.b $$1 = $$0.b(afl.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(uq $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public xz<afl> a() {
      return aeq.bu;
   }

   public void a(aes $$0) {
      $$0.a(this);
   }

   @Nullable
   public bno a(aov $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(afl.c $$0) {
      this.c.a($$0);
   }

   interface a {
      afl.b a();

      void a(afl.c var1);

      void a(uq var1);
   }

   static enum b {
      a(afl.d::new),
      b($$0 -> afl.e),
      c(afl.e::new);

      final Function<uq, afl.a> d;

      private b(Function<uq, afl.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(blt var1);

      void a(blt var1, ens var2);

      void a();
   }

   static class d implements afl.a {
      private final blt a;

      d(blt $$0) {
         this.a = $$0;
      }

      private d(uq $$0) {
         this.a = $$0.b(blt.class);
      }

      @Override
      public afl.b a() {
         return afl.b.a;
      }

      @Override
      public void a(afl.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(uq $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements afl.a {
      private final blt a;
      private final ens b;

      e(blt $$0, ens $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(uq $$0) {
         this.b = new ens((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(blt.class);
      }

      @Override
      public afl.b a() {
         return afl.b.c;
      }

      @Override
      public void a(afl.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(uq $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}

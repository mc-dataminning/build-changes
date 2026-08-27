import java.util.function.Function;
import javax.annotation.Nullable;

public class agh implements yp<afn> {
   public static final yg<vi, agh> a = yp.a(agh::a, agh::new);
   private final int b;
   private final agh.a c;
   private final boolean d;
   static final agh.a e = new agh.a() {
      @Override
      public agh.b a() {
         return agh.b.b;
      }

      @Override
      public void a(agh.c $$0) {
         $$0.a();
      }

      @Override
      public void a(vi $$0) {
      }
   };

   private agh(int $$0, boolean $$1, agh.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static agh a(bqa $$0, boolean $$1) {
      return new agh($$0.aj(), $$1, e);
   }

   public static agh a(bqa $$0, boolean $$1, boe $$2) {
      return new agh($$0.aj(), $$1, new agh.d($$2));
   }

   public static agh a(bqa $$0, boolean $$1, boe $$2, esj $$3) {
      return new agh($$0.aj(), $$1, new agh.e($$2, $$3));
   }

   private agh(vi $$0) {
      this.b = $$0.l();
      agh.b $$1 = $$0.b(agh.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(vi $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public yr<agh> a() {
      return afl.bw;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   @Nullable
   public bqa a(apu $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(agh.c $$0) {
      this.c.a($$0);
   }

   interface a {
      agh.b a();

      void a(agh.c var1);

      void a(vi var1);
   }

   static enum b {
      a(agh.d::new),
      b($$0 -> agh.e),
      c(agh.e::new);

      final Function<vi, agh.a> d;

      private b(Function<vi, agh.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(boe var1);

      void a(boe var1, esj var2);

      void a();
   }

   static class d implements agh.a {
      private final boe a;

      d(boe $$0) {
         this.a = $$0;
      }

      private d(vi $$0) {
         this.a = $$0.b(boe.class);
      }

      @Override
      public agh.b a() {
         return agh.b.a;
      }

      @Override
      public void a(agh.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(vi $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements agh.a {
      private final boe a;
      private final esj b;

      e(boe $$0, esj $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(vi $$0) {
         this.b = new esj((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(boe.class);
      }

      @Override
      public agh.b a() {
         return agh.b.c;
      }

      @Override
      public void a(agh.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(vi $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}

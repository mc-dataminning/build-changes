import java.util.function.Function;
import javax.annotation.Nullable;

public class ahn implements zs<ags> {
   public static final zj<wl, ahn> a = zs.a(ahn::a, ahn::new);
   private final int b;
   private final ahn.a c;
   private final boolean d;
   static final ahn.a e = new ahn.a() {
      @Override
      public ahn.b a() {
         return ahn.b.b;
      }

      @Override
      public void a(ahn.c $$0) {
         $$0.a();
      }

      @Override
      public void a(wl $$0) {
      }
   };

   private ahn(int $$0, boolean $$1, ahn.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahn a(bsp $$0, boolean $$1) {
      return new ahn($$0.al(), $$1, e);
   }

   public static ahn a(bsp $$0, boolean $$1, bqo $$2) {
      return new ahn($$0.al(), $$1, new ahn.d($$2));
   }

   public static ahn a(bsp $$0, boolean $$1, bqo $$2, evm $$3) {
      return new ahn($$0.al(), $$1, new ahn.e($$2, $$3));
   }

   private ahn(wl $$0) {
      this.b = $$0.l();
      ahn.b $$1 = $$0.b(ahn.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zu<ahn> a() {
      return agq.by;
   }

   public void a(ags $$0) {
      $$0.a(this);
   }

   @Nullable
   public bsp a(arb $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(ahn.c $$0) {
      this.c.a($$0);
   }

   interface a {
      ahn.b a();

      void a(ahn.c var1);

      void a(wl var1);
   }

   static enum b {
      a(ahn.d::new),
      b($$0 -> ahn.e),
      c(ahn.e::new);

      final Function<wl, ahn.a> d;

      private b(final Function<wl, ahn.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bqo var1);

      void a(bqo var1, evm var2);

      void a();
   }

   static class d implements ahn.a {
      private final bqo a;

      d(bqo $$0) {
         this.a = $$0;
      }

      private d(wl $$0) {
         this.a = $$0.b(bqo.class);
      }

      @Override
      public ahn.b a() {
         return ahn.b.a;
      }

      @Override
      public void a(ahn.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(wl $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahn.a {
      private final bqo a;
      private final evm b;

      e(bqo $$0, evm $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(wl $$0) {
         this.b = new evm((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bqo.class);
      }

      @Override
      public ahn.b a() {
         return ahn.b.c;
      }

      @Override
      public void a(ahn.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(wl $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}

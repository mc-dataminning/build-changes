import java.util.function.Function;
import javax.annotation.Nullable;

public class ahn implements zh<agr> {
   public static final yy<vw, ahn> a = zh.a(ahn::a, ahn::new);
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
      public void a(vw $$0) {
      }
   };

   private ahn(int $$0, boolean $$1, ahn.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahn a(bwt $$0, boolean $$1) {
      return new ahn($$0.ao(), $$1, e);
   }

   public static ahn a(bwt $$0, boolean $$1, buq $$2) {
      return new ahn($$0.ao(), $$1, new ahn.d($$2));
   }

   public static ahn a(bwt $$0, boolean $$1, buq $$2, ffq $$3) {
      return new ahn($$0.ao(), $$1, new ahn.e($$2, $$3));
   }

   private ahn(vw $$0) {
      this.b = $$0.l();
      ahn.b $$1 = $$0.b(ahn.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zj<ahn> a() {
      return agp.bF;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   @Nullable
   public bwt a(ars $$0) {
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

      void a(vw var1);
   }

   static enum b {
      a(ahn.d::new),
      b($$0 -> ahn.e),
      c(ahn.e::new);

      final Function<vw, ahn.a> d;

      private b(final Function<vw, ahn.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(buq var1);

      void a(buq var1, ffq var2);

      void a();
   }

   static class d implements ahn.a {
      private final buq a;

      d(buq $$0) {
         this.a = $$0;
      }

      private d(vw $$0) {
         this.a = $$0.b(buq.class);
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
      public void a(vw $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahn.a {
      private final buq a;
      private final ffq b;

      e(buq $$0, ffq $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(vw $$0) {
         this.b = new ffq((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(buq.class);
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
      public void a(vw $$0) {
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a((float)this.b.f);
         $$0.a(this.a);
      }
   }
}

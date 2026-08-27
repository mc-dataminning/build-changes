import java.util.function.Function;
import javax.annotation.Nullable;

public class agr implements yz<afx> {
   public static final yq<vs, agr> a = yz.a(agr::a, agr::new);
   private final int b;
   private final agr.a c;
   private final boolean d;
   static final agr.a e = new agr.a() {
      @Override
      public agr.b a() {
         return agr.b.b;
      }

      @Override
      public void a(agr.c $$0) {
         $$0.a();
      }

      @Override
      public void a(vs $$0) {
      }
   };

   private agr(int $$0, boolean $$1, agr.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static agr a(bql $$0, boolean $$1) {
      return new agr($$0.aj(), $$1, e);
   }

   public static agr a(bql $$0, boolean $$1, bop $$2) {
      return new agr($$0.aj(), $$1, new agr.d($$2));
   }

   public static agr a(bql $$0, boolean $$1, bop $$2, etf $$3) {
      return new agr($$0.aj(), $$1, new agr.e($$2, $$3));
   }

   private agr(vs $$0) {
      this.b = $$0.l();
      agr.b $$1 = $$0.b(agr.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zb<agr> a() {
      return afv.bw;
   }

   public void a(afx $$0) {
      $$0.a(this);
   }

   @Nullable
   public bql a(aqe $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(agr.c $$0) {
      this.c.a($$0);
   }

   interface a {
      agr.b a();

      void a(agr.c var1);

      void a(vs var1);
   }

   static enum b {
      a(agr.d::new),
      b($$0 -> agr.e),
      c(agr.e::new);

      final Function<vs, agr.a> d;

      private b(Function<vs, agr.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bop var1);

      void a(bop var1, etf var2);

      void a();
   }

   static class d implements agr.a {
      private final bop a;

      d(bop $$0) {
         this.a = $$0;
      }

      private d(vs $$0) {
         this.a = $$0.b(bop.class);
      }

      @Override
      public agr.b a() {
         return agr.b.a;
      }

      @Override
      public void a(agr.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(vs $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements agr.a {
      private final bop a;
      private final etf b;

      e(bop $$0, etf $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(vs $$0) {
         this.b = new etf((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bop.class);
      }

      @Override
      public agr.b a() {
         return agr.b.c;
      }

      @Override
      public void a(agr.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(vs $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}

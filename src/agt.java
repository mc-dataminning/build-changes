import java.util.function.Function;
import javax.annotation.Nullable;

public class agt implements zb<afz> {
   public static final ys<vu, agt> a = zb.a(agt::a, agt::new);
   private final int b;
   private final agt.a c;
   private final boolean d;
   static final agt.a e = new agt.a() {
      @Override
      public agt.b a() {
         return agt.b.b;
      }

      @Override
      public void a(agt.c $$0) {
         $$0.a();
      }

      @Override
      public void a(vu $$0) {
      }
   };

   private agt(int $$0, boolean $$1, agt.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static agt a(brh $$0, boolean $$1) {
      return new agt($$0.aj(), $$1, e);
   }

   public static agt a(brh $$0, boolean $$1, bpl $$2) {
      return new agt($$0.aj(), $$1, new agt.d($$2));
   }

   public static agt a(brh $$0, boolean $$1, bpl $$2, etp $$3) {
      return new agt($$0.aj(), $$1, new agt.e($$2, $$3));
   }

   private agt(vu $$0) {
      this.b = $$0.l();
      agt.b $$1 = $$0.b(agt.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zd<agt> a() {
      return afx.bw;
   }

   public void a(afz $$0) {
      $$0.a(this);
   }

   @Nullable
   public brh a(aqh $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(agt.c $$0) {
      this.c.a($$0);
   }

   interface a {
      agt.b a();

      void a(agt.c var1);

      void a(vu var1);
   }

   static enum b {
      a(agt.d::new),
      b($$0 -> agt.e),
      c(agt.e::new);

      final Function<vu, agt.a> d;

      private b(Function<vu, agt.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bpl var1);

      void a(bpl var1, etp var2);

      void a();
   }

   static class d implements agt.a {
      private final bpl a;

      d(bpl $$0) {
         this.a = $$0;
      }

      private d(vu $$0) {
         this.a = $$0.b(bpl.class);
      }

      @Override
      public agt.b a() {
         return agt.b.a;
      }

      @Override
      public void a(agt.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(vu $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements agt.a {
      private final bpl a;
      private final etp b;

      e(bpl $$0, etp $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(vu $$0) {
         this.b = new etp((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bpl.class);
      }

      @Override
      public agt.b a() {
         return agt.b.c;
      }

      @Override
      public void a(agt.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(vu $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}

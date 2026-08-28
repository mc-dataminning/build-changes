import java.util.function.Function;
import javax.annotation.Nullable;

public class ahr implements zp<agv> {
   public static final zg<wf, ahr> a = zp.a(ahr::a, ahr::new);
   private final int b;
   private final ahr.a c;
   private final boolean d;
   static final ahr.a e = new ahr.a() {
      @Override
      public ahr.b a() {
         return ahr.b.b;
      }

      @Override
      public void a(ahr.c $$0) {
         $$0.a();
      }

      @Override
      public void a(wf $$0) {
      }
   };

   private ahr(int $$0, boolean $$1, ahr.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahr a(bue $$0, boolean $$1) {
      return new ahr($$0.as(), $$1, e);
   }

   public static ahr a(bue $$0, boolean $$1, bsc $$2) {
      return new ahr($$0.as(), $$1, new ahr.d($$2));
   }

   public static ahr a(bue $$0, boolean $$1, bsc $$2, ezn $$3) {
      return new ahr($$0.as(), $$1, new ahr.e($$2, $$3));
   }

   private ahr(wf $$0) {
      this.b = $$0.l();
      ahr.b $$1 = $$0.b(ahr.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zr<ahr> a() {
      return agt.bB;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   @Nullable
   public bue a(arn $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(ahr.c $$0) {
      this.c.a($$0);
   }

   interface a {
      ahr.b a();

      void a(ahr.c var1);

      void a(wf var1);
   }

   static enum b {
      a(ahr.d::new),
      b($$0 -> ahr.e),
      c(ahr.e::new);

      final Function<wf, ahr.a> d;

      private b(final Function<wf, ahr.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bsc var1);

      void a(bsc var1, ezn var2);

      void a();
   }

   static class d implements ahr.a {
      private final bsc a;

      d(bsc $$0) {
         this.a = $$0;
      }

      private d(wf $$0) {
         this.a = $$0.b(bsc.class);
      }

      @Override
      public ahr.b a() {
         return ahr.b.a;
      }

      @Override
      public void a(ahr.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(wf $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahr.a {
      private final bsc a;
      private final ezn b;

      e(bsc $$0, ezn $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(wf $$0) {
         this.b = new ezn((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bsc.class);
      }

      @Override
      public ahr.b a() {
         return ahr.b.c;
      }

      @Override
      public void a(ahr.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(wf $$0) {
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a((float)this.b.f);
         $$0.a(this.a);
      }
   }
}

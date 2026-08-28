import java.util.function.Function;
import javax.annotation.Nullable;

public class ahr implements zw<agw> {
   public static final zn<wm, ahr> a = zw.a(ahr::a, ahr::new);
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
      public void a(wm $$0) {
      }
   };

   private ahr(int $$0, boolean $$1, ahr.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahr a(bsw $$0, boolean $$1) {
      return new ahr($$0.al(), $$1, e);
   }

   public static ahr a(bsw $$0, boolean $$1, bqv $$2) {
      return new ahr($$0.al(), $$1, new ahr.d($$2));
   }

   public static ahr a(bsw $$0, boolean $$1, bqv $$2, evt $$3) {
      return new ahr($$0.al(), $$1, new ahr.e($$2, $$3));
   }

   private ahr(wm $$0) {
      this.b = $$0.l();
      ahr.b $$1 = $$0.b(ahr.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(wm $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zy<ahr> a() {
      return agu.by;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   @Nullable
   public bsw a(arf $$0) {
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

      void a(wm var1);
   }

   static enum b {
      a(ahr.d::new),
      b($$0 -> ahr.e),
      c(ahr.e::new);

      final Function<wm, ahr.a> d;

      private b(final Function<wm, ahr.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bqv var1);

      void a(bqv var1, evt var2);

      void a();
   }

   static class d implements ahr.a {
      private final bqv a;

      d(bqv $$0) {
         this.a = $$0;
      }

      private d(wm $$0) {
         this.a = $$0.b(bqv.class);
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
      public void a(wm $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahr.a {
      private final bqv a;
      private final evt b;

      e(bqv $$0, evt $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(wm $$0) {
         this.b = new evt((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bqv.class);
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
      public void a(wm $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}

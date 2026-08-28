import java.util.function.Function;
import javax.annotation.Nullable;

public class ahq implements zo<agu> {
   public static final zf<we, ahq> a = zo.a(ahq::a, ahq::new);
   private final int b;
   private final ahq.a c;
   private final boolean d;
   static final ahq.a e = new ahq.a() {
      @Override
      public ahq.b a() {
         return ahq.b.b;
      }

      @Override
      public void a(ahq.c $$0) {
         $$0.a();
      }

      @Override
      public void a(we $$0) {
      }
   };

   private ahq(int $$0, boolean $$1, ahq.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahq a(btz $$0, boolean $$1) {
      return new ahq($$0.ar(), $$1, e);
   }

   public static ahq a(btz $$0, boolean $$1, brx $$2) {
      return new ahq($$0.ar(), $$1, new ahq.d($$2));
   }

   public static ahq a(btz $$0, boolean $$1, brx $$2, ezh $$3) {
      return new ahq($$0.ar(), $$1, new ahq.e($$2, $$3));
   }

   private ahq(we $$0) {
      this.b = $$0.l();
      ahq.b $$1 = $$0.b(ahq.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zq<ahq> a() {
      return ags.bB;
   }

   public void a(agu $$0) {
      $$0.a(this);
   }

   @Nullable
   public btz a(arm $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(ahq.c $$0) {
      this.c.a($$0);
   }

   interface a {
      ahq.b a();

      void a(ahq.c var1);

      void a(we var1);
   }

   static enum b {
      a(ahq.d::new),
      b($$0 -> ahq.e),
      c(ahq.e::new);

      final Function<we, ahq.a> d;

      private b(final Function<we, ahq.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(brx var1);

      void a(brx var1, ezh var2);

      void a();
   }

   static class d implements ahq.a {
      private final brx a;

      d(brx $$0) {
         this.a = $$0;
      }

      private d(we $$0) {
         this.a = $$0.b(brx.class);
      }

      @Override
      public ahq.b a() {
         return ahq.b.a;
      }

      @Override
      public void a(ahq.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(we $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahq.a {
      private final brx a;
      private final ezh b;

      e(brx $$0, ezh $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(we $$0) {
         this.b = new ezh((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(brx.class);
      }

      @Override
      public ahq.b a() {
         return ahq.b.c;
      }

      @Override
      public void a(ahq.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(we $$0) {
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a((float)this.b.f);
         $$0.a(this.a);
      }
   }
}

import java.util.function.Function;
import javax.annotation.Nullable;

public class ahj implements zd<agn> {
   public static final yu<vs, ahj> a = zd.a(ahj::a, ahj::new);
   private final int b;
   private final ahj.a c;
   private final boolean d;
   static final ahj.a e = new ahj.a() {
      @Override
      public ahj.b a() {
         return ahj.b.b;
      }

      @Override
      public void a(ahj.c $$0) {
         $$0.a();
      }

      @Override
      public void a(vs $$0) {
      }
   };

   private ahj(int $$0, boolean $$1, ahj.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahj a(bwa $$0, boolean $$1) {
      return new ahj($$0.ar(), $$1, e);
   }

   public static ahj a(bwa $$0, boolean $$1, btx $$2) {
      return new ahj($$0.ar(), $$1, new ahj.d($$2));
   }

   public static ahj a(bwa $$0, boolean $$1, btx $$2, fdw $$3) {
      return new ahj($$0.ar(), $$1, new ahj.e($$2, $$3));
   }

   private ahj(vs $$0) {
      this.b = $$0.l();
      ahj.b $$1 = $$0.b(ahj.b.class);
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
   public zf<ahj> a() {
      return agl.bF;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   @Nullable
   public bwa a(aro $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(ahj.c $$0) {
      this.c.a($$0);
   }

   interface a {
      ahj.b a();

      void a(ahj.c var1);

      void a(vs var1);
   }

   static enum b {
      a(ahj.d::new),
      b($$0 -> ahj.e),
      c(ahj.e::new);

      final Function<vs, ahj.a> d;

      private b(final Function<vs, ahj.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(btx var1);

      void a(btx var1, fdw var2);

      void a();
   }

   static class d implements ahj.a {
      private final btx a;

      d(btx $$0) {
         this.a = $$0;
      }

      private d(vs $$0) {
         this.a = $$0.b(btx.class);
      }

      @Override
      public ahj.b a() {
         return ahj.b.a;
      }

      @Override
      public void a(ahj.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(vs $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahj.a {
      private final btx a;
      private final fdw b;

      e(btx $$0, fdw $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(vs $$0) {
         this.b = new fdw((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(btx.class);
      }

      @Override
      public ahj.b a() {
         return ahj.b.c;
      }

      @Override
      public void a(ahj.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(vs $$0) {
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a((float)this.b.f);
         $$0.a(this.a);
      }
   }
}

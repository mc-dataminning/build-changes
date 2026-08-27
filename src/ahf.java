import java.util.function.Function;
import javax.annotation.Nullable;

public class ahf implements zl<agl> {
   public static final zc<we, ahf> a = zl.a(ahf::a, ahf::new);
   private final int b;
   private final ahf.a c;
   private final boolean d;
   static final ahf.a e = new ahf.a() {
      @Override
      public ahf.b a() {
         return ahf.b.b;
      }

      @Override
      public void a(ahf.c $$0) {
         $$0.a();
      }

      @Override
      public void a(we $$0) {
      }
   };

   private ahf(int $$0, boolean $$1, ahf.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahf a(brv $$0, boolean $$1) {
      return new ahf($$0.al(), $$1, e);
   }

   public static ahf a(brv $$0, boolean $$1, bpz $$2) {
      return new ahf($$0.al(), $$1, new ahf.d($$2));
   }

   public static ahf a(brv $$0, boolean $$1, bpz $$2, ewu $$3) {
      return new ahf($$0.al(), $$1, new ahf.e($$2, $$3));
   }

   private ahf(we $$0) {
      this.b = $$0.l();
      ahf.b $$1 = $$0.b(ahf.b.class);
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
   public zn<ahf> a() {
      return agj.by;
   }

   public void a(agl $$0) {
      $$0.a(this);
   }

   @Nullable
   public brv a(aqt $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(ahf.c $$0) {
      this.c.a($$0);
   }

   interface a {
      ahf.b a();

      void a(ahf.c var1);

      void a(we var1);
   }

   static enum b {
      a(ahf.d::new),
      b($$0 -> ahf.e),
      c(ahf.e::new);

      final Function<we, ahf.a> d;

      private b(Function<we, ahf.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bpz var1);

      void a(bpz var1, ewu var2);

      void a();
   }

   static class d implements ahf.a {
      private final bpz a;

      d(bpz $$0) {
         this.a = $$0;
      }

      private d(we $$0) {
         this.a = $$0.b(bpz.class);
      }

      @Override
      public ahf.b a() {
         return ahf.b.a;
      }

      @Override
      public void a(ahf.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(we $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahf.a {
      private final bpz a;
      private final ewu b;

      e(bpz $$0, ewu $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(we $$0) {
         this.b = new ewu((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bpz.class);
      }

      @Override
      public ahf.b a() {
         return ahf.b.c;
      }

      @Override
      public void a(ahf.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(we $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}

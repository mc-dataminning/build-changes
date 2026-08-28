import java.util.function.Function;
import javax.annotation.Nullable;

public class agw implements zb<agb> {
   public static final ys<vr, agw> a = zb.a(agw::a, agw::new);
   private final int b;
   private final agw.a c;
   private final boolean d;
   static final agw.a e = new agw.a() {
      @Override
      public agw.b a() {
         return agw.b.b;
      }

      @Override
      public void a(agw.c $$0) {
         $$0.a();
      }

      @Override
      public void a(vr $$0) {
      }
   };

   private agw(int $$0, boolean $$1, agw.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static agw a(bsd $$0, boolean $$1) {
      return new agw($$0.al(), $$1, e);
   }

   public static agw a(bsd $$0, boolean $$1, bqc $$2) {
      return new agw($$0.al(), $$1, new agw.d($$2));
   }

   public static agw a(bsd $$0, boolean $$1, bqc $$2, evz $$3) {
      return new agw($$0.al(), $$1, new agw.e($$2, $$3));
   }

   private agw(vr $$0) {
      this.b = $$0.l();
      agw.b $$1 = $$0.b(agw.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zd<agw> a() {
      return afz.by;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   @Nullable
   public bsd a(aqk $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(agw.c $$0) {
      this.c.a($$0);
   }

   interface a {
      agw.b a();

      void a(agw.c var1);

      void a(vr var1);
   }

   static enum b {
      a(agw.d::new),
      b($$0 -> agw.e),
      c(agw.e::new);

      final Function<vr, agw.a> d;

      private b(final Function<vr, agw.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bqc var1);

      void a(bqc var1, evz var2);

      void a();
   }

   static class d implements agw.a {
      private final bqc a;

      d(bqc $$0) {
         this.a = $$0;
      }

      private d(vr $$0) {
         this.a = $$0.b(bqc.class);
      }

      @Override
      public agw.b a() {
         return agw.b.a;
      }

      @Override
      public void a(agw.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(vr $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements agw.a {
      private final bqc a;
      private final evz b;

      e(bqc $$0, evz $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(vr $$0) {
         this.b = new evz((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bqc.class);
      }

      @Override
      public agw.b a() {
         return agw.b.c;
      }

      @Override
      public void a(agw.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(vr $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}

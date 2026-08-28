import java.util.function.Function;
import javax.annotation.Nullable;

public class ahm implements zk<agq> {
   public static final zb<wa, ahm> a = zk.a(ahm::a, ahm::new);
   private final int b;
   private final ahm.a c;
   private final boolean d;
   static final ahm.a e = new ahm.a() {
      @Override
      public ahm.b a() {
         return ahm.b.b;
      }

      @Override
      public void a(ahm.c $$0) {
         $$0.a();
      }

      @Override
      public void a(wa $$0) {
      }
   };

   private ahm(int $$0, boolean $$1, ahm.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahm a(bto $$0, boolean $$1) {
      return new ahm($$0.ap(), $$1, e);
   }

   public static ahm a(bto $$0, boolean $$1, bro $$2) {
      return new ahm($$0.ap(), $$1, new ahm.d($$2));
   }

   public static ahm a(bto $$0, boolean $$1, bro $$2, eys $$3) {
      return new ahm($$0.ap(), $$1, new ahm.e($$2, $$3));
   }

   private ahm(wa $$0) {
      this.b = $$0.l();
      ahm.b $$1 = $$0.b(ahm.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(wa $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zm<ahm> a() {
      return ago.bB;
   }

   public void a(agq $$0) {
      $$0.a(this);
   }

   @Nullable
   public bto a(arh $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(ahm.c $$0) {
      this.c.a($$0);
   }

   interface a {
      ahm.b a();

      void a(ahm.c var1);

      void a(wa var1);
   }

   static enum b {
      a(ahm.d::new),
      b($$0 -> ahm.e),
      c(ahm.e::new);

      final Function<wa, ahm.a> d;

      private b(final Function<wa, ahm.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bro var1);

      void a(bro var1, eys var2);

      void a();
   }

   static class d implements ahm.a {
      private final bro a;

      d(bro $$0) {
         this.a = $$0;
      }

      private d(wa $$0) {
         this.a = $$0.b(bro.class);
      }

      @Override
      public ahm.b a() {
         return ahm.b.a;
      }

      @Override
      public void a(ahm.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(wa $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahm.a {
      private final bro a;
      private final eys b;

      e(bro $$0, eys $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(wa $$0) {
         this.b = new eys((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bro.class);
      }

      @Override
      public ahm.b a() {
         return ahm.b.c;
      }

      @Override
      public void a(ahm.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(wa $$0) {
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a((float)this.b.f);
         $$0.a(this.a);
      }
   }
}

import java.util.function.Function;
import javax.annotation.Nullable;

public class ahs implements zq<agw> {
   public static final zh<wg, ahs> a = zq.a(ahs::a, ahs::new);
   private final int b;
   private final ahs.a c;
   private final boolean d;
   static final ahs.a e = new ahs.a() {
      @Override
      public ahs.b a() {
         return ahs.b.b;
      }

      @Override
      public void a(ahs.c $$0) {
         $$0.a();
      }

      @Override
      public void a(wg $$0) {
      }
   };

   private ahs(int $$0, boolean $$1, ahs.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahs a(bul $$0, boolean $$1) {
      return new ahs($$0.ar(), $$1, e);
   }

   public static ahs a(bul $$0, boolean $$1, bsj $$2) {
      return new ahs($$0.ar(), $$1, new ahs.d($$2));
   }

   public static ahs a(bul $$0, boolean $$1, bsj $$2, ezy $$3) {
      return new ahs($$0.ar(), $$1, new ahs.e($$2, $$3));
   }

   private ahs(wg $$0) {
      this.b = $$0.l();
      ahs.b $$1 = $$0.b(ahs.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zs<ahs> a() {
      return agu.bB;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   @Nullable
   public bul a(arp $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(ahs.c $$0) {
      this.c.a($$0);
   }

   interface a {
      ahs.b a();

      void a(ahs.c var1);

      void a(wg var1);
   }

   static enum b {
      a(ahs.d::new),
      b($$0 -> ahs.e),
      c(ahs.e::new);

      final Function<wg, ahs.a> d;

      private b(final Function<wg, ahs.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bsj var1);

      void a(bsj var1, ezy var2);

      void a();
   }

   static class d implements ahs.a {
      private final bsj a;

      d(bsj $$0) {
         this.a = $$0;
      }

      private d(wg $$0) {
         this.a = $$0.b(bsj.class);
      }

      @Override
      public ahs.b a() {
         return ahs.b.a;
      }

      @Override
      public void a(ahs.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(wg $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahs.a {
      private final bsj a;
      private final ezy b;

      e(bsj $$0, ezy $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(wg $$0) {
         this.b = new ezy((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bsj.class);
      }

      @Override
      public ahs.b a() {
         return ahs.b.c;
      }

      @Override
      public void a(ahs.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(wg $$0) {
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a((float)this.b.f);
         $$0.a(this.a);
      }
   }
}

import java.util.function.Function;
import javax.annotation.Nullable;

public class agz implements ze<age> {
   public static final yv<vx, agz> a = ze.a(agz::a, agz::new);
   private final int b;
   private final agz.a c;
   private final boolean d;
   static final agz.a e = new agz.a() {
      @Override
      public agz.b a() {
         return agz.b.b;
      }

      @Override
      public void a(agz.c $$0) {
         $$0.a();
      }

      @Override
      public void a(vx $$0) {
      }
   };

   private agz(int $$0, boolean $$1, agz.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static agz a(brw $$0, boolean $$1) {
      return new agz($$0.al(), $$1, e);
   }

   public static agz a(brw $$0, boolean $$1, bpv $$2) {
      return new agz($$0.al(), $$1, new agz.d($$2));
   }

   public static agz a(brw $$0, boolean $$1, bpv $$2, eum $$3) {
      return new agz($$0.al(), $$1, new agz.e($$2, $$3));
   }

   private agz(vx $$0) {
      this.b = $$0.l();
      agz.b $$1 = $$0.b(agz.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(vx $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zg<agz> a() {
      return agc.by;
   }

   public void a(age $$0) {
      $$0.a(this);
   }

   @Nullable
   public brw a(aqn $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(agz.c $$0) {
      this.c.a($$0);
   }

   interface a {
      agz.b a();

      void a(agz.c var1);

      void a(vx var1);
   }

   static enum b {
      a(agz.d::new),
      b($$0 -> agz.e),
      c(agz.e::new);

      final Function<vx, agz.a> d;

      private b(Function<vx, agz.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bpv var1);

      void a(bpv var1, eum var2);

      void a();
   }

   static class d implements agz.a {
      private final bpv a;

      d(bpv $$0) {
         this.a = $$0;
      }

      private d(vx $$0) {
         this.a = $$0.b(bpv.class);
      }

      @Override
      public agz.b a() {
         return agz.b.a;
      }

      @Override
      public void a(agz.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(vx $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements agz.a {
      private final bpv a;
      private final eum b;

      e(bpv $$0, eum $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(vx $$0) {
         this.b = new eum((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bpv.class);
      }

      @Override
      public agz.b a() {
         return agz.b.c;
      }

      @Override
      public void a(agz.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(vx $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}

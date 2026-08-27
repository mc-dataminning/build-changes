import java.util.function.Function;
import javax.annotation.Nullable;

public class agf implements yn<afl> {
   public static final ye<vg, agf> a = yn.a(agf::a, agf::new);
   private final int b;
   private final agf.a c;
   private final boolean d;
   static final agf.a e = new agf.a() {
      @Override
      public agf.b a() {
         return agf.b.b;
      }

      @Override
      public void a(agf.c $$0) {
         $$0.a();
      }

      @Override
      public void a(vg $$0) {
      }
   };

   private agf(int $$0, boolean $$1, agf.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static agf a(bpv $$0, boolean $$1) {
      return new agf($$0.aj(), $$1, e);
   }

   public static agf a(bpv $$0, boolean $$1, bnz $$2) {
      return new agf($$0.aj(), $$1, new agf.d($$2));
   }

   public static agf a(bpv $$0, boolean $$1, bnz $$2, esa $$3) {
      return new agf($$0.aj(), $$1, new agf.e($$2, $$3));
   }

   private agf(vg $$0) {
      this.b = $$0.l();
      agf.b $$1 = $$0.b(agf.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(vg $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public yp<agf> a() {
      return afj.bw;
   }

   public void a(afl $$0) {
      $$0.a(this);
   }

   @Nullable
   public bpv a(aps $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(agf.c $$0) {
      this.c.a($$0);
   }

   interface a {
      agf.b a();

      void a(agf.c var1);

      void a(vg var1);
   }

   static enum b {
      a(agf.d::new),
      b($$0 -> agf.e),
      c(agf.e::new);

      final Function<vg, agf.a> d;

      private b(Function<vg, agf.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bnz var1);

      void a(bnz var1, esa var2);

      void a();
   }

   static class d implements agf.a {
      private final bnz a;

      d(bnz $$0) {
         this.a = $$0;
      }

      private d(vg $$0) {
         this.a = $$0.b(bnz.class);
      }

      @Override
      public agf.b a() {
         return agf.b.a;
      }

      @Override
      public void a(agf.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(vg $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements agf.a {
      private final bnz a;
      private final esa b;

      e(bnz $$0, esa $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(vg $$0) {
         this.b = new esa((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bnz.class);
      }

      @Override
      public agf.b a() {
         return agf.b.c;
      }

      @Override
      public void a(agf.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(vg $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}

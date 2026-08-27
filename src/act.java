import java.util.function.Function;
import javax.annotation.Nullable;

public class act implements wb<aca> {
   private final int a;
   private final act.a b;
   private final boolean c;
   static final act.a d = new act.a() {
      @Override
      public act.b a() {
         return act.b.b;
      }

      @Override
      public void a(act.c $$0) {
         $$0.a();
      }

      @Override
      public void a(tl $$0) {
      }
   };

   private act(int $$0, boolean $$1, act.a $$2) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
   }

   public static act a(bjt $$0, boolean $$1) {
      return new act($$0.ah(), $$1, d);
   }

   public static act a(bjt $$0, boolean $$1, bia $$2) {
      return new act($$0.ah(), $$1, new act.d($$2));
   }

   public static act a(bjt $$0, boolean $$1, bia $$2, eif $$3) {
      return new act($$0.ah(), $$1, new act.e($$2, $$3));
   }

   public act(tl $$0) {
      this.a = $$0.n();
      act.b $$1 = $$0.b(act.b.class);
      this.b = $$1.d.apply($$0);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(tl $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
      $$0.a(this.c);
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   @Nullable
   public bjt a(alq $$0) {
      return $$0.b(this.a);
   }

   public boolean a() {
      return this.c;
   }

   public void a(act.c $$0) {
      this.b.a($$0);
   }

   interface a {
      act.b a();

      void a(act.c var1);

      void a(tl var1);
   }

   static enum b {
      a(act.d::new),
      b($$0 -> act.d),
      c(act.e::new);

      final Function<tl, act.a> d;

      private b(Function<tl, act.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bia var1);

      void a(bia var1, eif var2);

      void a();
   }

   static class d implements act.a {
      private final bia a;

      d(bia $$0) {
         this.a = $$0;
      }

      private d(tl $$0) {
         this.a = $$0.b(bia.class);
      }

      @Override
      public act.b a() {
         return act.b.a;
      }

      @Override
      public void a(act.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(tl $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements act.a {
      private final bia a;
      private final eif b;

      e(bia $$0, eif $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(tl $$0) {
         this.b = new eif((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bia.class);
      }

      @Override
      public act.b a() {
         return act.b.c;
      }

      @Override
      public void a(act.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(tl $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}

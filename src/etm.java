import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class etm extends eye {
   private static final aez a = new aez("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int k = 6;
   private static final int l = 130;
   private static final int m = 64;
   private static final int n = 250;
   private final eye o;
   @Nullable
   private final aez p;
   private final tl q;
   private final List<etm.b> s;
   @Nullable
   private final Runnable t;
   private final int u;
   private final evy v = evy.d();

   etm(eye $$0, int $$1, @Nullable aez $$2, tl $$3, tl $$4, List<etm.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.o = $$0;
      this.p = $$2;
      this.q = $$4;
      this.s = $$5;
      this.t = $$6;
      this.u = $$1 - 36;
   }

   @Override
   protected void aH_() {
      this.v.a(12).c().b();
      this.v.a(new ete(this.e.f().a(n.r), this.i).j(this.u).b(true));
      if (this.p != null) {
         this.v.a(esx.a(130, 64, this.p, 130, 64));
      }

      this.v.a(new ete(this.q, this.i).j(this.u).b(true));
      this.v.a(this.l());
      this.v.a($$1 -> {
         esi var10000 = this.d($$1);
      });
      this.b();
   }

   private evy l() {
      int $$0 = 6 * (this.s.size() - 1);
      int $$1 = Math.min((this.u - $$0) / this.s.size(), 150);
      evy $$2 = evy.e();
      $$2.a(6);

      for (etm.b $$3 : this.s) {
         $$2.a(esk.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void b() {
      this.o.a(this.f, this.g, this.h);
      this.v.a();
      evs.a(this.v, this.s());
   }

   @Override
   public void b(erz $$0, int $$1, int $$2, float $$3) {
      this.o.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, eqp.a);
      this.a($$0);
      $$0.a(a, this.v.r() - 18, this.v.t() - 18, this.v.l() + 36, this.v.i() + 36);
   }

   @Override
   public tl g() {
      return tk.a(this.e, this.q);
   }

   @Override
   public void az_() {
      if (this.t != null) {
         this.t.run();
      }

      this.f.a(this.o);
   }

   public static class a {
      private final eye a;
      private final tl b;
      private tl c = tk.a;
      private int d = 250;
      @Nullable
      private aez e;
      private final List<etm.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(eye $$0, tl $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public etm.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public etm.a a(aez $$0) {
         this.e = $$0;
         return this;
      }

      public etm.a a(tl $$0) {
         this.c = $$0;
         return this;
      }

      public etm.a a(tl $$0, Consumer<etm> $$1) {
         this.f.add(new etm.b($$0, $$1));
         return this;
      }

      public etm.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public etm a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new etm(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(tl a, Consumer<etm> b) {
   }
}

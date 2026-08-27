import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class exj extends fcc {
   private static final agt a = new agt("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int k = 6;
   private static final int l = 130;
   private static final int m = 64;
   private static final int n = 250;
   private final fcc o;
   @Nullable
   private final agt p;
   private final vb q;
   private final List<exj.b> r;
   @Nullable
   private final Runnable t;
   private final int u;
   private final ezv v = ezv.d();

   exj(fcc $$0, int $$1, @Nullable agt $$2, vb $$3, vb $$4, List<exj.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.o = $$0;
      this.p = $$2;
      this.q = $$4;
      this.r = $$5;
      this.t = $$6;
      this.u = $$1 - 36;
   }

   @Override
   protected void aP_() {
      this.v.a(12).c().b();
      this.v.a(new exb(this.e.f().a(n.r), this.i).j(this.u).b(true));
      if (this.p != null) {
         this.v.a(ewu.a(130, 64, this.p, 130, 64));
      }

      this.v.a(new exb(this.q, this.i).j(this.u).b(true));
      this.v.a(this.l());
      this.v.a($$1 -> {
         ewf var10000 = this.d($$1);
      });
      this.c();
   }

   private ezv l() {
      int $$0 = 6 * (this.r.size() - 1);
      int $$1 = Math.min((this.u - $$0) / this.r.size(), 150);
      ezv $$2 = ezv.e();
      $$2.a(6);

      for (exj.b $$3 : this.r) {
         $$2.a(ewh.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.o.a(this.f, this.g, this.h);
      this.v.a();
      ezp.a(this.v, this.s());
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      this.o.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, euk.a);
      this.a($$0);
      $$0.a(a, this.v.p() - 18, this.v.r() - 18, this.v.k() + 36, this.v.i() + 36);
   }

   @Override
   public vb h() {
      return va.a(this.e, this.q);
   }

   @Override
   public void aF_() {
      if (this.t != null) {
         this.t.run();
      }

      this.f.a(this.o);
   }

   public static class a {
      private final fcc a;
      private final vb b;
      private vb c = va.a;
      private int d = 250;
      @Nullable
      private agt e;
      private final List<exj.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fcc $$0, vb $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public exj.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public exj.a a(agt $$0) {
         this.e = $$0;
         return this;
      }

      public exj.a a(vb $$0) {
         this.c = $$0;
         return this;
      }

      public exj.a a(vb $$0, Consumer<exj> $$1) {
         this.f.add(new exj.b($$0, $$1));
         return this;
      }

      public exj.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public exj a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new exj(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(vb a, Consumer<exj> b) {
   }
}

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ewg extends faz {
   private static final agm a = new agm("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int k = 6;
   private static final int l = 130;
   private static final int m = 64;
   private static final int n = 250;
   private final faz o;
   @Nullable
   private final agm p;
   private final uv q;
   private final List<ewg.b> r;
   @Nullable
   private final Runnable t;
   private final int u;
   private final eys v = eys.d();

   ewg(faz $$0, int $$1, @Nullable agm $$2, uv $$3, uv $$4, List<ewg.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.o = $$0;
      this.p = $$2;
      this.q = $$4;
      this.r = $$5;
      this.t = $$6;
      this.u = $$1 - 36;
   }

   @Override
   protected void aQ_() {
      this.v.a(12).c().b();
      this.v.a(new evy(this.e.f().a(n.r), this.i).j(this.u).b(true));
      if (this.p != null) {
         this.v.a(evr.a(130, 64, this.p, 130, 64));
      }

      this.v.a(new evy(this.q, this.i).j(this.u).b(true));
      this.v.a(this.l());
      this.v.a($$1 -> {
         evc var10000 = this.d($$1);
      });
      this.c();
   }

   private eys l() {
      int $$0 = 6 * (this.r.size() - 1);
      int $$1 = Math.min((this.u - $$0) / this.r.size(), 150);
      eys $$2 = eys.e();
      $$2.a(6);

      for (ewg.b $$3 : this.r) {
         $$2.a(eve.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.o.a(this.f, this.g, this.h);
      this.v.a();
      eym.a(this.v, this.s());
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      this.o.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, eti.a);
      this.a($$0);
      $$0.a(a, this.v.p() - 18, this.v.r() - 18, this.v.k() + 36, this.v.i() + 36);
   }

   @Override
   public uv h() {
      return uu.a(this.e, this.q);
   }

   @Override
   public void aG_() {
      if (this.t != null) {
         this.t.run();
      }

      this.f.a(this.o);
   }

   public static class a {
      private final faz a;
      private final uv b;
      private uv c = uu.a;
      private int d = 250;
      @Nullable
      private agm e;
      private final List<ewg.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(faz $$0, uv $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ewg.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public ewg.a a(agm $$0) {
         this.e = $$0;
         return this;
      }

      public ewg.a a(uv $$0) {
         this.c = $$0;
         return this;
      }

      public ewg.a a(uv $$0, Consumer<ewg> $$1) {
         this.f.add(new ewg.b($$0, $$1));
         return this;
      }

      public ewg.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public ewg a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new ewg(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(uv a, Consumer<ewg> b) {
   }
}

import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epi extends gfx {
   static final afw a = new afw("pending_invite/accept_highlighted");
   static final afw b = new afw("pending_invite/accept");
   static final afw c = new afw("pending_invite/reject_highlighted");
   static final afw y = new afw("pending_invite/reject");
   private static final Logger z = LogUtils.getLogger();
   private static final ui A = ui.c("mco.invites.nopending");
   static final ui B = ui.c("mco.invites.button.accept");
   static final ui C = ui.c("mco.invites.button.reject");
   private final ezd D;
   private final CompletableFuture<List<enh>> E = CompletableFuture.supplyAsync(() -> {
      try {
         return emx.a().i().a;
      } catch (eok var1x) {
         z.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   ui F;
   epi.b G;
   int H = -1;
   private etj I;
   private etj J;

   public epi(ezd $$0, ui $$1) {
      super($$1);
      this.D = $$0;
   }

   @Override
   public void aM_() {
      ems.e();
      this.G = new epi.b();
      this.E.thenAcceptAsync($$0 -> {
         List<epi.a> $$1 = $$0.stream().map($$0x -> new epi.a($$0x)).toList();
         this.G.a($$1);
      }, this.j);
      this.d(this.G);
      this.I = this.d(etj.a(B, $$0 -> {
         this.a(this.H, true);
         this.H = -1;
         this.C();
      }).a(this.g / 2 - 174, this.h - 32, 100, 20).a());
      this.d(etj.a(uh.d, $$0 -> this.aC_()).a(this.g / 2 - 50, this.h - 32, 100, 20).a());
      this.J = this.d(etj.a(C, $$0 -> {
         this.a(this.H, false);
         this.H = -1;
         this.C();
      }).a(this.g / 2 + 74, this.h - 32, 100, 20).a());
      this.C();
   }

   @Override
   public void aC_() {
      this.f.a(this.D);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.G.k()) {
         String $$2 = this.G.i().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               emx $$2x = emx.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (eok var3x) {
               z.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.G.b($$0);
               eon $$3 = this.f.aY();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.j);
      }
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.F = null;
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.F != null) {
         $$0.a(this.i, this.F, $$1, $$2);
      }

      if (this.E.isDone() && this.G.k() == 0) {
         $$0.a(this.i, A, this.g / 2, this.h / 2 - 20, -1);
      }
   }

   @Override
   void C() {
      this.I.j = this.a(this.H);
      this.J.j = this.a(this.H);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends euf.a<epi.a> {
      private static final int b = 38;
      final enh c;
      private final List<eor> d;

      a(enh $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new epi.a.a(), new epi.a.b());
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         eor.a(epi.this.G, this, this.d, $$2, $$0, $$1);
         return true;
      }

      private void a(esy $$0, enh $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(epi.this.i, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(epi.this.i, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(epi.this.i, eqe.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         eor.a($$0, this.d, epi.this.G, $$2, $$3, $$4, $$5);
         eqe.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public ui a() {
         ui $$0 = uh.b(ui.b(this.c.b), ui.b(this.c.c), eqe.a(this.c.e));
         return ui.a("narrator.select", $$0);
      }

      class a extends eor {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(esy $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? epi.a : epi.b, $$1, $$2, 18, 18);
            if ($$3) {
               epi.this.F = epi.B;
            }
         }

         @Override
         public void a(int $$0) {
            epi.this.a($$0, true);
         }
      }

      class b extends eor {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(esy $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? epi.c : epi.y, $$1, $$2, 18, 18);
            if ($$3) {
               epi.this.F = epi.C;
            }
         }

         @Override
         public void a(int $$0) {
            epi.this.a($$0, false);
         }
      }
   }

   class b extends gfw<epi.a> {
      public b() {
         super(epi.this.g, epi.this.h, 32, epi.this.h - 40, 36);
      }

      public void b(int $$0) {
         this.j($$0);
      }

      @Override
      public int a() {
         return this.k() * 36;
      }

      @Override
      public int b() {
         return 260;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         this.c($$0);
      }

      public void c(int $$0) {
         epi.this.H = $$0;
         epi.this.C();
      }

      public void a(@Nullable epi.a $$0) {
         super.a($$0);
         epi.this.H = this.i().indexOf($$0);
         epi.this.C();
      }
   }
}

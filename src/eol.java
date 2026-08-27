import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eol extends gew {
   static final aeu a = new aeu("pending_invite/accept_highlighted");
   static final aeu b = new aeu("pending_invite/accept");
   static final aeu c = new aeu("pending_invite/reject_highlighted");
   static final aeu y = new aeu("pending_invite/reject");
   private static final Logger z = LogUtils.getLogger();
   private static final ti A = ti.c("mco.invites.nopending");
   static final ti B = ti.c("mco.invites.button.accept");
   static final ti C = ti.c("mco.invites.button.reject");
   private final eyf D;
   private final CompletableFuture<List<emk>> E = CompletableFuture.supplyAsync(() -> {
      try {
         return ema.a().h().a;
      } catch (enn var1x) {
         z.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   ti F;
   eol.b G;
   int H = -1;
   private esl I;
   private esl J;

   public eol(eyf $$0, ti $$1) {
      super($$1);
      this.D = $$0;
   }

   @Override
   public void aD_() {
      elv.d();
      this.G = new eol.b();
      this.E.thenAcceptAsync($$0 -> {
         List<eol.a> $$1 = $$0.stream().map($$0x -> new eol.a($$0x)).toList();
         this.G.a($$1);
      }, this.j);
      this.d(this.G);
      this.I = this.d(esl.a(B, $$0 -> {
         this.a(this.H, true);
         this.H = -1;
         this.C();
      }).a(this.g / 2 - 174, this.h - 32, 100, 20).a());
      this.d(esl.a(th.d, $$0 -> this.au_()).a(this.g / 2 - 50, this.h - 32, 100, 20).a());
      this.J = this.d(esl.a(C, $$0 -> {
         this.a(this.H, false);
         this.H = -1;
         this.C();
      }).a(this.g / 2 + 74, this.h - 32, 100, 20).a());
      this.C();
   }

   @Override
   public void au_() {
      this.f.a(this.D);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.G.k()) {
         String $$2 = this.G.i().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               ema $$2x = ema.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (enn var3x) {
               z.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.G.b($$0);
               enq $$3 = this.f.aY();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.e.a();
            }
         }, this.j);
      }
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
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

   class a extends eth.a<eol.a> {
      private static final int b = 38;
      final emk c;
      private final List<enu> d;

      a(emk $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new eol.a.a(), new eol.a.b());
      }

      @Override
      public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         enu.a(eol.this.G, this, this.d, $$2, $$0, $$1);
         return true;
      }

      private void a(esa $$0, emk $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(eol.this.i, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(eol.this.i, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(eol.this.i, eph.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         enu.a($$0, this.d, eol.this.G, $$2, $$3, $$4, $$5);
         eph.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public ti a() {
         ti $$0 = th.b(ti.b(this.c.b), ti.b(this.c.c), eph.a(this.c.e));
         return ti.a("narrator.select", $$0);
      }

      class a extends enu {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(esa $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? eol.a : eol.b, $$1, $$2, 18, 18);
            if ($$3) {
               eol.this.F = eol.B;
            }
         }

         @Override
         public void a(int $$0) {
            eol.this.a($$0, true);
         }
      }

      class b extends enu {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(esa $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? eol.c : eol.y, $$1, $$2, 18, 18);
            if ($$3) {
               eol.this.F = eol.C;
            }
         }

         @Override
         public void a(int $$0) {
            eol.this.a($$0, false);
         }
      }
   }

   class b extends gev<eol.a> {
      public b() {
         super(eol.this.g, eol.this.h, 32, eol.this.h - 40, 36);
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
         eol.this.H = $$0;
         eol.this.C();
      }

      public void a(@Nullable eol.a $$0) {
         super.a($$0);
         eol.this.H = this.i().indexOf($$0);
         eol.this.C();
      }
   }
}

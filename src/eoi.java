import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eoi extends ged {
   static final aep a = new aep("pending_invite/accept_highlighted");
   static final aep b = new aep("pending_invite/accept");
   static final aep c = new aep("pending_invite/reject_highlighted");
   static final aep y = new aep("pending_invite/reject");
   private static final Logger z = LogUtils.getLogger();
   private static final te A = te.c("mco.invites.nopending");
   static final te B = te.c("mco.invites.button.accept");
   static final te C = te.c("mco.invites.button.reject");
   private final exv D;
   private final CompletableFuture<List<emh>> E = CompletableFuture.supplyAsync(() -> {
      try {
         return elx.a().h().a;
      } catch (enk var1x) {
         z.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   te F;
   eoi.b G;
   int H = -1;
   private esi I;
   private esi J;

   public eoi(exv $$0, te $$1) {
      super($$1);
      this.D = $$0;
   }

   @Override
   public void aE_() {
      this.G = new eoi.b();
      this.E.thenAcceptAsync($$0 -> {
         List<eoi.a> $$1 = $$0.stream().map($$0x -> new eoi.a($$0x)).toList();
         this.G.a($$1);
      }, this.j);
      this.e(this.G);
      this.I = this.d(esi.a(te.c("mco.invites.button.accept"), $$0 -> {
         this.a(this.H, true);
         this.H = -1;
         this.B();
      }).a(this.g / 2 - 174, this.h - 32, 100, 20).a());
      this.d(esi.a(td.d, $$0 -> this.au_()).a(this.g / 2 - 50, this.h - 32, 100, 20).a());
      this.J = this.d(esi.a(te.c("mco.invites.button.reject"), $$0 -> {
         this.a(this.H, false);
         this.H = -1;
         this.B();
      }).a(this.g / 2 + 74, this.h - 32, 100, 20).a());
      this.B();
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
               elx $$2x = elx.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (enk var3x) {
               z.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.G.b($$0);
               eno $$3 = this.f.aX();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.e.a();
            }
         }, this.j);
      }
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.F = null;
      this.G.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.F != null) {
         $$0.a(this.i, this.F, $$1, $$2);
      }

      if (this.E.isDone() && this.G.k() == 0) {
         $$0.a(this.i, A, this.g / 2, this.h / 2 - 20, -1);
      }
   }

   @Override
   void B() {
      this.I.j = this.a(this.H);
      this.J.j = this.a(this.H);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends ete.a<eoi.a> {
      private static final int b = 38;
      final emh c;
      private final List<ens> d;

      a(emh $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new eoi.a.a(), new eoi.a.b());
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         ens.a(eoi.this.G, this, this.d, $$2, $$0, $$1);
         return true;
      }

      private void a(erx $$0, emh $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(eoi.this.i, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(eoi.this.i, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(eoi.this.i, epe.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         ens.a($$0, this.d, eoi.this.G, $$2, $$3, $$4, $$5);
         epe.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public te a() {
         te $$0 = td.b(te.b(this.c.b), te.b(this.c.c), epe.a(this.c.e));
         return te.a("narrator.select", $$0);
      }

      class a extends ens {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(erx $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? eoi.a : eoi.b, $$1, $$2, 18, 18);
            if ($$3) {
               eoi.this.F = eoi.B;
            }
         }

         @Override
         public void a(int $$0) {
            eoi.this.a($$0, true);
         }
      }

      class b extends ens {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(erx $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? eoi.c : eoi.y, $$1, $$2, 18, 18);
            if ($$3) {
               eoi.this.F = eoi.C;
            }
         }

         @Override
         public void a(int $$0) {
            eoi.this.a($$0, false);
         }
      }
   }

   class b extends gec<eoi.a> {
      public b() {
         super(eoi.this.g, eoi.this.h, 32, eoi.this.h - 40, 36);
      }

      public void b(int $$0) {
         this.i($$0);
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
         eoi.this.H = $$0;
         eoi.this.B();
      }

      public void a(@Nullable eoi.a $$0) {
         super.a($$0);
         eoi.this.H = this.i().indexOf($$0);
         eoi.this.B();
      }
   }
}

import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eos extends gfd {
   static final aey a = new aey("pending_invite/accept_highlighted");
   static final aey b = new aey("pending_invite/accept");
   static final aey c = new aey("pending_invite/reject_highlighted");
   static final aey y = new aey("pending_invite/reject");
   private static final Logger z = LogUtils.getLogger();
   private static final tn A = tn.c("mco.invites.nopending");
   static final tn B = tn.c("mco.invites.button.accept");
   static final tn C = tn.c("mco.invites.button.reject");
   private final eym D;
   private final CompletableFuture<List<emr>> E = CompletableFuture.supplyAsync(() -> {
      try {
         return emh.a().h().a;
      } catch (enu var1x) {
         z.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   tn F;
   eos.b G;
   int H = -1;
   private ess I;
   private ess J;

   public eos(eym $$0, tn $$1) {
      super($$1);
      this.D = $$0;
   }

   @Override
   public void aH_() {
      emc.d();
      this.G = new eos.b();
      this.E.thenAcceptAsync($$0 -> {
         List<eos.a> $$1 = $$0.stream().map($$0x -> new eos.a($$0x)).toList();
         this.G.a($$1);
      }, this.j);
      this.d(this.G);
      this.I = this.d(ess.a(B, $$0 -> {
         this.a(this.H, true);
         this.H = -1;
         this.D();
      }).a(this.g / 2 - 174, this.h - 32, 100, 20).a());
      this.d(ess.a(tm.d, $$0 -> this.az_()).a(this.g / 2 - 50, this.h - 32, 100, 20).a());
      this.J = this.d(ess.a(C, $$0 -> {
         this.a(this.H, false);
         this.H = -1;
         this.D();
      }).a(this.g / 2 + 74, this.h - 32, 100, 20).a());
      this.D();
   }

   @Override
   public void az_() {
      this.f.a(this.D);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.G.k()) {
         String $$2 = this.G.i().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               emh $$2x = emh.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (enu var3x) {
               z.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.G.b($$0);
               enx $$3 = this.f.aY();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.j);
      }
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
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
   void D() {
      this.I.j = this.a(this.H);
      this.J.j = this.a(this.H);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends eto.a<eos.a> {
      private static final int b = 38;
      final emr c;
      private final List<eob> d;

      a(emr $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new eos.a.a(), new eos.a.b());
      }

      @Override
      public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         eob.a(eos.this.G, this, this.d, $$2, $$0, $$1);
         return true;
      }

      private void a(esh $$0, emr $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(eos.this.i, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(eos.this.i, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(eos.this.i, epo.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         eob.a($$0, this.d, eos.this.G, $$2, $$3, $$4, $$5);
         epo.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public tn a() {
         tn $$0 = tm.b(tn.b(this.c.b), tn.b(this.c.c), epo.a(this.c.e));
         return tn.a("narrator.select", $$0);
      }

      class a extends eob {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(esh $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? eos.a : eos.b, $$1, $$2, 18, 18);
            if ($$3) {
               eos.this.F = eos.B;
            }
         }

         @Override
         public void a(int $$0) {
            eos.this.a($$0, true);
         }
      }

      class b extends eob {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(esh $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? eos.c : eos.y, $$1, $$2, 18, 18);
            if ($$3) {
               eos.this.F = eos.C;
            }
         }

         @Override
         public void a(int $$0) {
            eos.this.a($$0, false);
         }
      }
   }

   class b extends gfc<eos.a> {
      public b() {
         super(eos.this.g, eos.this.h, 32, eos.this.h - 40, 36);
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
         eos.this.H = $$0;
         eos.this.D();
      }

      public void a(@Nullable eos.a $$0) {
         super.a($$0);
         eos.this.H = this.i().indexOf($$0);
         eos.this.D();
      }
   }
}

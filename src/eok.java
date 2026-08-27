import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eok extends gex {
   static final aez a = new aez("pending_invite/accept_highlighted");
   static final aez b = new aez("pending_invite/accept");
   static final aez c = new aez("pending_invite/reject_highlighted");
   static final aez y = new aez("pending_invite/reject");
   private static final Logger z = LogUtils.getLogger();
   private static final tl A = tl.c("mco.invites.nopending");
   static final tl B = tl.c("mco.invites.button.accept");
   static final tl C = tl.c("mco.invites.button.reject");
   private final eye D;
   private final CompletableFuture<List<emj>> E = CompletableFuture.supplyAsync(() -> {
      try {
         return elz.a().h().a;
      } catch (enm var1x) {
         z.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   tl F;
   eok.b G;
   int H = -1;
   private esk I;
   private esk J;

   public eok(eye $$0, tl $$1) {
      super($$1);
      this.D = $$0;
   }

   @Override
   public void aH_() {
      elu.d();
      this.G = new eok.b();
      this.E.thenAcceptAsync($$0 -> {
         List<eok.a> $$1 = $$0.stream().map($$0x -> new eok.a($$0x)).toList();
         this.G.a($$1);
      }, this.j);
      this.d(this.G);
      this.I = this.d(esk.a(B, $$0 -> {
         this.a(this.H, true);
         this.H = -1;
         this.D();
      }).a(this.g / 2 - 174, this.h - 32, 100, 20).a());
      this.d(esk.a(tk.d, $$0 -> this.az_()).a(this.g / 2 - 50, this.h - 32, 100, 20).a());
      this.J = this.d(esk.a(C, $$0 -> {
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
               elz $$2x = elz.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (enm var3x) {
               z.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.G.b($$0);
               enp $$3 = this.f.aY();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.j);
      }
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
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

   class a extends etg.a<eok.a> {
      private static final int b = 38;
      final emj c;
      private final List<ent> d;

      a(emj $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new eok.a.a(), new eok.a.b());
      }

      @Override
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         ent.a(eok.this.G, this, this.d, $$2, $$0, $$1);
         return true;
      }

      private void a(erz $$0, emj $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(eok.this.i, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(eok.this.i, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(eok.this.i, epg.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         ent.a($$0, this.d, eok.this.G, $$2, $$3, $$4, $$5);
         epg.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public tl a() {
         tl $$0 = tk.b(tl.b(this.c.b), tl.b(this.c.c), epg.a(this.c.e));
         return tl.a("narrator.select", $$0);
      }

      class a extends ent {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(erz $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? eok.a : eok.b, $$1, $$2, 18, 18);
            if ($$3) {
               eok.this.F = eok.B;
            }
         }

         @Override
         public void a(int $$0) {
            eok.this.a($$0, true);
         }
      }

      class b extends ent {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(erz $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? eok.c : eok.y, $$1, $$2, 18, 18);
            if ($$3) {
               eok.this.F = eok.C;
            }
         }

         @Override
         public void a(int $$0) {
            eok.this.a($$0, false);
         }
      }
   }

   class b extends gew<eok.a> {
      public b() {
         super(eok.this.g, eok.this.h, 32, eok.this.h - 40, 36);
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
         eok.this.H = $$0;
         eok.this.D();
      }

      public void a(@Nullable eok.a $$0) {
         super.a($$0);
         eok.this.H = this.i().indexOf($$0);
         eok.this.D();
      }
   }
}

import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ewe extends gob {
   static final ajc a = new ajc("pending_invite/accept_highlighted");
   static final ajc b = new ajc("pending_invite/accept");
   static final ajc c = new ajc("pending_invite/reject_highlighted");
   static final ajc v = new ajc("pending_invite/reject");
   private static final Logger w = LogUtils.getLogger();
   private static final vs x = vs.c("mco.invites.nopending");
   static final vs y = vs.c("mco.invites.button.accept");
   static final vs z = vs.c("mco.invites.button.reject");
   private final fgh A;
   private final CompletableFuture<List<eud>> B = CompletableFuture.supplyAsync(() -> {
      try {
         return ett.a().i().a;
      } catch (evg var1x) {
         w.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   vs C;
   ewe.b D;
   int E = -1;
   private fak F;
   private fak G;

   public ewe(fgh $$0, vs $$1) {
      super($$1);
      this.A = $$0;
   }

   @Override
   public void aP_() {
      eto.f();
      this.D = new ewe.b();
      this.B.thenAcceptAsync($$0 -> {
         List<ewe.a> $$1 = $$0.stream().map($$0x -> new ewe.a($$0x)).toList();
         this.D.a($$1);
         if ($$1.isEmpty()) {
            this.f.aX().b(x);
         }
      }, this.j);
      this.c(this.D);
      this.F = this.c((fak)fak.a(y, $$0 -> {
         this.a(this.E, true);
         this.E = -1;
         this.E();
      }).a(this.g / 2 - 174, this.h - 32, 100, 20).a());
      this.c((fak)fak.a(vr.d, $$0 -> this.d()).a(this.g / 2 - 50, this.h - 32, 100, 20).a());
      this.G = this.c((fak)fak.a(z, $$0 -> {
         this.a(this.E, false);
         this.E = -1;
         this.E();
      }).a(this.g / 2 + 74, this.h - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void d() {
      this.f.a(this.A);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.D.n()) {
         String $$2 = this.D.l().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               ett $$2x = ett.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (evg var3x) {
               w.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.D.b($$0);
               evj $$3 = this.f.ba();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.j);
      }
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C = null;
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.C != null) {
         $$0.a(this.i, this.C, $$1, $$2);
      }

      if (this.B.isDone() && this.D.n() == 0) {
         $$0.a(this.i, x, this.g / 2, this.h / 2 - 20, -1);
      }
   }

   void E() {
      this.F.k = this.a(this.E);
      this.G.k = this.a(this.E);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends fbg.a<ewe.a> {
      private static final int b = 38;
      final eud c;
      private final List<evn> d;

      a(eud $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new ewe.a.a(), new ewe.a.b());
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         evn.a(ewe.this.D, this, this.d, $$2, $$0, $$1);
         return true;
      }

      private void a(ezx $$0, eud $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(ewe.this.i, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(ewe.this.i, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(ewe.this.i, exa.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         evn.a($$0, this.d, ewe.this.D, $$2, $$3, $$4, $$5);
         exa.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public vs a() {
         vs $$0 = vr.b(vs.b(this.c.b), vs.b(this.c.c), exa.a(this.c.e));
         return vs.a("narrator.select", $$0);
      }

      class a extends evn {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(ezx $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? ewe.a : ewe.b, $$1, $$2, 18, 18);
            if ($$3) {
               ewe.this.C = ewe.y;
            }
         }

         @Override
         public void a(int $$0) {
            ewe.this.a($$0, true);
         }
      }

      class b extends evn {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(ezx $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? ewe.c : ewe.v, $$1, $$2, 18, 18);
            if ($$3) {
               ewe.this.C = ewe.z;
            }
         }

         @Override
         public void a(int $$0) {
            ewe.this.a($$0, false);
         }
      }
   }

   class b extends goa<ewe.a> {
      public b() {
         super(ewe.this.g, ewe.this.h - 72, 32, 36);
      }

      public void b(int $$0) {
         this.i($$0);
      }

      @Override
      public int a() {
         return this.n() * 36;
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
         ewe.this.E = $$0;
         ewe.this.E();
      }

      public void a(@Nullable ewe.a $$0) {
         super.a($$0);
         ewe.this.E = this.l().indexOf($$0);
         ewe.this.E();
      }
   }
}

import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epj extends gfx {
   private static final Logger a = LogUtils.getLogger();
   private static final afw b = new afw("minecraft", "textures/gui/options_background.png");
   private static final ui c = ui.c("mco.question");
   static final ui y = ui.c("mco.configure.world.invites.normal.tooltip");
   static final ui z = ui.c("mco.configure.world.invites.ops.tooltip");
   static final ui A = ui.c("mco.configure.world.invites.remove.tooltip");
   private static final int B = -1;
   private final eox C;
   final eno D;
   epj.b E;
   int F;
   int G;
   private etj H;
   private etj I;
   int J = -1;
   private boolean K;

   public epj(eox $$0, eno $$1) {
      super(ui.c("mco.configure.world.players.title"));
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   public void aM_() {
      this.F = this.g / 2 - 160;
      this.G = 150;
      int $$0 = this.g / 2 + 12;
      this.E = new epj.b();
      this.E.f(this.F);
      this.e(this.E);

      for (enk $$1 : this.D.h) {
         this.E.a($$1);
      }

      this.J = -1;
      this.d(etj.a(ui.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new epc(this.C, this, this.D))).a($$0, h(1), this.G + 10, 20).a());
      this.H = this.d(etj.a(ui.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.l(this.J)).a($$0, h(7), this.G + 10, 20).a());
      this.I = this.d(etj.a(ui.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.D.h.get(this.J).c()) {
            this.k(this.J);
         } else {
            this.j(this.J);
         }
      }).a($$0, h(9), this.G + 10, 20).a());
      this.d(etj.a(uh.k, $$0x -> this.D()).a($$0 + this.G / 2 + 2, h(12), this.G / 2 + 10 - 2, 20).a());
      this.C();
   }

   @Override
   void C() {
      this.H.j = this.i(this.J);
      this.I.j = this.i(this.J);
      this.E.d();
   }

   private boolean i(int $$0) {
      return $$0 != -1;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.D();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void D() {
      if (this.K) {
         this.f.a(this.C.f());
      } else {
         this.f.a(this.C);
      }
   }

   void j(int $$0) {
      emx $$1 = emx.a();
      UUID $$2 = this.D.h.get($$0).b();

      try {
         this.a($$1.b(this.D.a, $$2));
      } catch (eok var5) {
         a.error("Couldn't op the user", var5);
      }

      this.C();
   }

   void k(int $$0) {
      emx $$1 = emx.a();
      UUID $$2 = this.D.h.get($$0).b();

      try {
         this.a($$1.c(this.D.a, $$2));
      } catch (eok var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.C();
   }

   private void a(eng $$0) {
      for (enk $$1 : this.D.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void l(int $$0) {
      this.C();
      if ($$0 >= 0 && $$0 < this.D.h.size()) {
         enk $$1 = this.D.h.get($$0);
         eoy $$2 = new eoy($$1x -> {
            if ($$1x) {
               emx $$2x = emx.a();

               try {
                  $$2x.a(this.D.a, $$1.b());
               } catch (eok var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.D.h.remove(this.J);
               this.J = -1;
               this.C();
            }

            this.K = true;
            this.f.a(this);
         }, c, ui.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      int $$4 = h(12) + 20;
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      $$0.a(b, 0, $$4, 0.0F, 0.0F, this.g, this.h - $$4, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      String $$5 = this.D.h != null ? Integer.toString(this.D.h.size()) : "0";
      $$0.a(this.i, ui.a("mco.configure.world.invited.number", $$5), this.F, h(0), -6250336, false);
   }

   class a extends euf.a<epj.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final euw f = new euw(new afw("player_list/remove_player"), new afw("player_list/remove_player_highlighted"));
      private static final euw g = new euw(new afw("player_list/make_operator"), new afw("player_list/make_operator_highlighted"));
      private static final euw h = new euw(new afw("player_list/remove_operator"), new afw("player_list/remove_operator_highlighted"));
      private final enk i;
      private final List<eth> j = new ArrayList<>();
      private final etv k;
      private final etv l;
      private final etv m;

      public a(enk $$0) {
         this.i = $$0;
         int $$1 = epj.this.D.h.indexOf(this.i);
         int $$2 = epj.this.E.p() - 16 - 9;
         int $$3 = epj.this.E.h($$1) + 1;
         this.k = new etv($$2, $$3, 8, 7, f, $$1x -> epj.this.l($$1), uh.a);
         this.k.a(euu.a(epj.A));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new etv($$2, $$3, 8, 7, g, $$1x -> epj.this.j($$1), uh.a);
         this.l.a(euu.a(epj.y));
         this.j.add(this.l);
         this.m = new etv($$2, $$3, 8, 7, h, $$1x -> epj.this.k($$1), uh.a);
         this.m.a(euu.a(epj.z));
         this.j.add(this.m);
         this.b();
      }

      public void b() {
         this.l.j = !this.i.c();
         this.m.j = !this.l.j;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.l.a($$0, $$1, $$2)) {
            this.m.a($$0, $$1, $$2);
         }

         this.k.a($$0, $$1, $$2);
         return true;
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         eqe.a($$0, epj.this.F + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(epj.this.i, this.i.a(), epj.this.F + 3 + 12, $$2 + 1, $$10, false);
         this.j.forEach($$5x -> {
            $$5x.g($$2 + 1);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public ui a() {
         return ui.a("narrator.select", this.i.a());
      }
   }

   class b extends gfw<epj.a> {
      public b() {
         super(epj.this.G + 10, epj.h(12) + 20, epj.h(1), epj.h(12) + 20, 13);
      }

      public void d() {
         if (epj.this.J != -1) {
            this.d(epj.this.J).b();
         }
      }

      public void a(enk $$0) {
         this.a((epj.a)(epj.this.new a($$0)));
      }

      @Override
      public int b() {
         return (int)((double)this.e * 1.0);
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         this.b($$0);
      }

      public void b(int $$0) {
         epj.this.J = $$0;
         epj.this.C();
      }

      public void a(@Nullable epj.a $$0) {
         super.a($$0);
         epj.this.J = this.i().indexOf($$0);
         epj.this.C();
      }

      @Override
      public int c() {
         return epj.this.F + this.e - 5;
      }

      @Override
      public int a() {
         return this.k() * 13;
      }
   }
}

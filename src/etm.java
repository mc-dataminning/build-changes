import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class etm extends gld {
   private static final Logger a = LogUtils.getLogger();
   private static final ahh b = new ahh("minecraft", "textures/gui/options_background.png");
   private static final vg c = vg.c("mco.question");
   static final vg v = vg.c("mco.configure.world.invites.normal.tooltip");
   static final vg w = vg.c("mco.configure.world.invites.ops.tooltip");
   static final vg x = vg.c("mco.configure.world.invites.remove.tooltip");
   private static final int y = -1;
   private final eta z;
   final err A;
   etm.b B;
   int C;
   int D;
   private exr E;
   private exr F;
   int G = -1;
   private boolean H;

   public etm(eta $$0, err $$1) {
      super(vg.c("mco.configure.world.players.title"));
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aP_() {
      this.C = this.g / 2 - 160;
      this.D = 150;
      int $$0 = this.g / 2 + 12;
      this.B = this.d(new etm.b());
      this.B.n(this.C);

      for (ern $$1 : this.A.h) {
         this.B.a($$1);
      }

      this.G = -1;
      this.d(exr.a(vg.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new etf(this.z, this, this.A))).a($$0, g(1), this.D + 10, 20).a());
      this.E = this.d(exr.a(vg.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.k(this.G)).a($$0, g(7), this.D + 10, 20).a());
      this.F = this.d(exr.a(vg.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.A.h.get(this.G).c()) {
            this.j(this.G);
         } else {
            this.i(this.G);
         }
      }).a($$0, g(9), this.D + 10, 20).a());
      this.d(exr.a(vf.k, $$0x -> this.H()).a($$0 + this.D / 2 + 2, g(12), this.D / 2 + 10 - 2, 20).a());
      this.E();
   }

   void E() {
      this.E.k = this.h(this.G);
      this.F.k = this.h(this.G);
      this.B.d();
   }

   private boolean h(int $$0) {
      return $$0 != -1;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.H();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void H() {
      if (this.H) {
         this.f.a(this.z.f());
      } else {
         this.f.a(this.z);
      }
   }

   void i(int $$0) {
      era $$1 = era.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.b(this.A.a, $$2));
      } catch (esn var5) {
         a.error("Couldn't op the user", var5);
      }

      this.E();
   }

   void j(int $$0) {
      era $$1 = era.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.c(this.A.a, $$2));
      } catch (esn var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.E();
   }

   private void a(erj $$0) {
      for (ern $$1 : this.A.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void k(int $$0) {
      this.E();
      if ($$0 >= 0 && $$0 < this.A.h.size()) {
         ern $$1 = this.A.h.get($$0);
         etb $$2 = new etb($$1x -> {
            if ($$1x) {
               era $$2x = era.a();

               try {
                  $$2x.a(this.A.a, $$1.b());
               } catch (esn var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.A.h.remove(this.G);
               this.G = -1;
               this.E();
            }

            this.H = true;
            this.f.a(this);
         }, c, vg.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      int $$4 = g(12) + 20;
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      $$0.a(b, 0, $$4, 0.0F, 0.0F, this.g, this.h - $$4, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      String $$5 = this.A.h != null ? Integer.toString(this.A.h.size()) : "0";
      $$0.a(this.i, vg.a("mco.configure.world.invited.number", $$5), this.C, g(0), -1, false);
   }

   class a extends eyn.a<etm.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final eze f = new eze(new ahh("player_list/remove_player"), new ahh("player_list/remove_player_highlighted"));
      private static final eze g = new eze(new ahh("player_list/make_operator"), new ahh("player_list/make_operator_highlighted"));
      private static final eze h = new eze(new ahh("player_list/remove_operator"), new ahh("player_list/remove_operator_highlighted"));
      private final ern i;
      private final List<exp> j = new ArrayList<>();
      private final eyd k;
      private final eyd l;
      private final eyd m;

      public a(ern $$0) {
         this.i = $$0;
         int $$1 = etm.this.A.h.indexOf(this.i);
         int $$2 = etm.this.B.r() - 16 - 9;
         int $$3 = etm.this.B.g($$1) + 1;
         this.k = new eyd($$2, $$3, 8, 7, f, $$1x -> etm.this.k($$1), vf.a);
         this.k.a(ezc.a(etm.x));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new eyd($$2, $$3, 8, 7, g, $$1x -> etm.this.i($$1), vf.a);
         this.l.a(ezc.a(etm.v));
         this.j.add(this.l);
         this.m = new eyd($$2, $$3, 8, 7, h, $$1x -> etm.this.j($$1), vf.a);
         this.m.a(ezc.a(etm.w));
         this.j.add(this.m);
         this.b();
      }

      public void b() {
         this.l.k = !this.i.c();
         this.m.k = !this.l.k;
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
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         euh.a($$0, etm.this.C + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(etm.this.i, this.i.a(), etm.this.C + 3 + 12, $$2 + 1, $$10, false);
         this.j.forEach($$5x -> {
            $$5x.o($$2 + 1);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public vg a() {
         return vg.a("narrator.select", this.i.a());
      }
   }

   class b extends glc<etm.a> {
      public b() {
         super(etm.this.D + 10, etm.g(12) + 20, etm.g(1), 13);
      }

      public void d() {
         if (etm.this.G != -1) {
            this.d(etm.this.G).b();
         }
      }

      public void a(ern $$0) {
         this.a((etm.a)(etm.this.new a($$0)));
      }

      @Override
      public int b() {
         return (int)((double)this.g * 1.0);
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         this.b($$0);
      }

      public void b(int $$0) {
         etm.this.G = $$0;
         etm.this.E();
      }

      public void a(@Nullable etm.a $$0) {
         super.a($$0);
         etm.this.G = this.l().indexOf($$0);
         etm.this.E();
      }

      @Override
      public int c() {
         return etm.this.C + this.g;
      }

      @Override
      public int a() {
         return this.n() * 13;
      }
   }
}

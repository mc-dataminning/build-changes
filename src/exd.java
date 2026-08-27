import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exd extends gpe {
   private static final Logger a = LogUtils.getLogger();
   private static final ajh b = new ajh("minecraft", "textures/gui/options_background.png");
   private static final vu c = vu.c("mco.question");
   static final vu v = vu.c("mco.configure.world.invites.normal.tooltip");
   static final vu w = vu.c("mco.configure.world.invites.ops.tooltip");
   static final vu x = vu.c("mco.configure.world.invites.remove.tooltip");
   private static final int y = -1;
   private final ewr z;
   final evi A;
   exd.b B;
   int C;
   int D;
   private fbi E;
   private fbi F;
   int G = -1;
   private boolean H;

   public exd(ewr $$0, evi $$1) {
      super(vu.c("mco.configure.world.players.title"));
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aO_() {
      this.C = this.g / 2 - 160;
      this.D = 150;
      int $$0 = this.g / 2 + 12;
      this.B = this.c(new exd.b());
      this.B.m(this.C);

      for (eve $$1 : this.A.h) {
         this.B.a($$1);
      }

      this.G = -1;
      this.c(fbi.a(vu.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new eww(this.z, this, this.A))).a($$0, g(1), this.D + 10, 20).a());
      this.E = this.c(fbi.a(vu.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.k(this.G)).a($$0, g(7), this.D + 10, 20).a());
      this.F = this.c(fbi.a(vu.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.A.h.get(this.G).c()) {
            this.j(this.G);
         } else {
            this.i(this.G);
         }
      }).a($$0, g(9), this.D + 10, 20).a());
      this.c(fbi.a(vt.k, $$0x -> this.H()).a($$0 + this.D / 2 + 2, g(12), this.D / 2 + 10 - 2, 20).a());
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
      eur $$1 = eur.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.b(this.A.a, $$2));
      } catch (ewe var5) {
         a.error("Couldn't op the user", var5);
      }

      this.E();
   }

   void j(int $$0) {
      eur $$1 = eur.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.c(this.A.a, $$2));
      } catch (ewe var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.E();
   }

   private void a(eva $$0) {
      for (eve $$1 : this.A.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void k(int $$0) {
      this.E();
      if ($$0 >= 0 && $$0 < this.A.h.size()) {
         eve $$1 = this.A.h.get($$0);
         ews $$2 = new ews($$1x -> {
            if ($$1x) {
               eur $$2x = eur.a();

               try {
                  $$2x.a(this.A.a, $$1.b());
               } catch (ewe var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.A.h.remove(this.G);
               this.G = -1;
               this.E();
            }

            this.H = true;
            this.f.a(this);
         }, c, vu.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      int $$4 = g(12) + 20;
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      $$0.a(b, 0, $$4, 0.0F, 0.0F, this.g, this.h - $$4, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      String $$5 = this.A.h != null ? Integer.toString(this.A.h.size()) : "0";
      $$0.a(this.i, vu.a("mco.configure.world.invited.number", $$5), this.C, g(0), -1, false);
   }

   class a extends fce.a<exd.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final fcv f = new fcv(new ajh("player_list/remove_player"), new ajh("player_list/remove_player_highlighted"));
      private static final fcv g = new fcv(new ajh("player_list/make_operator"), new ajh("player_list/make_operator_highlighted"));
      private static final fcv h = new fcv(new ajh("player_list/remove_operator"), new ajh("player_list/remove_operator_highlighted"));
      private final eve i;
      private final List<fbg> j = new ArrayList<>();
      private final fbu k;
      private final fbu l;
      private final fbu m;

      public a(eve $$0) {
         this.i = $$0;
         int $$1 = exd.this.A.h.indexOf(this.i);
         int $$2 = exd.this.B.r() - 16 - 9;
         int $$3 = exd.this.B.g($$1) + 1;
         this.k = new fbu($$2, $$3, 8, 7, f, $$1x -> exd.this.k($$1), vt.a);
         this.k.a(fct.a(exd.x));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new fbu($$2, $$3, 8, 7, g, $$1x -> exd.this.i($$1), vt.a);
         this.l.a(fct.a(exd.v));
         this.j.add(this.l);
         this.m = new fbu($$2, $$3, 8, 7, h, $$1x -> exd.this.j($$1), vt.a);
         this.m.a(fct.a(exd.w));
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
      public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         exy.a($$0, exd.this.C + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(exd.this.i, this.i.a(), exd.this.C + 3 + 12, $$2 + 1, $$10, false);
         this.j.forEach($$5x -> {
            $$5x.n($$2 + 1);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public vu a() {
         return vu.a("narrator.select", this.i.a());
      }
   }

   class b extends gpd<exd.a> {
      public b() {
         super(exd.this.D + 10, exd.g(12) + 20, exd.g(1), 13);
      }

      public void d() {
         if (exd.this.G != -1) {
            this.d(exd.this.G).b();
         }
      }

      public void a(eve $$0) {
         this.a((exd.a)(exd.this.new a($$0)));
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
         exd.this.G = $$0;
         exd.this.E();
      }

      public void a(@Nullable exd.a $$0) {
         super.a($$0);
         exd.this.G = this.l().indexOf($$0);
         exd.this.E();
      }

      @Override
      public int c() {
         return exd.this.C + this.g;
      }

      @Override
      public int a() {
         return this.n() * 13;
      }
   }
}

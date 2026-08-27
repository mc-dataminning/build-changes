import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class evj extends gnd {
   private static final Logger a = LogUtils.getLogger();
   private static final aiy b = new aiy("minecraft", "textures/gui/options_background.png");
   private static final vq c = vq.c("mco.question");
   static final vq v = vq.c("mco.configure.world.invites.normal.tooltip");
   static final vq w = vq.c("mco.configure.world.invites.ops.tooltip");
   static final vq x = vq.c("mco.configure.world.invites.remove.tooltip");
   private static final int y = -1;
   private final eux z;
   final eto A;
   evj.b B;
   int C;
   int D;
   private ezo E;
   private ezo F;
   int G = -1;
   private boolean H;

   public evj(eux $$0, eto $$1) {
      super(vq.c("mco.configure.world.players.title"));
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aQ_() {
      this.C = this.g / 2 - 160;
      this.D = 150;
      int $$0 = this.g / 2 + 12;
      this.B = this.c(new evj.b());
      this.B.m(this.C);

      for (etk $$1 : this.A.h) {
         this.B.a($$1);
      }

      this.G = -1;
      this.c(ezo.a(vq.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new evc(this.z, this, this.A))).a($$0, g(1), this.D + 10, 20).a());
      this.E = this.c(ezo.a(vq.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.k(this.G)).a($$0, g(7), this.D + 10, 20).a());
      this.F = this.c(ezo.a(vq.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.A.h.get(this.G).c()) {
            this.j(this.G);
         } else {
            this.i(this.G);
         }
      }).a($$0, g(9), this.D + 10, 20).a());
      this.c(ezo.a(vp.k, $$0x -> this.H()).a($$0 + this.D / 2 + 2, g(12), this.D / 2 + 10 - 2, 20).a());
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
      esx $$1 = esx.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.b(this.A.a, $$2));
      } catch (euk var5) {
         a.error("Couldn't op the user", var5);
      }

      this.E();
   }

   void j(int $$0) {
      esx $$1 = esx.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.c(this.A.a, $$2));
      } catch (euk var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.E();
   }

   private void a(etg $$0) {
      for (etk $$1 : this.A.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void k(int $$0) {
      this.E();
      if ($$0 >= 0 && $$0 < this.A.h.size()) {
         etk $$1 = this.A.h.get($$0);
         euy $$2 = new euy($$1x -> {
            if ($$1x) {
               esx $$2x = esx.a();

               try {
                  $$2x.a(this.A.a, $$1.b());
               } catch (euk var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.A.h.remove(this.G);
               this.G = -1;
               this.E();
            }

            this.H = true;
            this.f.a(this);
         }, c, vq.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      int $$4 = g(12) + 20;
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      $$0.a(b, 0, $$4, 0.0F, 0.0F, this.g, this.h - $$4, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      String $$5 = this.A.h != null ? Integer.toString(this.A.h.size()) : "0";
      $$0.a(this.i, vq.a("mco.configure.world.invited.number", $$5), this.C, g(0), -1, false);
   }

   class a extends fak.a<evj.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final fbb f = new fbb(new aiy("player_list/remove_player"), new aiy("player_list/remove_player_highlighted"));
      private static final fbb g = new fbb(new aiy("player_list/make_operator"), new aiy("player_list/make_operator_highlighted"));
      private static final fbb h = new fbb(new aiy("player_list/remove_operator"), new aiy("player_list/remove_operator_highlighted"));
      private final etk i;
      private final List<ezm> j = new ArrayList<>();
      private final faa k;
      private final faa l;
      private final faa m;

      public a(etk $$0) {
         this.i = $$0;
         int $$1 = evj.this.A.h.indexOf(this.i);
         int $$2 = evj.this.B.r() - 16 - 9;
         int $$3 = evj.this.B.g($$1) + 1;
         this.k = new faa($$2, $$3, 8, 7, f, $$1x -> evj.this.k($$1), vp.a);
         this.k.a(faz.a(evj.x));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new faa($$2, $$3, 8, 7, g, $$1x -> evj.this.i($$1), vp.a);
         this.l.a(faz.a(evj.v));
         this.j.add(this.l);
         this.m = new faa($$2, $$3, 8, 7, h, $$1x -> evj.this.j($$1), vp.a);
         this.m.a(faz.a(evj.w));
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
      public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         ewe.a($$0, evj.this.C + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(evj.this.i, this.i.a(), evj.this.C + 3 + 12, $$2 + 1, $$10, false);
         this.j.forEach($$5x -> {
            $$5x.n($$2 + 1);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public vq a() {
         return vq.a("narrator.select", this.i.a());
      }
   }

   class b extends gnc<evj.a> {
      public b() {
         super(evj.this.D + 10, evj.g(12) + 20, evj.g(1), 13);
      }

      public void d() {
         if (evj.this.G != -1) {
            this.d(evj.this.G).b();
         }
      }

      public void a(etk $$0) {
         this.a((evj.a)(evj.this.new a($$0)));
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
         evj.this.G = $$0;
         evj.this.E();
      }

      public void a(@Nullable evj.a $$0) {
         super.a($$0);
         evj.this.G = this.l().indexOf($$0);
         evj.this.E();
      }

      @Override
      public int c() {
         return evj.this.C + this.g;
      }

      @Override
      public int a() {
         return this.n() * 13;
      }
   }
}

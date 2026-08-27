import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class etb extends gkn {
   private static final Logger a = LogUtils.getLogger();
   private static final ahg b = new ahg("minecraft", "textures/gui/options_background.png");
   private static final vf c = vf.c("mco.question");
   static final vf v = vf.c("mco.configure.world.invites.normal.tooltip");
   static final vf w = vf.c("mco.configure.world.invites.ops.tooltip");
   static final vf x = vf.c("mco.configure.world.invites.remove.tooltip");
   private static final int y = -1;
   private final esp z;
   final erg A;
   etb.b B;
   int C;
   int D;
   private exe E;
   private exe F;
   int G = -1;
   private boolean H;

   public etb(esp $$0, erg $$1) {
      super(vf.c("mco.configure.world.players.title"));
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aN_() {
      this.C = this.g / 2 - 160;
      this.D = 150;
      int $$0 = this.g / 2 + 12;
      this.B = this.d(new etb.b());
      this.B.n(this.C);

      for (erc $$1 : this.A.h) {
         this.B.a($$1);
      }

      this.G = -1;
      this.d(exe.a(vf.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new esu(this.z, this, this.A))).a($$0, g(1), this.D + 10, 20).a());
      this.E = this.d(exe.a(vf.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.k(this.G)).a($$0, g(7), this.D + 10, 20).a());
      this.F = this.d(exe.a(vf.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.A.h.get(this.G).c()) {
            this.j(this.G);
         } else {
            this.i(this.G);
         }
      }).a($$0, g(9), this.D + 10, 20).a());
      this.d(exe.a(ve.k, $$0x -> this.D()).a($$0 + this.D / 2 + 2, g(12), this.D / 2 + 10 - 2, 20).a());
      this.C();
   }

   @Override
   void C() {
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
         this.D();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void D() {
      if (this.H) {
         this.f.a(this.z.f());
      } else {
         this.f.a(this.z);
      }
   }

   void i(int $$0) {
      eqp $$1 = eqp.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.b(this.A.a, $$2));
      } catch (esc var5) {
         a.error("Couldn't op the user", var5);
      }

      this.C();
   }

   void j(int $$0) {
      eqp $$1 = eqp.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.c(this.A.a, $$2));
      } catch (esc var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.C();
   }

   private void a(eqy $$0) {
      for (erc $$1 : this.A.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void k(int $$0) {
      this.C();
      if ($$0 >= 0 && $$0 < this.A.h.size()) {
         erc $$1 = this.A.h.get($$0);
         esq $$2 = new esq($$1x -> {
            if ($$1x) {
               eqp $$2x = eqp.a();

               try {
                  $$2x.a(this.A.a, $$1.b());
               } catch (esc var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.A.h.remove(this.G);
               this.G = -1;
               this.C();
            }

            this.H = true;
            this.f.a(this);
         }, c, vf.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      int $$4 = g(12) + 20;
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      $$0.a(b, 0, $$4, 0.0F, 0.0F, this.g, this.h - $$4, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      String $$5 = this.A.h != null ? Integer.toString(this.A.h.size()) : "0";
      $$0.a(this.i, vf.a("mco.configure.world.invited.number", $$5), this.C, g(0), -1, false);
   }

   class a extends eya.a<etb.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final eyr f = new eyr(new ahg("player_list/remove_player"), new ahg("player_list/remove_player_highlighted"));
      private static final eyr g = new eyr(new ahg("player_list/make_operator"), new ahg("player_list/make_operator_highlighted"));
      private static final eyr h = new eyr(new ahg("player_list/remove_operator"), new ahg("player_list/remove_operator_highlighted"));
      private final erc i;
      private final List<exc> j = new ArrayList<>();
      private final exq k;
      private final exq l;
      private final exq m;

      public a(erc $$0) {
         this.i = $$0;
         int $$1 = etb.this.A.h.indexOf(this.i);
         int $$2 = etb.this.B.r() - 16 - 9;
         int $$3 = etb.this.B.g($$1) + 1;
         this.k = new exq($$2, $$3, 8, 7, f, $$1x -> etb.this.k($$1), ve.a);
         this.k.a(eyp.a(etb.x));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new exq($$2, $$3, 8, 7, g, $$1x -> etb.this.i($$1), ve.a);
         this.l.a(eyp.a(etb.v));
         this.j.add(this.l);
         this.m = new exq($$2, $$3, 8, 7, h, $$1x -> etb.this.j($$1), ve.a);
         this.m.a(eyp.a(etb.w));
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
      public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         etw.a($$0, etb.this.C + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(etb.this.i, this.i.a(), etb.this.C + 3 + 12, $$2 + 1, $$10, false);
         this.j.forEach($$5x -> {
            $$5x.o($$2 + 1);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public vf a() {
         return vf.a("narrator.select", this.i.a());
      }
   }

   class b extends gkm<etb.a> {
      public b() {
         super(etb.this.D + 10, etb.g(12) + 20, etb.g(1), 13);
      }

      public void d() {
         if (etb.this.G != -1) {
            this.d(etb.this.G).b();
         }
      }

      public void a(erc $$0) {
         this.a((etb.a)(etb.this.new a($$0)));
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
         etb.this.G = $$0;
         etb.this.C();
      }

      public void a(@Nullable etb.a $$0) {
         super.a($$0);
         etb.this.G = this.l().indexOf($$0);
         etb.this.C();
      }

      @Override
      public int c() {
         return etb.this.C + this.g;
      }

      @Override
      public int a() {
         return this.n() * 13;
      }
   }
}

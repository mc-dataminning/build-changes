import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class etd extends gkp {
   private static final Logger a = LogUtils.getLogger();
   private static final ahg b = new ahg("minecraft", "textures/gui/options_background.png");
   private static final vf c = vf.c("mco.question");
   static final vf v = vf.c("mco.configure.world.invites.normal.tooltip");
   static final vf w = vf.c("mco.configure.world.invites.ops.tooltip");
   static final vf x = vf.c("mco.configure.world.invites.remove.tooltip");
   private static final int y = -1;
   private final esr z;
   final eri A;
   etd.b B;
   int C;
   int D;
   private exg E;
   private exg F;
   int G = -1;
   private boolean H;

   public etd(esr $$0, eri $$1) {
      super(vf.c("mco.configure.world.players.title"));
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aN_() {
      this.C = this.g / 2 - 160;
      this.D = 150;
      int $$0 = this.g / 2 + 12;
      this.B = this.d(new etd.b());
      this.B.n(this.C);

      for (ere $$1 : this.A.h) {
         this.B.a($$1);
      }

      this.G = -1;
      this.d(exg.a(vf.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new esw(this.z, this, this.A))).a($$0, g(1), this.D + 10, 20).a());
      this.E = this.d(exg.a(vf.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.k(this.G)).a($$0, g(7), this.D + 10, 20).a());
      this.F = this.d(exg.a(vf.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.A.h.get(this.G).c()) {
            this.j(this.G);
         } else {
            this.i(this.G);
         }
      }).a($$0, g(9), this.D + 10, 20).a());
      this.d(exg.a(ve.k, $$0x -> this.E()).a($$0 + this.D / 2 + 2, g(12), this.D / 2 + 10 - 2, 20).a());
      this.D();
   }

   void D() {
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
         this.E();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void E() {
      if (this.H) {
         this.f.a(this.z.f());
      } else {
         this.f.a(this.z);
      }
   }

   void i(int $$0) {
      eqr $$1 = eqr.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.b(this.A.a, $$2));
      } catch (ese var5) {
         a.error("Couldn't op the user", var5);
      }

      this.D();
   }

   void j(int $$0) {
      eqr $$1 = eqr.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.c(this.A.a, $$2));
      } catch (ese var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.D();
   }

   private void a(era $$0) {
      for (ere $$1 : this.A.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void k(int $$0) {
      this.D();
      if ($$0 >= 0 && $$0 < this.A.h.size()) {
         ere $$1 = this.A.h.get($$0);
         ess $$2 = new ess($$1x -> {
            if ($$1x) {
               eqr $$2x = eqr.a();

               try {
                  $$2x.a(this.A.a, $$1.b());
               } catch (ese var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.A.h.remove(this.G);
               this.G = -1;
               this.D();
            }

            this.H = true;
            this.f.a(this);
         }, c, vf.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      int $$4 = g(12) + 20;
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      $$0.a(b, 0, $$4, 0.0F, 0.0F, this.g, this.h - $$4, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      String $$5 = this.A.h != null ? Integer.toString(this.A.h.size()) : "0";
      $$0.a(this.i, vf.a("mco.configure.world.invited.number", $$5), this.C, g(0), -1, false);
   }

   class a extends eyc.a<etd.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final eyt f = new eyt(new ahg("player_list/remove_player"), new ahg("player_list/remove_player_highlighted"));
      private static final eyt g = new eyt(new ahg("player_list/make_operator"), new ahg("player_list/make_operator_highlighted"));
      private static final eyt h = new eyt(new ahg("player_list/remove_operator"), new ahg("player_list/remove_operator_highlighted"));
      private final ere i;
      private final List<exe> j = new ArrayList<>();
      private final exs k;
      private final exs l;
      private final exs m;

      public a(ere $$0) {
         this.i = $$0;
         int $$1 = etd.this.A.h.indexOf(this.i);
         int $$2 = etd.this.B.r() - 16 - 9;
         int $$3 = etd.this.B.g($$1) + 1;
         this.k = new exs($$2, $$3, 8, 7, f, $$1x -> etd.this.k($$1), ve.a);
         this.k.a(eyr.a(etd.x));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new exs($$2, $$3, 8, 7, g, $$1x -> etd.this.i($$1), ve.a);
         this.l.a(eyr.a(etd.v));
         this.j.add(this.l);
         this.m = new exs($$2, $$3, 8, 7, h, $$1x -> etd.this.j($$1), ve.a);
         this.m.a(eyr.a(etd.w));
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
      public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         ety.a($$0, etd.this.C + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(etd.this.i, this.i.a(), etd.this.C + 3 + 12, $$2 + 1, $$10, false);
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

   class b extends gko<etd.a> {
      public b() {
         super(etd.this.D + 10, etd.g(12) + 20, etd.g(1), 13);
      }

      public void d() {
         if (etd.this.G != -1) {
            this.d(etd.this.G).b();
         }
      }

      public void a(ere $$0) {
         this.a((etd.a)(etd.this.new a($$0)));
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
         etd.this.G = $$0;
         etd.this.D();
      }

      public void a(@Nullable etd.a $$0) {
         super.a($$0);
         etd.this.G = this.l().indexOf($$0);
         etd.this.D();
      }

      @Override
      public int c() {
         return etd.this.C + this.g;
      }

      @Override
      public int a() {
         return this.n() * 13;
      }
   }
}

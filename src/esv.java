import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esv extends gkc {
   private static final Logger a = LogUtils.getLogger();
   private static final ahd b = new ahd("minecraft", "textures/gui/options_background.png");
   private static final vd c = vd.c("mco.question");
   static final vd v = vd.c("mco.configure.world.invites.normal.tooltip");
   static final vd w = vd.c("mco.configure.world.invites.ops.tooltip");
   static final vd x = vd.c("mco.configure.world.invites.remove.tooltip");
   private static final int y = -1;
   private final esj z;
   final era A;
   esv.b B;
   int C;
   int D;
   private ewy E;
   private ewy F;
   int G = -1;
   private boolean H;

   public esv(esj $$0, era $$1) {
      super(vd.c("mco.configure.world.players.title"));
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aN_() {
      this.C = this.g / 2 - 160;
      this.D = 150;
      int $$0 = this.g / 2 + 12;
      this.B = this.d(new esv.b());
      this.B.n(this.C);

      for (eqw $$1 : this.A.h) {
         this.B.a($$1);
      }

      this.G = -1;
      this.d(ewy.a(vd.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new eso(this.z, this, this.A))).a($$0, g(1), this.D + 10, 20).a());
      this.E = this.d(ewy.a(vd.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.k(this.G)).a($$0, g(7), this.D + 10, 20).a());
      this.F = this.d(ewy.a(vd.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.A.h.get(this.G).c()) {
            this.j(this.G);
         } else {
            this.i(this.G);
         }
      }).a($$0, g(9), this.D + 10, 20).a());
      this.d(ewy.a(vc.k, $$0x -> this.D()).a($$0 + this.D / 2 + 2, g(12), this.D / 2 + 10 - 2, 20).a());
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
      eqj $$1 = eqj.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.b(this.A.a, $$2));
      } catch (erw var5) {
         a.error("Couldn't op the user", var5);
      }

      this.C();
   }

   void j(int $$0) {
      eqj $$1 = eqj.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.c(this.A.a, $$2));
      } catch (erw var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.C();
   }

   private void a(eqs $$0) {
      for (eqw $$1 : this.A.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void k(int $$0) {
      this.C();
      if ($$0 >= 0 && $$0 < this.A.h.size()) {
         eqw $$1 = this.A.h.get($$0);
         esk $$2 = new esk($$1x -> {
            if ($$1x) {
               eqj $$2x = eqj.a();

               try {
                  $$2x.a(this.A.a, $$1.b());
               } catch (erw var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.A.h.remove(this.G);
               this.G = -1;
               this.C();
            }

            this.H = true;
            this.f.a(this);
         }, c, vd.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      int $$4 = g(12) + 20;
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      $$0.a(b, 0, $$4, 0.0F, 0.0F, this.g, this.h - $$4, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      String $$5 = this.A.h != null ? Integer.toString(this.A.h.size()) : "0";
      $$0.a(this.i, vd.a("mco.configure.world.invited.number", $$5), this.C, g(0), -1, false);
   }

   class a extends exu.a<esv.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final eyl f = new eyl(new ahd("player_list/remove_player"), new ahd("player_list/remove_player_highlighted"));
      private static final eyl g = new eyl(new ahd("player_list/make_operator"), new ahd("player_list/make_operator_highlighted"));
      private static final eyl h = new eyl(new ahd("player_list/remove_operator"), new ahd("player_list/remove_operator_highlighted"));
      private final eqw i;
      private final List<eww> j = new ArrayList<>();
      private final exk k;
      private final exk l;
      private final exk m;

      public a(eqw $$0) {
         this.i = $$0;
         int $$1 = esv.this.A.h.indexOf(this.i);
         int $$2 = esv.this.B.r() - 16 - 9;
         int $$3 = esv.this.B.g($$1) + 1;
         this.k = new exk($$2, $$3, 8, 7, f, $$1x -> esv.this.k($$1), vc.a);
         this.k.a(eyj.a(esv.x));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new exk($$2, $$3, 8, 7, g, $$1x -> esv.this.i($$1), vc.a);
         this.l.a(eyj.a(esv.v));
         this.j.add(this.l);
         this.m = new exk($$2, $$3, 8, 7, h, $$1x -> esv.this.j($$1), vc.a);
         this.m.a(eyj.a(esv.w));
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
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         etq.a($$0, esv.this.C + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(esv.this.i, this.i.a(), esv.this.C + 3 + 12, $$2 + 1, $$10, false);
         this.j.forEach($$5x -> {
            $$5x.o($$2 + 1);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public vd a() {
         return vd.a("narrator.select", this.i.a());
      }
   }

   class b extends gkb<esv.a> {
      public b() {
         super(esv.this.D + 10, esv.g(12) + 20, esv.g(1), 13);
      }

      public void d() {
         if (esv.this.G != -1) {
            this.d(esv.this.G).b();
         }
      }

      public void a(eqw $$0) {
         this.a((esv.a)(esv.this.new a($$0)));
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
         esv.this.G = $$0;
         esv.this.C();
      }

      public void a(@Nullable esv.a $$0) {
         super.a($$0);
         esv.this.G = this.l().indexOf($$0);
         esv.this.C();
      }

      @Override
      public int c() {
         return esv.this.C + this.g;
      }

      @Override
      public int a() {
         return this.n() * 13;
      }
   }
}

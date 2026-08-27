import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eoh extends ger {
   private static final Logger a = LogUtils.getLogger();
   private static final aer b = new aer("minecraft", "textures/gui/options_background.png");
   private static final tf c = tf.c("mco.question");
   static final tf y = tf.c("mco.configure.world.invites.normal.tooltip");
   static final tf z = tf.c("mco.configure.world.invites.ops.tooltip");
   static final tf A = tf.c("mco.configure.world.invites.remove.tooltip");
   private static final int B = -1;
   private final enw C;
   final emm D;
   eoh.b E;
   int F;
   int G;
   private esg H;
   private esg I;
   int J = -1;
   private boolean K;

   public eoh(enw $$0, emm $$1) {
      super(tf.c("mco.configure.world.players.title"));
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   public void aC_() {
      this.F = this.g / 2 - 160;
      this.G = 150;
      int $$0 = this.g / 2 + 12;
      this.E = new eoh.b();
      this.E.f(this.F);
      this.e(this.E);

      for (emi $$1 : this.D.h) {
         this.E.a($$1);
      }

      this.J = -1;
      this.d(esg.a(tf.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new eob(this.C, this, this.D))).a($$0, h(1), this.G + 10, 20).a());
      this.H = this.d(esg.a(tf.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.l(this.J)).a($$0, h(7), this.G + 10, 20).a());
      this.I = this.d(esg.a(tf.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.D.h.get(this.J).c()) {
            this.k(this.J);
         } else {
            this.j(this.J);
         }
      }).a($$0, h(9), this.G + 10, 20).a());
      this.d(esg.a(te.k, $$0x -> this.D()).a($$0 + this.G / 2 + 2, h(12), this.G / 2 + 10 - 2, 20).a());
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
         this.f.a(this.C.g());
      } else {
         this.f.a(this.C);
      }
   }

   void j(int $$0) {
      elv $$1 = elv.a();
      UUID $$2 = this.D.h.get($$0).b();

      try {
         this.a($$1.b(this.D.a, $$2));
      } catch (eni var5) {
         a.error("Couldn't op the user", var5);
      }

      this.C();
   }

   void k(int $$0) {
      elv $$1 = elv.a();
      UUID $$2 = this.D.h.get($$0).b();

      try {
         this.a($$1.c(this.D.a, $$2));
      } catch (eni var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.C();
   }

   private void a(eme $$0) {
      for (emi $$1 : this.D.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void l(int $$0) {
      this.C();
      if ($$0 >= 0 && $$0 < this.D.h.size()) {
         emi $$1 = this.D.h.get($$0);
         enx $$2 = new enx($$1x -> {
            if ($$1x) {
               elv $$2x = elv.a();

               try {
                  $$2x.a(this.D.a, $$1.b());
               } catch (eni var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.D.h.remove(this.J);
               this.J = -1;
               this.C();
            }

            this.K = true;
            this.f.a(this);
         }, c, tf.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      int $$4 = h(12) + 20;
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      $$0.a(b, 0, $$4, 0.0F, 0.0F, this.g, this.h - $$4, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      String $$5 = this.D.h != null ? Integer.toString(this.D.h.size()) : "0";
      $$0.a(this.i, tf.a("mco.configure.world.invited.number", $$5), this.F, h(0), -6250336, false);
   }

   class a extends etc.a<eoh.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final ets f = new ets(new aer("player_list/remove_player"), new aer("player_list/remove_player_highlighted"));
      private static final ets g = new ets(new aer("player_list/make_operator"), new aer("player_list/make_operator_highlighted"));
      private static final ets h = new ets(new aer("player_list/remove_operator"), new aer("player_list/remove_operator_highlighted"));
      private final emi i;
      private final List<ese> j = new ArrayList<>();
      private final ess k;
      private final ess l;
      private final ess m;

      public a(emi $$0) {
         this.i = $$0;
         int $$1 = eoh.this.D.h.indexOf(this.i);
         int $$2 = eoh.this.E.p() - 16 - 9;
         int $$3 = eoh.this.E.g($$1) + 1;
         this.k = new ess($$2, $$3, 8, 7, f, $$1x -> eoh.this.l($$1), te.a);
         this.k.a(etq.a(eoh.A));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new ess($$2, $$3, 8, 7, g, $$1x -> eoh.this.j($$1), te.a);
         this.l.a(etq.a(eoh.y));
         this.j.add(this.l);
         this.m = new ess($$2, $$3, 8, 7, h, $$1x -> eoh.this.k($$1), te.a);
         this.m.a(etq.a(eoh.z));
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
      public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         epc.a($$0, eoh.this.F + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(eoh.this.i, this.i.a(), eoh.this.F + 3 + 12, $$2 + 1, $$10, false);
         this.j.forEach($$5x -> {
            $$5x.g($$2 + 1);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public tf a() {
         return tf.a("narrator.select", this.i.a());
      }
   }

   class b extends geq<eoh.a> {
      public b() {
         super(eoh.this.G + 10, eoh.h(12) + 20, eoh.h(1), eoh.h(12) + 20, 13);
      }

      public void d() {
         if (eoh.this.J != -1) {
            this.d(eoh.this.J).b();
         }
      }

      public void a(emi $$0) {
         this.a((eoh.a)(eoh.this.new a($$0)));
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
         eoh.this.J = $$0;
         eoh.this.C();
      }

      public void a(@Nullable eoh.a $$0) {
         super.a($$0);
         eoh.this.J = this.i().indexOf($$0);
         eoh.this.C();
      }

      @Override
      public int c() {
         return eoh.this.F + this.e - 5;
      }

      @Override
      public int a() {
         return this.k() * 13;
      }
   }
}

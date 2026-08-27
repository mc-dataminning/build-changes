import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eoi extends gei {
   private static final Logger a = LogUtils.getLogger();
   private static final aer b = new aer("minecraft", "textures/gui/options_background.png");
   private static final tf c = tf.c("mco.question");
   static final tf y = tf.c("mco.configure.world.invites.normal.tooltip");
   static final tf z = tf.c("mco.configure.world.invites.ops.tooltip");
   static final tf A = tf.c("mco.configure.world.invites.remove.tooltip");
   private static final int B = -1;
   private final enx C;
   final emn D;
   eoi.b E;
   int F;
   int G;
   private esh H;
   private esh I;
   int J = -1;
   private boolean K;

   public eoi(enx $$0, emn $$1) {
      super(tf.c("mco.configure.world.players.title"));
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   public void aE_() {
      this.F = this.g / 2 - 160;
      this.G = 150;
      int $$0 = this.g / 2 + 12;
      this.E = new eoi.b();
      this.E.f(this.F);
      this.e(this.E);

      for (emj $$1 : this.D.h) {
         this.E.a($$1);
      }

      this.J = -1;
      this.d(esh.a(tf.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new eoc(this.C, this, this.D))).a($$0, h(1), this.G + 10, 20).a());
      this.H = this.d(esh.a(tf.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.l(this.J)).a($$0, h(7), this.G + 10, 20).a());
      this.I = this.d(esh.a(tf.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.D.h.get(this.J).c()) {
            this.k(this.J);
         } else {
            this.j(this.J);
         }
      }).a($$0, h(9), this.G + 10, 20).a());
      this.d(esh.a(te.k, $$0x -> this.C()).a($$0 + this.G / 2 + 2, h(12), this.G / 2 + 10 - 2, 20).a());
      this.B();
   }

   @Override
   void B() {
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
         this.C();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void C() {
      if (this.K) {
         this.f.a(this.C.f());
      } else {
         this.f.a(this.C);
      }
   }

   void j(int $$0) {
      elw $$1 = elw.a();
      UUID $$2 = this.D.h.get($$0).b();

      try {
         this.a($$1.b(this.D.a, $$2));
      } catch (enj var5) {
         a.error("Couldn't op the user", var5);
      }

      this.B();
   }

   void k(int $$0) {
      elw $$1 = elw.a();
      UUID $$2 = this.D.h.get($$0).b();

      try {
         this.a($$1.c(this.D.a, $$2));
      } catch (enj var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.B();
   }

   private void a(emf $$0) {
      for (emj $$1 : this.D.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void l(int $$0) {
      this.B();
      if ($$0 >= 0 && $$0 < this.D.h.size()) {
         emj $$1 = this.D.h.get($$0);
         eny $$2 = new eny($$1x -> {
            if ($$1x) {
               elw $$2x = elw.a();

               try {
                  $$2x.a(this.D.a, $$1.b());
               } catch (enj var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.D.h.remove(this.J);
               this.J = -1;
               this.B();
            }

            this.K = true;
            this.f.a(this);
         }, c, tf.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
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

   class a extends etd.a<eoi.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final ets f = new ets(new aer("player_list/remove_player"), new aer("player_list/remove_player_highlighted"));
      private static final ets g = new ets(new aer("player_list/make_operator"), new aer("player_list/make_operator_highlighted"));
      private static final ets h = new ets(new aer("player_list/remove_operator"), new aer("player_list/remove_operator_highlighted"));
      private final emj i;
      private final List<esf> j = new ArrayList<>();
      private final est k;
      private final est l;
      private final est m;

      public a(emj $$0) {
         this.i = $$0;
         int $$1 = eoi.this.D.h.indexOf(this.i);
         int $$2 = eoi.this.E.p() - 16 - 9;
         int $$3 = eoi.this.E.g($$1) + 1;
         this.k = new est($$2, $$3, 8, 7, f, $$1x -> eoi.this.l($$1), te.a);
         this.k.a(etq.a(eoi.A));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new est($$2, $$3, 8, 7, g, $$1x -> eoi.this.j($$1), te.a);
         this.l.a(etq.a(eoi.y));
         this.j.add(this.l);
         this.m = new est($$2, $$3, 8, 7, h, $$1x -> eoi.this.k($$1), te.a);
         this.m.a(etq.a(eoi.z));
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
      public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         epd.a($$0, eoi.this.F + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(eoi.this.i, this.i.a(), eoi.this.F + 3 + 12, $$2 + 1, $$10, false);
         this.j.forEach($$5x -> {
            $$5x.f($$2 + 1);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public tf a() {
         return tf.a("narrator.select", this.i.a());
      }
   }

   class b extends geh<eoi.a> {
      public b() {
         super(eoi.this.G + 10, eoi.h(12) + 20, eoi.h(1), eoi.h(12) + 20, 13);
      }

      public void d() {
         if (eoi.this.J != -1) {
            this.d(eoi.this.J).b();
         }
      }

      public void a(emj $$0) {
         this.a((eoi.a)(eoi.this.new a($$0)));
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
         eoi.this.J = $$0;
         eoi.this.B();
      }

      public void a(@Nullable eoi.a $$0) {
         super.a($$0);
         eoi.this.J = this.i().indexOf($$0);
         eoi.this.B();
      }

      @Override
      public int c() {
         return eoi.this.F + this.e - 5;
      }

      @Override
      public int a() {
         return this.k() * 13;
      }
   }
}

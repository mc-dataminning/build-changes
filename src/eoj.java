import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eoj extends ged {
   private static final Logger a = LogUtils.getLogger();
   private static final aep b = new aep("minecraft", "textures/gui/options_background.png");
   private static final te c = te.c("mco.question");
   static final te y = te.c("mco.configure.world.invites.normal.tooltip");
   static final te z = te.c("mco.configure.world.invites.ops.tooltip");
   static final te A = te.c("mco.configure.world.invites.remove.tooltip");
   private static final int B = -1;
   private final eny C;
   final emo D;
   eoj.b E;
   int F;
   int G;
   private esi H;
   private esi I;
   int J = -1;
   private boolean K;

   public eoj(eny $$0, emo $$1) {
      super(te.c("mco.configure.world.players.title"));
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   public void aE_() {
      this.F = this.g / 2 - 160;
      this.G = 150;
      int $$0 = this.g / 2 + 12;
      this.E = new eoj.b();
      this.E.f(this.F);
      this.e(this.E);

      for (emk $$1 : this.D.h) {
         this.E.a($$1);
      }

      this.J = -1;
      this.d(esi.a(te.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new eod(this.C, this, this.D))).a($$0, h(1), this.G + 10, 20).a());
      this.H = this.d(esi.a(te.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.l(this.J)).a($$0, h(7), this.G + 10, 20).a());
      this.I = this.d(esi.a(te.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.D.h.get(this.J).c()) {
            this.k(this.J);
         } else {
            this.j(this.J);
         }
      }).a($$0, h(9), this.G + 10, 20).a());
      this.d(esi.a(td.k, $$0x -> this.C()).a($$0 + this.G / 2 + 2, h(12), this.G / 2 + 10 - 2, 20).a());
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
      elx $$1 = elx.a();
      UUID $$2 = this.D.h.get($$0).b();

      try {
         this.a($$1.b(this.D.a, $$2));
      } catch (enk var5) {
         a.error("Couldn't op the user", var5);
      }

      this.B();
   }

   void k(int $$0) {
      elx $$1 = elx.a();
      UUID $$2 = this.D.h.get($$0).b();

      try {
         this.a($$1.c(this.D.a, $$2));
      } catch (enk var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.B();
   }

   private void a(emg $$0) {
      for (emk $$1 : this.D.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void l(int $$0) {
      this.B();
      if ($$0 >= 0 && $$0 < this.D.h.size()) {
         emk $$1 = this.D.h.get($$0);
         enz $$2 = new enz($$1x -> {
            if ($$1x) {
               elx $$2x = elx.a();

               try {
                  $$2x.a(this.D.a, $$1.b());
               } catch (enk var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.D.h.remove(this.J);
               this.J = -1;
               this.B();
            }

            this.K = true;
            this.f.a(this);
         }, c, te.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      int $$4 = h(12) + 20;
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      $$0.a(b, 0, $$4, 0.0F, 0.0F, this.g, this.h - $$4, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      String $$5 = this.D.h != null ? Integer.toString(this.D.h.size()) : "0";
      $$0.a(this.i, te.a("mco.configure.world.invited.number", $$5), this.F, h(0), -6250336, false);
   }

   class a extends ete.a<eoj.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final ett f = new ett(new aep("player_list/remove_player"), new aep("player_list/remove_player_highlighted"));
      private static final ett g = new ett(new aep("player_list/make_operator"), new aep("player_list/make_operator_highlighted"));
      private static final ett h = new ett(new aep("player_list/remove_operator"), new aep("player_list/remove_operator_highlighted"));
      private final emk i;
      private final List<esg> j = new ArrayList<>();
      private final esu k;
      private final esu l;
      private final esu m;

      public a(emk $$0) {
         this.i = $$0;
         int $$1 = eoj.this.D.h.indexOf(this.i);
         int $$2 = eoj.this.E.p() - 16 - 9;
         int $$3 = eoj.this.E.g($$1) + 1;
         this.k = new esu($$2, $$3, 8, 7, f, $$1x -> eoj.this.l($$1), td.a);
         this.k.a(etr.a(eoj.A));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new esu($$2, $$3, 8, 7, g, $$1x -> eoj.this.j($$1), td.a);
         this.l.a(etr.a(eoj.y));
         this.j.add(this.l);
         this.m = new esu($$2, $$3, 8, 7, h, $$1x -> eoj.this.k($$1), td.a);
         this.m.a(etr.a(eoj.z));
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
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         epe.a($$0, eoj.this.F + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(eoj.this.i, this.i.a(), eoj.this.F + 3 + 12, $$2 + 1, $$10, false);
         this.j.forEach($$5x -> {
            $$5x.f($$2 + 1);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public te a() {
         return te.a("narrator.select", this.i.a());
      }
   }

   class b extends gec<eoj.a> {
      public b() {
         super(eoj.this.G + 10, eoj.h(12) + 20, eoj.h(1), eoj.h(12) + 20, 13);
      }

      public void d() {
         if (eoj.this.J != -1) {
            this.d(eoj.this.J).b();
         }
      }

      public void a(emk $$0) {
         this.a((eoj.a)(eoj.this.new a($$0)));
      }

      @Override
      public int b() {
         return (int)((double)this.d * 1.0);
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         this.b($$0);
      }

      public void b(int $$0) {
         eoj.this.J = $$0;
         eoj.this.B();
      }

      public void a(@Nullable eoj.a $$0) {
         super.a($$0);
         eoj.this.J = this.i().indexOf($$0);
         eoj.this.B();
      }

      @Override
      public int c() {
         return eoj.this.F + this.d - 5;
      }

      @Override
      public int a() {
         return this.k() * 13;
      }
   }
}

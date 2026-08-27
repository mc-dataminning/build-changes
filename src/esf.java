import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esf extends gjl {
   private static final Logger a = LogUtils.getLogger();
   private static final agt b = new agt("minecraft", "textures/gui/options_background.png");
   private static final vb c = vb.c("mco.question");
   static final vb v = vb.c("mco.configure.world.invites.normal.tooltip");
   static final vb w = vb.c("mco.configure.world.invites.ops.tooltip");
   static final vb x = vb.c("mco.configure.world.invites.remove.tooltip");
   private static final int y = -1;
   private final ert z;
   final eqk A;
   esf.b B;
   int C;
   int D;
   private ewh E;
   private ewh F;
   int G = -1;
   private boolean H;

   public esf(ert $$0, eqk $$1) {
      super(vb.c("mco.configure.world.players.title"));
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aP_() {
      this.C = this.g / 2 - 160;
      this.D = 150;
      int $$0 = this.g / 2 + 12;
      this.B = new esf.b();
      this.B.f(this.C);
      this.e(this.B);

      for (eqg $$1 : this.A.h) {
         this.B.a($$1);
      }

      this.G = -1;
      this.d(ewh.a(vb.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new ery(this.z, this, this.A))).a($$0, h(1), this.D + 10, 20).a());
      this.E = this.d(ewh.a(vb.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.l(this.G)).a($$0, h(7), this.D + 10, 20).a());
      this.F = this.d(ewh.a(vb.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.A.h.get(this.G).c()) {
            this.k(this.G);
         } else {
            this.j(this.G);
         }
      }).a($$0, h(9), this.D + 10, 20).a());
      this.d(ewh.a(va.k, $$0x -> this.D()).a($$0 + this.D / 2 + 2, h(12), this.D / 2 + 10 - 2, 20).a());
      this.C();
   }

   @Override
   void C() {
      this.E.j = this.i(this.G);
      this.F.j = this.i(this.G);
      this.B.d();
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
      if (this.H) {
         this.f.a(this.z.f());
      } else {
         this.f.a(this.z);
      }
   }

   void j(int $$0) {
      ept $$1 = ept.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.b(this.A.a, $$2));
      } catch (erg var5) {
         a.error("Couldn't op the user", var5);
      }

      this.C();
   }

   void k(int $$0) {
      ept $$1 = ept.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.c(this.A.a, $$2));
      } catch (erg var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.C();
   }

   private void a(eqc $$0) {
      for (eqg $$1 : this.A.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void l(int $$0) {
      this.C();
      if ($$0 >= 0 && $$0 < this.A.h.size()) {
         eqg $$1 = this.A.h.get($$0);
         eru $$2 = new eru($$1x -> {
            if ($$1x) {
               ept $$2x = ept.a();

               try {
                  $$2x.a(this.A.a, $$1.b());
               } catch (erg var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.A.h.remove(this.G);
               this.G = -1;
               this.C();
            }

            this.H = true;
            this.f.a(this);
         }, c, vb.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.B.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      int $$4 = h(12) + 20;
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      $$0.a(b, 0, $$4, 0.0F, 0.0F, this.g, this.h - $$4, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      String $$5 = this.A.h != null ? Integer.toString(this.A.h.size()) : "0";
      $$0.a(this.i, vb.a("mco.configure.world.invited.number", $$5), this.C, h(0), -1, false);
   }

   class a extends exd.a<esf.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final exu f = new exu(new agt("player_list/remove_player"), new agt("player_list/remove_player_highlighted"));
      private static final exu g = new exu(new agt("player_list/make_operator"), new agt("player_list/make_operator_highlighted"));
      private static final exu h = new exu(new agt("player_list/remove_operator"), new agt("player_list/remove_operator_highlighted"));
      private final eqg i;
      private final List<ewf> j = new ArrayList<>();
      private final ewt k;
      private final ewt l;
      private final ewt m;

      public a(eqg $$0) {
         this.i = $$0;
         int $$1 = esf.this.A.h.indexOf(this.i);
         int $$2 = esf.this.B.p() - 16 - 9;
         int $$3 = esf.this.B.h($$1) + 1;
         this.k = new ewt($$2, $$3, 8, 7, f, $$1x -> esf.this.l($$1), va.a);
         this.k.a(exs.a(esf.x));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new ewt($$2, $$3, 8, 7, g, $$1x -> esf.this.j($$1), va.a);
         this.l.a(exs.a(esf.v));
         this.j.add(this.l);
         this.m = new ewt($$2, $$3, 8, 7, h, $$1x -> esf.this.k($$1), va.a);
         this.m.a(exs.a(esf.w));
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
      public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         eta.a($$0, esf.this.C + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(esf.this.i, this.i.a(), esf.this.C + 3 + 12, $$2 + 1, $$10, false);
         this.j.forEach($$5x -> {
            $$5x.g($$2 + 1);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public vb a() {
         return vb.a("narrator.select", this.i.a());
      }
   }

   class b extends gjk<esf.a> {
      public b() {
         super(esf.this.D + 10, esf.h(12) + 20, esf.h(1), esf.h(12) + 20, 13);
      }

      public void d() {
         if (esf.this.G != -1) {
            this.d(esf.this.G).b();
         }
      }

      public void a(eqg $$0) {
         this.a((esf.a)(esf.this.new a($$0)));
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
         esf.this.G = $$0;
         esf.this.C();
      }

      public void a(@Nullable esf.a $$0) {
         super.a($$0);
         esf.this.G = this.i().indexOf($$0);
         esf.this.C();
      }

      @Override
      public int c() {
         return esf.this.C + this.e;
      }

      @Override
      public int a() {
         return this.k() * 13;
      }
   }
}

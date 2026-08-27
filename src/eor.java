import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eor extends gfb {
   private static final Logger a = LogUtils.getLogger();
   private static final aew b = new aew("minecraft", "textures/gui/options_background.png");
   private static final tl c = tl.c("mco.question");
   static final tl y = tl.c("mco.configure.world.invites.normal.tooltip");
   static final tl z = tl.c("mco.configure.world.invites.ops.tooltip");
   static final tl A = tl.c("mco.configure.world.invites.remove.tooltip");
   private static final int B = -1;
   private final eof C;
   final emw D;
   eor.b E;
   int F;
   int G;
   private esq H;
   private esq I;
   int J = -1;
   private boolean K;

   public eor(eof $$0, emw $$1) {
      super(tl.c("mco.configure.world.players.title"));
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   public void aH_() {
      this.F = this.g / 2 - 160;
      this.G = 150;
      int $$0 = this.g / 2 + 12;
      this.E = new eor.b();
      this.E.f(this.F);
      this.e(this.E);

      for (ems $$1 : this.D.h) {
         this.E.a($$1);
      }

      this.J = -1;
      this.d(esq.a(tl.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new eok(this.C, this, this.D))).a($$0, h(1), this.G + 10, 20).a());
      this.H = this.d(esq.a(tl.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.l(this.J)).a($$0, h(7), this.G + 10, 20).a());
      this.I = this.d(esq.a(tl.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.D.h.get(this.J).c()) {
            this.k(this.J);
         } else {
            this.j(this.J);
         }
      }).a($$0, h(9), this.G + 10, 20).a());
      this.d(esq.a(tk.k, $$0x -> this.E()).a($$0 + this.G / 2 + 2, h(12), this.G / 2 + 10 - 2, 20).a());
      this.D();
   }

   @Override
   void D() {
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
         this.E();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void E() {
      if (this.K) {
         this.f.a(this.C.f());
      } else {
         this.f.a(this.C);
      }
   }

   void j(int $$0) {
      emf $$1 = emf.a();
      UUID $$2 = this.D.h.get($$0).b();

      try {
         this.a($$1.b(this.D.a, $$2));
      } catch (ens var5) {
         a.error("Couldn't op the user", var5);
      }

      this.D();
   }

   void k(int $$0) {
      emf $$1 = emf.a();
      UUID $$2 = this.D.h.get($$0).b();

      try {
         this.a($$1.c(this.D.a, $$2));
      } catch (ens var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.D();
   }

   private void a(emo $$0) {
      for (ems $$1 : this.D.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void l(int $$0) {
      this.D();
      if ($$0 >= 0 && $$0 < this.D.h.size()) {
         ems $$1 = this.D.h.get($$0);
         eog $$2 = new eog($$1x -> {
            if ($$1x) {
               emf $$2x = emf.a();

               try {
                  $$2x.a(this.D.a, $$1.b());
               } catch (ens var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.D.h.remove(this.J);
               this.J = -1;
               this.D();
            }

            this.K = true;
            this.f.a(this);
         }, c, tl.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      int $$4 = h(12) + 20;
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      $$0.a(b, 0, $$4, 0.0F, 0.0F, this.g, this.h - $$4, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      String $$5 = this.D.h != null ? Integer.toString(this.D.h.size()) : "0";
      $$0.a(this.i, tl.a("mco.configure.world.invited.number", $$5), this.F, h(0), -6250336, false);
   }

   class a extends etm.a<eor.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final euc f = new euc(new aew("player_list/remove_player"), new aew("player_list/remove_player_highlighted"));
      private static final euc g = new euc(new aew("player_list/make_operator"), new aew("player_list/make_operator_highlighted"));
      private static final euc h = new euc(new aew("player_list/remove_operator"), new aew("player_list/remove_operator_highlighted"));
      private final ems i;
      private final List<eso> j = new ArrayList<>();
      private final etc k;
      private final etc l;
      private final etc m;

      public a(ems $$0) {
         this.i = $$0;
         int $$1 = eor.this.D.h.indexOf(this.i);
         int $$2 = eor.this.E.p() - 16 - 9;
         int $$3 = eor.this.E.h($$1) + 1;
         this.k = new etc($$2, $$3, 8, 7, f, $$1x -> eor.this.l($$1), tk.a);
         this.k.a(eua.a(eor.A));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new etc($$2, $$3, 8, 7, g, $$1x -> eor.this.j($$1), tk.a);
         this.l.a(eua.a(eor.y));
         this.j.add(this.l);
         this.m = new etc($$2, $$3, 8, 7, h, $$1x -> eor.this.k($$1), tk.a);
         this.m.a(eua.a(eor.z));
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
      public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         epm.a($$0, eor.this.F + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(eor.this.i, this.i.a(), eor.this.F + 3 + 12, $$2 + 1, $$10, false);
         this.j.forEach($$5x -> {
            $$5x.g($$2 + 1);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public tl a() {
         return tl.a("narrator.select", this.i.a());
      }
   }

   class b extends gfa<eor.a> {
      public b() {
         super(eor.this.G + 10, eor.h(12) + 20, eor.h(1), eor.h(12) + 20, 13);
      }

      public void d() {
         if (eor.this.J != -1) {
            this.d(eor.this.J).b();
         }
      }

      public void a(ems $$0) {
         this.a((eor.a)(eor.this.new a($$0)));
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
         eor.this.J = $$0;
         eor.this.D();
      }

      public void a(@Nullable eor.a $$0) {
         super.a($$0);
         eor.this.J = this.i().indexOf($$0);
         eor.this.D();
      }

      @Override
      public int c() {
         return eor.this.F + this.e - 5;
      }

      @Override
      public int a() {
         return this.k() * 13;
      }
   }
}

import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqy extends ghr {
   private static final Logger a = LogUtils.getLogger();
   private static final agi b = new agi("minecraft", "textures/gui/options_background.png");
   private static final ur c = ur.c("mco.question");
   static final ur v = ur.c("mco.configure.world.invites.normal.tooltip");
   static final ur w = ur.c("mco.configure.world.invites.ops.tooltip");
   static final ur x = ur.c("mco.configure.world.invites.remove.tooltip");
   private static final int y = -1;
   private final eqm z;
   final epd A;
   eqy.b B;
   int C;
   int D;
   private euz E;
   private euz F;
   int G = -1;
   private boolean H;

   public eqy(eqm $$0, epd $$1) {
      super(ur.c("mco.configure.world.players.title"));
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aP_() {
      this.C = this.g / 2 - 160;
      this.D = 150;
      int $$0 = this.g / 2 + 12;
      this.B = new eqy.b();
      this.B.f(this.C);
      this.e(this.B);

      for (eoz $$1 : this.A.h) {
         this.B.a($$1);
      }

      this.G = -1;
      this.d(euz.a(ur.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new eqr(this.z, this, this.A))).a($$0, h(1), this.D + 10, 20).a());
      this.E = this.d(euz.a(ur.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.l(this.G)).a($$0, h(7), this.D + 10, 20).a());
      this.F = this.d(euz.a(ur.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.A.h.get(this.G).c()) {
            this.k(this.G);
         } else {
            this.j(this.G);
         }
      }).a($$0, h(9), this.D + 10, 20).a());
      this.d(euz.a(uq.k, $$0x -> this.D()).a($$0 + this.D / 2 + 2, h(12), this.D / 2 + 10 - 2, 20).a());
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
      eom $$1 = eom.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.b(this.A.a, $$2));
      } catch (epz var5) {
         a.error("Couldn't op the user", var5);
      }

      this.C();
   }

   void k(int $$0) {
      eom $$1 = eom.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.c(this.A.a, $$2));
      } catch (epz var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.C();
   }

   private void a(eov $$0) {
      for (eoz $$1 : this.A.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void l(int $$0) {
      this.C();
      if ($$0 >= 0 && $$0 < this.A.h.size()) {
         eoz $$1 = this.A.h.get($$0);
         eqn $$2 = new eqn($$1x -> {
            if ($$1x) {
               eom $$2x = eom.a();

               try {
                  $$2x.a(this.A.a, $$1.b());
               } catch (epz var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.A.h.remove(this.G);
               this.G = -1;
               this.C();
            }

            this.H = true;
            this.f.a(this);
         }, c, ur.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.B.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      int $$4 = h(12) + 20;
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      $$0.a(b, 0, $$4, 0.0F, 0.0F, this.g, this.h - $$4, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      String $$5 = this.A.h != null ? Integer.toString(this.A.h.size()) : "0";
      $$0.a(this.i, ur.a("mco.configure.world.invited.number", $$5), this.C, h(0), -1, false);
   }

   class a extends evv.a<eqy.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final ewm f = new ewm(new agi("player_list/remove_player"), new agi("player_list/remove_player_highlighted"));
      private static final ewm g = new ewm(new agi("player_list/make_operator"), new agi("player_list/make_operator_highlighted"));
      private static final ewm h = new ewm(new agi("player_list/remove_operator"), new agi("player_list/remove_operator_highlighted"));
      private final eoz i;
      private final List<eux> j = new ArrayList<>();
      private final evl k;
      private final evl l;
      private final evl m;

      public a(eoz $$0) {
         this.i = $$0;
         int $$1 = eqy.this.A.h.indexOf(this.i);
         int $$2 = eqy.this.B.p() - 16 - 9;
         int $$3 = eqy.this.B.h($$1) + 1;
         this.k = new evl($$2, $$3, 8, 7, f, $$1x -> eqy.this.l($$1), uq.a);
         this.k.a(ewk.a(eqy.x));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new evl($$2, $$3, 8, 7, g, $$1x -> eqy.this.j($$1), uq.a);
         this.l.a(ewk.a(eqy.v));
         this.j.add(this.l);
         this.m = new evl($$2, $$3, 8, 7, h, $$1x -> eqy.this.k($$1), uq.a);
         this.m.a(ewk.a(eqy.w));
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
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         ert.a($$0, eqy.this.C + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(eqy.this.i, this.i.a(), eqy.this.C + 3 + 12, $$2 + 1, $$10, false);
         this.j.forEach($$5x -> {
            $$5x.g($$2 + 1);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public ur a() {
         return ur.a("narrator.select", this.i.a());
      }
   }

   class b extends ghq<eqy.a> {
      public b() {
         super(eqy.this.D + 10, eqy.h(12) + 20, eqy.h(1), eqy.h(12) + 20, 13);
      }

      public void d() {
         if (eqy.this.G != -1) {
            this.d(eqy.this.G).b();
         }
      }

      public void a(eoz $$0) {
         this.a((eqy.a)(eqy.this.new a($$0)));
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
         eqy.this.G = $$0;
         eqy.this.C();
      }

      public void a(@Nullable eqy.a $$0) {
         super.a($$0);
         eqy.this.G = this.i().indexOf($$0);
         eqy.this.C();
      }

      @Override
      public int c() {
         return eqy.this.C + this.e;
      }

      @Override
      public int a() {
         return this.k() * 13;
      }
   }
}

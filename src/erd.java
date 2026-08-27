import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class erd extends ghw {
   private static final Logger a = LogUtils.getLogger();
   private static final agm b = new agm("minecraft", "textures/gui/options_background.png");
   private static final uv c = uv.c("mco.question");
   static final uv v = uv.c("mco.configure.world.invites.normal.tooltip");
   static final uv w = uv.c("mco.configure.world.invites.ops.tooltip");
   static final uv x = uv.c("mco.configure.world.invites.remove.tooltip");
   private static final int y = -1;
   private final eqr z;
   final epi A;
   erd.b B;
   int C;
   int D;
   private eve E;
   private eve F;
   int G = -1;
   private boolean H;

   public erd(eqr $$0, epi $$1) {
      super(uv.c("mco.configure.world.players.title"));
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aQ_() {
      this.C = this.g / 2 - 160;
      this.D = 150;
      int $$0 = this.g / 2 + 12;
      this.B = new erd.b();
      this.B.f(this.C);
      this.e(this.B);

      for (epe $$1 : this.A.h) {
         this.B.a($$1);
      }

      this.G = -1;
      this.d(eve.a(uv.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new eqw(this.z, this, this.A))).a($$0, h(1), this.D + 10, 20).a());
      this.E = this.d(eve.a(uv.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.l(this.G)).a($$0, h(7), this.D + 10, 20).a());
      this.F = this.d(eve.a(uv.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.A.h.get(this.G).c()) {
            this.k(this.G);
         } else {
            this.j(this.G);
         }
      }).a($$0, h(9), this.D + 10, 20).a());
      this.d(eve.a(uu.k, $$0x -> this.D()).a($$0 + this.D / 2 + 2, h(12), this.D / 2 + 10 - 2, 20).a());
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
      eor $$1 = eor.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.b(this.A.a, $$2));
      } catch (eqe var5) {
         a.error("Couldn't op the user", var5);
      }

      this.C();
   }

   void k(int $$0) {
      eor $$1 = eor.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.c(this.A.a, $$2));
      } catch (eqe var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.C();
   }

   private void a(epa $$0) {
      for (epe $$1 : this.A.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void l(int $$0) {
      this.C();
      if ($$0 >= 0 && $$0 < this.A.h.size()) {
         epe $$1 = this.A.h.get($$0);
         eqs $$2 = new eqs($$1x -> {
            if ($$1x) {
               eor $$2x = eor.a();

               try {
                  $$2x.a(this.A.a, $$1.b());
               } catch (eqe var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.A.h.remove(this.G);
               this.G = -1;
               this.C();
            }

            this.H = true;
            this.f.a(this);
         }, c, uv.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.B.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      int $$4 = h(12) + 20;
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      $$0.a(b, 0, $$4, 0.0F, 0.0F, this.g, this.h - $$4, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      String $$5 = this.A.h != null ? Integer.toString(this.A.h.size()) : "0";
      $$0.a(this.i, uv.a("mco.configure.world.invited.number", $$5), this.C, h(0), -1, false);
   }

   class a extends ewa.a<erd.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final ewr f = new ewr(new agm("player_list/remove_player"), new agm("player_list/remove_player_highlighted"));
      private static final ewr g = new ewr(new agm("player_list/make_operator"), new agm("player_list/make_operator_highlighted"));
      private static final ewr h = new ewr(new agm("player_list/remove_operator"), new agm("player_list/remove_operator_highlighted"));
      private final epe i;
      private final List<evc> j = new ArrayList<>();
      private final evq k;
      private final evq l;
      private final evq m;

      public a(epe $$0) {
         this.i = $$0;
         int $$1 = erd.this.A.h.indexOf(this.i);
         int $$2 = erd.this.B.p() - 16 - 9;
         int $$3 = erd.this.B.h($$1) + 1;
         this.k = new evq($$2, $$3, 8, 7, f, $$1x -> erd.this.l($$1), uu.a);
         this.k.a(ewp.a(erd.x));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new evq($$2, $$3, 8, 7, g, $$1x -> erd.this.j($$1), uu.a);
         this.l.a(ewp.a(erd.v));
         this.j.add(this.l);
         this.m = new evq($$2, $$3, 8, 7, h, $$1x -> erd.this.k($$1), uu.a);
         this.m.a(ewp.a(erd.w));
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
      public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         ery.a($$0, erd.this.C + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(erd.this.i, this.i.a(), erd.this.C + 3 + 12, $$2 + 1, $$10, false);
         this.j.forEach($$5x -> {
            $$5x.g($$2 + 1);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public uv a() {
         return uv.a("narrator.select", this.i.a());
      }
   }

   class b extends ghv<erd.a> {
      public b() {
         super(erd.this.D + 10, erd.h(12) + 20, erd.h(1), erd.h(12) + 20, 13);
      }

      public void d() {
         if (erd.this.G != -1) {
            this.d(erd.this.G).b();
         }
      }

      public void a(epe $$0) {
         this.a((erd.a)(erd.this.new a($$0)));
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
         erd.this.G = $$0;
         erd.this.C();
      }

      public void a(@Nullable erd.a $$0) {
         super.a($$0);
         erd.this.G = this.i().indexOf($$0);
         erd.this.C();
      }

      @Override
      public int c() {
         return erd.this.C + this.e;
      }

      @Override
      public int a() {
         return this.k() * 13;
      }
   }
}

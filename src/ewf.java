import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ewf extends gob {
   private static final Logger a = LogUtils.getLogger();
   private static final ajc b = new ajc("minecraft", "textures/gui/options_background.png");
   private static final vs c = vs.c("mco.question");
   static final vs v = vs.c("mco.configure.world.invites.normal.tooltip");
   static final vs w = vs.c("mco.configure.world.invites.ops.tooltip");
   static final vs x = vs.c("mco.configure.world.invites.remove.tooltip");
   private static final int y = -1;
   private final evt z;
   final euk A;
   ewf.b B;
   int C;
   int D;
   private fak E;
   private fak F;
   int G = -1;
   private boolean H;

   public ewf(evt $$0, euk $$1) {
      super(vs.c("mco.configure.world.players.title"));
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aP_() {
      this.C = this.g / 2 - 160;
      this.D = 150;
      int $$0 = this.g / 2 + 12;
      this.B = this.c(new ewf.b());
      this.B.m(this.C);

      for (eug $$1 : this.A.h) {
         this.B.a($$1);
      }

      this.G = -1;
      this.c(fak.a(vs.c("mco.configure.world.buttons.invite"), $$0x -> this.f.a(new evy(this.z, this, this.A))).a($$0, g(1), this.D + 10, 20).a());
      this.E = this.c(fak.a(vs.c("mco.configure.world.invites.remove.tooltip"), $$0x -> this.k(this.G)).a($$0, g(7), this.D + 10, 20).a());
      this.F = this.c(fak.a(vs.c("mco.configure.world.invites.ops.tooltip"), $$0x -> {
         if (this.A.h.get(this.G).c()) {
            this.j(this.G);
         } else {
            this.i(this.G);
         }
      }).a($$0, g(9), this.D + 10, 20).a());
      this.c(fak.a(vr.k, $$0x -> this.H()).a($$0 + this.D / 2 + 2, g(12), this.D / 2 + 10 - 2, 20).a());
      this.E();
   }

   void E() {
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
         this.H();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void H() {
      if (this.H) {
         this.f.a(this.z.f());
      } else {
         this.f.a(this.z);
      }
   }

   void i(int $$0) {
      ett $$1 = ett.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.b(this.A.a, $$2));
      } catch (evg var5) {
         a.error("Couldn't op the user", var5);
      }

      this.E();
   }

   void j(int $$0) {
      ett $$1 = ett.a();
      UUID $$2 = this.A.h.get($$0).b();

      try {
         this.a($$1.c(this.A.a, $$2));
      } catch (evg var5) {
         a.error("Couldn't deop the user", var5);
      }

      this.E();
   }

   private void a(euc $$0) {
      for (eug $$1 : this.A.h) {
         $$1.a($$0.a.contains($$1.a()));
      }
   }

   void k(int $$0) {
      this.E();
      if ($$0 >= 0 && $$0 < this.A.h.size()) {
         eug $$1 = this.A.h.get($$0);
         evu $$2 = new evu($$1x -> {
            if ($$1x) {
               ett $$2x = ett.a();

               try {
                  $$2x.a(this.A.a, $$1.b());
               } catch (evg var5) {
                  a.error("Couldn't uninvite user", var5);
               }

               this.A.h.remove(this.G);
               this.G = -1;
               this.E();
            }

            this.H = true;
            this.f.a(this);
         }, c, vs.a("mco.configure.world.uninvite.player", $$1.a()));
         this.f.a($$2);
      }
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      int $$4 = g(12) + 20;
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      $$0.a(b, 0, $$4, 0.0F, 0.0F, this.g, this.h - $$4, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      String $$5 = this.A.h != null ? Integer.toString(this.A.h.size()) : "0";
      $$0.a(this.i, vs.a("mco.configure.world.invited.number", $$5), this.C, g(0), -1, false);
   }

   class a extends fbg.a<ewf.a> {
      private static final int b = 3;
      private static final int c = 1;
      private static final int d = 8;
      private static final int e = 7;
      private static final fbx f = new fbx(new ajc("player_list/remove_player"), new ajc("player_list/remove_player_highlighted"));
      private static final fbx g = new fbx(new ajc("player_list/make_operator"), new ajc("player_list/make_operator_highlighted"));
      private static final fbx h = new fbx(new ajc("player_list/remove_operator"), new ajc("player_list/remove_operator_highlighted"));
      private final eug i;
      private final List<fai> j = new ArrayList<>();
      private final faw k;
      private final faw l;
      private final faw m;

      public a(eug $$0) {
         this.i = $$0;
         int $$1 = ewf.this.A.h.indexOf(this.i);
         int $$2 = ewf.this.B.r() - 16 - 9;
         int $$3 = ewf.this.B.g($$1) + 1;
         this.k = new faw($$2, $$3, 8, 7, f, $$1x -> ewf.this.k($$1), vr.a);
         this.k.a(fbv.a(ewf.x));
         this.j.add(this.k);
         $$2 += 11;
         this.l = new faw($$2, $$3, 8, 7, g, $$1x -> ewf.this.i($$1), vr.a);
         this.l.a(fbv.a(ewf.v));
         this.j.add(this.l);
         this.m = new faw($$2, $$3, 8, 7, h, $$1x -> ewf.this.j($$1), vr.a);
         this.m.a(fbv.a(ewf.w));
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
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.i.d()) {
            $$10 = -6250336;
         } else if (this.i.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         exa.a($$0, ewf.this.C + 2 + 2, $$2 + 1, 8, this.i.b());
         $$0.a(ewf.this.i, this.i.a(), ewf.this.C + 3 + 12, $$2 + 1, $$10, false);
         this.j.forEach($$5x -> {
            $$5x.n($$2 + 1);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public vs a() {
         return vs.a("narrator.select", this.i.a());
      }
   }

   class b extends goa<ewf.a> {
      public b() {
         super(ewf.this.D + 10, ewf.g(12) + 20, ewf.g(1), 13);
      }

      public void d() {
         if (ewf.this.G != -1) {
            this.d(ewf.this.G).b();
         }
      }

      public void a(eug $$0) {
         this.a((ewf.a)(ewf.this.new a($$0)));
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
         ewf.this.G = $$0;
         ewf.this.E();
      }

      public void a(@Nullable ewf.a $$0) {
         super.a($$0);
         ewf.this.G = this.l().indexOf($$0);
         ewf.this.E();
      }

      @Override
      public int c() {
         return ewf.this.C + this.g;
      }

      @Override
      public int a() {
         return this.n() * 13;
      }
   }
}

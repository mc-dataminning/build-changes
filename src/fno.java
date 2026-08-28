import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fno extends hqd {
   static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("mco.configure.world.players.title");
   static final wy c = wy.c("mco.question");
   private static final int C = 8;
   final fwo D = new fwo(this);
   private final fnd E;
   final flu F;
   @Nullable
   private fno.b G;
   boolean H;

   public fno(fnd $$0, flu $$1) {
      super(b);
      this.E = $$0;
      this.F = $$1;
   }

   @Override
   public void aO_() {
      this.D.a(b, this.p);
      this.G = this.D.c(new fno.b());
      this.E();
      fws $$0 = this.D.b(fws.e().a(8));
      $$0.a(fta.a(wy.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fni(this.E, this, this.F))).a());
      $$0.a(fta.a(wx.k, $$0x -> this.aL_()).a());
      this.D.a($$1 -> {
         fsy var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      if (this.G != null) {
         this.G.a(this.n, this.D);
      }
   }

   void E() {
      if (this.G != null) {
         this.G.aE_().clear();

         for (flq $$0 : this.F.h) {
            this.G.aE_().add(new fno.a($$0));
         }
      }
   }

   @Override
   public void aL_() {
      this.F();
   }

   private void F() {
      if (this.H) {
         this.m.a(this.E.g());
      } else {
         this.m.a(this.E);
      }
   }

   class a extends ftg.a<fno.a> {
      private static final wy b = wy.c("mco.configure.world.invites.normal.tooltip");
      private static final wy c = wy.c("mco.configure.world.invites.ops.tooltip");
      private static final wy d = wy.c("mco.configure.world.invites.remove.tooltip");
      private static final alg e = alg.b("player_list/make_operator");
      private static final alg f = alg.b("player_list/remove_operator");
      private static final alg g = alg.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final flq j;
      private final fta k;
      private final fta l;
      private final fta m;

      public a(final flq $$0) {
         this.j = $$0;
         int $$1 = fno.this.F.h.indexOf(this.j);
         this.l = fuf.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fno.this.p.a(b))
            .a($$1x -> wx.a(wy.a("mco.invited.player.narration", $$0.a()), (wy)$$1x.get(), wy.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fuf.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fno.this.p.a(c))
            .a($$1x -> wx.a(wy.a("mco.invited.player.narration", $$0.a()), (wy)$$1x.get(), wy.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fuf.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fno.this.p.a(d))
            .a($$1x -> wx.a(wy.a("mco.invited.player.narration", $$0.a()), (wy)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fkt $$1 = fkt.a();
         UUID $$2 = fno.this.F.h.get($$0).b();

         try {
            this.a($$1.b(fno.this.F.a, $$2));
         } catch (fmp var5) {
            fno.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fkt $$1 = fkt.a();
         UUID $$2 = fno.this.F.h.get($$0).b();

         try {
            this.a($$1.c(fno.this.F.a, $$2));
         } catch (fmp var5) {
            fno.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fno.this.F.h.size()) {
            flq $$1 = fno.this.F.h.get($$0);
            fne $$2 = new fne($$2x -> {
               if ($$2x) {
                  fkt $$3 = fkt.a();

                  try {
                     $$3.a(fno.this.F.a, $$1.b());
                  } catch (fmp var6) {
                     fno.a.error("Couldn't uninvite user", var6);
                  }

                  fno.this.F.h.remove($$0);
                  fno.this.E();
               }

               fno.this.H = true;
               fno.this.m.a(fno.this);
            }, fno.c, wy.a("mco.configure.world.uninvite.player", $$1.a()));
            fno.this.m.a($$2);
         }
      }

      private void a(flm $$0) {
         for (flq $$1 : fno.this.F.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fta g() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fux> aE_() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public List<? extends fwv> b() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public void a(fsm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         foi.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fno.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10);
         int $$15 = $$2 + $$5 / 2 - 10;
         int $$16 = $$3 + $$4 - this.k.A();
         this.k.c($$16, $$15);
         this.k.a($$0, $$6, $$7, $$9);
         int $$17 = $$16 - this.g().A() - 8;
         this.l.c($$17, $$15);
         this.l.a($$0, $$6, $$7, $$9);
         this.m.c($$17, $$15);
         this.m.a($$0, $$6, $$7, $$9);
      }
   }

   class b extends ftg<fno.a> {
      private static final int m = 36;

      public b() {
         super(fpt.Q(), fno.this.n, fno.this.D.d(), fno.this.D.c(), 36, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fsm $$0, int $$1, int $$2) {
         String $$3 = fno.this.F.h != null ? Integer.toString(fno.this.F.h.size()) : "0";
         wy $$4 = wy.a("mco.configure.world.invited.number", $$3).a(o.t);
         $$0.b(fno.this.p, $$4, $$1 + this.a() / 2 - fno.this.p.a($$4) / 2, $$2, -1);
      }

      @Override
      public int a() {
         return 300;
      }
   }
}

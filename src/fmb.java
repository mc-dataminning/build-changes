import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmb extends hol {
   static final Logger a = LogUtils.getLogger();
   private static final ww b = ww.c("mco.configure.world.players.title");
   static final ww c = ww.c("mco.question");
   private static final int C = 8;
   final fve D = new fve(this);
   private final flq E;
   final fkh F;
   @Nullable
   private fmb.b G;
   boolean H;

   public fmb(flq $$0, fkh $$1) {
      super(b);
      this.E = $$0;
      this.F = $$1;
   }

   @Override
   public void aN_() {
      this.D.a(b, this.p);
      this.G = this.D.c(new fmb.b());
      this.E();
      fvi $$0 = this.D.b(fvi.e().a(8));
      $$0.a(frq.a(ww.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new flv(this.E, this, this.F))).a());
      $$0.a(frq.a(wv.k, $$0x -> this.aK_()).a());
      this.D.a($$1 -> {
         fro var10000 = this.c($$1);
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
         this.G.aD_().clear();

         for (fkd $$0 : this.F.h) {
            this.G.aD_().add(new fmb.a($$0));
         }
      }
   }

   @Override
   public void aK_() {
      this.F();
   }

   private void F() {
      if (this.H) {
         this.m.a(this.E.g());
      } else {
         this.m.a(this.E);
      }
   }

   class a extends frw.a<fmb.a> {
      private static final ww b = ww.c("mco.configure.world.invites.normal.tooltip");
      private static final ww c = ww.c("mco.configure.world.invites.ops.tooltip");
      private static final ww d = ww.c("mco.configure.world.invites.remove.tooltip");
      private static final ale e = ale.b("player_list/make_operator");
      private static final ale f = ale.b("player_list/remove_operator");
      private static final ale g = ale.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fkd j;
      private final frq k;
      private final frq l;
      private final frq m;

      public a(final fkd $$0) {
         this.j = $$0;
         int $$1 = fmb.this.F.h.indexOf(this.j);
         this.l = fsv.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fmb.this.p.a(b))
            .a($$1x -> wv.a(ww.a("mco.invited.player.narration", $$0.a()), (ww)$$1x.get(), ww.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fsv.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fmb.this.p.a(c))
            .a($$1x -> wv.a(ww.a("mco.invited.player.narration", $$0.a()), (ww)$$1x.get(), ww.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fsv.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fmb.this.p.a(d))
            .a($$1x -> wv.a(ww.a("mco.invited.player.narration", $$0.a()), (ww)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fjg $$1 = fjg.a();
         UUID $$2 = fmb.this.F.h.get($$0).b();

         try {
            this.a($$1.b(fmb.this.F.a, $$2));
         } catch (flc var5) {
            fmb.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fjg $$1 = fjg.a();
         UUID $$2 = fmb.this.F.h.get($$0).b();

         try {
            this.a($$1.c(fmb.this.F.a, $$2));
         } catch (flc var5) {
            fmb.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fmb.this.F.h.size()) {
            fkd $$1 = fmb.this.F.h.get($$0);
            flr $$2 = new flr($$2x -> {
               if ($$2x) {
                  fjg $$3 = fjg.a();

                  try {
                     $$3.a(fmb.this.F.a, $$1.b());
                  } catch (flc var6) {
                     fmb.a.error("Couldn't uninvite user", var6);
                  }

                  fmb.this.F.h.remove($$0);
                  fmb.this.E();
               }

               fmb.this.H = true;
               fmb.this.m.a(fmb.this);
            }, fmb.c, ww.a("mco.configure.world.uninvite.player", $$1.a()));
            fmb.this.m.a($$2);
         }
      }

      private void a(fjz $$0) {
         for (fkd $$1 : fmb.this.F.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private frq g() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends ftn> aD_() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public List<? extends fvl> b() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fmv.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fmb.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10);
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

   class b extends frw<fmb.a> {
      private static final int m = 36;

      public b() {
         super(fof.Q(), fmb.this.n, fmb.this.D.d(), fmb.this.D.c(), 36, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(frc $$0, int $$1, int $$2) {
         String $$3 = fmb.this.F.h != null ? Integer.toString(fmb.this.F.h.size()) : "0";
         ww $$4 = ww.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.b(fmb.this.p, $$4, $$1 + this.a() / 2 - fmb.this.p.a($$4) / 2, $$2, -1);
      }

      @Override
      public int a() {
         return 300;
      }
   }
}

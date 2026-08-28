import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkc extends hhv {
   static final Logger a = LogUtils.getLogger();
   private static final xv b = xv.c("mco.configure.world.players.title");
   static final xv c = xv.c("mco.question");
   private static final int C = 8;
   final frt D = new frt(this);
   private final fjr E;
   final fii F;
   @Nullable
   private fkc.b G;
   boolean H;

   public fkc(fjr $$0, fii $$1) {
      super(b);
      this.E = $$0;
      this.F = $$1;
   }

   @Override
   public void aT_() {
      this.D.a(b, this.p);
      this.G = this.D.c(new fkc.b());
      this.E();
      frx $$0 = this.D.b(frx.e().a(8));
      $$0.a(foe.a(xv.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fjw(this.E, this, this.F))).a());
      $$0.a(foe.a(xu.k, $$0x -> this.aP_()).a());
      this.D.a($$1 -> {
         foc var10000 = this.c($$1);
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
         this.G.aI_().clear();

         for (fie $$0 : this.F.h) {
            this.G.aI_().add(new fkc.a($$0));
         }
      }
   }

   @Override
   public void aP_() {
      this.F();
   }

   private void F() {
      if (this.H) {
         this.m.a(this.E.g());
      } else {
         this.m.a(this.E);
      }
   }

   class a extends fok.a<fkc.a> {
      private static final xv b = xv.c("mco.configure.world.invites.normal.tooltip");
      private static final xv c = xv.c("mco.configure.world.invites.ops.tooltip");
      private static final xv d = xv.c("mco.configure.world.invites.remove.tooltip");
      private static final alz e = alz.b("player_list/make_operator");
      private static final alz f = alz.b("player_list/remove_operator");
      private static final alz g = alz.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fie j;
      private final foe k;
      private final foe l;
      private final foe m;

      public a(final fie $$0) {
         this.j = $$0;
         int $$1 = fkc.this.F.h.indexOf(this.j);
         this.l = fpk.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fkc.this.p.a(b))
            .a($$1x -> xu.a(xv.a("mco.invited.player.narration", $$0.a()), (xv)$$1x.get(), xv.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fpk.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fkc.this.p.a(c))
            .a($$1x -> xu.a(xv.a("mco.invited.player.narration", $$0.a()), (xv)$$1x.get(), xv.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fpk.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fkc.this.p.a(d))
            .a($$1x -> xu.a(xv.a("mco.invited.player.narration", $$0.a()), (xv)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fhh $$1 = fhh.a();
         UUID $$2 = fkc.this.F.h.get($$0).b();

         try {
            this.a($$1.b(fkc.this.F.a, $$2));
         } catch (fjd var5) {
            fkc.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fhh $$1 = fhh.a();
         UUID $$2 = fkc.this.F.h.get($$0).b();

         try {
            this.a($$1.c(fkc.this.F.a, $$2));
         } catch (fjd var5) {
            fkc.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fkc.this.F.h.size()) {
            fie $$1 = fkc.this.F.h.get($$0);
            fjs $$2 = new fjs($$2x -> {
               if ($$2x) {
                  fhh $$3 = fhh.a();

                  try {
                     $$3.a(fkc.this.F.a, $$1.b());
                  } catch (fjd var6) {
                     fkc.a.error("Couldn't uninvite user", var6);
                  }

                  fkc.this.F.h.remove($$0);
                  fkc.this.E();
               }

               fkc.this.H = true;
               fkc.this.m.a(fkc.this);
            }, fkc.c, xv.a("mco.configure.world.uninvite.player", $$1.a()));
            fkc.this.m.a($$2);
         }
      }

      private void a(fia $$0) {
         for (fie $$1 : fkc.this.F.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private foe g() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fqc> aI_() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public List<? extends fsa> b() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public void a(fnr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fkw.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(fkc.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
         int $$15 = $$2 + $$5 / 2 - 10;
         int $$16 = $$3 + $$4 - this.k.y();
         this.k.c($$16, $$15);
         this.k.a($$0, $$6, $$7, $$9);
         int $$17 = $$16 - this.g().y() - 8;
         this.l.c($$17, $$15);
         this.l.a($$0, $$6, $$7, $$9);
         this.m.c($$17, $$15);
         this.m.a($$0, $$6, $$7, $$9);
      }
   }

   class b extends fok<fkc.a> {
      private static final int m = 36;

      public b() {
         super(fmf.Q(), fkc.this.n, fkc.this.D.d(), fkc.this.D.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fnr $$0, int $$1, int $$2) {
         String $$3 = fkc.this.F.h != null ? Integer.toString(fkc.this.F.h.size()) : "0";
         xv $$4 = xv.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(fkc.this.p, $$4, $$1 + this.a() / 2 - fkc.this.p.a($$4) / 2, $$2, -1, false);
      }

      @Override
      public int a() {
         return 300;
      }
   }
}

import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fol extends hrc {
   static final Logger a = LogUtils.getLogger();
   private static final xg b = xg.c("mco.configure.world.players.title");
   static final xg c = xg.c("mco.question");
   private static final int C = 8;
   final fxm D = new fxm(this);
   private final foa E;
   final fmr F;
   @Nullable
   private fol.b G;
   boolean H;

   public fol(foa $$0, fmr $$1) {
      super(b);
      this.E = $$0;
      this.F = $$1;
   }

   @Override
   public void aO_() {
      this.D.a(b, this.p);
      this.G = this.D.c(new fol.b());
      this.E();
      fxq $$0 = this.D.b(fxq.e().a(8));
      $$0.a(fty.a(xg.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fof(this.E, this, this.F))).a());
      $$0.a(fty.a(xf.k, $$0x -> this.aL_()).a());
      this.D.a($$1 -> {
         ftw var10000 = this.c($$1);
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

         for (fmn $$0 : this.F.h) {
            this.G.aE_().add(new fol.a($$0));
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

   class a extends fue.a<fol.a> {
      private static final xg b = xg.c("mco.configure.world.invites.normal.tooltip");
      private static final xg c = xg.c("mco.configure.world.invites.ops.tooltip");
      private static final xg d = xg.c("mco.configure.world.invites.remove.tooltip");
      private static final alr e = alr.b("player_list/make_operator");
      private static final alr f = alr.b("player_list/remove_operator");
      private static final alr g = alr.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fmn j;
      private final fty k;
      private final fty l;
      private final fty m;

      public a(final fmn $$0) {
         this.j = $$0;
         int $$1 = fol.this.F.h.indexOf(this.j);
         this.l = fvd.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fol.this.p.a(b))
            .a($$1x -> xf.a(xg.a("mco.invited.player.narration", $$0.a()), (xg)$$1x.get(), xg.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fvd.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fol.this.p.a(c))
            .a($$1x -> xf.a(xg.a("mco.invited.player.narration", $$0.a()), (xg)$$1x.get(), xg.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fvd.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fol.this.p.a(d))
            .a($$1x -> xf.a(xg.a("mco.invited.player.narration", $$0.a()), (xg)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         flq $$1 = flq.a();
         UUID $$2 = fol.this.F.h.get($$0).b();

         try {
            this.a($$1.b(fol.this.F.a, $$2));
         } catch (fnm var5) {
            fol.a.error("Couldn't op the user", var5);
         }

         this.c();
         this.a(this.m);
      }

      private void b(int $$0) {
         flq $$1 = flq.a();
         UUID $$2 = fol.this.F.h.get($$0).b();

         try {
            this.a($$1.c(fol.this.F.a, $$2));
         } catch (fnm var5) {
            fol.a.error("Couldn't deop the user", var5);
         }

         this.c();
         this.a(this.l);
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fol.this.F.h.size()) {
            fmn $$1 = fol.this.F.h.get($$0);
            fob $$2 = new fob($$2x -> {
               if ($$2x) {
                  flq $$3 = flq.a();

                  try {
                     $$3.a(fol.this.F.a, $$1.b());
                  } catch (fnm var6) {
                     fol.a.error("Couldn't uninvite user", var6);
                  }

                  fol.this.F.h.remove($$0);
                  fol.this.E();
               }

               fol.this.H = true;
               fol.this.m.a(fol.this);
            }, fol.c, xg.a("mco.configure.world.uninvite.player", $$1.a()));
            fol.this.m.a($$2);
         }
      }

      private void a(fmj $$0) {
         for (fmn $$1 : fol.this.F.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fty g() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fvv> aE_() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public List<? extends fxt> b() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fpg.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fol.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10);
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

   class b extends fue<fol.a> {
      private static final int m = 36;

      public b() {
         super(fqq.Q(), fol.this.n, fol.this.D.d(), fol.this.D.c(), 36, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(ftk $$0, int $$1, int $$2) {
         String $$3 = fol.this.F.h != null ? Integer.toString(fol.this.F.h.size()) : "0";
         xg $$4 = xg.a("mco.configure.world.invited.number", $$3).a(o.t);
         $$0.b(fol.this.p, $$4, $$1 + this.a() / 2 - fol.this.p.a($$4) / 2, $$2, -1);
      }

      @Override
      public int a() {
         return 300;
      }
   }
}

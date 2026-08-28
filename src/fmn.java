import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmn extends hpb {
   static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("mco.configure.world.players.title");
   static final wy c = wy.c("mco.question");
   private static final int C = 8;
   final fvq D = new fvq(this);
   private final fmc E;
   final fkt F;
   @Nullable
   private fmn.b G;
   boolean H;

   public fmn(fmc $$0, fkt $$1) {
      super(b);
      this.E = $$0;
      this.F = $$1;
   }

   @Override
   public void aN_() {
      this.D.a(b, this.p);
      this.G = this.D.c(new fmn.b());
      this.E();
      fvu $$0 = this.D.b(fvu.e().a(8));
      $$0.a(fsc.a(wy.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fmh(this.E, this, this.F))).a());
      $$0.a(fsc.a(wx.k, $$0x -> this.aK_()).a());
      this.D.a($$1 -> {
         fsa var10000 = this.c($$1);
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

         for (fkp $$0 : this.F.h) {
            this.G.aD_().add(new fmn.a($$0));
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

   class a extends fsi.a<fmn.a> {
      private static final wy b = wy.c("mco.configure.world.invites.normal.tooltip");
      private static final wy c = wy.c("mco.configure.world.invites.ops.tooltip");
      private static final wy d = wy.c("mco.configure.world.invites.remove.tooltip");
      private static final alg e = alg.b("player_list/make_operator");
      private static final alg f = alg.b("player_list/remove_operator");
      private static final alg g = alg.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fkp j;
      private final fsc k;
      private final fsc l;
      private final fsc m;

      public a(final fkp $$0) {
         this.j = $$0;
         int $$1 = fmn.this.F.h.indexOf(this.j);
         this.l = fth.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fmn.this.p.a(b))
            .a($$1x -> wx.a(wy.a("mco.invited.player.narration", $$0.a()), (wy)$$1x.get(), wy.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fth.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fmn.this.p.a(c))
            .a($$1x -> wx.a(wy.a("mco.invited.player.narration", $$0.a()), (wy)$$1x.get(), wy.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fth.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fmn.this.p.a(d))
            .a($$1x -> wx.a(wy.a("mco.invited.player.narration", $$0.a()), (wy)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fjs $$1 = fjs.a();
         UUID $$2 = fmn.this.F.h.get($$0).b();

         try {
            this.a($$1.b(fmn.this.F.a, $$2));
         } catch (flo var5) {
            fmn.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fjs $$1 = fjs.a();
         UUID $$2 = fmn.this.F.h.get($$0).b();

         try {
            this.a($$1.c(fmn.this.F.a, $$2));
         } catch (flo var5) {
            fmn.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fmn.this.F.h.size()) {
            fkp $$1 = fmn.this.F.h.get($$0);
            fmd $$2 = new fmd($$2x -> {
               if ($$2x) {
                  fjs $$3 = fjs.a();

                  try {
                     $$3.a(fmn.this.F.a, $$1.b());
                  } catch (flo var6) {
                     fmn.a.error("Couldn't uninvite user", var6);
                  }

                  fmn.this.F.h.remove($$0);
                  fmn.this.E();
               }

               fmn.this.H = true;
               fmn.this.m.a(fmn.this);
            }, fmn.c, wy.a("mco.configure.world.uninvite.player", $$1.a()));
            fmn.this.m.a($$2);
         }
      }

      private void a(fkl $$0) {
         for (fkp $$1 : fmn.this.F.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fsc g() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends ftz> aD_() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public List<? extends fvx> b() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fnh.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fmn.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10);
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

   class b extends fsi<fmn.a> {
      private static final int m = 36;

      public b() {
         super(fos.Q(), fmn.this.n, fmn.this.D.d(), fmn.this.D.c(), 36, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fro $$0, int $$1, int $$2) {
         String $$3 = fmn.this.F.h != null ? Integer.toString(fmn.this.F.h.size()) : "0";
         wy $$4 = wy.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.b(fmn.this.p, $$4, $$1 + this.a() / 2 - fmn.this.p.a($$4) / 2, $$2, -1);
      }

      @Override
      public int a() {
         return 300;
      }
   }
}

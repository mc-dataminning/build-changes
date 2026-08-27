import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbu extends gty {
   static final Logger a = LogUtils.getLogger();
   private static final wx b = wx.c("mco.configure.world.players.title");
   static final wx c = wx.c("mco.question");
   private static final int B = 8;
   final fjm C = new fjm(this);
   private final fbi D;
   final ezz E;
   @Nullable
   private fbu.b F;
   boolean G;

   public fbu(fbi $$0, ezz $$1) {
      super(b);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   public void aM_() {
      this.C.a(b, this.p);
      this.F = this.C.c(new fbu.b());
      this.C();
      fjq $$0 = this.C.b(fjq.e().a(8));
      $$0.a(ffz.a(wx.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fbn(this.D, this, this.E))).a());
      $$0.a(ffz.a(ww.k, $$0x -> this.d()).a());
      this.C.a($$1 -> {
         ffx var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
      if (this.F != null) {
         this.F.a(this.n, this.C);
      }
   }

   void C() {
      if (this.F != null) {
         this.F.aE_().clear();

         for (ezv $$0 : this.E.h) {
            this.F.aE_().add(new fbu.a($$0));
         }
      }
   }

   @Override
   public void d() {
      this.D();
   }

   private void D() {
      if (this.G) {
         this.m.a(this.D.f());
      } else {
         this.m.a(this.D);
      }
   }

   class a extends fgf.a<fbu.a> {
      private static final wx b = wx.c("mco.configure.world.invites.normal.tooltip");
      private static final wx c = wx.c("mco.configure.world.invites.ops.tooltip");
      private static final wx d = wx.c("mco.configure.world.invites.remove.tooltip");
      private static final akm e = new akm("player_list/make_operator");
      private static final akm f = new akm("player_list/remove_operator");
      private static final akm g = new akm("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final ezv j;
      private final ffz k;
      private final ffz l;
      private final ffz m;

      public a(ezv $$0) {
         this.j = $$0;
         int $$1 = fbu.this.E.h.indexOf(this.j);
         this.l = fhe.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fbu.this.p.a(b))
            .a($$1x -> ww.a(wx.a("mco.invited.player.narration", $$0.a()), (wx)$$1x.get(), wx.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fhe.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fbu.this.p.a(c))
            .a($$1x -> ww.a(wx.a("mco.invited.player.narration", $$0.a()), (wx)$$1x.get(), wx.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fhe.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fbu.this.p.a(d))
            .a($$1x -> ww.a(wx.a("mco.invited.player.narration", $$0.a()), (wx)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         ezi $$1 = ezi.a();
         UUID $$2 = fbu.this.E.h.get($$0).b();

         try {
            this.a($$1.b(fbu.this.E.a, $$2));
         } catch (fav var5) {
            fbu.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         ezi $$1 = ezi.a();
         UUID $$2 = fbu.this.E.h.get($$0).b();

         try {
            this.a($$1.c(fbu.this.E.a, $$2));
         } catch (fav var5) {
            fbu.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fbu.this.E.h.size()) {
            ezv $$1 = fbu.this.E.h.get($$0);
            fbj $$2 = new fbj($$2x -> {
               if ($$2x) {
                  ezi $$3 = ezi.a();

                  try {
                     $$3.a(fbu.this.E.a, $$1.b());
                  } catch (fav var6) {
                     fbu.a.error("Couldn't uninvite user", var6);
                  }

                  fbu.this.E.h.remove($$0);
                  fbu.this.C();
               }

               fbu.this.G = true;
               fbu.this.m.a(fbu.this);
            }, fbu.c, wx.a("mco.configure.world.uninvite.player", $$1.a()));
            fbu.this.m.a($$2);
         }
      }

      private void a(ezr $$0) {
         for (ezv $$1 : fbu.this.E.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private ffz d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fhv> aE_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fjt> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fcp.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(fbu.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
         int $$15 = $$2 + $$5 / 2 - 10;
         int $$16 = $$3 + $$4 - this.k.x();
         this.k.c($$16, $$15);
         this.k.a($$0, $$6, $$7, $$9);
         int $$17 = $$16 - this.d().x() - 8;
         this.l.c($$17, $$15);
         this.l.a($$0, $$6, $$7, $$9);
         this.m.c($$17, $$15);
         this.m.a($$0, $$6, $$7, $$9);
      }
   }

   class b extends fgf<fbu.a> {
      private static final int m = 36;

      public b() {
         super(fdz.Q(), fbu.this.n, fbu.this.C.d(), fbu.this.C.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(ffm $$0, int $$1, int $$2) {
         String $$3 = fbu.this.E.h != null ? Integer.toString(fbu.this.E.h.size()) : "0";
         wx $$4 = wx.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(fbu.this.p, $$4, $$1 + this.b() / 2 - fbu.this.p.a($$4) / 2, $$2, -1, false);
      }

      @Override
      public int a() {
         return this.l() * this.d + this.f;
      }

      @Override
      public int b() {
         return 300;
      }
   }
}

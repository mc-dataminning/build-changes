import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgi extends hdp {
   static final Logger a = LogUtils.getLogger();
   private static final xe b = xe.c("mco.configure.world.players.title");
   static final xe c = xe.c("mco.question");
   private static final int B = 8;
   final foc C = new foc(this);
   private final ffx D;
   final fep E;
   @Nullable
   private fgi.b F;
   boolean G;

   public fgi(ffx $$0, fep $$1) {
      super(b);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   public void aS_() {
      this.C.a(b, this.p);
      this.F = this.C.c(new fgi.b());
      this.D();
      fog $$0 = this.C.b(fog.e().a(8));
      $$0.a(fko.a(xe.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fgc(this.D, this, this.E))).a());
      $$0.a(fko.a(xd.k, $$0x -> this.d()).a());
      this.C.a($$1 -> {
         fkm var10000 = this.c($$1);
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

   void D() {
      if (this.F != null) {
         this.F.aJ_().clear();

         for (fel $$0 : this.E.h) {
            this.F.aJ_().add(new fgi.a($$0));
         }
      }
   }

   @Override
   public void d() {
      this.E();
   }

   private void E() {
      if (this.G) {
         this.m.a(this.D.g());
      } else {
         this.m.a(this.D);
      }
   }

   class a extends fku.a<fgi.a> {
      private static final xe b = xe.c("mco.configure.world.invites.normal.tooltip");
      private static final xe c = xe.c("mco.configure.world.invites.ops.tooltip");
      private static final xe d = xe.c("mco.configure.world.invites.remove.tooltip");
      private static final ale e = ale.b("player_list/make_operator");
      private static final ale f = ale.b("player_list/remove_operator");
      private static final ale g = ale.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fel j;
      private final fko k;
      private final fko l;
      private final fko m;

      public a(final fel $$0) {
         this.j = $$0;
         int $$1 = fgi.this.E.h.indexOf(this.j);
         this.l = flt.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fgi.this.p.a(b))
            .a($$1x -> xd.a(xe.a("mco.invited.player.narration", $$0.a()), (xe)$$1x.get(), xe.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = flt.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fgi.this.p.a(c))
            .a($$1x -> xd.a(xe.a("mco.invited.player.narration", $$0.a()), (xe)$$1x.get(), xe.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = flt.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fgi.this.p.a(d))
            .a($$1x -> xd.a(xe.a("mco.invited.player.narration", $$0.a()), (xe)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fdy $$1 = fdy.a();
         UUID $$2 = fgi.this.E.h.get($$0).b();

         try {
            this.a($$1.b(fgi.this.E.a, $$2));
         } catch (ffj var5) {
            fgi.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fdy $$1 = fdy.a();
         UUID $$2 = fgi.this.E.h.get($$0).b();

         try {
            this.a($$1.c(fgi.this.E.a, $$2));
         } catch (ffj var5) {
            fgi.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fgi.this.E.h.size()) {
            fel $$1 = fgi.this.E.h.get($$0);
            ffy $$2 = new ffy($$2x -> {
               if ($$2x) {
                  fdy $$3 = fdy.a();

                  try {
                     $$3.a(fgi.this.E.a, $$1.b());
                  } catch (ffj var6) {
                     fgi.a.error("Couldn't uninvite user", var6);
                  }

                  fgi.this.E.h.remove($$0);
                  fgi.this.D();
               }

               fgi.this.G = true;
               fgi.this.m.a(fgi.this);
            }, fgi.c, xe.a("mco.configure.world.uninvite.player", $$1.a()));
            fgi.this.m.a($$2);
         }
      }

      private void a(feh $$0) {
         for (fel $$1 : fgi.this.E.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fko d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fml> aJ_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends foj> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fhd.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(fgi.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
         int $$15 = $$2 + $$5 / 2 - 10;
         int $$16 = $$3 + $$4 - this.k.y();
         this.k.c($$16, $$15);
         this.k.a($$0, $$6, $$7, $$9);
         int $$17 = $$16 - this.d().y() - 8;
         this.l.c($$17, $$15);
         this.l.a($$0, $$6, $$7, $$9);
         this.m.c($$17, $$15);
         this.m.a($$0, $$6, $$7, $$9);
      }
   }

   class b extends fku<fgi.a> {
      private static final int m = 36;

      public b() {
         super(fip.Q(), fgi.this.n, fgi.this.C.d(), fgi.this.C.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fkb $$0, int $$1, int $$2) {
         String $$3 = fgi.this.E.h != null ? Integer.toString(fgi.this.E.h.size()) : "0";
         xe $$4 = xe.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(fgi.this.p, $$4, $$1 + this.b() / 2 - fgi.this.p.a($$4) / 2, $$2, -1, false);
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

import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffu extends hct {
   static final Logger a = LogUtils.getLogger();
   private static final xd b = xd.c("mco.configure.world.players.title");
   static final xd c = xd.c("mco.question");
   private static final int B = 8;
   final fno C = new fno(this);
   private final ffj D;
   final feb E;
   @Nullable
   private ffu.b F;
   boolean G;

   public ffu(ffj $$0, feb $$1) {
      super(b);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   public void aT_() {
      this.C.a(b, this.p);
      this.F = this.C.c(new ffu.b());
      this.D();
      fns $$0 = this.C.b(fns.e().a(8));
      $$0.a(fka.a(xd.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new ffo(this.D, this, this.E))).a());
      $$0.a(fka.a(xc.k, $$0x -> this.d()).a());
      this.C.a($$1 -> {
         fjy var10000 = this.c($$1);
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
         this.F.aK_().clear();

         for (fdx $$0 : this.E.h) {
            this.F.aK_().add(new ffu.a($$0));
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

   class a extends fkg.a<ffu.a> {
      private static final xd b = xd.c("mco.configure.world.invites.normal.tooltip");
      private static final xd c = xd.c("mco.configure.world.invites.ops.tooltip");
      private static final xd d = xd.c("mco.configure.world.invites.remove.tooltip");
      private static final alb e = alb.b("player_list/make_operator");
      private static final alb f = alb.b("player_list/remove_operator");
      private static final alb g = alb.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fdx j;
      private final fka k;
      private final fka l;
      private final fka m;

      public a(final fdx $$0) {
         this.j = $$0;
         int $$1 = ffu.this.E.h.indexOf(this.j);
         this.l = flf.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + ffu.this.p.a(b))
            .a($$1x -> xc.a(xd.a("mco.invited.player.narration", $$0.a()), (xd)$$1x.get(), xd.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = flf.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + ffu.this.p.a(c))
            .a($$1x -> xc.a(xd.a("mco.invited.player.narration", $$0.a()), (xd)$$1x.get(), xd.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = flf.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + ffu.this.p.a(d))
            .a($$1x -> xc.a(xd.a("mco.invited.player.narration", $$0.a()), (xd)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fdk $$1 = fdk.a();
         UUID $$2 = ffu.this.E.h.get($$0).b();

         try {
            this.a($$1.b(ffu.this.E.a, $$2));
         } catch (fev var5) {
            ffu.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fdk $$1 = fdk.a();
         UUID $$2 = ffu.this.E.h.get($$0).b();

         try {
            this.a($$1.c(ffu.this.E.a, $$2));
         } catch (fev var5) {
            ffu.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < ffu.this.E.h.size()) {
            fdx $$1 = ffu.this.E.h.get($$0);
            ffk $$2 = new ffk($$2x -> {
               if ($$2x) {
                  fdk $$3 = fdk.a();

                  try {
                     $$3.a(ffu.this.E.a, $$1.b());
                  } catch (fev var6) {
                     ffu.a.error("Couldn't uninvite user", var6);
                  }

                  ffu.this.E.h.remove($$0);
                  ffu.this.D();
               }

               ffu.this.G = true;
               ffu.this.m.a(ffu.this);
            }, ffu.c, xd.a("mco.configure.world.uninvite.player", $$1.a()));
            ffu.this.m.a($$2);
         }
      }

      private void a(fdt $$0) {
         for (fdx $$1 : ffu.this.E.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fka d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends flx> aK_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fnv> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fgp.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(ffu.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends fkg<ffu.a> {
      private static final int m = 36;

      public b() {
         super(fib.Q(), ffu.this.n, ffu.this.C.d(), ffu.this.C.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fjn $$0, int $$1, int $$2) {
         String $$3 = ffu.this.E.h != null ? Integer.toString(ffu.this.E.h.size()) : "0";
         xd $$4 = xd.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(ffu.this.p, $$4, $$1 + this.b() / 2 - ffu.this.p.a($$4) / 2, $$2, -1, false);
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

import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhu extends hff {
   static final Logger a = LogUtils.getLogger();
   private static final xl b = xl.c("mco.configure.world.players.title");
   static final xl c = xl.c("mco.question");
   private static final int B = 8;
   final fpl C = new fpl(this);
   private final fhj D;
   final fgb E;
   @Nullable
   private fhu.b F;
   boolean G;

   public fhu(fhj $$0, fgb $$1) {
      super(b);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   public void aS_() {
      this.C.a(b, this.p);
      this.F = this.C.c(new fhu.b());
      this.D();
      fpp $$0 = this.C.b(fpp.e().a(8));
      $$0.a(flw.a(xl.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fho(this.D, this, this.E))).a());
      $$0.a(flw.a(xk.k, $$0x -> this.aP_()).a());
      this.C.a($$1 -> {
         flu var10000 = this.c($$1);
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
         this.F.aI_().clear();

         for (ffx $$0 : this.E.h) {
            this.F.aI_().add(new fhu.a($$0));
         }
      }
   }

   @Override
   public void aP_() {
      this.E();
   }

   private void E() {
      if (this.G) {
         this.m.a(this.D.g());
      } else {
         this.m.a(this.D);
      }
   }

   class a extends fmc.a<fhu.a> {
      private static final xl b = xl.c("mco.configure.world.invites.normal.tooltip");
      private static final xl c = xl.c("mco.configure.world.invites.ops.tooltip");
      private static final xl d = xl.c("mco.configure.world.invites.remove.tooltip");
      private static final all e = all.b("player_list/make_operator");
      private static final all f = all.b("player_list/remove_operator");
      private static final all g = all.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final ffx j;
      private final flw k;
      private final flw l;
      private final flw m;

      public a(final ffx $$0) {
         this.j = $$0;
         int $$1 = fhu.this.E.h.indexOf(this.j);
         this.l = fnb.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fhu.this.p.a(b))
            .a($$1x -> xk.a(xl.a("mco.invited.player.narration", $$0.a()), (xl)$$1x.get(), xl.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fnb.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fhu.this.p.a(c))
            .a($$1x -> xk.a(xl.a("mco.invited.player.narration", $$0.a()), (xl)$$1x.get(), xl.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fnb.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fhu.this.p.a(d))
            .a($$1x -> xk.a(xl.a("mco.invited.player.narration", $$0.a()), (xl)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         ffa $$1 = ffa.a();
         UUID $$2 = fhu.this.E.h.get($$0).b();

         try {
            this.a($$1.b(fhu.this.E.a, $$2));
         } catch (fgv var5) {
            fhu.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         ffa $$1 = ffa.a();
         UUID $$2 = fhu.this.E.h.get($$0).b();

         try {
            this.a($$1.c(fhu.this.E.a, $$2));
         } catch (fgv var5) {
            fhu.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fhu.this.E.h.size()) {
            ffx $$1 = fhu.this.E.h.get($$0);
            fhk $$2 = new fhk($$2x -> {
               if ($$2x) {
                  ffa $$3 = ffa.a();

                  try {
                     $$3.a(fhu.this.E.a, $$1.b());
                  } catch (fgv var6) {
                     fhu.a.error("Couldn't uninvite user", var6);
                  }

                  fhu.this.E.h.remove($$0);
                  fhu.this.D();
               }

               fhu.this.G = true;
               fhu.this.m.a(fhu.this);
            }, fhu.c, xl.a("mco.configure.world.uninvite.player", $$1.a()));
            fhu.this.m.a($$2);
         }
      }

      private void a(fft $$0) {
         for (ffx $$1 : fhu.this.E.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private flw d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fnt> aI_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fps> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fio.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(fhu.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends fmc<fhu.a> {
      private static final int m = 36;

      public b() {
         super(fjx.Q(), fhu.this.n, fhu.this.C.d(), fhu.this.C.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(flj $$0, int $$1, int $$2) {
         String $$3 = fhu.this.E.h != null ? Integer.toString(fhu.this.E.h.size()) : "0";
         xl $$4 = xl.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(fhu.this.p, $$4, $$1 + this.b() / 2 - fhu.this.p.a($$4) / 2, $$2, -1, false);
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

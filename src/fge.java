import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fge extends hdk {
   static final Logger a = LogUtils.getLogger();
   private static final xd b = xd.c("mco.configure.world.players.title");
   static final xd c = xd.c("mco.question");
   private static final int B = 8;
   final fny C = new fny(this);
   private final fft D;
   final fel E;
   @Nullable
   private fge.b F;
   boolean G;

   public fge(fft $$0, fel $$1) {
      super(b);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   public void aR_() {
      this.C.a(b, this.p);
      this.F = this.C.c(new fge.b());
      this.D();
      foc $$0 = this.C.b(foc.e().a(8));
      $$0.a(fkk.a(xd.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new ffy(this.D, this, this.E))).a());
      $$0.a(fkk.a(xc.k, $$0x -> this.d()).a());
      this.C.a($$1 -> {
         fki var10000 = this.c($$1);
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

         for (feh $$0 : this.E.h) {
            this.F.aI_().add(new fge.a($$0));
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

   class a extends fkq.a<fge.a> {
      private static final xd b = xd.c("mco.configure.world.invites.normal.tooltip");
      private static final xd c = xd.c("mco.configure.world.invites.ops.tooltip");
      private static final xd d = xd.c("mco.configure.world.invites.remove.tooltip");
      private static final alc e = alc.b("player_list/make_operator");
      private static final alc f = alc.b("player_list/remove_operator");
      private static final alc g = alc.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final feh j;
      private final fkk k;
      private final fkk l;
      private final fkk m;

      public a(final feh $$0) {
         this.j = $$0;
         int $$1 = fge.this.E.h.indexOf(this.j);
         this.l = flp.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fge.this.p.a(b))
            .a($$1x -> xc.a(xd.a("mco.invited.player.narration", $$0.a()), (xd)$$1x.get(), xd.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = flp.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fge.this.p.a(c))
            .a($$1x -> xc.a(xd.a("mco.invited.player.narration", $$0.a()), (xd)$$1x.get(), xd.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = flp.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fge.this.p.a(d))
            .a($$1x -> xc.a(xd.a("mco.invited.player.narration", $$0.a()), (xd)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fdu $$1 = fdu.a();
         UUID $$2 = fge.this.E.h.get($$0).b();

         try {
            this.a($$1.b(fge.this.E.a, $$2));
         } catch (fff var5) {
            fge.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fdu $$1 = fdu.a();
         UUID $$2 = fge.this.E.h.get($$0).b();

         try {
            this.a($$1.c(fge.this.E.a, $$2));
         } catch (fff var5) {
            fge.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fge.this.E.h.size()) {
            feh $$1 = fge.this.E.h.get($$0);
            ffu $$2 = new ffu($$2x -> {
               if ($$2x) {
                  fdu $$3 = fdu.a();

                  try {
                     $$3.a(fge.this.E.a, $$1.b());
                  } catch (fff var6) {
                     fge.a.error("Couldn't uninvite user", var6);
                  }

                  fge.this.E.h.remove($$0);
                  fge.this.D();
               }

               fge.this.G = true;
               fge.this.m.a(fge.this);
            }, fge.c, xd.a("mco.configure.world.uninvite.player", $$1.a()));
            fge.this.m.a($$2);
         }
      }

      private void a(fed $$0) {
         for (feh $$1 : fge.this.E.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fkk d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fmh> aI_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fof> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fgz.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(fge.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends fkq<fge.a> {
      private static final int m = 36;

      public b() {
         super(fil.Q(), fge.this.n, fge.this.C.d(), fge.this.C.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fjx $$0, int $$1, int $$2) {
         String $$3 = fge.this.E.h != null ? Integer.toString(fge.this.E.h.size()) : "0";
         xd $$4 = xd.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(fge.this.p, $$4, $$1 + this.b() / 2 - fge.this.p.a($$4) / 2, $$2, -1, false);
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

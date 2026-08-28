import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fec extends gwj {
   static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("mco.configure.world.players.title");
   static final wy c = wy.c("mco.question");
   private static final int A = 8;
   final flt B = new flt(this);
   private final fdr C;
   final fcj D;
   @Nullable
   private fec.b E;
   boolean F;

   public fec(fdr $$0, fcj $$1) {
      super(b);
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   public void aP_() {
      this.B.a(b, this.o);
      this.E = this.B.c(new fec.b());
      this.D();
      flx $$0 = this.B.b(flx.e().a(8));
      $$0.a(fig.a(wy.c("mco.configure.world.buttons.invite"), $$0x -> this.l.a(new fdw(this.C, this, this.D))).a());
      $$0.a(fig.a(wx.k, $$0x -> this.d()).a());
      this.B.a($$1 -> {
         fie var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.a();
      if (this.E != null) {
         this.E.a(this.m, this.B);
      }
   }

   void D() {
      if (this.E != null) {
         this.E.aG_().clear();

         for (fcf $$0 : this.D.h) {
            this.E.aG_().add(new fec.a($$0));
         }
      }
   }

   @Override
   public void d() {
      this.E();
   }

   private void E() {
      if (this.F) {
         this.l.a(this.C.g());
      } else {
         this.l.a(this.C);
      }
   }

   class a extends fim.a<fec.a> {
      private static final wy b = wy.c("mco.configure.world.invites.normal.tooltip");
      private static final wy c = wy.c("mco.configure.world.invites.ops.tooltip");
      private static final wy d = wy.c("mco.configure.world.invites.remove.tooltip");
      private static final akq e = akq.b("player_list/make_operator");
      private static final akq f = akq.b("player_list/remove_operator");
      private static final akq g = akq.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fcf j;
      private final fig k;
      private final fig l;
      private final fig m;

      public a(final fcf $$0) {
         this.j = $$0;
         int $$1 = fec.this.D.h.indexOf(this.j);
         this.l = fjl.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fec.this.o.a(b))
            .a($$1x -> wx.a(wy.a("mco.invited.player.narration", $$0.a()), (wy)$$1x.get(), wy.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fjl.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fec.this.o.a(c))
            .a($$1x -> wx.a(wy.a("mco.invited.player.narration", $$0.a()), (wy)$$1x.get(), wy.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fjl.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fec.this.o.a(d))
            .a($$1x -> wx.a(wy.a("mco.invited.player.narration", $$0.a()), (wy)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fbs $$1 = fbs.a();
         UUID $$2 = fec.this.D.h.get($$0).b();

         try {
            this.a($$1.b(fec.this.D.a, $$2));
         } catch (fdd var5) {
            fec.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fbs $$1 = fbs.a();
         UUID $$2 = fec.this.D.h.get($$0).b();

         try {
            this.a($$1.c(fec.this.D.a, $$2));
         } catch (fdd var5) {
            fec.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fec.this.D.h.size()) {
            fcf $$1 = fec.this.D.h.get($$0);
            fds $$2 = new fds($$2x -> {
               if ($$2x) {
                  fbs $$3 = fbs.a();

                  try {
                     $$3.a(fec.this.D.a, $$1.b());
                  } catch (fdd var6) {
                     fec.a.error("Couldn't uninvite user", var6);
                  }

                  fec.this.D.h.remove($$0);
                  fec.this.D();
               }

               fec.this.F = true;
               fec.this.l.a(fec.this);
            }, fec.c, wy.a("mco.configure.world.uninvite.player", $$1.a()));
            fec.this.l.a($$2);
         }
      }

      private void a(fcb $$0) {
         for (fcf $$1 : fec.this.D.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fig d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fkc> aG_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fma> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fex.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(fec.this.o, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends fim<fec.a> {
      private static final int m = 36;

      public b() {
         super(fgi.Q(), fec.this.m, fec.this.B.d(), fec.this.B.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fht $$0, int $$1, int $$2) {
         String $$3 = fec.this.D.h != null ? Integer.toString(fec.this.D.h.size()) : "0";
         wy $$4 = wy.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(fec.this.o, $$4, $$1 + this.b() / 2 - fec.this.o.a($$4) / 2, $$2, -1, false);
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

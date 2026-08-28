import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fei extends gwq {
   static final Logger a = LogUtils.getLogger();
   private static final wz b = wz.c("mco.configure.world.players.title");
   static final wz c = wz.c("mco.question");
   private static final int B = 8;
   final flz C = new flz(this);
   private final fdx D;
   final fcp E;
   @Nullable
   private fei.b F;
   boolean G;

   public fei(fdx $$0, fcp $$1) {
      super(b);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   public void aT_() {
      this.C.a(b, this.o);
      this.F = this.C.c(new fei.b());
      this.C();
      fmd $$0 = this.C.b(fmd.e().a(8));
      $$0.a(fim.a(wz.c("mco.configure.world.buttons.invite"), $$0x -> this.l.a(new fec(this.D, this, this.E))).a());
      $$0.a(fim.a(wy.k, $$0x -> this.d()).a());
      this.C.a($$1 -> {
         fik var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
      if (this.F != null) {
         this.F.a(this.m, this.C);
      }
   }

   void C() {
      if (this.F != null) {
         this.F.aK_().clear();

         for (fcl $$0 : this.E.h) {
            this.F.aK_().add(new fei.a($$0));
         }
      }
   }

   @Override
   public void d() {
      this.D();
   }

   private void D() {
      if (this.G) {
         this.l.a(this.D.g());
      } else {
         this.l.a(this.D);
      }
   }

   class a extends fis.a<fei.a> {
      private static final wz b = wz.c("mco.configure.world.invites.normal.tooltip");
      private static final wz c = wz.c("mco.configure.world.invites.ops.tooltip");
      private static final wz d = wz.c("mco.configure.world.invites.remove.tooltip");
      private static final akr e = akr.b("player_list/make_operator");
      private static final akr f = akr.b("player_list/remove_operator");
      private static final akr g = akr.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fcl j;
      private final fim k;
      private final fim l;
      private final fim m;

      public a(final fcl $$0) {
         this.j = $$0;
         int $$1 = fei.this.E.h.indexOf(this.j);
         this.l = fjr.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fei.this.o.a(b))
            .a($$1x -> wy.a(wz.a("mco.invited.player.narration", $$0.a()), (wz)$$1x.get(), wz.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fjr.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fei.this.o.a(c))
            .a($$1x -> wy.a(wz.a("mco.invited.player.narration", $$0.a()), (wz)$$1x.get(), wz.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fjr.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fei.this.o.a(d))
            .a($$1x -> wy.a(wz.a("mco.invited.player.narration", $$0.a()), (wz)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fby $$1 = fby.a();
         UUID $$2 = fei.this.E.h.get($$0).b();

         try {
            this.a($$1.b(fei.this.E.a, $$2));
         } catch (fdj var5) {
            fei.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fby $$1 = fby.a();
         UUID $$2 = fei.this.E.h.get($$0).b();

         try {
            this.a($$1.c(fei.this.E.a, $$2));
         } catch (fdj var5) {
            fei.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fei.this.E.h.size()) {
            fcl $$1 = fei.this.E.h.get($$0);
            fdy $$2 = new fdy($$2x -> {
               if ($$2x) {
                  fby $$3 = fby.a();

                  try {
                     $$3.a(fei.this.E.a, $$1.b());
                  } catch (fdj var6) {
                     fei.a.error("Couldn't uninvite user", var6);
                  }

                  fei.this.E.h.remove($$0);
                  fei.this.C();
               }

               fei.this.G = true;
               fei.this.l.a(fei.this);
            }, fei.c, wz.a("mco.configure.world.uninvite.player", $$1.a()));
            fei.this.l.a($$2);
         }
      }

      private void a(fch $$0) {
         for (fcl $$1 : fei.this.E.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fim d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fki> aK_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fmg> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         ffd.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(fei.this.o, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends fis<fei.a> {
      private static final int m = 36;

      public b() {
         super(fgo.Q(), fei.this.m, fei.this.C.d(), fei.this.C.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fhz $$0, int $$1, int $$2) {
         String $$3 = fei.this.E.h != null ? Integer.toString(fei.this.E.h.size()) : "0";
         wz $$4 = wz.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(fei.this.o, $$4, $$1 + this.b() / 2 - fei.this.o.a($$4) / 2, $$2, -1, false);
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

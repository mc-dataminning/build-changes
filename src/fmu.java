import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmu extends hpj {
   static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("mco.configure.world.players.title");
   static final wy c = wy.c("mco.question");
   private static final int C = 8;
   final fvx D = new fvx(this);
   private final fmj E;
   final fla F;
   @Nullable
   private fmu.b G;
   boolean H;

   public fmu(fmj $$0, fla $$1) {
      super(b);
      this.E = $$0;
      this.F = $$1;
   }

   @Override
   public void aO_() {
      this.D.a(b, this.p);
      this.G = this.D.c(new fmu.b());
      this.E();
      fwb $$0 = this.D.b(fwb.e().a(8));
      $$0.a(fsj.a(wy.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fmo(this.E, this, this.F))).a());
      $$0.a(fsj.a(wx.k, $$0x -> this.aL_()).a());
      this.D.a($$1 -> {
         fsh var10000 = this.c($$1);
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

         for (fkw $$0 : this.F.h) {
            this.G.aE_().add(new fmu.a($$0));
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

   class a extends fsp.a<fmu.a> {
      private static final wy b = wy.c("mco.configure.world.invites.normal.tooltip");
      private static final wy c = wy.c("mco.configure.world.invites.ops.tooltip");
      private static final wy d = wy.c("mco.configure.world.invites.remove.tooltip");
      private static final alg e = alg.b("player_list/make_operator");
      private static final alg f = alg.b("player_list/remove_operator");
      private static final alg g = alg.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fkw j;
      private final fsj k;
      private final fsj l;
      private final fsj m;

      public a(final fkw $$0) {
         this.j = $$0;
         int $$1 = fmu.this.F.h.indexOf(this.j);
         this.l = fto.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fmu.this.p.a(b))
            .a($$1x -> wx.a(wy.a("mco.invited.player.narration", $$0.a()), (wy)$$1x.get(), wy.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fto.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fmu.this.p.a(c))
            .a($$1x -> wx.a(wy.a("mco.invited.player.narration", $$0.a()), (wy)$$1x.get(), wy.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fto.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fmu.this.p.a(d))
            .a($$1x -> wx.a(wy.a("mco.invited.player.narration", $$0.a()), (wy)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fjz $$1 = fjz.a();
         UUID $$2 = fmu.this.F.h.get($$0).b();

         try {
            this.a($$1.b(fmu.this.F.a, $$2));
         } catch (flv var5) {
            fmu.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fjz $$1 = fjz.a();
         UUID $$2 = fmu.this.F.h.get($$0).b();

         try {
            this.a($$1.c(fmu.this.F.a, $$2));
         } catch (flv var5) {
            fmu.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fmu.this.F.h.size()) {
            fkw $$1 = fmu.this.F.h.get($$0);
            fmk $$2 = new fmk($$2x -> {
               if ($$2x) {
                  fjz $$3 = fjz.a();

                  try {
                     $$3.a(fmu.this.F.a, $$1.b());
                  } catch (flv var6) {
                     fmu.a.error("Couldn't uninvite user", var6);
                  }

                  fmu.this.F.h.remove($$0);
                  fmu.this.E();
               }

               fmu.this.H = true;
               fmu.this.m.a(fmu.this);
            }, fmu.c, wy.a("mco.configure.world.uninvite.player", $$1.a()));
            fmu.this.m.a($$2);
         }
      }

      private void a(fks $$0) {
         for (fkw $$1 : fmu.this.F.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fsj g() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fug> aE_() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public List<? extends fwe> b() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public void a(frv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fno.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fmu.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10);
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

   class b extends fsp<fmu.a> {
      private static final int m = 36;

      public b() {
         super(foz.Q(), fmu.this.n, fmu.this.D.d(), fmu.this.D.c(), 36, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(frv $$0, int $$1, int $$2) {
         String $$3 = fmu.this.F.h != null ? Integer.toString(fmu.this.F.h.size()) : "0";
         wy $$4 = wy.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.b(fmu.this.p, $$4, $$1 + this.a() / 2 - fmu.this.p.a($$4) / 2, $$2, -1);
      }

      @Override
      public int a() {
         return 300;
      }
   }
}

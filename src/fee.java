import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fee extends gxb {
   static final Logger a = LogUtils.getLogger();
   private static final xe b = xe.c("mco.configure.world.players.title");
   static final xe c = xe.c("mco.question");
   private static final int B = 8;
   final fma C = new fma(this);
   private final fds D;
   final fcj E;
   @Nullable
   private fee.b F;
   boolean G;

   public fee(fds $$0, fcj $$1) {
      super(b);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   public void aN_() {
      this.C.a(b, this.p);
      this.F = this.C.c(new fee.b());
      this.C();
      fme $$0 = this.C.b(fme.e().a(8));
      $$0.a(fin.a(xe.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fdx(this.D, this, this.E))).a());
      $$0.a(fin.a(xd.k, $$0x -> this.d()).a());
      this.C.a($$1 -> {
         fil var10000 = this.c($$1);
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

         for (fcf $$0 : this.E.h) {
            this.F.aE_().add(new fee.a($$0));
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

   class a extends fit.a<fee.a> {
      private static final xe b = xe.c("mco.configure.world.invites.normal.tooltip");
      private static final xe c = xe.c("mco.configure.world.invites.ops.tooltip");
      private static final xe d = xe.c("mco.configure.world.invites.remove.tooltip");
      private static final akt e = new akt("player_list/make_operator");
      private static final akt f = new akt("player_list/remove_operator");
      private static final akt g = new akt("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fcf j;
      private final fin k;
      private final fin l;
      private final fin m;

      public a(fcf $$0) {
         this.j = $$0;
         int $$1 = fee.this.E.h.indexOf(this.j);
         this.l = fjs.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fee.this.p.a(b))
            .a($$1x -> xd.a(xe.a("mco.invited.player.narration", $$0.a()), (xe)$$1x.get(), xe.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fjs.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fee.this.p.a(c))
            .a($$1x -> xd.a(xe.a("mco.invited.player.narration", $$0.a()), (xe)$$1x.get(), xe.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fjs.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fee.this.p.a(d))
            .a($$1x -> xd.a(xe.a("mco.invited.player.narration", $$0.a()), (xe)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fbs $$1 = fbs.a();
         UUID $$2 = fee.this.E.h.get($$0).b();

         try {
            this.a($$1.b(fee.this.E.a, $$2));
         } catch (fdf var5) {
            fee.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fbs $$1 = fbs.a();
         UUID $$2 = fee.this.E.h.get($$0).b();

         try {
            this.a($$1.c(fee.this.E.a, $$2));
         } catch (fdf var5) {
            fee.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fee.this.E.h.size()) {
            fcf $$1 = fee.this.E.h.get($$0);
            fdt $$2 = new fdt($$2x -> {
               if ($$2x) {
                  fbs $$3 = fbs.a();

                  try {
                     $$3.a(fee.this.E.a, $$1.b());
                  } catch (fdf var6) {
                     fee.a.error("Couldn't uninvite user", var6);
                  }

                  fee.this.E.h.remove($$0);
                  fee.this.C();
               }

               fee.this.G = true;
               fee.this.m.a(fee.this);
            }, fee.c, xe.a("mco.configure.world.uninvite.player", $$1.a()));
            fee.this.m.a($$2);
         }
      }

      private void a(fcb $$0) {
         for (fcf $$1 : fee.this.E.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fin d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fkj> aE_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fmh> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fez.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(fee.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends fit<fee.a> {
      private static final int m = 36;

      public b() {
         super(fgj.Q(), fee.this.n, fee.this.C.d(), fee.this.C.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fia $$0, int $$1, int $$2) {
         String $$3 = fee.this.E.h != null ? Integer.toString(fee.this.E.h.size()) : "0";
         xe $$4 = xe.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(fee.this.p, $$4, $$1 + this.b() / 2 - fee.this.p.a($$4) / 2, $$2, -1, false);
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

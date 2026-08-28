import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpb extends hro {
   static final Logger a = LogUtils.getLogger();
   private static final xc b = xc.c("mco.configure.world.players.title");
   static final xc c = xc.c("mco.question");
   private static final int C = 8;
   final fyb D = new fyb(this);
   private final fop E;
   final fng F;
   @Nullable
   private fpb.b G;
   boolean H;

   public fpb(fop $$0, fng $$1) {
      super(b);
      this.E = $$0;
      this.F = $$1;
   }

   @Override
   public void aS_() {
      this.D.a(b, this.p);
      this.G = this.D.c(new fpb.b());
      this.E();
      fyf $$0 = this.D.b(fyf.e().a(8));
      $$0.a(fun.a(xc.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fov(this.E, this, this.F))).a());
      $$0.a(fun.a(xb.k, $$0x -> this.aP_()).a());
      this.D.a($$1 -> {
         ful var10000 = this.c($$1);
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
         this.G.aI_().clear();

         for (fnc $$0 : this.F.h) {
            this.G.aI_().add(new fpb.a($$0));
         }
      }
   }

   @Override
   public void aP_() {
      this.F();
   }

   private void F() {
      if (this.H) {
         this.m.a(this.E.g());
      } else {
         this.m.a(this.E);
      }
   }

   class a extends fut.a<fpb.a> {
      private static final xc b = xc.c("mco.configure.world.invites.normal.tooltip");
      private static final xc c = xc.c("mco.configure.world.invites.ops.tooltip");
      private static final xc d = xc.c("mco.configure.world.invites.remove.tooltip");
      private static final alk e = alk.b("player_list/make_operator");
      private static final alk f = alk.b("player_list/remove_operator");
      private static final alk g = alk.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fnc j;
      private final fun k;
      private final fun l;
      private final fun m;

      public a(final fnc $$0) {
         this.j = $$0;
         int $$1 = fpb.this.F.h.indexOf(this.j);
         this.l = fvs.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fpb.this.p.a(b))
            .a($$1x -> xb.a(xc.a("mco.invited.player.narration", $$0.a()), (xc)$$1x.get(), xc.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fvs.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fpb.this.p.a(c))
            .a($$1x -> xb.a(xc.a("mco.invited.player.narration", $$0.a()), (xc)$$1x.get(), xc.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fvs.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fpb.this.p.a(d))
            .a($$1x -> xb.a(xc.a("mco.invited.player.narration", $$0.a()), (xc)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fmf $$1 = fmf.a();
         UUID $$2 = fpb.this.F.h.get($$0).b();

         try {
            this.a($$1.b(fpb.this.F.a, $$2));
         } catch (fob var5) {
            fpb.a.error("Couldn't op the user", var5);
         }

         this.c();
         this.a(this.m);
      }

      private void b(int $$0) {
         fmf $$1 = fmf.a();
         UUID $$2 = fpb.this.F.h.get($$0).b();

         try {
            this.a($$1.c(fpb.this.F.a, $$2));
         } catch (fob var5) {
            fpb.a.error("Couldn't deop the user", var5);
         }

         this.c();
         this.a(this.l);
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fpb.this.F.h.size()) {
            fnc $$1 = fpb.this.F.h.get($$0);
            foq $$2 = new foq($$2x -> {
               if ($$2x) {
                  fmf $$3 = fmf.a();

                  try {
                     $$3.a(fpb.this.F.a, $$1.b());
                  } catch (fob var6) {
                     fpb.a.error("Couldn't uninvite user", var6);
                  }

                  fpb.this.F.h.remove($$0);
                  fpb.this.E();
               }

               fpb.this.H = true;
               fpb.this.m.a(fpb.this);
            }, fpb.c, xc.a("mco.configure.world.uninvite.player", $$1.a()));
            fpb.this.m.a($$2);
         }
      }

      private void a(fmy $$0) {
         for (fnc $$1 : fpb.this.F.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fun g() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fwk> aI_() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public List<? extends fyi> b() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fpv.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fpb.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10);
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

   class b extends fut<fpb.a> {
      private static final int m = 36;

      public b() {
         super(frf.Q(), fpb.this.n, fpb.this.D.d(), fpb.this.D.c(), 36, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(ftz $$0, int $$1, int $$2) {
         String $$3 = fpb.this.F.h != null ? Integer.toString(fpb.this.F.h.size()) : "0";
         xc $$4 = xc.a("mco.configure.world.invited.number", $$3).a(o.t);
         $$0.b(fpb.this.p, $$4, $$1 + this.a() / 2 - fpb.this.p.a($$4) / 2, $$2, -1);
      }

      @Override
      public int a() {
         return 300;
      }
   }
}

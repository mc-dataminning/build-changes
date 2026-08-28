import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcz extends gvf {
   static final Logger a = LogUtils.getLogger();
   private static final xo b = xo.c("mco.configure.world.players.title");
   static final xo c = xo.c("mco.question");
   private static final int B = 8;
   final fkq C = new fkq(this);
   private final fcn D;
   final fbe E;
   @Nullable
   private fcz.b F;
   boolean G;

   public fcz(fcn $$0, fbe $$1) {
      super(b);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   public void aM_() {
      this.C.a(b, this.p);
      this.F = this.C.c(new fcz.b());
      this.E();
      fku $$0 = this.C.b(fku.e().a(8));
      $$0.a(fhd.a(xo.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fcs(this.D, this, this.E))).a());
      $$0.a(fhd.a(xn.k, $$0x -> this.d()).a());
      this.C.a($$1 -> {
         fhb var10000 = this.c($$1);
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

   void E() {
      if (this.F != null) {
         this.F.aD_().clear();

         for (fba $$0 : this.E.h) {
            this.F.aD_().add(new fcz.a($$0));
         }
      }
   }

   @Override
   public void d() {
      this.F();
   }

   private void F() {
      if (this.G) {
         this.m.a(this.D.f());
      } else {
         this.m.a(this.D);
      }
   }

   class a extends fhj.a<fcz.a> {
      private static final xo b = xo.c("mco.configure.world.invites.normal.tooltip");
      private static final xo c = xo.c("mco.configure.world.invites.ops.tooltip");
      private static final xo d = xo.c("mco.configure.world.invites.remove.tooltip");
      private static final ale e = new ale("player_list/make_operator");
      private static final ale f = new ale("player_list/remove_operator");
      private static final ale g = new ale("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fba j;
      private final fhd k;
      private final fhd l;
      private final fhd m;

      public a(final fba $$0) {
         this.j = $$0;
         int $$1 = fcz.this.E.h.indexOf(this.j);
         this.l = fii.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fcz.this.p.a(b))
            .a($$1x -> xn.a(xo.a("mco.invited.player.narration", $$0.a()), (xo)$$1x.get(), xo.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fii.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fcz.this.p.a(c))
            .a($$1x -> xn.a(xo.a("mco.invited.player.narration", $$0.a()), (xo)$$1x.get(), xo.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fii.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fcz.this.p.a(d))
            .a($$1x -> xn.a(xo.a("mco.invited.player.narration", $$0.a()), (xo)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fan $$1 = fan.a();
         UUID $$2 = fcz.this.E.h.get($$0).b();

         try {
            this.a($$1.b(fcz.this.E.a, $$2));
         } catch (fca var5) {
            fcz.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fan $$1 = fan.a();
         UUID $$2 = fcz.this.E.h.get($$0).b();

         try {
            this.a($$1.c(fcz.this.E.a, $$2));
         } catch (fca var5) {
            fcz.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fcz.this.E.h.size()) {
            fba $$1 = fcz.this.E.h.get($$0);
            fco $$2 = new fco($$2x -> {
               if ($$2x) {
                  fan $$3 = fan.a();

                  try {
                     $$3.a(fcz.this.E.a, $$1.b());
                  } catch (fca var6) {
                     fcz.a.error("Couldn't uninvite user", var6);
                  }

                  fcz.this.E.h.remove($$0);
                  fcz.this.E();
               }

               fcz.this.G = true;
               fcz.this.m.a(fcz.this);
            }, fcz.c, xo.a("mco.configure.world.uninvite.player", $$1.a()));
            fcz.this.m.a($$2);
         }
      }

      private void a(faw $$0) {
         for (fba $$1 : fcz.this.E.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fhd d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fiz> aD_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fkx> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fdu.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(fcz.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends fhj<fcz.a> {
      private static final int m = 36;

      public b() {
         super(ffe.Q(), fcz.this.n, fcz.this.C.d(), fcz.this.C.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fgq $$0, int $$1, int $$2) {
         String $$3 = fcz.this.E.h != null ? Integer.toString(fcz.this.E.h.size()) : "0";
         xo $$4 = xo.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(fcz.this.p, $$4, $$1 + this.b() / 2 - fcz.this.p.a($$4) / 2, $$2, -1, false);
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

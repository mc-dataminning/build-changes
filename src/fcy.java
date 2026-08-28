import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcy extends gve {
   static final Logger a = LogUtils.getLogger();
   private static final xo b = xo.c("mco.configure.world.players.title");
   static final xo c = xo.c("mco.question");
   private static final int B = 8;
   final fkp C = new fkp(this);
   private final fcm D;
   final fbd E;
   @Nullable
   private fcy.b F;
   boolean G;

   public fcy(fcm $$0, fbd $$1) {
      super(b);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   public void aM_() {
      this.C.a(b, this.p);
      this.F = this.C.c(new fcy.b());
      this.D();
      fkt $$0 = this.C.b(fkt.e().a(8));
      $$0.a(fhc.a(xo.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fcr(this.D, this, this.E))).a());
      $$0.a(fhc.a(xn.k, $$0x -> this.d()).a());
      this.C.a($$1 -> {
         fha var10000 = this.c($$1);
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
         this.F.aE_().clear();

         for (faz $$0 : this.E.h) {
            this.F.aE_().add(new fcy.a($$0));
         }
      }
   }

   @Override
   public void d() {
      this.E();
   }

   private void E() {
      if (this.G) {
         this.m.a(this.D.f());
      } else {
         this.m.a(this.D);
      }
   }

   class a extends fhi.a<fcy.a> {
      private static final xo b = xo.c("mco.configure.world.invites.normal.tooltip");
      private static final xo c = xo.c("mco.configure.world.invites.ops.tooltip");
      private static final xo d = xo.c("mco.configure.world.invites.remove.tooltip");
      private static final ale e = new ale("player_list/make_operator");
      private static final ale f = new ale("player_list/remove_operator");
      private static final ale g = new ale("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final faz j;
      private final fhc k;
      private final fhc l;
      private final fhc m;

      public a(final faz $$0) {
         this.j = $$0;
         int $$1 = fcy.this.E.h.indexOf(this.j);
         this.l = fih.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fcy.this.p.a(b))
            .a($$1x -> xn.a(xo.a("mco.invited.player.narration", $$0.a()), (xo)$$1x.get(), xo.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fih.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fcy.this.p.a(c))
            .a($$1x -> xn.a(xo.a("mco.invited.player.narration", $$0.a()), (xo)$$1x.get(), xo.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fih.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fcy.this.p.a(d))
            .a($$1x -> xn.a(xo.a("mco.invited.player.narration", $$0.a()), (xo)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fam $$1 = fam.a();
         UUID $$2 = fcy.this.E.h.get($$0).b();

         try {
            this.a($$1.b(fcy.this.E.a, $$2));
         } catch (fbz var5) {
            fcy.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fam $$1 = fam.a();
         UUID $$2 = fcy.this.E.h.get($$0).b();

         try {
            this.a($$1.c(fcy.this.E.a, $$2));
         } catch (fbz var5) {
            fcy.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fcy.this.E.h.size()) {
            faz $$1 = fcy.this.E.h.get($$0);
            fcn $$2 = new fcn($$2x -> {
               if ($$2x) {
                  fam $$3 = fam.a();

                  try {
                     $$3.a(fcy.this.E.a, $$1.b());
                  } catch (fbz var6) {
                     fcy.a.error("Couldn't uninvite user", var6);
                  }

                  fcy.this.E.h.remove($$0);
                  fcy.this.D();
               }

               fcy.this.G = true;
               fcy.this.m.a(fcy.this);
            }, fcy.c, xo.a("mco.configure.world.uninvite.player", $$1.a()));
            fcy.this.m.a($$2);
         }
      }

      private void a(fav $$0) {
         for (faz $$1 : fcy.this.E.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fhc d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fiy> aE_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fkw> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fdt.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(fcy.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends fhi<fcy.a> {
      private static final int m = 36;

      public b() {
         super(ffd.Q(), fcy.this.n, fcy.this.C.d(), fcy.this.C.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fgp $$0, int $$1, int $$2) {
         String $$3 = fcy.this.E.h != null ? Integer.toString(fcy.this.E.h.size()) : "0";
         xo $$4 = xo.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(fcy.this.p, $$4, $$1 + this.b() / 2 - fcy.this.p.a($$4) / 2, $$2, -1, false);
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

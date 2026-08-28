import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcv extends gvb {
   static final Logger a = LogUtils.getLogger();
   private static final xl b = xl.c("mco.configure.world.players.title");
   static final xl c = xl.c("mco.question");
   private static final int B = 8;
   final fkm C = new fkm(this);
   private final fcj D;
   final fba E;
   @Nullable
   private fcv.b F;
   boolean G;

   public fcv(fcj $$0, fba $$1) {
      super(b);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   public void aN_() {
      this.C.a(b, this.p);
      this.F = this.C.c(new fcv.b());
      this.C();
      fkq $$0 = this.C.b(fkq.e().a(8));
      $$0.a(fgz.a(xl.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fco(this.D, this, this.E))).a());
      $$0.a(fgz.a(xk.k, $$0x -> this.d()).a());
      this.C.a($$1 -> {
         fgx var10000 = this.c($$1);
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
         this.F.aF_().clear();

         for (faw $$0 : this.E.h) {
            this.F.aF_().add(new fcv.a($$0));
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

   class a extends fhf.a<fcv.a> {
      private static final xl b = xl.c("mco.configure.world.invites.normal.tooltip");
      private static final xl c = xl.c("mco.configure.world.invites.ops.tooltip");
      private static final xl d = xl.c("mco.configure.world.invites.remove.tooltip");
      private static final alb e = new alb("player_list/make_operator");
      private static final alb f = new alb("player_list/remove_operator");
      private static final alb g = new alb("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final faw j;
      private final fgz k;
      private final fgz l;
      private final fgz m;

      public a(final faw $$0) {
         this.j = $$0;
         int $$1 = fcv.this.E.h.indexOf(this.j);
         this.l = fie.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fcv.this.p.a(b))
            .a($$1x -> xk.a(xl.a("mco.invited.player.narration", $$0.a()), (xl)$$1x.get(), xl.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fie.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fcv.this.p.a(c))
            .a($$1x -> xk.a(xl.a("mco.invited.player.narration", $$0.a()), (xl)$$1x.get(), xl.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fie.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fcv.this.p.a(d))
            .a($$1x -> xk.a(xl.a("mco.invited.player.narration", $$0.a()), (xl)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         faj $$1 = faj.a();
         UUID $$2 = fcv.this.E.h.get($$0).b();

         try {
            this.a($$1.b(fcv.this.E.a, $$2));
         } catch (fbw var5) {
            fcv.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         faj $$1 = faj.a();
         UUID $$2 = fcv.this.E.h.get($$0).b();

         try {
            this.a($$1.c(fcv.this.E.a, $$2));
         } catch (fbw var5) {
            fcv.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fcv.this.E.h.size()) {
            faw $$1 = fcv.this.E.h.get($$0);
            fck $$2 = new fck($$2x -> {
               if ($$2x) {
                  faj $$3 = faj.a();

                  try {
                     $$3.a(fcv.this.E.a, $$1.b());
                  } catch (fbw var6) {
                     fcv.a.error("Couldn't uninvite user", var6);
                  }

                  fcv.this.E.h.remove($$0);
                  fcv.this.C();
               }

               fcv.this.G = true;
               fcv.this.m.a(fcv.this);
            }, fcv.c, xl.a("mco.configure.world.uninvite.player", $$1.a()));
            fcv.this.m.a($$2);
         }
      }

      private void a(fas $$0) {
         for (faw $$1 : fcv.this.E.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fgz d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fiv> aF_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fkt> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fdq.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(fcv.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends fhf<fcv.a> {
      private static final int m = 36;

      public b() {
         super(ffa.Q(), fcv.this.n, fcv.this.C.d(), fcv.this.C.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fgm $$0, int $$1, int $$2) {
         String $$3 = fcv.this.E.h != null ? Integer.toString(fcv.this.E.h.size()) : "0";
         xl $$4 = xl.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(fcv.this.p, $$4, $$1 + this.b() / 2 - fcv.this.p.a($$4) / 2, $$2, -1, false);
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

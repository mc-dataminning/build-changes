import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgt extends hee {
   static final Logger a = LogUtils.getLogger();
   private static final xh b = xh.c("mco.configure.world.players.title");
   static final xh c = xh.c("mco.question");
   private static final int B = 8;
   final fon C = new fon(this);
   private final fgi D;
   final ffa E;
   @Nullable
   private fgt.b F;
   boolean G;

   public fgt(fgi $$0, ffa $$1) {
      super(b);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   public void aS_() {
      this.C.a(b, this.p);
      this.F = this.C.c(new fgt.b());
      this.D();
      fos $$0 = this.C.b(fos.e().a(8));
      $$0.a(fkz.a(xh.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fgn(this.D, this, this.E))).a());
      $$0.a(fkz.a(xg.k, $$0x -> this.d()).a());
      this.C.a($$1 -> {
         fkx var10000 = this.c($$1);
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
         this.F.aJ_().clear();

         for (few $$0 : this.E.h) {
            this.F.aJ_().add(new fgt.a($$0));
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

   class a extends flf.a<fgt.a> {
      private static final xh b = xh.c("mco.configure.world.invites.normal.tooltip");
      private static final xh c = xh.c("mco.configure.world.invites.ops.tooltip");
      private static final xh d = xh.c("mco.configure.world.invites.remove.tooltip");
      private static final alh e = alh.b("player_list/make_operator");
      private static final alh f = alh.b("player_list/remove_operator");
      private static final alh g = alh.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final few j;
      private final fkz k;
      private final fkz l;
      private final fkz m;

      public a(final few $$0) {
         this.j = $$0;
         int $$1 = fgt.this.E.h.indexOf(this.j);
         this.l = fme.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fgt.this.p.a(b))
            .a($$1x -> xg.a(xh.a("mco.invited.player.narration", $$0.a()), (xh)$$1x.get(), xh.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fme.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fgt.this.p.a(c))
            .a($$1x -> xg.a(xh.a("mco.invited.player.narration", $$0.a()), (xh)$$1x.get(), xh.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fme.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fgt.this.p.a(d))
            .a($$1x -> xg.a(xh.a("mco.invited.player.narration", $$0.a()), (xh)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fej $$1 = fej.a();
         UUID $$2 = fgt.this.E.h.get($$0).b();

         try {
            this.a($$1.b(fgt.this.E.a, $$2));
         } catch (ffu var5) {
            fgt.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fej $$1 = fej.a();
         UUID $$2 = fgt.this.E.h.get($$0).b();

         try {
            this.a($$1.c(fgt.this.E.a, $$2));
         } catch (ffu var5) {
            fgt.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fgt.this.E.h.size()) {
            few $$1 = fgt.this.E.h.get($$0);
            fgj $$2 = new fgj($$2x -> {
               if ($$2x) {
                  fej $$3 = fej.a();

                  try {
                     $$3.a(fgt.this.E.a, $$1.b());
                  } catch (ffu var6) {
                     fgt.a.error("Couldn't uninvite user", var6);
                  }

                  fgt.this.E.h.remove($$0);
                  fgt.this.D();
               }

               fgt.this.G = true;
               fgt.this.m.a(fgt.this);
            }, fgt.c, xh.a("mco.configure.world.uninvite.player", $$1.a()));
            fgt.this.m.a($$2);
         }
      }

      private void a(fes $$0) {
         for (few $$1 : fgt.this.E.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fkz d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fmw> aJ_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fov> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fho.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(fgt.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends flf<fgt.a> {
      private static final int m = 36;

      public b() {
         super(fja.Q(), fgt.this.n, fgt.this.C.d(), fgt.this.C.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fkm $$0, int $$1, int $$2) {
         String $$3 = fgt.this.E.h != null ? Integer.toString(fgt.this.E.h.size()) : "0";
         xh $$4 = xh.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(fgt.this.p, $$4, $$1 + this.b() / 2 - fgt.this.p.a($$4) / 2, $$2, -1, false);
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

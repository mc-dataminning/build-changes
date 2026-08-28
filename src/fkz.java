import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkz extends hne {
   static final Logger a = LogUtils.getLogger();
   private static final wv b = wv.c("mco.configure.world.players.title");
   static final wv c = wv.c("mco.question");
   private static final int C = 8;
   final fub D = new fub(this);
   private final fko E;
   final fjf F;
   @Nullable
   private fkz.b G;
   boolean H;

   public fkz(fko $$0, fjf $$1) {
      super(b);
      this.E = $$0;
      this.F = $$1;
   }

   @Override
   public void aN_() {
      this.D.a(b, this.p);
      this.G = this.D.c(new fkz.b());
      this.E();
      fuf $$0 = this.D.b(fuf.e().a(8));
      $$0.a(fqn.a(wv.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fkt(this.E, this, this.F))).a());
      $$0.a(fqn.a(wu.k, $$0x -> this.aK_()).a());
      this.D.a($$1 -> {
         fql var10000 = this.c($$1);
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
         this.G.aD_().clear();

         for (fjb $$0 : this.F.h) {
            this.G.aD_().add(new fkz.a($$0));
         }
      }
   }

   @Override
   public void aK_() {
      this.F();
   }

   private void F() {
      if (this.H) {
         this.m.a(this.E.g());
      } else {
         this.m.a(this.E);
      }
   }

   class a extends fqt.a<fkz.a> {
      private static final wv b = wv.c("mco.configure.world.invites.normal.tooltip");
      private static final wv c = wv.c("mco.configure.world.invites.ops.tooltip");
      private static final wv d = wv.c("mco.configure.world.invites.remove.tooltip");
      private static final ald e = ald.b("player_list/make_operator");
      private static final ald f = ald.b("player_list/remove_operator");
      private static final ald g = ald.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fjb j;
      private final fqn k;
      private final fqn l;
      private final fqn m;

      public a(final fjb $$0) {
         this.j = $$0;
         int $$1 = fkz.this.F.h.indexOf(this.j);
         this.l = frs.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fkz.this.p.a(b))
            .a($$1x -> wu.a(wv.a("mco.invited.player.narration", $$0.a()), (wv)$$1x.get(), wv.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = frs.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fkz.this.p.a(c))
            .a($$1x -> wu.a(wv.a("mco.invited.player.narration", $$0.a()), (wv)$$1x.get(), wv.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = frs.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fkz.this.p.a(d))
            .a($$1x -> wu.a(wv.a("mco.invited.player.narration", $$0.a()), (wv)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fie $$1 = fie.a();
         UUID $$2 = fkz.this.F.h.get($$0).b();

         try {
            this.a($$1.b(fkz.this.F.a, $$2));
         } catch (fka var5) {
            fkz.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fie $$1 = fie.a();
         UUID $$2 = fkz.this.F.h.get($$0).b();

         try {
            this.a($$1.c(fkz.this.F.a, $$2));
         } catch (fka var5) {
            fkz.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fkz.this.F.h.size()) {
            fjb $$1 = fkz.this.F.h.get($$0);
            fkp $$2 = new fkp($$2x -> {
               if ($$2x) {
                  fie $$3 = fie.a();

                  try {
                     $$3.a(fkz.this.F.a, $$1.b());
                  } catch (fka var6) {
                     fkz.a.error("Couldn't uninvite user", var6);
                  }

                  fkz.this.F.h.remove($$0);
                  fkz.this.E();
               }

               fkz.this.H = true;
               fkz.this.m.a(fkz.this);
            }, fkz.c, wv.a("mco.configure.world.uninvite.player", $$1.a()));
            fkz.this.m.a($$2);
         }
      }

      private void a(fix $$0) {
         for (fjb $$1 : fkz.this.F.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fqn g() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fsk> aD_() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public List<? extends fui> b() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         flt.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fkz.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10);
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

   class b extends fqt<fkz.a> {
      private static final int m = 36;

      public b() {
         super(fnd.Q(), fkz.this.n, fkz.this.D.d(), fkz.this.D.c(), 36, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fpz $$0, int $$1, int $$2) {
         String $$3 = fkz.this.F.h != null ? Integer.toString(fkz.this.F.h.size()) : "0";
         wv $$4 = wv.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.b(fkz.this.p, $$4, $$1 + this.a() / 2 - fkz.this.p.a($$4) / 2, $$2, -1);
      }

      @Override
      public int a() {
         return 300;
      }
   }
}

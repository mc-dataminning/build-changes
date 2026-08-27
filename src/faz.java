import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class faz extends gtb {
   static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("mco.configure.world.players.title");
   static final wu c = wu.c("mco.question");
   private static final int B = 8;
   final fir C = new fir(this);
   private final fan D;
   final eze E;
   @Nullable
   private faz.b F;
   boolean G;

   public faz(fan $$0, eze $$1) {
      super(b);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   public void aM_() {
      this.C.a(b, this.p);
      this.F = this.C.c(new faz.b());
      this.C();
      fiv $$0 = this.C.b(fiv.e().a(8));
      $$0.a(ffe.a(wu.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fas(this.D, this, this.E))).a());
      $$0.a(ffe.a(wt.k, $$0x -> this.d()).a());
      this.C.a($$1 -> {
         ffc var10000 = this.c($$1);
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

         for (eza $$0 : this.E.h) {
            this.F.aE_().add(new faz.a($$0));
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

   class a extends ffk.a<faz.a> {
      private static final wu b = wu.c("mco.configure.world.invites.normal.tooltip");
      private static final wu c = wu.c("mco.configure.world.invites.ops.tooltip");
      private static final wu d = wu.c("mco.configure.world.invites.remove.tooltip");
      private static final akh e = new akh("player_list/make_operator");
      private static final akh f = new akh("player_list/remove_operator");
      private static final akh g = new akh("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final eza j;
      private final ffe k;
      private final ffe l;
      private final ffe m;

      public a(eza $$0) {
         this.j = $$0;
         int $$1 = faz.this.E.h.indexOf(this.j);
         this.l = fgj.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + faz.this.p.a(b))
            .a($$1x -> wt.a(wu.a("mco.invited.player.narration", $$0.a()), (wu)$$1x.get(), wu.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fgj.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + faz.this.p.a(c))
            .a($$1x -> wt.a(wu.a("mco.invited.player.narration", $$0.a()), (wu)$$1x.get(), wu.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fgj.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + faz.this.p.a(d))
            .a($$1x -> wt.a(wu.a("mco.invited.player.narration", $$0.a()), (wu)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         eyn $$1 = eyn.a();
         UUID $$2 = faz.this.E.h.get($$0).b();

         try {
            this.a($$1.b(faz.this.E.a, $$2));
         } catch (faa var5) {
            faz.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         eyn $$1 = eyn.a();
         UUID $$2 = faz.this.E.h.get($$0).b();

         try {
            this.a($$1.c(faz.this.E.a, $$2));
         } catch (faa var5) {
            faz.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < faz.this.E.h.size()) {
            eza $$1 = faz.this.E.h.get($$0);
            fao $$2 = new fao($$2x -> {
               if ($$2x) {
                  eyn $$3 = eyn.a();

                  try {
                     $$3.a(faz.this.E.a, $$1.b());
                  } catch (faa var6) {
                     faz.a.error("Couldn't uninvite user", var6);
                  }

                  faz.this.E.h.remove($$0);
                  faz.this.C();
               }

               faz.this.G = true;
               faz.this.m.a(faz.this);
            }, faz.c, wu.a("mco.configure.world.uninvite.player", $$1.a()));
            faz.this.m.a($$2);
         }
      }

      private void a(eyw $$0) {
         for (eza $$1 : faz.this.E.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private ffe d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fha> aE_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fiy> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fbu.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(faz.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends ffk<faz.a> {
      private static final int m = 36;

      public b() {
         super(fde.Q(), faz.this.n, faz.this.C.d(), faz.this.C.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fer $$0, int $$1, int $$2) {
         String $$3 = faz.this.E.h != null ? Integer.toString(faz.this.E.h.size()) : "0";
         wu $$4 = wu.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(faz.this.p, $$4, $$1 + this.b() / 2 - faz.this.p.a($$4) / 2, $$2, -1, false);
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

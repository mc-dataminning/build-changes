import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjd extends hky {
   static final Logger a = LogUtils.getLogger();
   private static final wo b = wo.c("mco.configure.world.players.title");
   static final wo c = wo.c("mco.question");
   private static final int C = 8;
   final fse D = new fse(this);
   private final fis E;
   final fhj F;
   @Nullable
   private fjd.b G;
   boolean H;

   public fjd(fis $$0, fhj $$1) {
      super(b);
      this.E = $$0;
      this.F = $$1;
   }

   @Override
   public void aR_() {
      this.D.a(b, this.p);
      this.G = this.D.c(new fjd.b());
      this.E();
      fsi $$0 = this.D.b(fsi.e().a(8));
      $$0.a(fop.a(wo.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fix(this.E, this, this.F))).a());
      $$0.a(fop.a(wn.k, $$0x -> this.aO_()).a());
      this.D.a($$1 -> {
         fon var10000 = this.c($$1);
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
         this.G.aH_().clear();

         for (fhf $$0 : this.F.h) {
            this.G.aH_().add(new fjd.a($$0));
         }
      }
   }

   @Override
   public void aO_() {
      this.F();
   }

   private void F() {
      if (this.H) {
         this.m.a(this.E.g());
      } else {
         this.m.a(this.E);
      }
   }

   class a extends fow.a<fjd.a> {
      private static final wo b = wo.c("mco.configure.world.invites.normal.tooltip");
      private static final wo c = wo.c("mco.configure.world.invites.ops.tooltip");
      private static final wo d = wo.c("mco.configure.world.invites.remove.tooltip");
      private static final aku e = aku.b("player_list/make_operator");
      private static final aku f = aku.b("player_list/remove_operator");
      private static final aku g = aku.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fhf j;
      private final fop k;
      private final fop l;
      private final fop m;

      public a(final fhf $$0) {
         this.j = $$0;
         int $$1 = fjd.this.F.h.indexOf(this.j);
         this.l = fpv.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fjd.this.p.a(b))
            .a($$1x -> wn.a(wo.a("mco.invited.player.narration", $$0.a()), (wo)$$1x.get(), wo.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fpv.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fjd.this.p.a(c))
            .a($$1x -> wn.a(wo.a("mco.invited.player.narration", $$0.a()), (wo)$$1x.get(), wo.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fpv.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fjd.this.p.a(d))
            .a($$1x -> wn.a(wo.a("mco.invited.player.narration", $$0.a()), (wo)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fgi $$1 = fgi.a();
         UUID $$2 = fjd.this.F.h.get($$0).b();

         try {
            this.a($$1.b(fjd.this.F.a, $$2));
         } catch (fie var5) {
            fjd.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fgi $$1 = fgi.a();
         UUID $$2 = fjd.this.F.h.get($$0).b();

         try {
            this.a($$1.c(fjd.this.F.a, $$2));
         } catch (fie var5) {
            fjd.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fjd.this.F.h.size()) {
            fhf $$1 = fjd.this.F.h.get($$0);
            fit $$2 = new fit($$2x -> {
               if ($$2x) {
                  fgi $$3 = fgi.a();

                  try {
                     $$3.a(fjd.this.F.a, $$1.b());
                  } catch (fie var6) {
                     fjd.a.error("Couldn't uninvite user", var6);
                  }

                  fjd.this.F.h.remove($$0);
                  fjd.this.E();
               }

               fjd.this.H = true;
               fjd.this.m.a(fjd.this);
            }, fjd.c, wo.a("mco.configure.world.uninvite.player", $$1.a()));
            fjd.this.m.a($$2);
         }
      }

      private void a(fhb $$0) {
         for (fhf $$1 : fjd.this.F.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fop g() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fqn> aH_() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public List<? extends fsl> b() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fjx.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fjd.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10);
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

   class b extends fow<fjd.a> {
      private static final int m = 36;

      public b() {
         super(flh.Q(), fjd.this.n, fjd.this.D.d(), fjd.this.D.c(), 36, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fob $$0, int $$1, int $$2) {
         String $$3 = fjd.this.F.h != null ? Integer.toString(fjd.this.F.h.size()) : "0";
         wo $$4 = wo.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.b(fjd.this.p, $$4, $$1 + this.a() / 2 - fjd.this.p.a($$4) / 2, $$2, -1);
      }

      @Override
      public int a() {
         return 300;
      }
   }
}

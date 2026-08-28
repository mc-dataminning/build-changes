import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fda extends gvg {
   static final Logger a = LogUtils.getLogger();
   private static final xp b = xp.c("mco.configure.world.players.title");
   static final xp c = xp.c("mco.question");
   private static final int B = 8;
   final fkr C = new fkr(this);
   private final fco D;
   final fbf E;
   @Nullable
   private fda.b F;
   boolean G;

   public fda(fco $$0, fbf $$1) {
      super(b);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   public void aM_() {
      this.C.a(b, this.p);
      this.F = this.C.c(new fda.b());
      this.E();
      fkv $$0 = this.C.b(fkv.e().a(8));
      $$0.a(fhe.a(xp.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fct(this.D, this, this.E))).a());
      $$0.a(fhe.a(xo.k, $$0x -> this.d()).a());
      this.C.a($$1 -> {
         fhc var10000 = this.c($$1);
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

         for (fbb $$0 : this.E.h) {
            this.F.aD_().add(new fda.a($$0));
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

   class a extends fhk.a<fda.a> {
      private static final xp b = xp.c("mco.configure.world.invites.normal.tooltip");
      private static final xp c = xp.c("mco.configure.world.invites.ops.tooltip");
      private static final xp d = xp.c("mco.configure.world.invites.remove.tooltip");
      private static final alf e = new alf("player_list/make_operator");
      private static final alf f = new alf("player_list/remove_operator");
      private static final alf g = new alf("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fbb j;
      private final fhe k;
      private final fhe l;
      private final fhe m;

      public a(final fbb $$0) {
         this.j = $$0;
         int $$1 = fda.this.E.h.indexOf(this.j);
         this.l = fij.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fda.this.p.a(b))
            .a($$1x -> xo.a(xp.a("mco.invited.player.narration", $$0.a()), (xp)$$1x.get(), xp.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fij.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fda.this.p.a(c))
            .a($$1x -> xo.a(xp.a("mco.invited.player.narration", $$0.a()), (xp)$$1x.get(), xp.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fij.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fda.this.p.a(d))
            .a($$1x -> xo.a(xp.a("mco.invited.player.narration", $$0.a()), (xp)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fao $$1 = fao.a();
         UUID $$2 = fda.this.E.h.get($$0).b();

         try {
            this.a($$1.b(fda.this.E.a, $$2));
         } catch (fcb var5) {
            fda.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fao $$1 = fao.a();
         UUID $$2 = fda.this.E.h.get($$0).b();

         try {
            this.a($$1.c(fda.this.E.a, $$2));
         } catch (fcb var5) {
            fda.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fda.this.E.h.size()) {
            fbb $$1 = fda.this.E.h.get($$0);
            fcp $$2 = new fcp($$2x -> {
               if ($$2x) {
                  fao $$3 = fao.a();

                  try {
                     $$3.a(fda.this.E.a, $$1.b());
                  } catch (fcb var6) {
                     fda.a.error("Couldn't uninvite user", var6);
                  }

                  fda.this.E.h.remove($$0);
                  fda.this.E();
               }

               fda.this.G = true;
               fda.this.m.a(fda.this);
            }, fda.c, xp.a("mco.configure.world.uninvite.player", $$1.a()));
            fda.this.m.a($$2);
         }
      }

      private void a(fax $$0) {
         for (fbb $$1 : fda.this.E.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fhe d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fja> aD_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fky> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(fgr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fdv.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(fda.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends fhk<fda.a> {
      private static final int m = 36;

      public b() {
         super(fff.Q(), fda.this.n, fda.this.C.d(), fda.this.C.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fgr $$0, int $$1, int $$2) {
         String $$3 = fda.this.E.h != null ? Integer.toString(fda.this.E.h.size()) : "0";
         xp $$4 = xp.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(fda.this.p, $$4, $$1 + this.b() / 2 - fda.this.p.a($$4) / 2, $$2, -1, false);
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

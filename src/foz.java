import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class foz extends hrm {
   static final Logger a = LogUtils.getLogger();
   private static final xa b = xa.c("mco.configure.world.players.title");
   static final xa c = xa.c("mco.question");
   private static final int C = 8;
   final fxz D = new fxz(this);
   private final fon E;
   final fne F;
   @Nullable
   private foz.b G;
   boolean H;

   public foz(fon $$0, fne $$1) {
      super(b);
      this.E = $$0;
      this.F = $$1;
   }

   @Override
   public void aS_() {
      this.D.a(b, this.p);
      this.G = this.D.c(new foz.b());
      this.E();
      fyd $$0 = this.D.b(fyd.e().a(8));
      $$0.a(ful.a(xa.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fot(this.E, this, this.F))).a());
      $$0.a(ful.a(wz.k, $$0x -> this.aP_()).a());
      this.D.a($$1 -> {
         fuj var10000 = this.c($$1);
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

         for (fna $$0 : this.F.h) {
            this.G.aI_().add(new foz.a($$0));
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

   class a extends fur.a<foz.a> {
      private static final xa b = xa.c("mco.configure.world.invites.normal.tooltip");
      private static final xa c = xa.c("mco.configure.world.invites.ops.tooltip");
      private static final xa d = xa.c("mco.configure.world.invites.remove.tooltip");
      private static final ali e = ali.b("player_list/make_operator");
      private static final ali f = ali.b("player_list/remove_operator");
      private static final ali g = ali.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fna j;
      private final ful k;
      private final ful l;
      private final ful m;

      public a(final fna $$0) {
         this.j = $$0;
         int $$1 = foz.this.F.h.indexOf(this.j);
         this.l = fvq.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + foz.this.p.a(b))
            .a($$1x -> wz.a(xa.a("mco.invited.player.narration", $$0.a()), (xa)$$1x.get(), xa.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fvq.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + foz.this.p.a(c))
            .a($$1x -> wz.a(xa.a("mco.invited.player.narration", $$0.a()), (xa)$$1x.get(), xa.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fvq.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + foz.this.p.a(d))
            .a($$1x -> wz.a(xa.a("mco.invited.player.narration", $$0.a()), (xa)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fmd $$1 = fmd.a();
         UUID $$2 = foz.this.F.h.get($$0).b();

         try {
            this.a($$1.b(foz.this.F.a, $$2));
         } catch (fnz var5) {
            foz.a.error("Couldn't op the user", var5);
         }

         this.c();
         this.a(this.m);
      }

      private void b(int $$0) {
         fmd $$1 = fmd.a();
         UUID $$2 = foz.this.F.h.get($$0).b();

         try {
            this.a($$1.c(foz.this.F.a, $$2));
         } catch (fnz var5) {
            foz.a.error("Couldn't deop the user", var5);
         }

         this.c();
         this.a(this.l);
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < foz.this.F.h.size()) {
            fna $$1 = foz.this.F.h.get($$0);
            foo $$2 = new foo($$2x -> {
               if ($$2x) {
                  fmd $$3 = fmd.a();

                  try {
                     $$3.a(foz.this.F.a, $$1.b());
                  } catch (fnz var6) {
                     foz.a.error("Couldn't uninvite user", var6);
                  }

                  foz.this.F.h.remove($$0);
                  foz.this.E();
               }

               foz.this.H = true;
               foz.this.m.a(foz.this);
            }, foz.c, xa.a("mco.configure.world.uninvite.player", $$1.a()));
            foz.this.m.a($$2);
         }
      }

      private void a(fmw $$0) {
         for (fna $$1 : foz.this.F.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private ful g() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fwi> aI_() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public List<? extends fyg> b() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fpt.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(foz.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10);
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

   class b extends fur<foz.a> {
      private static final int m = 36;

      public b() {
         super(frd.Q(), foz.this.n, foz.this.D.d(), foz.this.D.c(), 36, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(ftx $$0, int $$1, int $$2) {
         String $$3 = foz.this.F.h != null ? Integer.toString(foz.this.F.h.size()) : "0";
         xa $$4 = xa.a("mco.configure.world.invited.number", $$3).a(o.t);
         $$0.b(foz.this.p, $$4, $$1 + this.a() / 2 - foz.this.p.a($$4) / 2, $$2, -1);
      }

      @Override
      public int a() {
         return 300;
      }
   }
}

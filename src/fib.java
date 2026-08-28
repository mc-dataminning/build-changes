import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fib extends hfq {
   static final Logger a = LogUtils.getLogger();
   private static final xj b = xj.c("mco.configure.world.players.title");
   static final xj c = xj.c("mco.question");
   private static final int B = 8;
   final fps C = new fps(this);
   private final fhq D;
   final fgi E;
   @Nullable
   private fib.b F;
   boolean G;

   public fib(fhq $$0, fgi $$1) {
      super(b);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   public void aR_() {
      this.C.a(b, this.p);
      this.F = this.C.c(new fib.b());
      this.F();
      fpw $$0 = this.C.b(fpw.e().a(8));
      $$0.a(fmd.a(xj.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fhv(this.D, this, this.E))).a());
      $$0.a(fmd.a(xi.k, $$0x -> this.aO_()).a());
      this.C.a($$1 -> {
         fmb var10000 = this.c($$1);
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

   void F() {
      if (this.F != null) {
         this.F.aH_().clear();

         for (fge $$0 : this.E.h) {
            this.F.aH_().add(new fib.a($$0));
         }
      }
   }

   @Override
   public void aO_() {
      this.G();
   }

   private void G() {
      if (this.G) {
         this.m.a(this.D.g());
      } else {
         this.m.a(this.D);
      }
   }

   class a extends fmj.a<fib.a> {
      private static final xj b = xj.c("mco.configure.world.invites.normal.tooltip");
      private static final xj c = xj.c("mco.configure.world.invites.ops.tooltip");
      private static final xj d = xj.c("mco.configure.world.invites.remove.tooltip");
      private static final alj e = alj.b("player_list/make_operator");
      private static final alj f = alj.b("player_list/remove_operator");
      private static final alj g = alj.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fge j;
      private final fmd k;
      private final fmd l;
      private final fmd m;

      public a(final fge $$0) {
         this.j = $$0;
         int $$1 = fib.this.E.h.indexOf(this.j);
         this.l = fni.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fib.this.p.a(b))
            .a($$1x -> xi.a(xj.a("mco.invited.player.narration", $$0.a()), (xj)$$1x.get(), xj.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fni.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fib.this.p.a(c))
            .a($$1x -> xi.a(xj.a("mco.invited.player.narration", $$0.a()), (xj)$$1x.get(), xj.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fni.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fib.this.p.a(d))
            .a($$1x -> xi.a(xj.a("mco.invited.player.narration", $$0.a()), (xj)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         ffh $$1 = ffh.a();
         UUID $$2 = fib.this.E.h.get($$0).b();

         try {
            this.a($$1.b(fib.this.E.a, $$2));
         } catch (fhc var5) {
            fib.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         ffh $$1 = ffh.a();
         UUID $$2 = fib.this.E.h.get($$0).b();

         try {
            this.a($$1.c(fib.this.E.a, $$2));
         } catch (fhc var5) {
            fib.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fib.this.E.h.size()) {
            fge $$1 = fib.this.E.h.get($$0);
            fhr $$2 = new fhr($$2x -> {
               if ($$2x) {
                  ffh $$3 = ffh.a();

                  try {
                     $$3.a(fib.this.E.a, $$1.b());
                  } catch (fhc var6) {
                     fib.a.error("Couldn't uninvite user", var6);
                  }

                  fib.this.E.h.remove($$0);
                  fib.this.F();
               }

               fib.this.G = true;
               fib.this.m.a(fib.this);
            }, fib.c, xj.a("mco.configure.world.uninvite.player", $$1.a()));
            fib.this.m.a($$2);
         }
      }

      private void a(fga $$0) {
         for (fge $$1 : fib.this.E.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fmd d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends foa> aH_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fpz> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fiv.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(fib.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends fmj<fib.a> {
      private static final int m = 36;

      public b() {
         super(fke.Q(), fib.this.n, fib.this.C.d(), fib.this.C.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(flq $$0, int $$1, int $$2) {
         String $$3 = fib.this.E.h != null ? Integer.toString(fib.this.E.h.size()) : "0";
         xj $$4 = xj.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(fib.this.p, $$4, $$1 + this.b() / 2 - fib.this.p.a($$4) / 2, $$2, -1, false);
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

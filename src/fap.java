import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fap extends gsq {
   static final Logger a = LogUtils.getLogger();
   private static final ws b = ws.c("mco.configure.world.players.title");
   static final ws c = ws.c("mco.question");
   private static final int B = 8;
   final fih C = new fih(this);
   private final fad D;
   final eyu E;
   @Nullable
   fap.b F;
   boolean G;

   public fap(fad $$0, eyu $$1) {
      super(b);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   public void aM_() {
      this.C.a(b, this.p);
      this.F = this.C.c(new fap.b());

      for (eyq $$0 : this.E.h) {
         this.F.aE_().add(new fap.a($$0));
      }

      fil $$1 = this.C.b(fil.e().a(8));
      $$1.a(feu.a(ws.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fai(this.D, this, this.E))).a());
      $$1.a(feu.a(wr.k, $$0x -> this.d()).a());
      this.C.a($$1x -> {
         fes var10000 = this.c($$1x);
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

   @Override
   public void d() {
      this.C();
   }

   private void C() {
      if (this.G) {
         this.m.a(this.D.f());
      } else {
         this.m.a(this.D);
      }
   }

   class a extends ffa.a<fap.a> {
      private static final ws b = ws.c("mco.configure.world.invites.normal.tooltip");
      private static final ws c = ws.c("mco.configure.world.invites.ops.tooltip");
      private static final ws d = ws.c("mco.configure.world.invites.remove.tooltip");
      private static final akf e = new akf("player_list/make_operator");
      private static final akf f = new akf("player_list/remove_operator");
      private static final akf g = new akf("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final eyq j;
      private final feu k;
      private final feu l;
      private final feu m;

      public a(eyq $$0) {
         this.j = $$0;
         int $$1 = fap.this.E.h.indexOf(this.j);
         this.l = ffz.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fap.this.p.a(b))
            .a($$1x -> wr.a(ws.a("mco.invited.player.narration", $$0.a()), (ws)$$1x.get(), ws.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = ffz.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fap.this.p.a(c))
            .a($$1x -> wr.a(ws.a("mco.invited.player.narration", $$0.a()), (ws)$$1x.get(), ws.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = ffz.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fap.this.p.a(d))
            .a($$1x -> wr.a(ws.a("mco.invited.player.narration", $$0.a()), (ws)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         eyd $$1 = eyd.a();
         UUID $$2 = fap.this.E.h.get($$0).b();

         try {
            this.a($$1.b(fap.this.E.a, $$2));
         } catch (ezq var5) {
            fap.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         eyd $$1 = eyd.a();
         UUID $$2 = fap.this.E.h.get($$0).b();

         try {
            this.a($$1.c(fap.this.E.a, $$2));
         } catch (ezq var5) {
            fap.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fap.this.E.h.size()) {
            eyq $$1 = fap.this.E.h.get($$0);
            fae $$2 = new fae($$2x -> {
               if ($$2x) {
                  eyd $$3 = eyd.a();

                  try {
                     $$3.a(fap.this.E.a, $$1.b());
                  } catch (ezq var6) {
                     fap.a.error("Couldn't uninvite user", var6);
                  }

                  fap.this.E.h.remove($$0);
               }

               fap.this.G = true;
               fap.this.m.a(fap.this);
               if (fap.this.F != null) {
                  fap.this.F.aE_().remove(this);
               }
            }, fap.c, ws.a("mco.configure.world.uninvite.player", $$1.a()));
            fap.this.m.a($$2);
         }
      }

      private void a(eym $$0) {
         for (eyq $$1 : fap.this.E.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private feu d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fgq> aE_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fio> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fbk.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(fap.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends ffa<fap.a> {
      private static final int m = 36;

      public b() {
         super(fcu.Q(), fap.this.n, fap.this.C.d(), fap.this.C.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(feh $$0, int $$1, int $$2) {
         String $$3 = fap.this.E.h != null ? Integer.toString(fap.this.E.h.size()) : "0";
         ws $$4 = ws.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(fap.this.p, $$4, $$1 + this.b() / 2 - fap.this.p.a($$4) / 2, $$2, -1, false);
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

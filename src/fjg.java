import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjg extends hlf {
   static final Logger a = LogUtils.getLogger();
   private static final wp b = wp.c("mco.configure.world.players.title");
   static final wp c = wp.c("mco.question");
   private static final int C = 8;
   final fsi D = new fsi(this);
   private final fiv E;
   final fhm F;
   @Nullable
   private fjg.b G;
   boolean H;

   public fjg(fiv $$0, fhm $$1) {
      super(b);
      this.E = $$0;
      this.F = $$1;
   }

   @Override
   public void aR_() {
      this.D.a(b, this.p);
      this.G = this.D.c(new fjg.b());
      this.E();
      fsm $$0 = this.D.b(fsm.e().a(8));
      $$0.a(fou.a(wp.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fja(this.E, this, this.F))).a());
      $$0.a(fou.a(wo.k, $$0x -> this.aO_()).a());
      this.D.a($$1 -> {
         fos var10000 = this.c($$1);
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

         for (fhi $$0 : this.F.h) {
            this.G.aH_().add(new fjg.a($$0));
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

   class a extends fpa.a<fjg.a> {
      private static final wp b = wp.c("mco.configure.world.invites.normal.tooltip");
      private static final wp c = wp.c("mco.configure.world.invites.ops.tooltip");
      private static final wp d = wp.c("mco.configure.world.invites.remove.tooltip");
      private static final akv e = akv.b("player_list/make_operator");
      private static final akv f = akv.b("player_list/remove_operator");
      private static final akv g = akv.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fhi j;
      private final fou k;
      private final fou l;
      private final fou m;

      public a(final fhi $$0) {
         this.j = $$0;
         int $$1 = fjg.this.F.h.indexOf(this.j);
         this.l = fpz.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fjg.this.p.a(b))
            .a($$1x -> wo.a(wp.a("mco.invited.player.narration", $$0.a()), (wp)$$1x.get(), wp.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fpz.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fjg.this.p.a(c))
            .a($$1x -> wo.a(wp.a("mco.invited.player.narration", $$0.a()), (wp)$$1x.get(), wp.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fpz.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fjg.this.p.a(d))
            .a($$1x -> wo.a(wp.a("mco.invited.player.narration", $$0.a()), (wp)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fgl $$1 = fgl.a();
         UUID $$2 = fjg.this.F.h.get($$0).b();

         try {
            this.a($$1.b(fjg.this.F.a, $$2));
         } catch (fih var5) {
            fjg.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fgl $$1 = fgl.a();
         UUID $$2 = fjg.this.F.h.get($$0).b();

         try {
            this.a($$1.c(fjg.this.F.a, $$2));
         } catch (fih var5) {
            fjg.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fjg.this.F.h.size()) {
            fhi $$1 = fjg.this.F.h.get($$0);
            fiw $$2 = new fiw($$2x -> {
               if ($$2x) {
                  fgl $$3 = fgl.a();

                  try {
                     $$3.a(fjg.this.F.a, $$1.b());
                  } catch (fih var6) {
                     fjg.a.error("Couldn't uninvite user", var6);
                  }

                  fjg.this.F.h.remove($$0);
                  fjg.this.E();
               }

               fjg.this.H = true;
               fjg.this.m.a(fjg.this);
            }, fjg.c, wp.a("mco.configure.world.uninvite.player", $$1.a()));
            fjg.this.m.a($$2);
         }
      }

      private void a(fhe $$0) {
         for (fhi $$1 : fjg.this.F.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fou g() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fqr> aH_() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public List<? extends fsp> b() {
         return ImmutableList.of(this.g(), this.k);
      }

      @Override
      public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fka.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fjg.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10);
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

   class b extends fpa<fjg.a> {
      private static final int m = 36;

      public b() {
         super(flk.Q(), fjg.this.n, fjg.this.D.d(), fjg.this.D.c(), 36, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fof $$0, int $$1, int $$2) {
         String $$3 = fjg.this.F.h != null ? Integer.toString(fjg.this.F.h.size()) : "0";
         wp $$4 = wp.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.b(fjg.this.p, $$4, $$1 + this.a() / 2 - fjg.this.p.a($$4) / 2, $$2, -1);
      }

      @Override
      public int a() {
         return 300;
      }
   }
}

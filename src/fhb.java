import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhb extends hep {
   static final Logger a = LogUtils.getLogger();
   private static final xi b = xi.c("mco.configure.world.players.title");
   static final xi c = xi.c("mco.question");
   private static final int B = 8;
   final fow C = new fow(this);
   private final fgq D;
   final ffi E;
   @Nullable
   private fhb.b F;
   boolean G;

   public fhb(fgq $$0, ffi $$1) {
      super(b);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   public void aR_() {
      this.C.a(b, this.p);
      this.F = this.C.c(new fhb.b());
      this.D();
      fpa $$0 = this.C.b(fpa.e().a(8));
      $$0.a(flh.a(xi.c("mco.configure.world.buttons.invite"), $$0x -> this.m.a(new fgv(this.D, this, this.E))).a());
      $$0.a(flh.a(xh.k, $$0x -> this.d()).a());
      this.C.a($$1 -> {
         flf var10000 = this.c($$1);
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
         this.F.aI_().clear();

         for (ffe $$0 : this.E.h) {
            this.F.aI_().add(new fhb.a($$0));
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

   class a extends fln.a<fhb.a> {
      private static final xi b = xi.c("mco.configure.world.invites.normal.tooltip");
      private static final xi c = xi.c("mco.configure.world.invites.ops.tooltip");
      private static final xi d = xi.c("mco.configure.world.invites.remove.tooltip");
      private static final ali e = ali.b("player_list/make_operator");
      private static final ali f = ali.b("player_list/remove_operator");
      private static final ali g = ali.b("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final ffe j;
      private final flh k;
      private final flh l;
      private final flh m;

      public a(final ffe $$0) {
         this.j = $$0;
         int $$1 = fhb.this.E.h.indexOf(this.j);
         this.l = fmm.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fhb.this.p.a(b))
            .a($$1x -> xh.a(xi.a("mco.invited.player.narration", $$0.a()), (xi)$$1x.get(), xi.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fmm.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fhb.this.p.a(c))
            .a($$1x -> xh.a(xi.a("mco.invited.player.narration", $$0.a()), (xi)$$1x.get(), xi.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fmm.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fhb.this.p.a(d))
            .a($$1x -> xh.a(xi.a("mco.invited.player.narration", $$0.a()), (xi)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         fer $$1 = fer.a();
         UUID $$2 = fhb.this.E.h.get($$0).b();

         try {
            this.a($$1.b(fhb.this.E.a, $$2));
         } catch (fgc var5) {
            fhb.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         fer $$1 = fer.a();
         UUID $$2 = fhb.this.E.h.get($$0).b();

         try {
            this.a($$1.c(fhb.this.E.a, $$2));
         } catch (fgc var5) {
            fhb.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fhb.this.E.h.size()) {
            ffe $$1 = fhb.this.E.h.get($$0);
            fgr $$2 = new fgr($$2x -> {
               if ($$2x) {
                  fer $$3 = fer.a();

                  try {
                     $$3.a(fhb.this.E.a, $$1.b());
                  } catch (fgc var6) {
                     fhb.a.error("Couldn't uninvite user", var6);
                  }

                  fhb.this.E.h.remove($$0);
                  fhb.this.D();
               }

               fhb.this.G = true;
               fhb.this.m.a(fhb.this);
            }, fhb.c, xi.a("mco.configure.world.uninvite.player", $$1.a()));
            fhb.this.m.a($$2);
         }
      }

      private void a(ffa $$0) {
         for (ffe $$1 : fhb.this.E.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private flh d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fne> aI_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fpd> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fhw.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(fhb.this.p, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends fln<fhb.a> {
      private static final int m = 36;

      public b() {
         super(fji.Q(), fhb.this.n, fhb.this.C.d(), fhb.this.C.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fku $$0, int $$1, int $$2) {
         String $$3 = fhb.this.E.h != null ? Integer.toString(fhb.this.E.h.size()) : "0";
         xi $$4 = xi.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(fhb.this.p, $$4, $$1 + this.b() / 2 - fhb.this.p.a($$4) / 2, $$2, -1, false);
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

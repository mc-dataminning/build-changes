import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdi extends gvm {
   static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("mco.configure.world.players.title");
   static final wu c = wu.c("mco.question");
   private static final int A = 8;
   final fkz B = new fkz(this);
   private final fcx C;
   final fbn D;
   @Nullable
   private fdi.b E;
   boolean F;

   public fdi(fcx $$0, fbn $$1) {
      super(b);
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   public void aO_() {
      this.B.a(b, this.o);
      this.E = this.B.c(new fdi.b());
      this.E();
      fld $$0 = this.B.b(fld.e().a(8));
      $$0.a(fhm.a(wu.c("mco.configure.world.buttons.invite"), $$0x -> this.l.a(new fdc(this.C, this, this.D))).a());
      $$0.a(fhm.a(wt.k, $$0x -> this.d()).a());
      this.B.a($$1 -> {
         fhk var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.a();
      if (this.E != null) {
         this.E.a(this.m, this.B);
      }
   }

   void E() {
      if (this.E != null) {
         this.E.aF_().clear();

         for (fbj $$0 : this.D.h) {
            this.E.aF_().add(new fdi.a($$0));
         }
      }
   }

   @Override
   public void d() {
      this.F();
   }

   private void F() {
      if (this.F) {
         this.l.a(this.C.g());
      } else {
         this.l.a(this.C);
      }
   }

   class a extends fhs.a<fdi.a> {
      private static final wu b = wu.c("mco.configure.world.invites.normal.tooltip");
      private static final wu c = wu.c("mco.configure.world.invites.ops.tooltip");
      private static final wu d = wu.c("mco.configure.world.invites.remove.tooltip");
      private static final akk e = new akk("player_list/make_operator");
      private static final akk f = new akk("player_list/remove_operator");
      private static final akk g = new akk("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final fbj j;
      private final fhm k;
      private final fhm l;
      private final fhm m;

      public a(final fbj $$0) {
         this.j = $$0;
         int $$1 = fdi.this.D.h.indexOf(this.j);
         this.l = fir.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + fdi.this.o.a(b))
            .a($$1x -> wt.a(wu.a("mco.invited.player.narration", $$0.a()), (wu)$$1x.get(), wu.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = fir.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + fdi.this.o.a(c))
            .a($$1x -> wt.a(wu.a("mco.invited.player.narration", $$0.a()), (wu)$$1x.get(), wu.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = fir.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + fdi.this.o.a(d))
            .a($$1x -> wt.a(wu.a("mco.invited.player.narration", $$0.a()), (wu)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         faw $$1 = faw.a();
         UUID $$2 = fdi.this.D.h.get($$0).b();

         try {
            this.a($$1.b(fdi.this.D.a, $$2));
         } catch (fcj var5) {
            fdi.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         faw $$1 = faw.a();
         UUID $$2 = fdi.this.D.h.get($$0).b();

         try {
            this.a($$1.c(fdi.this.D.a, $$2));
         } catch (fcj var5) {
            fdi.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fdi.this.D.h.size()) {
            fbj $$1 = fdi.this.D.h.get($$0);
            fcy $$2 = new fcy($$2x -> {
               if ($$2x) {
                  faw $$3 = faw.a();

                  try {
                     $$3.a(fdi.this.D.a, $$1.b());
                  } catch (fcj var6) {
                     fdi.a.error("Couldn't uninvite user", var6);
                  }

                  fdi.this.D.h.remove($$0);
                  fdi.this.E();
               }

               fdi.this.F = true;
               fdi.this.l.a(fdi.this);
            }, fdi.c, wu.a("mco.configure.world.uninvite.player", $$1.a()));
            fdi.this.l.a($$2);
         }
      }

      private void a(fbf $$0) {
         for (fbj $$1 : fdi.this.D.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fhm d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends fji> aF_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends flg> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fed.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(fdi.this.o, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends fhs<fdi.a> {
      private static final int m = 36;

      public b() {
         super(ffn.Q(), fdi.this.m, fdi.this.B.d(), fdi.this.B.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fgz $$0, int $$1, int $$2) {
         String $$3 = fdi.this.D.h != null ? Integer.toString(fdi.this.D.h.size()) : "0";
         wu $$4 = wu.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(fdi.this.o, $$4, $$1 + this.b() / 2 - fdi.this.o.a($$4) / 2, $$2, -1, false);
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

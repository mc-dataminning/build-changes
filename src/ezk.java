import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezk extends grl {
   static final Logger a = LogUtils.getLogger();
   private static final wg b = wg.c("mco.configure.world.players.title");
   static final wg c = wg.c("mco.question");
   private static final int y = 8;
   final fhc z = new fhc(this);
   private final eyy A;
   final exp B;
   @Nullable
   private ezk.b C;
   boolean D;

   public ezk(eyy $$0, exp $$1) {
      super(b);
      this.A = $$0;
      this.B = $$1;
   }

   @Override
   public void aN_() {
      this.z.a(b, this.m);
      this.C = this.z.c(new ezk.b());

      for (exl $$0 : this.B.h) {
         this.C.aF_().add(new ezk.a($$0));
      }

      fhg $$1 = this.z.b(fhg.e().a(8));
      $$1.a(fdp.a(wg.c("mco.configure.world.buttons.invite"), $$0x -> this.j.a(new ezd(this.A, this, this.B))).a());
      $$1.a(fdp.a(wf.k, $$0x -> this.d()).a());
      this.z.a($$1x -> {
         fdn var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.z.a();
      if (this.C != null) {
         this.C.a(this.k, this.z);
      }
   }

   @Override
   public void d() {
      this.C();
   }

   private void C() {
      if (this.D) {
         this.j.a(this.A.f());
      } else {
         this.j.a(this.A);
      }
   }

   class a extends fdv.a<ezk.a> {
      private static final wg b = wg.c("mco.configure.world.invites.normal.tooltip");
      private static final wg c = wg.c("mco.configure.world.invites.ops.tooltip");
      private static final wg d = wg.c("mco.configure.world.invites.remove.tooltip");
      private static final ajt e = new ajt("player_list/make_operator");
      private static final ajt f = new ajt("player_list/remove_operator");
      private static final ajt g = new ajt("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final exl j;
      private final fdp k;
      private final fdp l;
      private final fdp m;

      public a(exl $$0) {
         this.j = $$0;
         int $$1 = ezk.this.B.h.indexOf(this.j);
         this.l = feu.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + ezk.this.m.a(b))
            .a($$1x -> wf.a(wg.a("mco.invited.player.narration", $$0.a()), (wg)$$1x.get(), wg.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = feu.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + ezk.this.m.a(c))
            .a($$1x -> wf.a(wg.a("mco.invited.player.narration", $$0.a()), (wg)$$1x.get(), wg.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = feu.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + ezk.this.m.a(d))
            .a($$1x -> wf.a(wg.a("mco.invited.player.narration", $$0.a()), (wg)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         ewy $$1 = ewy.a();
         UUID $$2 = ezk.this.B.h.get($$0).b();

         try {
            this.a($$1.b(ezk.this.B.a, $$2));
         } catch (eyl var5) {
            ezk.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         ewy $$1 = ewy.a();
         UUID $$2 = ezk.this.B.h.get($$0).b();

         try {
            this.a($$1.c(ezk.this.B.a, $$2));
         } catch (eyl var5) {
            ezk.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < ezk.this.B.h.size()) {
            exl $$1 = ezk.this.B.h.get($$0);
            eyz $$2 = new eyz($$2x -> {
               if ($$2x) {
                  ewy $$3 = ewy.a();

                  try {
                     $$3.a(ezk.this.B.a, $$1.b());
                  } catch (eyl var6) {
                     ezk.a.error("Couldn't uninvite user", var6);
                  }

                  ezk.this.B.h.remove($$0);
               }

               ezk.this.D = true;
               ezk.this.j.a(ezk.this);
            }, ezk.c, wg.a("mco.configure.world.uninvite.player", $$1.a()));
            ezk.this.j.a($$2);
         }
      }

      private void a(exh $$0) {
         for (exl $$1 : ezk.this.B.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fdp d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends ffl> aF_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fhj> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         faf.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(ezk.this.m, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends fdv<ezk.a> {
      private static final int m = 36;

      public b() {
         super(fbp.Q(), ezk.this.k, ezk.this.z.d(), ezk.this.z.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fdc $$0, int $$1, int $$2) {
         String $$3 = ezk.this.B.h != null ? Integer.toString(ezk.this.B.h.size()) : "0";
         wg $$4 = wg.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(ezk.this.m, $$4, $$1 + this.b() / 2 - ezk.this.m.a($$4) / 2, $$2, -1, false);
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

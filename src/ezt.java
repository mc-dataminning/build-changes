import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezt extends gru {
   static final Logger a = LogUtils.getLogger();
   private static final wi b = wi.c("mco.configure.world.players.title");
   static final wi c = wi.c("mco.question");
   private static final int y = 8;
   final fhl z = new fhl(this);
   private final ezh A;
   final exy B;
   @Nullable
   private ezt.b C;
   boolean D;

   public ezt(ezh $$0, exy $$1) {
      super(b);
      this.A = $$0;
      this.B = $$1;
   }

   @Override
   public void aM_() {
      this.z.a(b, this.m);
      this.C = this.z.c(new ezt.b());

      for (exu $$0 : this.B.h) {
         this.C.aE_().add(new ezt.a($$0));
      }

      fhp $$1 = this.z.b(fhp.e().a(8));
      $$1.a(fdy.a(wi.c("mco.configure.world.buttons.invite"), $$0x -> this.j.a(new ezm(this.A, this, this.B))).a());
      $$1.a(fdy.a(wh.k, $$0x -> this.d()).a());
      this.z.a($$1x -> {
         fdw var10000 = this.c($$1x);
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

   class a extends fee.a<ezt.a> {
      private static final wi b = wi.c("mco.configure.world.invites.normal.tooltip");
      private static final wi c = wi.c("mco.configure.world.invites.ops.tooltip");
      private static final wi d = wi.c("mco.configure.world.invites.remove.tooltip");
      private static final ajv e = new ajv("player_list/make_operator");
      private static final ajv f = new ajv("player_list/remove_operator");
      private static final ajv g = new ajv("player_list/remove_player");
      private static final int h = 8;
      private static final int i = 7;
      private final exu j;
      private final fdy k;
      private final fdy l;
      private final fdy m;

      public a(exu $$0) {
         this.j = $$0;
         int $$1 = ezt.this.B.h.indexOf(this.j);
         this.l = ffd.a(b, $$1x -> this.a($$1), false)
            .a(e, 8, 7)
            .a(16 + ezt.this.m.a(b))
            .a($$1x -> wh.a(wi.a("mco.invited.player.narration", $$0.a()), (wi)$$1x.get(), wi.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.m = ffd.a(c, $$1x -> this.b($$1), false)
            .a(f, 8, 7)
            .a(16 + ezt.this.m.a(c))
            .a($$1x -> wh.a(wi.a("mco.invited.player.narration", $$0.a()), (wi)$$1x.get(), wi.a("narration.cycle_button.usage.focused", b)))
            .a();
         this.k = ffd.a(d, $$1x -> this.c($$1), false)
            .a(g, 8, 7)
            .a(16 + ezt.this.m.a(d))
            .a($$1x -> wh.a(wi.a("mco.invited.player.narration", $$0.a()), (wi)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         exh $$1 = exh.a();
         UUID $$2 = ezt.this.B.h.get($$0).b();

         try {
            this.a($$1.b(ezt.this.B.a, $$2));
         } catch (eyu var5) {
            ezt.a.error("Couldn't op the user", var5);
         }

         this.c();
      }

      private void b(int $$0) {
         exh $$1 = exh.a();
         UUID $$2 = ezt.this.B.h.get($$0).b();

         try {
            this.a($$1.c(ezt.this.B.a, $$2));
         } catch (eyu var5) {
            ezt.a.error("Couldn't deop the user", var5);
         }

         this.c();
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < ezt.this.B.h.size()) {
            exu $$1 = ezt.this.B.h.get($$0);
            ezi $$2 = new ezi($$2x -> {
               if ($$2x) {
                  exh $$3 = exh.a();

                  try {
                     $$3.a(ezt.this.B.a, $$1.b());
                  } catch (eyu var6) {
                     ezt.a.error("Couldn't uninvite user", var6);
                  }

                  ezt.this.B.h.remove($$0);
               }

               ezt.this.D = true;
               ezt.this.j.a(ezt.this);
            }, ezt.c, wi.a("mco.configure.world.uninvite.player", $$1.a()));
            ezt.this.j.a($$2);
         }
      }

      private void a(exq $$0) {
         for (exu $$1 : ezt.this.B.h) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.l.k = !this.j.c();
         this.m.k = !this.l.k;
      }

      private fdy d() {
         return this.l.k ? this.l : this.m;
      }

      @Override
      public List<? extends ffu> aE_() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public List<? extends fhs> b() {
         return ImmutableList.of(this.d(), this.k);
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.j.d()) {
            $$10 = -6250336;
         } else if (this.j.e()) {
            $$10 = 8388479;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fao.a($$0, $$3, $$13, 32, this.j.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(ezt.this.m, this.j.a(), $$3 + 8 + 32, $$14, $$10, false);
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

   class b extends fee<ezt.a> {
      private static final int m = 36;

      public b() {
         super(fby.Q(), ezt.this.k, ezt.this.z.d(), ezt.this.z.c(), 36);
         this.a(true, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fdl $$0, int $$1, int $$2) {
         String $$3 = ezt.this.B.h != null ? Integer.toString(ezt.this.B.h.size()) : "0";
         wi $$4 = wi.a("mco.configure.world.invited.number", $$3).a(n.t);
         $$0.a(ezt.this.m, $$4, $$1 + this.b() / 2 - ezt.this.m.a($$4) / 2, $$2, -1, false);
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

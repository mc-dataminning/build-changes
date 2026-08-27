import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class fbb extends fcc {
   private static final agt a = new agt("icon/draft_report");
   private int b;
   private final vb c;
   private final boolean k;
   private vb l;
   private final List<ewh> m = Lists.newArrayList();
   @Nullable
   private ewh n;

   public fbb(@Nullable vb $$0, boolean $$1) {
      super(vb.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.k = $$1;
   }

   @Override
   protected void aP_() {
      this.b = 0;
      this.m.clear();
      vb $$0 = this.k ? vb.c("deathScreen.spectate") : vb.c("deathScreen.respawn");
      this.m.add(this.d(ewh.a($$0, $$0x -> {
         this.f.s.fQ();
         $$0x.i = false;
      }).a(this.g / 2 - 100, this.h / 4 + 72, 200, 20).a()));
      this.n = this.d(
         ewh.a(vb.c("deathScreen.titleScreen"), $$0x -> this.f.aW().a(this.f, this, this::l, true)).a(this.g / 2 - 100, this.h / 4 + 96, 200, 20).a()
      );
      this.m.add(this.n);
      this.c(false);
      this.l = vb.a("deathScreen.score.value", vb.b(Integer.toString(this.f.s.fN())).a(n.o));
   }

   @Override
   public boolean aE_() {
      return false;
   }

   private void l() {
      if (this.k) {
         this.C();
      } else {
         fav $$0 = new fbb.a($$0x -> {
            if ($$0x) {
               this.C();
            } else {
               this.f.s.fQ();
               this.f.a(null);
            }
         }, vb.c("deathScreen.quit.confirm"), va.a, vb.c("deathScreen.titleScreen"), vb.c("deathScreen.respawn"));
         this.f.a($$0);
         $$0.b(20);
      }
   }

   private void C() {
      if (this.f.r != null) {
         this.f.r.V();
      }

      this.f.b(new fbi(vb.c("menu.savingLevel")));
      this.f.a(new fch());
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().b(2.0F, 2.0F, 2.0F);
      $$0.a(this.i, this.e, this.g / 2 / 2, 30, 16777215);
      $$0.c().b();
      if (this.c != null) {
         $$0.a(this.i, this.c, this.g / 2, 85, 16777215);
      }

      $$0.a(this.i, this.l, this.g / 2, 100, 16777215);
      if (this.c != null && $$2 > 85 && $$2 < 85 + 9) {
         vy $$4 = this.a($$1);
         $$0.a(this.i, $$4, $$1, $$2);
      }

      if (this.n != null && this.f.aW().c()) {
         $$0.a(a, this.n.p() + this.n.k() - 17, this.n.r() + 3, 15, 15);
      }
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      $$0.b(0, 0, this.g, this.h, 1615855616, -1602211792);
   }

   @Nullable
   private vy a(int $$0) {
      if (this.c == null) {
         return null;
      } else {
         int $$1 = this.f.h.a(this.c);
         int $$2 = this.g / 2 - $$1 / 2;
         int $$3 = this.g / 2 + $$1 / 2;
         return $$0 >= $$2 && $$0 <= $$3 ? this.f.h.b().a(this.c, $$0 - $$2) : null;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.c != null && $$1 > 85.0 && $$1 < (double)(85 + 9)) {
         vy $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.h() != null && $$3.h().a() == uz.a.a) {
            this.a($$3);
            return false;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public void d() {
      super.d();
      this.b++;
      if (this.b == 20) {
         this.c(true);
      }
   }

   private void c(boolean $$0) {
      for (ewh $$1 : this.m) {
         $$1.i = $$0;
      }
   }

   public static class a extends fav {
      public a(BooleanConsumer $$0, vb $$1, vb $$2, vb $$3, vb $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }
   }
}

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class fcl extends fdm {
   private static final ahh a = new ahh("icon/draft_report");
   private int b;
   private final vg c;
   private final boolean k;
   private vg l;
   private final List<exr> m = Lists.newArrayList();
   @Nullable
   private exr n;

   public fcl(@Nullable vg $$0, boolean $$1) {
      super(vg.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.k = $$1;
   }

   @Override
   protected void aP_() {
      this.b = 0;
      this.m.clear();
      vg $$0 = this.k ? vg.c("deathScreen.spectate") : vg.c("deathScreen.respawn");
      this.m.add(this.d(exr.a($$0, $$0x -> {
         this.f.s.fQ();
         $$0x.j = false;
      }).a(this.g / 2 - 100, this.h / 4 + 72, 200, 20).a()));
      this.n = this.d(
         exr.a(vg.c("deathScreen.titleScreen"), $$0x -> this.f.aY().a(this.f, this, this::o, true)).a(this.g / 2 - 100, this.h / 4 + 96, 200, 20).a()
      );
      this.m.add(this.n);
      this.c(false);
      this.l = vg.a("deathScreen.score.value", vg.b(Integer.toString(this.f.s.fN())).a(n.o));
   }

   @Override
   public boolean aN_() {
      return false;
   }

   private void o() {
      if (this.k) {
         this.E();
      } else {
         fcf $$0 = new fcl.a($$0x -> {
            if ($$0x) {
               this.E();
            } else {
               this.f.s.fQ();
               this.f.a(null);
            }
         }, vg.c("deathScreen.quit.confirm"), vf.a, vg.c("deathScreen.titleScreen"), vg.c("deathScreen.respawn"));
         this.f.a($$0);
         $$0.b(20);
      }
   }

   private void E() {
      if (this.f.r != null) {
         this.f.r.W();
      }

      this.f.b(new fcs(vg.c("menu.savingLevel")));
      this.f.a(new fdr());
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
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
         wd $$4 = this.a($$1);
         $$0.a(this.i, $$4, $$1, $$2);
      }

      if (this.n != null && this.f.aY().c()) {
         $$0.a(a, this.n.B() + this.n.w() - 17, this.n.C() + 3, 15, 15);
      }
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
      $$0.b(0, 0, this.g, this.h, 1615855616, -1602211792);
   }

   @Nullable
   private wd a(int $$0) {
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
         wd $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.h() != null && $$3.h().a() == ve.a.a) {
            this.a($$3);
            return false;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public void e() {
      super.e();
      this.b++;
      if (this.b == 20) {
         this.c(true);
      }
   }

   private void c(boolean $$0) {
      for (exr $$1 : this.m) {
         $$1.j = $$0;
      }
   }

   public static class a extends fcf {
      public a(BooleanConsumer $$0, vg $$1, vg $$2, vg $$3, vg $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }
   }
}

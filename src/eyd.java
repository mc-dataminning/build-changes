import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class eyd extends ezd {
   private static final afw a = new afw("icon/draft_report");
   private int b;
   private final ui c;
   private final boolean k;
   private ui l;
   private final List<etj> m = Lists.newArrayList();
   @Nullable
   private etj n;

   public eyd(@Nullable ui $$0, boolean $$1) {
      super(ui.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.k = $$1;
   }

   @Override
   protected void aM_() {
      this.b = 0;
      this.m.clear();
      ui $$0 = this.k ? ui.c("deathScreen.spectate") : ui.c("deathScreen.respawn");
      this.m.add(this.d(etj.a($$0, $$0x -> {
         this.f.s.fQ();
         $$0x.i = false;
      }).a(this.g / 2 - 100, this.h / 4 + 72, 200, 20).a()));
      this.n = this.d(
         etj.a(ui.c("deathScreen.titleScreen"), $$0x -> this.f.aX().a(this.f, this, this::l, true)).a(this.g / 2 - 100, this.h / 4 + 96, 200, 20).a()
      );
      this.m.add(this.n);
      this.c(false);
      this.l = ui.a("deathScreen.score.value", ui.b(Integer.toString(this.f.s.fN())).a(n.o));
   }

   @Override
   public boolean aB_() {
      return false;
   }

   private void l() {
      if (this.k) {
         this.C();
      } else {
         exx $$0 = new eyd.a($$0x -> {
            if ($$0x) {
               this.C();
            } else {
               this.f.s.fQ();
               this.f.a(null);
            }
         }, ui.c("deathScreen.quit.confirm"), uh.a, ui.c("deathScreen.titleScreen"), ui.c("deathScreen.respawn"));
         this.f.a($$0);
         $$0.b(20);
      }
   }

   private void C() {
      if (this.f.r != null) {
         this.f.r.U();
      }

      this.f.b(new eyk(ui.c("menu.savingLevel")));
      this.f.a(new ezi());
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
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
         vf $$4 = this.a($$1);
         $$0.a(this.i, $$4, $$1, $$2);
      }

      if (this.n != null && this.f.aX().c()) {
         $$0.a(a, this.n.p() + this.n.k() - 17, this.n.r() + 3, 15, 15);
      }
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      $$0.b(0, 0, this.g, this.h, 1615855616, -1602211792);
   }

   @Nullable
   private vf a(int $$0) {
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
         vf $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.h() != null && $$3.h().a() == ug.a.a) {
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
      for (etj $$1 : this.m) {
         $$1.i = $$0;
      }
   }

   public static class a extends exx {
      public a(BooleanConsumer $$0, ui $$1, ui $$2, ui $$3, ui $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }
   }
}

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class exj extends eyk {
   private static final aex a = new aex("icon/draft_report");
   private int b;
   private final tm c;
   private final boolean k;
   private tm l;
   private final List<esq> m = Lists.newArrayList();
   @Nullable
   private esq n;

   public exj(@Nullable tm $$0, boolean $$1) {
      super(tm.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.k = $$1;
   }

   @Override
   protected void aI_() {
      this.b = 0;
      this.m.clear();
      tm $$0 = this.k ? tm.c("deathScreen.spectate") : tm.c("deathScreen.respawn");
      this.m.add(this.d(esq.a($$0, $$0x -> {
         this.f.s.fP();
         $$0x.i = false;
      }).a(this.g / 2 - 100, this.h / 4 + 72, 200, 20).a()));
      this.n = this.d(
         esq.a(tm.c("deathScreen.titleScreen"), $$0x -> this.f.aX().a(this.f, this, this::l, true)).a(this.g / 2 - 100, this.h / 4 + 96, 200, 20).a()
      );
      this.m.add(this.n);
      this.c(false);
      this.l = tm.a("deathScreen.score.value", tm.b(Integer.toString(this.f.s.fM())).a(n.o));
   }

   @Override
   public boolean ay_() {
      return false;
   }

   private void l() {
      if (this.k) {
         this.D();
      } else {
         exd $$0 = new exj.a($$0x -> {
            if ($$0x) {
               this.D();
            } else {
               this.f.s.fP();
               this.f.a(null);
            }
         }, tm.c("deathScreen.quit.confirm"), tl.a, tm.c("deathScreen.titleScreen"), tm.c("deathScreen.respawn"));
         this.f.a($$0);
         $$0.b(20);
      }
   }

   private void D() {
      if (this.f.r != null) {
         this.f.r.U();
      }

      this.f.b(new exq(tm.c("menu.savingLevel")));
      this.f.a(new eyp());
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
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
         ui $$4 = this.a($$1);
         $$0.a(this.i, $$4, $$1, $$2);
      }

      if (this.n != null && this.f.aX().c()) {
         $$0.a(a, this.n.r() + this.n.l() - 17, this.n.t() + 3, 15, 15);
      }
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      $$0.b(0, 0, this.g, this.h, 1615855616, -1602211792);
   }

   @Nullable
   private ui a(int $$0) {
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
         ui $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.h() != null && $$3.h().a() == tk.a.a) {
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
   public void c() {
      super.c();
      this.b++;
      if (this.b == 20) {
         this.c(true);
      }
   }

   private void c(boolean $$0) {
      for (esq $$1 : this.m) {
         $$1.i = $$0;
      }
   }

   public static class a extends exd {
      public a(BooleanConsumer $$0, tm $$1, tm $$2, tm $$3, tm $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }
   }
}

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class fek extends ffl {
   private static final aiy a = new aiy("icon/draft_report");
   private int b;
   private final vq c;
   private final boolean k;
   private vq l;
   private final List<ezo> m = Lists.newArrayList();
   @Nullable
   private ezo n;

   public fek(@Nullable vq $$0, boolean $$1) {
      super(vq.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.k = $$1;
   }

   @Override
   protected void aQ_() {
      this.b = 0;
      this.m.clear();
      vq $$0 = this.k ? vq.c("deathScreen.spectate") : vq.c("deathScreen.respawn");
      this.m.add(this.c(ezo.a($$0, $$0x -> {
         this.f.s.fR();
         $$0x.j = false;
      }).a(this.g / 2 - 100, this.h / 4 + 72, 200, 20).a()));
      this.n = this.c(
         ezo.a(vq.c("deathScreen.titleScreen"), $$0x -> this.f.aZ().a(this.f, this, this::o, true)).a(this.g / 2 - 100, this.h / 4 + 96, 200, 20).a()
      );
      this.m.add(this.n);
      this.c(false);
      this.l = vq.a("deathScreen.score.value", vq.b(Integer.toString(this.f.s.fN())).a(n.o));
   }

   @Override
   public boolean aO_() {
      return false;
   }

   private void o() {
      if (this.k) {
         this.E();
      } else {
         fee $$0 = new fek.a($$0x -> {
            if ($$0x) {
               this.E();
            } else {
               this.f.s.fR();
               this.f.a(null);
            }
         }, vq.c("deathScreen.quit.confirm"), vp.a, vq.c("deathScreen.titleScreen"), vq.c("deathScreen.respawn"));
         this.f.a($$0);
         $$0.b(20);
      }
   }

   private void E() {
      if (this.f.r != null) {
         this.f.r.W();
      }

      this.f.b(new fer(vq.c("menu.savingLevel")));
      this.f.a(new ffq());
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
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
         wn $$4 = this.a($$1);
         $$0.a(this.i, $$4, $$1, $$2);
      }

      if (this.n != null && this.f.aZ().c()) {
         $$0.a(a, this.n.B() + this.n.w() - 17, this.n.C() + 3, 15, 15);
      }
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      $$0.b(0, 0, this.g, this.h, 1615855616, -1602211792);
   }

   @Nullable
   private wn a(int $$0) {
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
         wn $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.h() != null && $$3.h().a() == vo.a.a) {
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
      for (ezo $$1 : this.m) {
         $$1.j = $$0;
      }
   }

   public static class a extends fee {
      public a(BooleanConsumer $$0, vq $$1, vq $$2, vq $$3, vq $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }
   }
}

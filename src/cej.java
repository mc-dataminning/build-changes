import java.util.EnumSet;
import javax.annotation.Nullable;

public class cej extends cdd {
   private static final int a = 10;
   private final bwn b;
   private final int c;
   @Nullable
   private jh d;

   public cej(bwn $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(cdd.a.a));
   }

   @Override
   public boolean b() {
      if (this.b.cY()) {
         return false;
      } else if (this.b.dV().U()) {
         return false;
      } else if (this.b.dY().a(this.c) != 0) {
         return false;
      } else {
         ash $$0 = (ash)this.b.dV();
         jh $$1 = this.b.dv();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            fbx $$2 = chd.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(kj.a($$1x))));
            this.d = $$2 == null ? null : jh.a((ka)$$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean c() {
      return this.d != null && !this.b.L().m() && this.b.L().i().equals(this.d);
   }

   @Override
   public void a() {
      if (this.d != null) {
         cfr $$0 = this.b.L();
         if ($$0.m() && !this.d.a(this.b.dt(), 10.0)) {
            fbx $$1 = fbx.c(this.d);
            fbx $$2 = this.b.dt();
            fbx $$3 = $$2.d($$1);
            $$1 = $$3.c(0.4).e($$1);
            fbx $$4 = $$1.d($$2).d().c(10.0).e($$2);
            jh $$5 = jh.a((ka)$$4);
            $$5 = this.b.dV().a(edp.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      bam $$0 = this.b.dY();
      jh $$1 = this.b.dV().a(edp.a.f, this.b.dv().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.L().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}

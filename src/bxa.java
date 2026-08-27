import java.util.EnumSet;
import javax.annotation.Nullable;

public class bxa extends bvu {
   private static final int a = 10;
   private final bpf b;
   private final int c;
   @Nullable
   private ib d;

   public bxa(bpf $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(bvu.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.cL()) {
         return false;
      } else if (this.b.dJ().P()) {
         return false;
      } else if (this.b.ef().a(this.c) != 0) {
         return false;
      } else {
         apa $$0 = (apa)this.b.dJ();
         ib $$1 = this.b.dj();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            eov $$2 = bzu.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(jd.a($$1x))));
            this.d = $$2 == null ? null : ib.a($$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean b() {
      return this.d != null && !this.b.N().l() && this.b.N().h().equals(this.d);
   }

   @Override
   public void e() {
      if (this.d != null) {
         byi $$0 = this.b.N();
         if ($$0.l() && !this.d.a(this.b.dh(), 10.0)) {
            eov $$1 = eov.c(this.d);
            eov $$2 = this.b.dh();
            eov $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            eov $$4 = $$1.d($$2).d().a(10.0).e($$2);
            ib $$5 = ib.a($$4);
            $$5 = this.b.dJ().a(drq.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      awt $$0 = this.b.ef();
      ib $$1 = this.b.dJ().a(drq.a.f, this.b.dj().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}

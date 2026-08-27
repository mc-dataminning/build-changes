import java.util.List;
import javax.annotation.Nullable;

public class bwg extends bwl {
   private int a;
   private final bpw b;
   @Nullable
   private cis c;
   private bvu d;

   public bwg(bpw $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<ckp> $$0 = this.b.dM().a(ckp.class, this.b.cH().g(5.0));
      boolean $$1 = false;

      for (ckp $$2 : $$0) {
         bow $$3 = $$2.cN();
         if ($$3 instanceof cis && (aww.e(((cis)$$3).bn) > 0.0F || aww.e(((cis)$$3).bp) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (aww.e(this.c.bn) > 0.0F || aww.e(this.c.bp) > 0.0F) || $$1;
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bO() && (aww.e(this.c.bn) > 0.0F || aww.e(this.c.bp) > 0.0F);
   }

   @Override
   public void c() {
      for (ckp $$1 : this.b.dM().a(ckp.class, this.b.cH().g(5.0))) {
         if ($$1.cN() instanceof cis $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bvu.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = aww.e(this.c.bn) > 0.0F || aww.e(this.c.bp) > 0.0F;
      float $$1 = this.d == bvu.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new epr((double)this.b.bn, (double)this.b.bo, (double)this.b.bp));
      this.b.a(bpt.a, this.b.dp());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bvu.a) {
            ib $$2 = this.c.dm().a(this.c.cE().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.K().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = bvu.b;
            }
         } else if (this.d == bvu.b) {
            ih $$3 = this.c.cF();
            ib $$4 = this.c.dm().a($$3, 10);
            this.b.K().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = bvu.a;
            }
         }
      }
   }
}

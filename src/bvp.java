import java.util.List;
import javax.annotation.Nullable;

public class bvp extends bvu {
   private int a;
   private final bpf b;
   @Nullable
   private cia c;
   private bvd d;

   public bvp(bpf $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cjv> $$0 = this.b.dJ().a(cjv.class, this.b.cE().g(5.0));
      boolean $$1 = false;

      for (cjv $$2 : $$0) {
         bof $$3 = $$2.cK();
         if ($$3 instanceof cia && (awm.e(((cia)$$3).bl) > 0.0F || awm.e(((cia)$$3).bn) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (awm.e(this.c.bl) > 0.0F || awm.e(this.c.bn) > 0.0F) || $$1;
   }

   @Override
   public boolean S_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bL() && (awm.e(this.c.bl) > 0.0F || awm.e(this.c.bn) > 0.0F);
   }

   @Override
   public void c() {
      for (cjv $$1 : this.b.dJ().a(cjv.class, this.b.cE().g(5.0))) {
         if ($$1.cK() instanceof cia $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bvd.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = awm.e(this.c.bl) > 0.0F || awm.e(this.c.bn) > 0.0F;
      float $$1 = this.d == bvd.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new eov((double)this.b.bl, (double)this.b.bm, (double)this.b.bn));
      this.b.a(bpc.a, this.b.dm());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bvd.a) {
            ib $$2 = this.c.dj().a(this.c.cB().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.N().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.e((bof)this.c) < 4.0F) {
               this.a = 0;
               this.d = bvd.b;
            }
         } else if (this.d == bvd.b) {
            ih $$3 = this.c.cC();
            ib $$4 = this.c.dj().a($$3, 10);
            this.b.N().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.e((bof)this.c) > 12.0F) {
               this.a = 0;
               this.d = bvd.a;
            }
         }
      }
   }
}

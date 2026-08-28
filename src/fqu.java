import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class fqu extends frw {
   private static final int d = 20;
   private final xj s;
   private fmw u = fmw.a;
   protected xj a;
   protected xj b;
   private int v;
   protected final BooleanConsumer c;
   private final List<fmd> w = Lists.newArrayList();

   public fqu(BooleanConsumer $$0, xj $$1, xj $$2) {
      this($$0, $$1, $$2, xi.f, xi.g);
   }

   public fqu(BooleanConsumer $$0, xj $$1, xj $$2, xj $$3, xj $$4) {
      super($$1);
      this.c = $$0;
      this.s = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public xj i() {
      return xi.a(super.i(), this.s);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.u = fmw.a(this.p, this.s, this.n - 50);
      int $$0 = azm.a(this.F() + this.G() + 20, this.o / 6 + 96, this.o - 24);
      this.w.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(fmd.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 155, $$0, 150, 20).a());
      this.a(fmd.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(fmd $$0) {
      this.w.add(this.c($$0));
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.m(), 16777215);
      this.u.a($$0, this.n / 2, this.F());
   }

   private int m() {
      int $$0 = (this.o - this.G()) / 2;
      return azm.a($$0 - 20 - 9, 10, 80);
   }

   private int F() {
      return this.m() + 20;
   }

   private int G() {
      return this.u.a() * 9;
   }

   public void b(int $$0) {
      this.v = $$0;

      for (fmd $$1 : this.w) {
         $$1.j = false;
      }
   }

   @Override
   public void e() {
      super.e();
      if (--this.v == 0) {
         for (fmd $$0 : this.w) {
            $$0.j = true;
         }
      }
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.c.accept(false);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }
}

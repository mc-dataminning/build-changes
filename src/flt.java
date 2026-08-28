import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class flt extends fnb {
   private static final int d = 20;
   private final xo r;
   private fhv s = fhv.a;
   protected xo a;
   protected xo b;
   private int u;
   protected final BooleanConsumer c;
   private final List<fhc> v = Lists.newArrayList();

   public flt(BooleanConsumer $$0, xo $$1, xo $$2) {
      this($$0, $$1, $$2, xn.f, xn.g);
   }

   public flt(BooleanConsumer $$0, xo $$1, xo $$2, xo $$3, xo $$4) {
      super($$1);
      this.c = $$0;
      this.r = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public xo i() {
      return xn.a(super.i(), this.r);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.s = fhv.a(this.p, this.r, this.n - 50);
      int $$0 = ayx.a(this.D() + this.E() + 20, this.o / 6 + 96, this.o - 24);
      this.v.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(fhc.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 155, $$0, 150, 20).a());
      this.a(fhc.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(fhc $$0) {
      this.v.add(this.c($$0));
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.m(), 16777215);
      this.s.a($$0, this.n / 2, this.D());
   }

   private int m() {
      int $$0 = (this.o - this.E()) / 2;
      return ayx.a($$0 - 20 - 9, 10, 80);
   }

   private int D() {
      return this.m() + 20;
   }

   private int E() {
      return this.s.a() * 9;
   }

   public void b(int $$0) {
      this.u = $$0;

      for (fhc $$1 : this.v) {
         $$1.j = false;
      }
   }

   @Override
   public void e() {
      super.e();
      if (--this.u == 0) {
         for (fhc $$0 : this.v) {
            $$0.j = true;
         }
      }
   }

   @Override
   public boolean aD_() {
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

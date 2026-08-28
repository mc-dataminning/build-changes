import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class flq extends fmy {
   private static final int d = 20;
   private final xl r;
   private fhs s = fhs.a;
   protected xl a;
   protected xl b;
   private int u;
   protected final BooleanConsumer c;
   private final List<fgz> v = Lists.newArrayList();

   public flq(BooleanConsumer $$0, xl $$1, xl $$2) {
      this($$0, $$1, $$2, xk.f, xk.g);
   }

   public flq(BooleanConsumer $$0, xl $$1, xl $$2, xl $$3, xl $$4) {
      super($$1);
      this.c = $$0;
      this.r = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public xl i() {
      return xk.a(super.i(), this.r);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.s = fhs.a(this.p, this.r, this.n - 50);
      int $$0 = ayu.a(this.C() + this.D() + 20, this.o / 6 + 96, this.o - 24);
      this.v.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(fgz.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 155, $$0, 150, 20).a());
      this.a(fgz.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(fgz $$0) {
      this.v.add(this.c($$0));
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.m(), 16777215);
      this.s.a($$0, this.n / 2, this.C());
   }

   private int m() {
      int $$0 = (this.o - this.D()) / 2;
      return ayu.a($$0 - 20 - 9, 10, 80);
   }

   private int C() {
      return this.m() + 20;
   }

   private int D() {
      return this.s.a() * 9;
   }

   public void b(int $$0) {
      this.u = $$0;

      for (fgz $$1 : this.v) {
         $$1.j = false;
      }
   }

   @Override
   public void e() {
      super.e();
      if (--this.u == 0) {
         for (fgz $$0 : this.v) {
            $$0.j = true;
         }
      }
   }

   @Override
   public boolean aE_() {
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

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class fsp extends ftr {
   private static final int d = 20;
   private final xk s;
   private fos u = fos.a;
   protected xk a;
   protected xk b;
   private int v;
   protected final BooleanConsumer c;
   private final List<fny> w = Lists.newArrayList();

   public fsp(BooleanConsumer $$0, xk $$1, xk $$2) {
      this($$0, $$1, $$2, xj.f, xj.g);
   }

   public fsp(BooleanConsumer $$0, xk $$1, xk $$2, xk $$3, xk $$4) {
      super($$1);
      this.c = $$0;
      this.s = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public xk i() {
      return xj.a(super.i(), this.s);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.u = fos.a(this.p, this.s, this.n - 50);
      int $$0 = azu.a(this.E() + this.F() + 20, this.o / 6 + 96, this.o - 24);
      this.w.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(fny.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 155, $$0, 150, 20).a());
      this.a(fny.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(fny $$0) {
      this.w.add(this.c($$0));
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.l(), 16777215);
      this.u.a($$0, this.n / 2, this.E());
   }

   private int l() {
      int $$0 = (this.o - this.F()) / 2;
      return azu.a($$0 - 20 - 9, 10, 80);
   }

   private int E() {
      return this.l() + 20;
   }

   private int F() {
      return this.u.a() * 9;
   }

   public void b(int $$0) {
      this.v = $$0;

      for (fny $$1 : this.w) {
         $$1.j = false;
      }
   }

   @Override
   public void e() {
      super.e();
      if (--this.v == 0) {
         for (fny $$0 : this.w) {
            $$0.j = true;
         }
      }
   }

   @Override
   public boolean aH_() {
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

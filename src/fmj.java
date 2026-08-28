import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class fmj extends fnl {
   private static final int q = 20;
   private final wu r;
   private fin s = fin.a;
   protected wu a;
   protected wu b;
   private int u;
   protected final BooleanConsumer c;
   private final List<fhu> v = Lists.newArrayList();

   public fmj(BooleanConsumer $$0, wu $$1, wu $$2) {
      this($$0, $$1, $$2, wt.f, wt.g);
   }

   public fmj(BooleanConsumer $$0, wu $$1, wu $$2, wu $$3, wu $$4) {
      super($$1);
      this.c = $$0;
      this.r = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public wu i() {
      return wt.a(super.i(), this.r);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.s = fin.a(this.o, this.r, this.m - 50);
      int $$0 = ayg.a(this.D() + this.E() + 20, this.n / 6 + 96, this.n - 24);
      this.v.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(fhu.a(this.a, $$0x -> this.c.accept(true)).a(this.m / 2 - 155, $$0, 150, 20).a());
      this.a(fhu.a(this.b, $$0x -> this.c.accept(false)).a(this.m / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(fhu $$0) {
      this.v.add(this.c($$0));
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, this.m(), 16777215);
      this.s.a($$0, this.m / 2, this.D());
   }

   private int m() {
      int $$0 = (this.n - this.E()) / 2;
      return ayg.a($$0 - 20 - 9, 10, 80);
   }

   private int D() {
      return this.m() + 20;
   }

   private int E() {
      return this.s.a() * 9;
   }

   public void b(int $$0) {
      this.u = $$0;

      for (fhu $$1 : this.v) {
         $$1.j = false;
      }
   }

   @Override
   public void e() {
      super.e();
      if (--this.u == 0) {
         for (fhu $$0 : this.v) {
            $$0.j = true;
         }
      }
   }

   @Override
   public boolean aF_() {
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

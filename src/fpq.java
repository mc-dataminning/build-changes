import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class fpq extends fqs {
   private static final int d = 20;
   private final xh s;
   private fls u = fls.a;
   protected xh a;
   protected xh b;
   private int v;
   protected final BooleanConsumer c;
   private final List<fkz> w = Lists.newArrayList();

   public fpq(BooleanConsumer $$0, xh $$1, xh $$2) {
      this($$0, $$1, $$2, xg.f, xg.g);
   }

   public fpq(BooleanConsumer $$0, xh $$1, xh $$2, xh $$3, xh $$4) {
      super($$1);
      this.c = $$0;
      this.s = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public xh i() {
      return xg.a(super.i(), this.s);
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.u = fls.a(this.p, this.s, this.n - 50);
      int $$0 = azj.a(this.D() + this.E() + 20, this.o / 6 + 96, this.o - 24);
      this.w.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(fkz.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 155, $$0, 150, 20).a());
      this.a(fkz.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(fkz $$0) {
      this.w.add(this.c($$0));
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.m(), 16777215);
      this.u.a($$0, this.n / 2, this.D());
   }

   private int m() {
      int $$0 = (this.o - this.E()) / 2;
      return azj.a($$0 - 20 - 9, 10, 80);
   }

   private int D() {
      return this.m() + 20;
   }

   private int E() {
      return this.u.a() * 9;
   }

   public void b(int $$0) {
      this.v = $$0;

      for (fkz $$1 : this.w) {
         $$1.j = false;
      }
   }

   @Override
   public void e() {
      super.e();
      if (--this.v == 0) {
         for (fkz $$0 : this.w) {
            $$0.j = true;
         }
      }
   }

   @Override
   public boolean aI_() {
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

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class fkq extends fly {
   private static final int d = 20;
   private final wx r;
   private fgs s = fgs.a;
   protected wx a;
   protected wx b;
   private int u;
   protected final BooleanConsumer c;
   private final List<ffz> v = Lists.newArrayList();

   public fkq(BooleanConsumer $$0, wx $$1, wx $$2) {
      this($$0, $$1, $$2, ww.f, ww.g);
   }

   public fkq(BooleanConsumer $$0, wx $$1, wx $$2, wx $$3, wx $$4) {
      super($$1);
      this.c = $$0;
      this.r = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public wx i() {
      return ww.a(super.i(), this.r);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.s = fgs.a(this.p, this.r, this.n - 50);
      int $$0 = ayd.a(this.C() + this.D() + 20, this.o / 6 + 96, this.o - 24);
      this.v.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(ffz.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 155, $$0, 150, 20).a());
      this.a(ffz.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(ffz $$0) {
      this.v.add(this.c($$0));
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.m(), 16777215);
      this.s.a($$0, this.n / 2, this.C());
   }

   private int m() {
      int $$0 = (this.o - this.D()) / 2;
      return ayd.a($$0 - 20 - 9, 10, 80);
   }

   private int C() {
      return this.m() + 20;
   }

   private int D() {
      return this.s.a() * 9;
   }

   public void b(int $$0) {
      this.u = $$0;

      for (ffz $$1 : this.v) {
         $$1.j = false;
      }
   }

   @Override
   public void e() {
      super.e();
      if (--this.u == 0) {
         for (ffz $$0 : this.v) {
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

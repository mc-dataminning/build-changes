import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class fbu extends fdb {
   private static final int k = 20;
   private final vf l;
   private exz m = exz.a;
   protected vf a;
   protected vf b;
   private int n;
   protected final BooleanConsumer c;
   private final List<exg> o = Lists.newArrayList();

   public fbu(BooleanConsumer $$0, vf $$1, vf $$2) {
      this($$0, $$1, $$2, ve.f, ve.g);
   }

   public fbu(BooleanConsumer $$0, vf $$1, vf $$2, vf $$3, vf $$4) {
      super($$1);
      this.c = $$0;
      this.l = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public vf h() {
      return ve.a(super.h(), this.l);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.m = exz.a(this.i, this.l, this.g - 50);
      int $$0 = auo.a(this.D() + this.E() + 20, this.h / 6 + 96, this.h - 24);
      this.o.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(exg.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 155, $$0, 150, 20).a());
      this.a(exg.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(exg $$0) {
      this.o.add(this.d($$0));
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.n(), 16777215);
      this.m.a($$0, this.g / 2, this.D());
   }

   private int n() {
      int $$0 = (this.h - this.E()) / 2;
      return auo.a($$0 - 20 - 9, 10, 80);
   }

   private int D() {
      return this.n() + 20;
   }

   private int E() {
      return this.m.a() * 9;
   }

   public void b(int $$0) {
      this.n = $$0;

      for (exg $$1 : this.o) {
         $$1.j = false;
      }
   }

   @Override
   public void d() {
      super.d();
      if (--this.n == 0) {
         for (exg $$0 : this.o) {
            $$0.j = true;
         }
      }
   }

   @Override
   public boolean aL_() {
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

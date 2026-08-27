import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class fbs extends fcz {
   private static final int k = 20;
   private final vf l;
   private exx m = exx.a;
   protected vf a;
   protected vf b;
   private int n;
   protected final BooleanConsumer c;
   private final List<exe> o = Lists.newArrayList();

   public fbs(BooleanConsumer $$0, vf $$1, vf $$2) {
      this($$0, $$1, $$2, ve.f, ve.g);
   }

   public fbs(BooleanConsumer $$0, vf $$1, vf $$2, vf $$3, vf $$4) {
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
      this.m = exx.a(this.i, this.l, this.g - 50);
      int $$0 = aun.a(this.C() + this.D() + 20, this.h / 6 + 96, this.h - 24);
      this.o.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(exe.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 155, $$0, 150, 20).a());
      this.a(exe.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(exe $$0) {
      this.o.add(this.d($$0));
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.n(), 16777215);
      this.m.a($$0, this.g / 2, this.C());
   }

   private int n() {
      int $$0 = (this.h - this.D()) / 2;
      return aun.a($$0 - 20 - 9, 10, 80);
   }

   private int C() {
      return this.n() + 20;
   }

   private int D() {
      return this.m.a() * 9;
   }

   public void b(int $$0) {
      this.n = $$0;

      for (exe $$1 : this.o) {
         $$1.j = false;
      }
   }

   @Override
   public void d() {
      super.d();
      if (--this.n == 0) {
         for (exe $$0 : this.o) {
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

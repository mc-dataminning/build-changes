import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class fcf extends fdm {
   private static final int k = 20;
   private final vg l;
   private eyk m = eyk.a;
   protected vg a;
   protected vg b;
   private int n;
   protected final BooleanConsumer c;
   private final List<exr> o = Lists.newArrayList();

   public fcf(BooleanConsumer $$0, vg $$1, vg $$2) {
      this($$0, $$1, $$2, vf.f, vf.g);
   }

   public fcf(BooleanConsumer $$0, vg $$1, vg $$2, vg $$3, vg $$4) {
      super($$1);
      this.c = $$0;
      this.l = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public vg i() {
      return vf.a(super.i(), this.l);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.m = eyk.a(this.i, this.l, this.g - 50);
      int $$0 = aup.a(this.E() + this.H() + 20, this.h / 6 + 96, this.h - 24);
      this.o.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(exr.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 155, $$0, 150, 20).a());
      this.a(exr.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(exr $$0) {
      this.o.add(this.d($$0));
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.o(), 16777215);
      this.m.a($$0, this.g / 2, this.E());
   }

   private int o() {
      int $$0 = (this.h - this.H()) / 2;
      return aup.a($$0 - 20 - 9, 10, 80);
   }

   private int E() {
      return this.o() + 20;
   }

   private int H() {
      return this.m.a() * 9;
   }

   public void b(int $$0) {
      this.n = $$0;

      for (exr $$1 : this.o) {
         $$1.j = false;
      }
   }

   @Override
   public void e() {
      super.e();
      if (--this.n == 0) {
         for (exr $$0 : this.o) {
            $$0.j = true;
         }
      }
   }

   @Override
   public boolean aN_() {
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

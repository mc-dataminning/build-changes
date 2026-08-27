import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class ffx extends fhf {
   private static final int k = 20;
   private final vu l;
   private fbz m = fbz.a;
   protected vu a;
   protected vu b;
   private int n;
   protected final BooleanConsumer c;
   private final List<fbg> o = Lists.newArrayList();

   public ffx(BooleanConsumer $$0, vu $$1, vu $$2) {
      this($$0, $$1, $$2, vt.f, vt.g);
   }

   public ffx(BooleanConsumer $$0, vu $$1, vu $$2, vu $$3, vu $$4) {
      super($$1);
      this.c = $$0;
      this.l = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public vu i() {
      return vt.a(super.i(), this.l);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.m = fbz.a(this.i, this.l, this.g - 50);
      int $$0 = aww.a(this.E() + this.H() + 20, this.h / 6 + 96, this.h - 24);
      this.o.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(fbg.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 155, $$0, 150, 20).a());
      this.a(fbg.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(fbg $$0) {
      this.o.add(this.c($$0));
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.o(), 16777215);
      this.m.a($$0, this.g / 2, this.E());
   }

   private int o() {
      int $$0 = (this.h - this.H()) / 2;
      return aww.a($$0 - 20 - 9, 10, 80);
   }

   private int E() {
      return this.o() + 20;
   }

   private int H() {
      return this.m.a() * 9;
   }

   public void b(int $$0) {
      this.n = $$0;

      for (fbg $$1 : this.o) {
         $$1.j = false;
      }
   }

   @Override
   public void e() {
      super.e();
      if (--this.n == 0) {
         for (fbg $$0 : this.o) {
            $$0.j = true;
         }
      }
   }

   @Override
   public boolean aM_() {
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

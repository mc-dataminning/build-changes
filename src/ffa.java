import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class ffa extends fgh {
   private static final int k = 20;
   private final vs l;
   private fbd m = fbd.a;
   protected vs a;
   protected vs b;
   private int n;
   protected final BooleanConsumer c;
   private final List<fak> o = Lists.newArrayList();

   public ffa(BooleanConsumer $$0, vs $$1, vs $$2) {
      this($$0, $$1, $$2, vr.f, vr.g);
   }

   public ffa(BooleanConsumer $$0, vs $$1, vs $$2, vs $$3, vs $$4) {
      super($$1);
      this.c = $$0;
      this.l = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public vs i() {
      return vr.a(super.i(), this.l);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.m = fbd.a(this.i, this.l, this.g - 50);
      int $$0 = awm.a(this.E() + this.H() + 20, this.h / 6 + 96, this.h - 24);
      this.o.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(fak.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 155, $$0, 150, 20).a());
      this.a(fak.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(fak $$0) {
      this.o.add(this.c($$0));
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.o(), 16777215);
      this.m.a($$0, this.g / 2, this.E());
   }

   private int o() {
      int $$0 = (this.h - this.H()) / 2;
      return awm.a($$0 - 20 - 9, 10, 80);
   }

   private int E() {
      return this.o() + 20;
   }

   private int H() {
      return this.m.a() * 9;
   }

   public void b(int $$0) {
      this.n = $$0;

      for (fak $$1 : this.o) {
         $$1.j = false;
      }
   }

   @Override
   public void e() {
      super.e();
      if (--this.n == 0) {
         for (fak $$0 : this.o) {
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

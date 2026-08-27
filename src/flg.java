import com.google.common.collect.ImmutableList;

public class flg<T extends blu> extends fit<T> {
   protected final fmw a;
   protected final fmw b;
   protected final fmw f;
   protected final fmw g;
   protected final fmw h;
   protected final fmw i;

   protected flg(fmw $$0, boolean $$1, float $$2, float $$3, float $$4, float $$5, int $$6) {
      super($$1, $$2, $$3, $$4, $$5, (float)$$6);
      this.a = $$0.b("head");
      this.b = $$0.b("body");
      this.f = $$0.b("right_hind_leg");
      this.g = $$0.b("left_hind_leg");
      this.h = $$0.b("right_front_leg");
      this.i = $$0.b("left_front_leg");
   }

   public static fne a(int $$0, fna $$1) {
      fne $$2 = new fne();
      fnf $$3 = $$2.a();
      $$3.a("head", fnb.c().a(0, 0).a(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, $$1), fmy.a(0.0F, (float)(18 - $$0), -6.0F));
      $$3.a("body", fnb.c().a(28, 8).a(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, $$1), fmy.a(0.0F, (float)(17 - $$0), 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      fnb $$4 = fnb.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, (float)$$0, 4.0F, $$1);
      $$3.a("right_hind_leg", $$4, fmy.a(-3.0F, (float)(24 - $$0), 7.0F));
      $$3.a("left_hind_leg", $$4, fmy.a(3.0F, (float)(24 - $$0), 7.0F));
      $$3.a("right_front_leg", $$4, fmy.a(-3.0F, (float)(24 - $$0), -5.0F));
      $$3.a("left_front_leg", $$4, fmy.a(3.0F, (float)(24 - $$0), -5.0F));
      return $$2;
   }

   @Override
   protected Iterable<fmw> a() {
      return ImmutableList.of(this.a);
   }

   @Override
   protected Iterable<fmw> b() {
      return ImmutableList.of(this.b, this.f, this.g, this.h, this.i);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a.e = $$5 * (float) (Math.PI / 180.0);
      this.a.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = aun.b($$1 * 0.6662F) * 1.4F * $$2;
      this.g.e = aun.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.h.e = aun.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.i.e = aun.b($$1 * 0.6662F) * 1.4F * $$2;
   }
}

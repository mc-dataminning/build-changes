import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;

public class erj extends err {
   protected final esv a;
   protected iv b;
   private final int d;
   protected final dtl c;
   private final List<esq> h = Lists.newArrayList();
   private final evq i;
   private final euz j;

   public erj(evq $$0, esv $$1, iv $$2, int $$3, dtl $$4, erf $$5, euz $$6) {
      super(ese.ad, 0, $$5);
      this.i = $$0;
      this.a = $$1;
      this.b = $$2;
      this.d = $$3;
      this.c = $$4;
      this.j = $$6;
   }

   public erj(esd $$0, tz $$1) {
      super(ese.ad, $$1);
      this.i = $$0.c();
      this.b = new iv($$1.f("PosX"), $$1.f("PosY"), $$1.f("PosZ"));
      this.d = $$1.f("ground_level_delta");
      DynamicOps<uw> $$2 = $$0.b().a(un.a);
      this.a = $$1.<esv>a("pool_element", esv.f, $$2).orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = $$1.<dtl>a("rotation", dtl.h).orElseThrow();
      this.f = this.a.a(this.i, this.b, this.c);
      uf $$3 = $$1.d("junctions", 10);
      this.h.clear();
      $$3.forEach($$1x -> this.h.add(esq.a(new Dynamic($$2, $$1x))));
      this.j = $$1.<euz>a("liquid_settings", euz.c).orElse(eto.e);
   }

   @Override
   protected void a(esd $$0, tz $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.d);
      DynamicOps<uw> $$2 = $$0.b().a(un.a);
      $$1.a("pool_element", esv.f, $$2, this.a);
      $$1.a("rotation", dtl.h, this.c);
      uf $$3 = new uf();

      for (esq $$4 : this.h) {
         $$3.add((uw)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
      if (this.j != eto.e) {
         $$1.a("liquid_settings", euz.c, $$2, this.j);
      }
   }

   @Override
   public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, iv $$5, boolean $$6) {
      this.a.a(this.i, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.j, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dtl a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public esv b() {
      return this.a;
   }

   public iv c() {
      return this.b;
   }

   public int d() {
      return this.d;
   }

   public void a(esq $$0) {
      this.h.add($$0);
   }

   public List<esq> e() {
      return this.h;
   }
}

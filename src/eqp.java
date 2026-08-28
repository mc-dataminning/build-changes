import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;

public class eqp extends eqx {
   protected final esb a;
   protected iu b;
   private final int d;
   protected final dst c;
   private final List<erw> h = Lists.newArrayList();
   private final euw i;
   private final euf j;

   public eqp(euw $$0, esb $$1, iu $$2, int $$3, dst $$4, eql $$5, euf $$6) {
      super(erk.ad, 0, $$5);
      this.i = $$0;
      this.a = $$1;
      this.b = $$2;
      this.d = $$3;
      this.c = $$4;
      this.j = $$6;
   }

   public eqp(erj $$0, tz $$1) {
      super(erk.ad, $$1);
      this.i = $$0.c();
      this.b = new iu($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.d = $$1.h("ground_level_delta");
      DynamicOps<uw> $$2 = $$0.b().a(un.a);
      this.a = $$1.<esb>a("pool_element", esb.f, $$2).orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = dst.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.i, this.b, this.c);
      uf $$3 = $$1.c("junctions", 10);
      this.h.clear();
      $$3.forEach($$1x -> this.h.add(erw.a(new Dynamic($$2, $$1x))));
      this.j = $$1.<euf>a("liquid_settings", euf.c).orElse(esu.e);
   }

   @Override
   protected void a(erj $$0, tz $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.d);
      DynamicOps<uw> $$2 = $$0.b().a(un.a);
      $$1.a("pool_element", esb.f, $$2, this.a);
      $$1.a("rotation", this.c.name());
      uf $$3 = new uf();

      for (erw $$4 : this.h) {
         $$3.add((uw)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
      if (this.j != esu.e) {
         $$1.a("liquid_settings", euf.c, $$2, this.j);
      }
   }

   @Override
   public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, iu $$5, boolean $$6) {
      this.a.a(this.i, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.j, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dst a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public esb b() {
      return this.a;
   }

   public iu c() {
      return this.b;
   }

   public int d() {
      return this.d;
   }

   public void a(erw $$0) {
      this.h.add($$0);
   }

   public List<erw> e() {
      return this.h;
   }
}

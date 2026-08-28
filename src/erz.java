import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;

public class erz extends esh {
   protected final etl a;
   protected iw b;
   private final int d;
   protected final dty c;
   private final List<etg> h = Lists.newArrayList();
   private final ewg i;
   private final evp j;

   public erz(ewg $$0, etl $$1, iw $$2, int $$3, dty $$4, erv $$5, evp $$6) {
      super(esu.ad, 0, $$5);
      this.i = $$0;
      this.a = $$1;
      this.b = $$2;
      this.d = $$3;
      this.c = $$4;
      this.j = $$6;
   }

   public erz(est $$0, ua $$1) {
      super(esu.ad, $$1);
      this.i = $$0.c();
      this.b = new iw($$1.b("PosX", 0), $$1.b("PosY", 0), $$1.b("PosZ", 0));
      this.d = $$1.b("ground_level_delta", 0);
      DynamicOps<va> $$2 = $$0.b().a(uo.a);
      this.a = $$1.<etl>a("pool_element", etl.f, $$2).orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = $$1.<dty>a("rotation", dty.h).orElseThrow();
      this.f = this.a.a(this.i, this.b, this.c);
      ug $$3 = $$1.p("junctions");
      this.h.clear();
      $$3.forEach($$1x -> this.h.add(etg.a(new Dynamic($$2, $$1x))));
      this.j = $$1.<evp>a("liquid_settings", evp.c).orElse(eue.e);
   }

   @Override
   protected void a(est $$0, ua $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.d);
      DynamicOps<va> $$2 = $$0.b().a(uo.a);
      $$1.a("pool_element", etl.f, $$2, this.a);
      $$1.a("rotation", dty.h, this.c);
      ug $$3 = new ug();

      for (etg $$4 : this.h) {
         $$3.add((va)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
      if (this.j != eue.e) {
         $$1.a("liquid_settings", evp.c, $$2, this.j);
      }
   }

   @Override
   public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, iw $$5, boolean $$6) {
      this.a.a(this.i, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.j, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dty a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public etl b() {
      return this.a;
   }

   public iw c() {
      return this.b;
   }

   public int d() {
      return this.d;
   }

   public void a(etg $$0) {
      this.h.add($$0);
   }

   public List<etg> e() {
      return this.h;
   }
}

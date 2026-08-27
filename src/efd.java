import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class efd extends efl {
   private static final Logger d = LogUtils.getLogger();
   protected final ego a;
   protected ib b;
   private final int h;
   protected final dik c;
   private final List<egj> i = Lists.newArrayList();
   private final eji j;

   public efd(eji $$0, ego $$1, ib $$2, int $$3, dik $$4, eez $$5) {
      super(efy.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
   }

   public efd(efx $$0, tm $$1) {
      super(efy.ad, $$1);
      this.j = $$0.c();
      this.b = new ib($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<uj> $$2 = $$0.b().a(ua.a);
      this.a = (ego)ego.e
         .parse($$2, $$1.p("pool_element"))
         .resultOrPartial(d::error)
         .orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = dik.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      ts $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(egj.a(new Dynamic($$2, $$1x))));
   }

   @Override
   protected void a(efx $$0, tm $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<uj> $$2 = $$0.b().a(ua.a);
      ego.e.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      ts $$3 = new ts();

      for (egj $$4 : this.i) {
         $$3.add((uj)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
   }

   @Override
   public void a(czs $$0, czq $$1, dqw $$2, axr $$3, eez $$4, cye $$5, ib $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(czs $$0, czq $$1, dqw $$2, axr $$3, eez $$4, ib $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dik a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public ego b() {
      return this.a;
   }

   public ib c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(egj $$0) {
      this.i.add($$0);
   }

   public List<egj> e() {
      return this.i;
   }
}

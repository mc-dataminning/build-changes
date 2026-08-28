import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class eog extends eoo {
   private static final Logger d = LogUtils.getLogger();
   protected final eps a;
   protected jh b;
   private final int h;
   protected final drc c;
   private final List<epn> i = Lists.newArrayList();
   private final esn j;
   private final erw k;

   public eog(esn $$0, eps $$1, jh $$2, int $$3, drc $$4, eoc $$5, erw $$6) {
      super(epb.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
      this.k = $$6;
   }

   public eog(epa $$0, ux $$1) {
      super(epb.ad, $$1);
      this.j = $$0.c();
      this.b = new jh($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<vu> $$2 = $$0.b().a(vl.a);
      this.a = (eps)eps.f.parse($$2, $$1.p("pool_element")).getPartialOrThrow($$0x -> new IllegalStateException("Invalid pool element found: " + $$0x));
      this.c = drc.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      vd $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(epn.a(new Dynamic($$2, $$1x))));
      this.k = erw.c.parse(vl.a, $$1.c("liquid_settings")).result().orElse(eql.e);
   }

   @Override
   protected void a(epa $$0, ux $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<vu> $$2 = $$0.b().a(vl.a);
      eps.f.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      vd $$3 = new vd();

      for (epn $$4 : this.i) {
         $$3.add((vu)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
      if (this.k != eql.e) {
         $$1.a("liquid_settings", (vu)erw.c.encodeStart(vl.a, this.k).getOrThrow());
      }
   }

   @Override
   public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, jh $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.k, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public drc a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public eps b() {
      return this.a;
   }

   public jh c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(epn $$0) {
      this.i.add($$0);
   }

   public List<epn> e() {
      return this.i;
   }
}

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class dyv extends dzd {
   private static final Logger d = LogUtils.getLogger();
   protected final eag a;
   protected hx b;
   private final int h;
   protected final dcv c;
   private final List<eab> i = Lists.newArrayList();
   private final eda j;

   public dyv(eda $$0, eag $$1, hx $$2, int $$3, dcv $$4, dyr $$5) {
      super(dzq.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
   }

   public dyv(dzp $$0, sl $$1) {
      super(dzq.ad, $$1);
      this.j = $$0.c();
      this.b = new hx($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<ti> $$2 = ahb.a(sz.a, $$0.b());
      this.a = (eag)eag.e
         .parse($$2, $$1.p("pool_element"))
         .resultOrPartial(d::error)
         .orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = dcv.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      sr $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(eab.a(new Dynamic($$2, $$1x))));
   }

   @Override
   protected void a(dzp $$0, sl $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<ti> $$2 = ahb.a(sz.a, $$0.b());
      eag.e.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      sr $$3 = new sr();

      for (eab $$4 : this.i) {
         $$3.add((ti)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
   }

   @Override
   public void a(cud $$0, cub $$1, dkx $$2, aup $$3, dyr $$4, csp $$5, hx $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(cud $$0, cub $$1, dkx $$2, aup $$3, dyr $$4, hx $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dcv a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public eag b() {
      return this.a;
   }

   public hx c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(eab $$0) {
      this.i.add($$0);
   }

   public List<eab> e() {
      return this.i;
   }
}

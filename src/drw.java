import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class drw extends dse {
   private static final Logger d = LogUtils.getLogger();
   protected final dth a;
   protected gu b;
   private final int h;
   protected final cvz c;
   private final List<dtc> i = Lists.newArrayList();
   private final dvu j;

   public drw(dvu $$0, dth $$1, gu $$2, int $$3, cvz $$4, drs $$5) {
      super(dsr.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
   }

   public drw(dsq $$0, qr $$1) {
      super(dsr.ad, $$1);
      this.j = $$0.c();
      this.b = new gu($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<rk> $$2 = aco.a(rc.a, $$0.b());
      this.a = (dth)dth.e
         .parse($$2, $$1.p("pool_element"))
         .resultOrPartial(d::error)
         .orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = cvz.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      qx $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(dtc.a(new Dynamic($$2, $$1x))));
   }

   @Override
   protected void a(dsq $$0, qr $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<rk> $$2 = aco.a(rc.a, $$0.b());
      dth.e.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      qx $$3 = new qx();

      for (dtc $$4 : this.i) {
         $$3.add((rk)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
   }

   @Override
   public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, gu $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public cvz a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public dth b() {
      return this.a;
   }

   public gu c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(dtc $$0) {
      this.i.add($$0);
   }

   public List<dtc> e() {
      return this.i;
   }
}

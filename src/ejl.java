import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class ejl extends ejt {
   private static final Logger d = LogUtils.getLogger();
   protected final ekx a;
   protected jd b;
   private final int h;
   protected final dmm c;
   private final List<eks> i = Lists.newArrayList();
   private final ens j;
   private final enb k;

   public ejl(ens $$0, ekx $$1, jd $$2, int $$3, dmm $$4, ejh $$5, enb $$6) {
      super(ekg.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
      this.k = $$6;
   }

   public ejl(ekf $$0, ub $$1) {
      super(ekg.ad, $$1);
      this.j = $$0.c();
      this.b = new jd($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<uy> $$2 = $$0.b().a(up.a);
      this.a = (ekx)ekx.f.parse($$2, $$1.p("pool_element")).getPartialOrThrow($$0x -> new IllegalStateException("Invalid pool element found: " + $$0x));
      this.c = dmm.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      uh $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(eks.a(new Dynamic($$2, $$1x))));
      this.k = enb.c.parse(up.a, $$1.c("liquid_settings")).result().orElse(elq.e);
   }

   @Override
   protected void a(ekf $$0, ub $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<uy> $$2 = $$0.b().a(up.a);
      ekx.f.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      uh $$3 = new uh();

      for (eks $$4 : this.i) {
         $$3.add((uy)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
      if (this.k != elq.e) {
         $$1.a("liquid_settings", (uy)enb.c.encodeStart(up.a, this.k).getOrThrow());
      }
   }

   @Override
   public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5, jd $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, jd $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.k, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dmm a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public ekx b() {
      return this.a;
   }

   public jd c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(eks $$0) {
      this.i.add($$0);
   }

   public List<eks> e() {
      return this.i;
   }
}

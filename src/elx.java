import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class elx extends emf {
   private static final Logger d = LogUtils.getLogger();
   protected final enj a;
   protected jh b;
   private final int h;
   protected final dow c;
   private final List<ene> i = Lists.newArrayList();
   private final eqe j;
   private final epn k;

   public elx(eqe $$0, enj $$1, jh $$2, int $$3, dow $$4, elt $$5, epn $$6) {
      super(ems.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
      this.k = $$6;
   }

   public elx(emr $$0, un $$1) {
      super(ems.ad, $$1);
      this.j = $$0.c();
      this.b = new jh($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<vk> $$2 = $$0.b().a(vb.a);
      this.a = (enj)enj.f.parse($$2, $$1.p("pool_element")).getPartialOrThrow($$0x -> new IllegalStateException("Invalid pool element found: " + $$0x));
      this.c = dow.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      ut $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(ene.a(new Dynamic($$2, $$1x))));
      this.k = epn.c.parse(vb.a, $$1.c("liquid_settings")).result().orElse(eoc.e);
   }

   @Override
   protected void a(emr $$0, un $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<vk> $$2 = $$0.b().a(vb.a);
      enj.f.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      ut $$3 = new ut();

      for (ene $$4 : this.i) {
         $$3.add((vk)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
      if (this.k != eoc.e) {
         $$1.a("liquid_settings", (vk)epn.c.encodeStart(vb.a, this.k).getOrThrow());
      }
   }

   @Override
   public void a(dgd $$0, dgb $$1, dxk $$2, azv $$3, elt $$4, del $$5, jh $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dgd $$0, dgb $$1, dxk $$2, azv $$3, elt $$4, jh $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.k, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dow a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public enj b() {
      return this.a;
   }

   public jh c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(ene $$0) {
      this.i.add($$0);
   }

   public List<ene> e() {
      return this.i;
   }
}

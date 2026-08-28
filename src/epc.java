import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class epc extends epk {
   private static final Logger d = LogUtils.getLogger();
   protected final eqo a;
   protected jj b;
   private final int h;
   protected final drm c;
   private final List<eqj> i = Lists.newArrayList();
   private final etj j;
   private final ess k;

   public epc(etj $$0, eqo $$1, jj $$2, int $$3, drm $$4, eoy $$5, ess $$6) {
      super(epx.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
      this.k = $$6;
   }

   public epc(epw $$0, tw $$1) {
      super(epx.ad, $$1);
      this.j = $$0.c();
      this.b = new jj($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<ut> $$2 = $$0.b().a(uk.a);
      this.a = (eqo)eqo.f.parse($$2, $$1.p("pool_element")).getPartialOrThrow($$0x -> new IllegalStateException("Invalid pool element found: " + $$0x));
      this.c = drm.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      uc $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(eqj.a(new Dynamic($$2, $$1x))));
      this.k = ess.c.parse(uk.a, $$1.c("liquid_settings")).result().orElse(erh.e);
   }

   @Override
   protected void a(epw $$0, tw $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<ut> $$2 = $$0.b().a(uk.a);
      eqo.f.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      uc $$3 = new uc();

      for (eqj $$4 : this.i) {
         $$3.add((ut)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
      if (this.k != erh.e) {
         $$1.a("liquid_settings", (ut)ess.c.encodeStart(uk.a, this.k).getOrThrow());
      }
   }

   @Override
   public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, jj $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.k, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public drm a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public eqo b() {
      return this.a;
   }

   public jj c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(eqj $$0) {
      this.i.add($$0);
   }

   public List<eqj> e() {
      return this.i;
   }
}

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class enh extends enp {
   private static final Logger d = LogUtils.getLogger();
   protected final eot a;
   protected ji b;
   private final int h;
   protected final dqd c;
   private final List<eoo> i = Lists.newArrayList();
   private final ero j;
   private final eqx k;

   public enh(ero $$0, eot $$1, ji $$2, int $$3, dqd $$4, end $$5, eqx $$6) {
      super(eoc.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
      this.k = $$6;
   }

   public enh(eob $$0, tq $$1) {
      super(eoc.ad, $$1);
      this.j = $$0.c();
      this.b = new ji($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<un> $$2 = $$0.b().a(ue.a);
      this.a = (eot)eot.f.parse($$2, $$1.p("pool_element")).getPartialOrThrow($$0x -> new IllegalStateException("Invalid pool element found: " + $$0x));
      this.c = dqd.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      tw $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(eoo.a(new Dynamic($$2, $$1x))));
      this.k = eqx.c.parse(ue.a, $$1.c("liquid_settings")).result().orElse(epm.e);
   }

   @Override
   protected void a(eob $$0, tq $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<un> $$2 = $$0.b().a(ue.a);
      eot.f.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      tw $$3 = new tw();

      for (eoo $$4 : this.i) {
         $$3.add((un)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
      if (this.k != epm.e) {
         $$1.a("liquid_settings", (un)eqx.c.encodeStart(ue.a, this.k).getOrThrow());
      }
   }

   @Override
   public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, ji $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.k, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dqd a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public eot b() {
      return this.a;
   }

   public ji c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(eoo $$0) {
      this.i.add($$0);
   }

   public List<eoo> e() {
      return this.i;
   }
}

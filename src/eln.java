import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class eln extends elv {
   private static final Logger d = LogUtils.getLogger();
   protected final emz a;
   protected jg b;
   private final int h;
   protected final dol c;
   private final List<emu> i = Lists.newArrayList();
   private final epu j;
   private final epd k;

   public eln(epu $$0, emz $$1, jg $$2, int $$3, dol $$4, elj $$5, epd $$6) {
      super(emi.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
      this.k = $$6;
   }

   public eln(emh $$0, uj $$1) {
      super(emi.ad, $$1);
      this.j = $$0.c();
      this.b = new jg($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<vg> $$2 = $$0.b().a(ux.a);
      this.a = (emz)emz.f.parse($$2, $$1.p("pool_element")).getPartialOrThrow($$0x -> new IllegalStateException("Invalid pool element found: " + $$0x));
      this.c = dol.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      up $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(emu.a(new Dynamic($$2, $$1x))));
      this.k = epd.c.parse(ux.a, $$1.c("liquid_settings")).result().orElse(ens.e);
   }

   @Override
   protected void a(emh $$0, uj $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<vg> $$2 = $$0.b().a(ux.a);
      emz.f.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      up $$3 = new up();

      for (emu $$4 : this.i) {
         $$3.add((vg)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
      if (this.k != ens.e) {
         $$1.a("liquid_settings", (vg)epd.c.encodeStart(ux.a, this.k).getOrThrow());
      }
   }

   @Override
   public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, jg $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.k, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dol a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public emz b() {
      return this.a;
   }

   public jg c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(emu $$0) {
      this.i.add($$0);
   }

   public List<emu> e() {
      return this.i;
   }
}

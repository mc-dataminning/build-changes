import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class eky extends elg {
   private static final Logger d = LogUtils.getLogger();
   protected final emk a;
   protected je b;
   private final int h;
   protected final dnx c;
   private final List<emf> i = Lists.newArrayList();
   private final epf j;
   private final eoo k;

   public eky(epf $$0, emk $$1, je $$2, int $$3, dnx $$4, eku $$5, eoo $$6) {
      super(elt.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
      this.k = $$6;
   }

   public eky(els $$0, uf $$1) {
      super(elt.ad, $$1);
      this.j = $$0.c();
      this.b = new je($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<vc> $$2 = $$0.b().a(ut.a);
      this.a = (emk)emk.f.parse($$2, $$1.p("pool_element")).getPartialOrThrow($$0x -> new IllegalStateException("Invalid pool element found: " + $$0x));
      this.c = dnx.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      ul $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(emf.a(new Dynamic($$2, $$1x))));
      this.k = eoo.c.parse(ut.a, $$1.c("liquid_settings")).result().orElse(end.e);
   }

   @Override
   protected void a(els $$0, uf $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<vc> $$2 = $$0.b().a(ut.a);
      emk.f.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      ul $$3 = new ul();

      for (emf $$4 : this.i) {
         $$3.add((vc)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
      if (this.k != end.e) {
         $$1.a("liquid_settings", (vc)eoo.c.encodeStart(ut.a, this.k).getOrThrow());
      }
   }

   @Override
   public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, je $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.k, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dnx a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public emk b() {
      return this.a;
   }

   public je c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(emf $$0) {
      this.i.add($$0);
   }

   public List<emf> e() {
      return this.i;
   }
}

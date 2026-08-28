import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class elt extends emb {
   private static final Logger d = LogUtils.getLogger();
   protected final enf a;
   protected jh b;
   private final int h;
   protected final dor c;
   private final List<ena> i = Lists.newArrayList();
   private final eqa j;
   private final epj k;

   public elt(eqa $$0, enf $$1, jh $$2, int $$3, dor $$4, elp $$5, epj $$6) {
      super(emo.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
      this.k = $$6;
   }

   public elt(emn $$0, uk $$1) {
      super(emo.ad, $$1);
      this.j = $$0.c();
      this.b = new jh($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<vh> $$2 = $$0.b().a(uy.a);
      this.a = (enf)enf.f.parse($$2, $$1.p("pool_element")).getPartialOrThrow($$0x -> new IllegalStateException("Invalid pool element found: " + $$0x));
      this.c = dor.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      uq $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(ena.a(new Dynamic($$2, $$1x))));
      this.k = epj.c.parse(uy.a, $$1.c("liquid_settings")).result().orElse(eny.e);
   }

   @Override
   protected void a(emn $$0, uk $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<vh> $$2 = $$0.b().a(uy.a);
      enf.f.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      uq $$3 = new uq();

      for (ena $$4 : this.i) {
         $$3.add((vh)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
      if (this.k != eny.e) {
         $$1.a("liquid_settings", (vh)epj.c.encodeStart(uy.a, this.k).getOrThrow());
      }
   }

   @Override
   public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, jh $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.k, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dor a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public enf b() {
      return this.a;
   }

   public jh c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(ena $$0) {
      this.i.add($$0);
   }

   public List<ena> e() {
      return this.i;
   }
}

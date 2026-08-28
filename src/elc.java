import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class elc extends elk {
   private static final Logger d = LogUtils.getLogger();
   protected final emo a;
   protected jf b;
   private final int h;
   protected final doa c;
   private final List<emj> i = Lists.newArrayList();
   private final epj j;
   private final eos k;

   public elc(epj $$0, emo $$1, jf $$2, int $$3, doa $$4, eky $$5, eos $$6) {
      super(elx.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
      this.k = $$6;
   }

   public elc(elw $$0, ug $$1) {
      super(elx.ad, $$1);
      this.j = $$0.c();
      this.b = new jf($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<vd> $$2 = $$0.b().a(uu.a);
      this.a = (emo)emo.f.parse($$2, $$1.p("pool_element")).getPartialOrThrow($$0x -> new IllegalStateException("Invalid pool element found: " + $$0x));
      this.c = doa.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      um $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(emj.a(new Dynamic($$2, $$1x))));
      this.k = eos.c.parse(uu.a, $$1.c("liquid_settings")).result().orElse(enh.e);
   }

   @Override
   protected void a(elw $$0, ug $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<vd> $$2 = $$0.b().a(uu.a);
      emo.f.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      um $$3 = new um();

      for (emj $$4 : this.i) {
         $$3.add((vd)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
      if (this.k != enh.e) {
         $$1.a("liquid_settings", (vd)eos.c.encodeStart(uu.a, this.k).getOrThrow());
      }
   }

   @Override
   public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, jf $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.k, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public doa a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public emo b() {
      return this.a;
   }

   public jf c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(emj $$0) {
      this.i.add($$0);
   }

   public List<emj> e() {
      return this.i;
   }
}

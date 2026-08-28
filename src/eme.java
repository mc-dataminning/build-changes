import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class eme extends emm {
   private static final Logger d = LogUtils.getLogger();
   protected final enq a;
   protected jh b;
   private final int h;
   protected final dpd c;
   private final List<enl> i = Lists.newArrayList();
   private final eql j;
   private final epu k;

   public eme(eql $$0, enq $$1, jh $$2, int $$3, dpd $$4, ema $$5, epu $$6) {
      super(emz.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
      this.k = $$6;
   }

   public eme(emy $$0, ul $$1) {
      super(emz.ad, $$1);
      this.j = $$0.c();
      this.b = new jh($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<vi> $$2 = $$0.b().a(uz.a);
      this.a = (enq)enq.f.parse($$2, $$1.p("pool_element")).getPartialOrThrow($$0x -> new IllegalStateException("Invalid pool element found: " + $$0x));
      this.c = dpd.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      ur $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(enl.a(new Dynamic($$2, $$1x))));
      this.k = epu.c.parse(uz.a, $$1.c("liquid_settings")).result().orElse(eoj.e);
   }

   @Override
   protected void a(emy $$0, ul $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<vi> $$2 = $$0.b().a(uz.a);
      enq.f.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      ur $$3 = new ur();

      for (enl $$4 : this.i) {
         $$3.add((vi)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
      if (this.k != eoj.e) {
         $$1.a("liquid_settings", (vi)epu.c.encodeStart(uz.a, this.k).getOrThrow());
      }
   }

   @Override
   public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, jh $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.k, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dpd a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public enq b() {
      return this.a;
   }

   public jh c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(enl $$0) {
      this.i.add($$0);
   }

   public List<enl> e() {
      return this.i;
   }
}

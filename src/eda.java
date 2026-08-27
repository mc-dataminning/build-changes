import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class eda extends edi {
   private static final Logger d = LogUtils.getLogger();
   protected final eel a;
   protected ib b;
   private final int h;
   protected final dgo c;
   private final List<eeg> i = Lists.newArrayList();
   private final ehf j;

   public eda(ehf $$0, eel $$1, ib $$2, int $$3, dgo $$4, ecw $$5) {
      super(edv.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
   }

   public eda(edu $$0, ta $$1) {
      super(edv.ad, $$1);
      this.j = $$0.c();
      this.b = new ib($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<tx> $$2 = $$0.b().a(to.a);
      this.a = (eel)eel.e
         .parse($$2, $$1.p("pool_element"))
         .resultOrPartial(d::error)
         .orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = dgo.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      tg $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(eeg.a(new Dynamic($$2, $$1x))));
   }

   @Override
   protected void a(edu $$0, ta $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<tx> $$2 = $$0.b().a(to.a);
      eel.e.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      tg $$3 = new tg();

      for (eeg $$4 : this.i) {
         $$3.add((tx)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
   }

   @Override
   public void a(cxw $$0, cxu $$1, doy $$2, axd $$3, ecw $$4, cwi $$5, ib $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(cxw $$0, cxu $$1, doy $$2, axd $$3, ecw $$4, ib $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dgo a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public eel b() {
      return this.a;
   }

   public ib c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(eeg $$0) {
      this.i.add($$0);
   }

   public List<eeg> e() {
      return this.i;
   }
}

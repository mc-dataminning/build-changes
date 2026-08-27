import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class eba extends ebi {
   private static final Logger d = LogUtils.getLogger();
   protected final ecl a;
   protected hz b;
   private final int h;
   protected final dfa c;
   private final List<ecg> i = Lists.newArrayList();
   private final eff j;

   public eba(eff $$0, ecl $$1, hz $$2, int $$3, dfa $$4, eaw $$5) {
      super(ebv.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
   }

   public eba(ebu $$0, sw $$1) {
      super(ebv.ad, $$1);
      this.j = $$0.c();
      this.b = new hz($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<tt> $$2 = aiw.a(tk.a, $$0.b());
      this.a = (ecl)ecl.e
         .parse($$2, $$1.p("pool_element"))
         .resultOrPartial(d::error)
         .orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = dfa.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      tc $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(ecg.a(new Dynamic($$2, $$1x))));
   }

   @Override
   protected void a(ebu $$0, sw $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<tt> $$2 = aiw.a(tk.a, $$0.b());
      ecl.e.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      tc $$3 = new tc();

      for (ecg $$4 : this.i) {
         $$3.add((tt)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
   }

   @Override
   public void a(cwi $$0, cwg $$1, dnc $$2, awo $$3, eaw $$4, cuu $$5, hz $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(cwi $$0, cwg $$1, dnc $$2, awo $$3, eaw $$4, hz $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dfa a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public ecl b() {
      return this.a;
   }

   public hz c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(ecg $$0) {
      this.i.add($$0);
   }

   public List<ecg> e() {
      return this.i;
   }
}

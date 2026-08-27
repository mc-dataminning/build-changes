import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class ecc extends eck {
   private static final Logger d = LogUtils.getLogger();
   protected final edn a;
   protected ib b;
   private final int h;
   protected final dfr c;
   private final List<edi> i = Lists.newArrayList();
   private final egh j;

   public ecc(egh $$0, edn $$1, ib $$2, int $$3, dfr $$4, eby $$5) {
      super(ecx.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
   }

   public ecc(ecw $$0, sy $$1) {
      super(ecx.ad, $$1);
      this.j = $$0.c();
      this.b = new ib($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<tv> $$2 = aja.a(tm.a, $$0.b());
      this.a = (edn)edn.e
         .parse($$2, $$1.p("pool_element"))
         .resultOrPartial(d::error)
         .orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = dfr.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      te $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(edi.a(new Dynamic($$2, $$1x))));
   }

   @Override
   protected void a(ecw $$0, sy $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<tv> $$2 = aja.a(tm.a, $$0.b());
      edn.e.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      te $$3 = new te();

      for (edi $$4 : this.i) {
         $$3.add((tv)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
   }

   @Override
   public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, ib $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dfr a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public edn b() {
      return this.a;
   }

   public ib c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(edi $$0) {
      this.i.add($$0);
   }

   public List<edi> e() {
      return this.i;
   }
}

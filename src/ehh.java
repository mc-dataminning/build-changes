import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class ehh extends ehp {
   private static final Logger d = LogUtils.getLogger();
   protected final eis a;
   protected io b;
   private final int h;
   protected final dkn c;
   private final List<ein> i = Lists.newArrayList();
   private final elm j;

   public ehh(elm $$0, eis $$1, io $$2, int $$3, dkn $$4, ehd $$5) {
      super(eic.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
   }

   public ehh(eib $$0, ud $$1) {
      super(eic.ad, $$1);
      this.j = $$0.c();
      this.b = new io($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<va> $$2 = $$0.b().a(ur.a);
      this.a = (eis)eis.e
         .parse($$2, $$1.p("pool_element"))
         .resultOrPartial(d::error)
         .orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = dkn.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      uj $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(ein.a(new Dynamic($$2, $$1x))));
   }

   @Override
   protected void a(eib $$0, ud $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<va> $$2 = $$0.b().a(ur.a);
      eis.e.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      uj $$3 = new uj();

      for (ein $$4 : this.i) {
         $$3.add((va)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
   }

   @Override
   public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, io $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dkn a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public eis b() {
      return this.a;
   }

   public io c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(ein $$0) {
      this.i.add($$0);
   }

   public List<ein> e() {
      return this.i;
   }
}

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class dwr extends dwz {
   private static final Logger d = LogUtils.getLogger();
   protected final dyc a;
   protected ht b;
   private final int h;
   protected final dbf c;
   private final List<dxx> i = Lists.newArrayList();
   private final eaw j;

   public dwr(eaw $$0, dyc $$1, ht $$2, int $$3, dbf $$4, dwn $$5) {
      super(dxm.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
   }

   public dwr(dxl $$0, rz $$1) {
      super(dxm.ad, $$1);
      this.j = $$0.c();
      this.b = new ht($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<sw> $$2 = age.a(sn.a, $$0.b());
      this.a = (dyc)dyc.e
         .parse($$2, $$1.p("pool_element"))
         .resultOrPartial(d::error)
         .orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = dbf.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      sf $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(dxx.a(new Dynamic($$2, $$1x))));
   }

   @Override
   protected void a(dxl $$0, rz $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<sw> $$2 = age.a(sn.a, $$0.b());
      dyc.e.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      sf $$3 = new sf();

      for (dxx $$4 : this.i) {
         $$3.add((sw)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
   }

   @Override
   public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, ht $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dbf a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public dyc b() {
      return this.a;
   }

   public ht c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(dxx $$0) {
      this.i.add($$0);
   }

   public List<dxx> e() {
      return this.i;
   }
}

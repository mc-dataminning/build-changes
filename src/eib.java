import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class eib extends eij {
   private static final Logger d = LogUtils.getLogger();
   protected final ejm a;
   protected iz b;
   private final int h;
   protected final dlh c;
   private final List<ejh> i = Lists.newArrayList();
   private final emg j;

   public eib(emg $$0, ejm $$1, iz $$2, int $$3, dlh $$4, ehx $$5) {
      super(eiw.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
   }

   public eib(eiv $$0, ur $$1) {
      super(eiw.ad, $$1);
      this.j = $$0.c();
      this.b = new iz($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<vo> $$2 = $$0.b().a(vf.a);
      this.a = (ejm)ejm.e
         .parse($$2, $$1.p("pool_element"))
         .resultOrPartial(d::error)
         .orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = dlh.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      ux $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(ejh.a(new Dynamic($$2, $$1x))));
   }

   @Override
   protected void a(eiv $$0, ur $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<vo> $$2 = $$0.b().a(vf.a);
      ejm.e.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      ux $$3 = new ux();

      for (ejh $$4 : this.i) {
         $$3.add((vo)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
   }

   @Override
   public void a(dco $$0, dcm $$1, dtu $$2, azc $$3, ehx $$4, dba $$5, iz $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dco $$0, dcm $$1, dtu $$2, azc $$3, ehx $$4, iz $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dlh a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public ejm b() {
      return this.a;
   }

   public iz c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(ejh $$0) {
      this.i.add($$0);
   }

   public List<ejh> e() {
      return this.i;
   }
}

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class dut extends dvb {
   private static final Logger d = LogUtils.getLogger();
   protected final dwe a;
   protected gv b;
   private final int h;
   protected final cyw c;
   private final List<dvz> i = Lists.newArrayList();
   private final dyr j;

   public dut(dyr $$0, dwe $$1, gv $$2, int $$3, cyw $$4, dup $$5) {
      super(dvo.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
   }

   public dut(dvn $$0, qs $$1) {
      super(dvo.ad, $$1);
      this.j = $$0.c();
      this.b = new gv($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<rl> $$2 = aen.a(rd.a, $$0.b());
      this.a = (dwe)dwe.e
         .parse($$2, $$1.p("pool_element"))
         .resultOrPartial(d::error)
         .orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = cyw.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      qy $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(dvz.a(new Dynamic($$2, $$1x))));
   }

   @Override
   protected void a(dvn $$0, qs $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<rl> $$2 = aen.a(rd.a, $$0.b());
      dwe.e.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      qy $$3 = new qy();

      for (dvz $$4 : this.i) {
         $$3.add((rl)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
   }

   @Override
   public void a(cqe $$0, cqc $$1, dgv $$2, art $$3, dup $$4, cor $$5, gv $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(cqe $$0, cqc $$1, dgv $$2, art $$3, dup $$4, gv $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public cyw a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public dwe b() {
      return this.a;
   }

   public gv c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(dvz $$0) {
      this.i.add($$0);
   }

   public List<dvz> e() {
      return this.i;
   }
}

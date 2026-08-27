import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class duy extends dvg {
   private static final Logger d = LogUtils.getLogger();
   protected final dwj a;
   protected gw b;
   private final int h;
   protected final czn c;
   private final List<dwe> i = Lists.newArrayList();
   private final dyw j;

   public duy(dyw $$0, dwj $$1, gw $$2, int $$3, czn $$4, duu $$5) {
      super(dvt.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
   }

   public duy(dvs $$0, qw $$1) {
      super(dvt.ad, $$1);
      this.j = $$0.c();
      this.b = new gw($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<rq> $$2 = aex.a(ri.a, $$0.b());
      this.a = (dwj)dwj.e
         .parse($$2, $$1.p("pool_element"))
         .resultOrPartial(d::error)
         .orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = czn.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      rc $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(dwe.a(new Dynamic($$2, $$1x))));
   }

   @Override
   protected void a(dvs $$0, qw $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<rq> $$2 = aex.a(ri.a, $$0.b());
      dwj.e.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      rc $$3 = new rc();

      for (dwe $$4 : this.i) {
         $$3.add((rq)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
   }

   @Override
   public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, gw $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public czn a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public dwj b() {
      return this.a;
   }

   public gw c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(dwe $$0) {
      this.i.add($$0);
   }

   public List<dwe> e() {
      return this.i;
   }
}

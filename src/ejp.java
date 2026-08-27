import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class ejp extends ejx {
   private static final Logger d = LogUtils.getLogger();
   protected final ela a;
   protected ir b;
   private final int h;
   protected final dmd c;
   private final List<ekv> i = Lists.newArrayList();
   private final enu j;

   public ejp(enu $$0, ela $$1, ir $$2, int $$3, dmd $$4, ejl $$5) {
      super(ekk.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
   }

   public ejp(ekj $$0, uk $$1) {
      super(ekk.ad, $$1);
      this.j = $$0.c();
      this.b = new ir($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<vh> $$2 = $$0.b().a(uy.a);
      this.a = (ela)ela.e
         .parse($$2, $$1.p("pool_element"))
         .resultOrPartial(d::error)
         .orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = dmd.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      uq $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(ekv.a(new Dynamic($$2, $$1x))));
   }

   @Override
   protected void a(ekj $$0, uk $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<vh> $$2 = $$0.b().a(uy.a);
      ela.e.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      uq $$3 = new uq();

      for (ekv $$4 : this.i) {
         $$3.add((vh)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
   }

   @Override
   public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, ir $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dmd a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public ela b() {
      return this.a;
   }

   public ir c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(ekv $$0) {
      this.i.add($$0);
   }

   public List<ekv> e() {
      return this.i;
   }
}

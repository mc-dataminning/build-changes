import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;

public class esj extends esr {
   protected final etv a;
   protected iw b;
   private final int d;
   protected final dui c;
   private final List<etq> h = Lists.newArrayList();
   private final ewq i;
   private final evz j;

   public esj(ewq $$0, etv $$1, iw $$2, int $$3, dui $$4, esf $$5, evz $$6) {
      super(ete.ad, 0, $$5);
      this.i = $$0;
      this.a = $$1;
      this.b = $$2;
      this.d = $$3;
      this.c = $$4;
      this.j = $$6;
   }

   public esj(etd $$0, ua $$1) {
      super(ete.ad, $$1);
      this.i = $$0.c();
      this.b = new iw($$1.b("PosX", 0), $$1.b("PosY", 0), $$1.b("PosZ", 0));
      this.d = $$1.b("ground_level_delta", 0);
      DynamicOps<va> $$2 = $$0.b().a(uo.a);
      this.a = $$1.<etv>a("pool_element", etv.f, $$2).orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = $$1.<dui>a("rotation", dui.h).orElseThrow();
      this.f = this.a.a(this.i, this.b, this.c);
      ug $$3 = $$1.p("junctions");
      this.h.clear();
      $$3.forEach($$1x -> this.h.add(etq.a(new Dynamic($$2, $$1x))));
      this.j = $$1.<evz>a("liquid_settings", evz.c).orElse(euo.e);
   }

   @Override
   protected void a(etd $$0, ua $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.d);
      DynamicOps<va> $$2 = $$0.b().a(uo.a);
      $$1.a("pool_element", etv.f, $$2, this.a);
      $$1.a("rotation", dui.h, this.c);
      ug $$3 = new ug();

      for (etq $$4 : this.h) {
         $$3.add((va)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
      if (this.j != euo.e) {
         $$1.a("liquid_settings", evz.c, $$2, this.j);
      }
   }

   @Override
   public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, iw $$5, boolean $$6) {
      this.a.a(this.i, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.j, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dui a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public etv b() {
      return this.a;
   }

   public iw c() {
      return this.b;
   }

   public int d() {
      return this.d;
   }

   public void a(etq $$0) {
      this.h.add($$0);
   }

   public List<etq> e() {
      return this.h;
   }
}

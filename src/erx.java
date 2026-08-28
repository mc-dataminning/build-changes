import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;

public class erx extends esf {
   protected final etj a;
   protected iv b;
   private final int d;
   protected final dtw c;
   private final List<ete> h = Lists.newArrayList();
   private final ewe i;
   private final evn j;

   public erx(ewe $$0, etj $$1, iv $$2, int $$3, dtw $$4, ert $$5, evn $$6) {
      super(ess.ad, 0, $$5);
      this.i = $$0;
      this.a = $$1;
      this.b = $$2;
      this.d = $$3;
      this.c = $$4;
      this.j = $$6;
   }

   public erx(esr $$0, tz $$1) {
      super(ess.ad, $$1);
      this.i = $$0.c();
      this.b = new iv($$1.b("PosX", 0), $$1.b("PosY", 0), $$1.b("PosZ", 0));
      this.d = $$1.b("ground_level_delta", 0);
      DynamicOps<uy> $$2 = $$0.b().a(un.a);
      this.a = $$1.<etj>a("pool_element", etj.f, $$2).orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = $$1.<dtw>a("rotation", dtw.h).orElseThrow();
      this.f = this.a.a(this.i, this.b, this.c);
      uf $$3 = $$1.p("junctions");
      this.h.clear();
      $$3.forEach($$1x -> this.h.add(ete.a(new Dynamic($$2, $$1x))));
      this.j = $$1.<evn>a("liquid_settings", evn.c).orElse(euc.e);
   }

   @Override
   protected void a(esr $$0, tz $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.d);
      DynamicOps<uy> $$2 = $$0.b().a(un.a);
      $$1.a("pool_element", etj.f, $$2, this.a);
      $$1.a("rotation", dtw.h, this.c);
      uf $$3 = new uf();

      for (ete $$4 : this.h) {
         $$3.add((uy)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
      if (this.j != euc.e) {
         $$1.a("liquid_settings", evn.c, $$2, this.j);
      }
   }

   @Override
   public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, iv $$5, boolean $$6) {
      this.a.a(this.i, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.j, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dtw a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public etj b() {
      return this.a;
   }

   public iv c() {
      return this.b;
   }

   public int d() {
      return this.d;
   }

   public void a(ete $$0) {
      this.h.add($$0);
   }

   public List<ete> e() {
      return this.h;
   }
}

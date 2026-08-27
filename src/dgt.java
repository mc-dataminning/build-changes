import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dgt extends dhd implements bkh {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private vg e;
   private clv f;
   @Nullable
   private su g;
   @Nullable
   private List<Pair<ih<dgu>, clv>> h;

   public dgt(hx $$0, djp $$1) {
      super(dhf.t, $$0, $$1);
      this.f = ((cvp)$$1.b()).b();
   }

   public dgt(hx $$0, djp $$1, clv $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static su a(cng $$0) {
      su $$1 = null;
      so $$2 = cla.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(cng $$0, clv $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(cng $$0) {
      this.g = a($$0);
      this.h = null;
      this.e = $$0.A() ? $$0.y() : null;
   }

   @Override
   public vg ad() {
      return (vg)(this.e != null ? this.e : vg.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public vg af() {
      return this.e;
   }

   public void a(vg $$0) {
      this.e = $$0;
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      if (this.g != null) {
         $$0.a("Patterns", this.g);
      }

      if (this.e != null) {
         $$0.a("CustomName", vg.a.a(this.e));
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = vg.a.a($$0.l("CustomName"));
      }

      this.g = $$0.c("Patterns", 10);
      this.h = null;
   }

   public zi a() {
      return zi.a(this);
   }

   @Override
   public so aA_() {
      return this.q();
   }

   public static int c(cng $$0) {
      so $$1 = cla.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<ih<dgu>, clv>> c() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<ih<dgu>, clv>> a(clv $$0, @Nullable su $$1) {
      List<Pair<ih<dgu>, clv>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(kd.am.f(dgv.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            so $$4 = $$1.a($$3);
            ih<dgu> $$5 = dgu.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, clv.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(cng $$0) {
      so $$1 = cla.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         su $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         cla.a($$0, dhf.t, $$1);
      }
   }

   public cng f() {
      cng $$0 = new cng(cwd.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         so $$1 = new so();
         $$1.a("Patterns", this.g.e());
         cla.a($$0, this.v(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public clv g() {
      return this.f;
   }
}

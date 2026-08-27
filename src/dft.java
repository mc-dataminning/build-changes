import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dft extends dgd implements bjp {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private vb e;
   private ckv f;
   @Nullable
   private sp g;
   @Nullable
   private List<Pair<ie<dfu>, ckv>> h;

   public dft(hv $$0, dip $$1) {
      super(dgf.t, $$0, $$1);
      this.f = ((cuq)$$1.b()).b();
   }

   public dft(hv $$0, dip $$1, ckv $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static sp a(cmh $$0) {
      sp $$1 = null;
      sj $$2 = cka.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(cmh $$0, ckv $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(cmh $$0) {
      this.g = a($$0);
      this.h = null;
      this.e = $$0.A() ? $$0.y() : null;
   }

   @Override
   public vb ad() {
      return (vb)(this.e != null ? this.e : vb.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public vb af() {
      return this.e;
   }

   public void a(vb $$0) {
      this.e = $$0;
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      if (this.g != null) {
         $$0.a("Patterns", this.g);
      }

      if (this.e != null) {
         $$0.a("CustomName", vb.a.a(this.e));
      }
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = vb.a.a($$0.l("CustomName"));
      }

      this.g = $$0.c("Patterns", 10);
      this.h = null;
   }

   public yv a() {
      return yv.a(this);
   }

   @Override
   public sj ax_() {
      return this.q();
   }

   public static int c(cmh $$0) {
      sj $$1 = cka.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<ie<dfu>, ckv>> c() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<ie<dfu>, ckv>> a(ckv $$0, @Nullable sp $$1) {
      List<Pair<ie<dfu>, ckv>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(kb.am.f(dfv.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            sj $$4 = $$1.a($$3);
            ie<dfu> $$5 = dfu.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, ckv.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(cmh $$0) {
      sj $$1 = cka.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         sp $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         cka.a($$0, dgf.t, $$1);
      }
   }

   public cmh f() {
      cmh $$0 = new cmh(cve.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         sj $$1 = new sj();
         $$1.a("Patterns", this.g.e());
         cka.a($$0, this.v(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public ckv g() {
      return this.f;
   }
}

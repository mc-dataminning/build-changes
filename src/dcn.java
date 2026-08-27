import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dcn extends dcx implements bhe {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private tn e;
   private chv f;
   @Nullable
   private re g;
   @Nullable
   private List<Pair<hg<dco>, chv>> h;

   public dcn(gw $$0, dfl $$1) {
      super(dcz.t, $$0, $$1);
      this.f = ((cro)$$1.b()).a();
   }

   public dcn(gw $$0, dfl $$1, chv $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static re a(cjh $$0) {
      re $$1 = null;
      qy $$2 = cha.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(cjh $$0, chv $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(cjh $$0) {
      this.g = a($$0);
      this.h = null;
      this.e = $$0.A() ? $$0.y() : null;
   }

   @Override
   public tn ab() {
      return (tn)(this.e != null ? this.e : tn.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public tn ad() {
      return this.e;
   }

   public void a(tn $$0) {
      this.e = $$0;
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      if (this.g != null) {
         $$0.a("Patterns", this.g);
      }

      if (this.e != null) {
         $$0.a("CustomName", tn.a.a(this.e));
      }
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = tn.a.a($$0.l("CustomName"));
      }

      this.g = $$0.c("Patterns", 10);
      this.h = null;
   }

   public xf a() {
      return xf.a(this);
   }

   @Override
   public qy as_() {
      return this.o();
   }

   public static int c(cjh $$0) {
      qy $$1 = cha.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<hg<dco>, chv>> c() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<hg<dco>, chv>> a(chv $$0, @Nullable re $$1) {
      List<Pair<hg<dco>, chv>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(jd.al.f(dcp.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            qy $$4 = $$1.a($$3);
            hg<dco> $$5 = dco.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, chv.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(cjh $$0) {
      qy $$1 = cha.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         re $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         cha.a($$0, dcz.t, $$1);
      }
   }

   public cjh f() {
      cjh $$0 = new cjh(csd.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         qy $$1 = new qy();
         $$1.a("Patterns", this.g.e());
         cha.a($$0, this.u(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public chv g() {
      return this.f;
   }
}

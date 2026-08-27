import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class din extends dix implements bmb {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private vq e;
   private cnr f;
   @Nullable
   private tc g;
   @Nullable
   private List<Pair<ij<dio>, cnr>> h;

   public din(hz $$0, dlj $$1) {
      super(diz.t, $$0, $$1);
      this.f = ((cxj)$$1.b()).b();
   }

   public din(hz $$0, dlj $$1, cnr $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static tc a(cpd $$0) {
      tc $$1 = null;
      sw $$2 = cmw.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(cpd $$0, cnr $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(cpd $$0) {
      this.g = a($$0);
      this.h = null;
      this.e = $$0.B() ? $$0.z() : null;
   }

   @Override
   public vq ad() {
      return (vq)(this.e != null ? this.e : vq.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public vq af() {
      return this.e;
   }

   public void a(vq $$0) {
      this.e = $$0;
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      if (this.g != null) {
         $$0.a("Patterns", this.g);
      }

      if (this.e != null) {
         $$0.a("CustomName", vq.a.a(this.e));
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = vq.a.a($$0.l("CustomName"));
      }

      this.g = $$0.c("Patterns", 10);
      this.h = null;
   }

   public aan a() {
      return aan.a(this);
   }

   @Override
   public sw aA_() {
      return this.q();
   }

   public static int c(cpd $$0) {
      sw $$1 = cmw.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<ij<dio>, cnr>> c() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<ij<dio>, cnr>> a(cnr $$0, @Nullable tc $$1) {
      List<Pair<ij<dio>, cnr>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(kf.am.f(dip.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            sw $$4 = $$1.a($$3);
            ij<dio> $$5 = dio.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, cnr.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(cpd $$0) {
      sw $$1 = cmw.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         tc $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         cmw.a($$0, diz.t, $$1);
      }
   }

   public cpd f() {
      cpd $$0 = new cpd(cxx.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         sw $$1 = new sw();
         $$1.a("Patterns", this.g.e());
         cmw.a($$0, this.v(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public cnr g() {
      return this.f;
   }
}

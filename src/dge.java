import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dge extends dgo implements bjz {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private vd e;
   private clf f;
   @Nullable
   private sr g;
   @Nullable
   private List<Pair<ih<dgf>, clf>> h;

   public dge(hx $$0, dja $$1) {
      super(dgq.t, $$0, $$1);
      this.f = ((cva)$$1.b()).b();
   }

   public dge(hx $$0, dja $$1, clf $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static sr a(cmr $$0) {
      sr $$1 = null;
      sl $$2 = ckk.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(cmr $$0, clf $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(cmr $$0) {
      this.g = a($$0);
      this.h = null;
      this.e = $$0.A() ? $$0.y() : null;
   }

   @Override
   public vd ad() {
      return (vd)(this.e != null ? this.e : vd.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public vd af() {
      return this.e;
   }

   public void a(vd $$0) {
      this.e = $$0;
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      if (this.g != null) {
         $$0.a("Patterns", this.g);
      }

      if (this.e != null) {
         $$0.a("CustomName", vd.a.a(this.e));
      }
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = vd.a.a($$0.l("CustomName"));
      }

      this.g = $$0.c("Patterns", 10);
      this.h = null;
   }

   public ze a() {
      return ze.a(this);
   }

   @Override
   public sl ax_() {
      return this.q();
   }

   public static int c(cmr $$0) {
      sl $$1 = ckk.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<ih<dgf>, clf>> c() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<ih<dgf>, clf>> a(clf $$0, @Nullable sr $$1) {
      List<Pair<ih<dgf>, clf>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(kd.am.f(dgg.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            sl $$4 = $$1.a($$3);
            ih<dgf> $$5 = dgf.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, clf.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(cmr $$0) {
      sl $$1 = ckk.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         sr $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         ckk.a($$0, dgq.t, $$1);
      }
   }

   public cmr f() {
      cmr $$0 = new cmr(cvo.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         sl $$1 = new sl();
         $$1.a("Patterns", this.g.e());
         ckk.a($$0, this.v(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public clf g() {
      return this.f;
   }
}

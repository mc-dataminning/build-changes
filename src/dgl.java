import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dgl extends dgv implements bkf {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private vf e;
   private clm f;
   @Nullable
   private st g;
   @Nullable
   private List<Pair<ih<dgm>, clm>> h;

   public dgl(hx $$0, djh $$1) {
      super(dgx.t, $$0, $$1);
      this.f = ((cvh)$$1.b()).b();
   }

   public dgl(hx $$0, djh $$1, clm $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static st a(cmy $$0) {
      st $$1 = null;
      sn $$2 = ckr.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(cmy $$0, clm $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(cmy $$0) {
      this.g = a($$0);
      this.h = null;
      this.e = $$0.A() ? $$0.y() : null;
   }

   @Override
   public vf ad() {
      return (vf)(this.e != null ? this.e : vf.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public vf af() {
      return this.e;
   }

   public void a(vf $$0) {
      this.e = $$0;
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      if (this.g != null) {
         $$0.a("Patterns", this.g);
      }

      if (this.e != null) {
         $$0.a("CustomName", vf.a.a(this.e));
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = vf.a.a($$0.l("CustomName"));
      }

      this.g = $$0.c("Patterns", 10);
      this.h = null;
   }

   public zh a() {
      return zh.a(this);
   }

   @Override
   public sn ax_() {
      return this.q();
   }

   public static int c(cmy $$0) {
      sn $$1 = ckr.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<ih<dgm>, clm>> c() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<ih<dgm>, clm>> a(clm $$0, @Nullable st $$1) {
      List<Pair<ih<dgm>, clm>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(kd.am.f(dgn.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            sn $$4 = $$1.a($$3);
            ih<dgm> $$5 = dgm.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, clm.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(cmy $$0) {
      sn $$1 = ckr.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         st $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         ckr.a($$0, dgx.t, $$1);
      }
   }

   public cmy f() {
      cmy $$0 = new cmy(cvv.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         sn $$1 = new sn();
         $$1.a("Patterns", this.g.e());
         ckr.a($$0, this.v(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public clm g() {
      return this.f;
   }
}

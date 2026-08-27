import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dcl extends dcv implements bhc {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private tl e;
   private cht f;
   @Nullable
   private rd g;
   @Nullable
   private List<Pair<hg<dcm>, cht>> h;

   public dcl(gw $$0, dfj $$1) {
      super(dcx.t, $$0, $$1);
      this.f = ((crm)$$1.b()).a();
   }

   public dcl(gw $$0, dfj $$1, cht $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static rd a(cjf $$0) {
      rd $$1 = null;
      qx $$2 = cgy.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(cjf $$0, cht $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(cjf $$0) {
      this.g = a($$0);
      this.h = null;
      this.e = $$0.A() ? $$0.y() : null;
   }

   @Override
   public tl ac() {
      return (tl)(this.e != null ? this.e : tl.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public tl ae() {
      return this.e;
   }

   public void a(tl $$0) {
      this.e = $$0;
   }

   @Override
   protected void b(qx $$0) {
      super.b($$0);
      if (this.g != null) {
         $$0.a("Patterns", this.g);
      }

      if (this.e != null) {
         $$0.a("CustomName", tl.a.a(this.e));
      }
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = tl.a.a($$0.l("CustomName"));
      }

      this.g = $$0.c("Patterns", 10);
      this.h = null;
   }

   public xe a() {
      return xe.a(this);
   }

   @Override
   public qx as_() {
      return this.o();
   }

   public static int c(cjf $$0) {
      qx $$1 = cgy.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<hg<dcm>, cht>> c() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<hg<dcm>, cht>> a(cht $$0, @Nullable rd $$1) {
      List<Pair<hg<dcm>, cht>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(jd.al.f(dcn.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            qx $$4 = $$1.a($$3);
            hg<dcm> $$5 = dcm.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, cht.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(cjf $$0) {
      qx $$1 = cgy.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         rd $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         cgy.a($$0, dcx.t, $$1);
      }
   }

   public cjf f() {
      cjf $$0 = new cjf(csb.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         qx $$1 = new qx();
         $$1.a("Patterns", this.g.e());
         cgy.a($$0, this.u(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public cht g() {
      return this.f;
   }
}

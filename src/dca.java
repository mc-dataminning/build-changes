import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dca extends dck implements bgs {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private te e;
   private chk f;
   @Nullable
   private qy g;
   @Nullable
   private List<Pair<hf<dcb>, chk>> h;

   public dca(gv $$0, dey $$1) {
      super(dcm.t, $$0, $$1);
      this.f = ((crb)$$1.b()).a();
   }

   public dca(gv $$0, dey $$1, chk $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static qy a(ciw $$0) {
      qy $$1 = null;
      qs $$2 = cgp.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(ciw $$0, chk $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(ciw $$0) {
      this.g = a($$0);
      this.h = null;
      this.e = $$0.A() ? $$0.y() : null;
   }

   @Override
   public te ab() {
      return (te)(this.e != null ? this.e : te.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public te ad() {
      return this.e;
   }

   public void a(te $$0) {
      this.e = $$0;
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      if (this.g != null) {
         $$0.a("Patterns", this.g);
      }

      if (this.e != null) {
         $$0.a("CustomName", te.a.a(this.e));
      }
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = te.a.a($$0.l("CustomName"));
      }

      this.g = $$0.c("Patterns", 10);
      this.h = null;
   }

   public ww a() {
      return ww.a(this);
   }

   @Override
   public qs ao_() {
      return this.o();
   }

   public static int c(ciw $$0) {
      qs $$1 = cgp.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<hf<dcb>, chk>> c() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<hf<dcb>, chk>> a(chk $$0, @Nullable qy $$1) {
      List<Pair<hf<dcb>, chk>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(jc.al.f(dcc.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            qs $$4 = $$1.a($$3);
            hf<dcb> $$5 = dcb.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, chk.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(ciw $$0) {
      qs $$1 = cgp.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         qy $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         cgp.a($$0, dcm.t, $$1);
      }
   }

   public ciw f() {
      ciw $$0 = new ciw(crq.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         qs $$1 = new qs();
         $$1.a("Patterns", this.g.e());
         cgp.a($$0, this.u(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public chk g() {
      return this.f;
   }
}

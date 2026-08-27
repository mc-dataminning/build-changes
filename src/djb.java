import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class djb extends djl implements bmq {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private vs e;
   private cog f;
   @Nullable
   private te g;
   @Nullable
   private List<Pair<il<djc>, cog>> h;

   public djb(ib $$0, dme $$1) {
      super(djn.t, $$0, $$1);
      this.f = ((cxw)$$1.b()).b();
   }

   public djb(ib $$0, dme $$1, cog $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static te a(cpq $$0) {
      te $$1 = null;
      sy $$2 = cnl.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(cpq $$0, cog $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(cpq $$0) {
      this.g = a($$0);
      this.h = null;
      this.e = $$0.B() ? $$0.z() : null;
   }

   @Override
   public vs ad() {
      return (vs)(this.e != null ? this.e : vs.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public vs af() {
      return this.e;
   }

   public void a(vs $$0) {
      this.e = $$0;
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      if (this.g != null) {
         $$0.a("Patterns", this.g);
      }

      if (this.e != null) {
         $$0.a("CustomName", vs.a.a(this.e));
      }
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.e = vs.a.a($$0.l("CustomName"));
      }

      this.g = $$0.c("Patterns", 10);
      this.h = null;
   }

   public aap a() {
      return aap.a(this);
   }

   @Override
   public sy a(in.a $$0) {
      return this.d($$0);
   }

   public static int c(cpq $$0) {
      sy $$1 = cnl.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<il<djc>, cog>> b() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<il<djc>, cog>> a(cog $$0, @Nullable te $$1) {
      List<Pair<il<djc>, cog>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(kh.am.f(djd.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            sy $$4 = $$1.a($$3);
            il<djc> $$5 = djc.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, cog.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(cpq $$0) {
      sy $$1 = cnl.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         te $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         cnl.a($$0, djn.t, $$1);
      }
   }

   public cpq c() {
      cpq $$0 = new cpq(cyk.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         sy $$1 = new sy();
         $$1.a("Patterns", this.g.e());
         cnl.a($$0, this.r(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public cog f() {
      return this.f;
   }
}

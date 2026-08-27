import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dcp extends dcz implements bhi {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private tl e;
   private chz f;
   @Nullable
   private rc g;
   @Nullable
   private List<Pair<he<dcq>, chz>> h;

   public dcp(gw $$0, dfd $$1) {
      super(ddb.t, $$0, $$1);
      this.f = ((crs)$$1.b()).b();
   }

   public dcp(gw $$0, dfd $$1, chz $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static rc a(cjl $$0) {
      rc $$1 = null;
      qw $$2 = che.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(cjl $$0, chz $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(cjl $$0) {
      this.g = a($$0);
      this.h = null;
      this.e = $$0.A() ? $$0.y() : null;
   }

   @Override
   public tl ab() {
      return (tl)(this.e != null ? this.e : tl.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public tl ad() {
      return this.e;
   }

   public void a(tl $$0) {
      this.e = $$0;
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      if (this.g != null) {
         $$0.a("Patterns", this.g);
      }

      if (this.e != null) {
         $$0.a("CustomName", tl.a.a(this.e));
      }
   }

   @Override
   public void a(qw $$0) {
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
   public qw as_() {
      return this.o();
   }

   public static int c(cjl $$0) {
      qw $$1 = che.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<he<dcq>, chz>> c() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<he<dcq>, chz>> a(chz $$0, @Nullable rc $$1) {
      List<Pair<he<dcq>, chz>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(jb.am.f(dcr.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            qw $$4 = $$1.a($$3);
            he<dcq> $$5 = dcq.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, chz.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(cjl $$0) {
      qw $$1 = che.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         rc $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         che.a($$0, ddb.t, $$1);
      }
   }

   public cjl f() {
      cjl $$0 = new cjl(csh.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         qw $$1 = new qw();
         $$1.a("Patterns", this.g.e());
         che.a($$0, this.u(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public chz g() {
      return this.f;
   }
}

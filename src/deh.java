import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class deh extends der implements biu {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private ur e;
   private cjp f;
   @Nullable
   private sf g;
   @Nullable
   private List<Pair<ib<dei>, cjp>> h;

   public deh(ht $$0, dgw $$1) {
      super(det.t, $$0, $$1);
      this.f = ((ctj)$$1.b()).b();
   }

   public deh(ht $$0, dgw $$1, cjp $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static sf a(clb $$0) {
      sf $$1 = null;
      rz $$2 = ciu.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(clb $$0, cjp $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(clb $$0) {
      this.g = a($$0);
      this.h = null;
      this.e = $$0.A() ? $$0.y() : null;
   }

   @Override
   public ur ab() {
      return (ur)(this.e != null ? this.e : ur.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public ur ad() {
      return this.e;
   }

   public void a(ur $$0) {
      this.e = $$0;
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      if (this.g != null) {
         $$0.a("Patterns", this.g);
      }

      if (this.e != null) {
         $$0.a("CustomName", ur.a.a(this.e));
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = ur.a.a($$0.l("CustomName"));
      }

      this.g = $$0.c("Patterns", 10);
      this.h = null;
   }

   public yk a() {
      return yk.a(this);
   }

   @Override
   public rz av_() {
      return this.o();
   }

   public static int c(clb $$0) {
      rz $$1 = ciu.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<ib<dei>, cjp>> c() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<ib<dei>, cjp>> a(cjp $$0, @Nullable sf $$1) {
      List<Pair<ib<dei>, cjp>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(jy.an.f(dej.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            rz $$4 = $$1.a($$3);
            ib<dei> $$5 = dei.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, cjp.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(clb $$0) {
      rz $$1 = ciu.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         sf $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         ciu.a($$0, det.t, $$1);
      }
   }

   public clb f() {
      clb $$0 = new clb(cty.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         rz $$1 = new rz();
         $$1.a("Patterns", this.g.e());
         ciu.a($$0, this.u(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public cjp g() {
      return this.f;
   }
}

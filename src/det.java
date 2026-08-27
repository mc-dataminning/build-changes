import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class det extends dfd implements bjb {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private ur e;
   private cjx f;
   @Nullable
   private sf g;
   @Nullable
   private List<Pair<ib<deu>, cjx>> h;

   public det(ht $$0, dhi $$1) {
      super(dff.t, $$0, $$1);
      this.f = ((ctr)$$1.b()).b();
   }

   public det(ht $$0, dhi $$1, cjx $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static sf a(clj $$0) {
      sf $$1 = null;
      rz $$2 = cjc.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(clj $$0, cjx $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(clj $$0) {
      this.g = a($$0);
      this.h = null;
      this.e = $$0.A() ? $$0.y() : null;
   }

   @Override
   public ur ad() {
      return (ur)(this.e != null ? this.e : ur.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public ur af() {
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
   public rz aw_() {
      return this.o();
   }

   public static int c(clj $$0) {
      rz $$1 = cjc.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<ib<deu>, cjx>> c() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<ib<deu>, cjx>> a(cjx $$0, @Nullable sf $$1) {
      List<Pair<ib<deu>, cjx>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(jy.an.f(dev.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            rz $$4 = $$1.a($$3);
            ib<deu> $$5 = deu.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, cjx.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(clj $$0) {
      rz $$1 = cjc.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         sf $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         cjc.a($$0, dff.t, $$1);
      }
   }

   public clj f() {
      clj $$0 = new clj(cuf.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         rz $$1 = new rz();
         $$1.a("Patterns", this.g.e());
         cjc.a($$0, this.u(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public cjx g() {
      return this.f;
   }
}

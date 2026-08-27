import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class djw extends dkg implements bnh {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private vu e;
   private cpb f;
   @Nullable
   private tg g;
   @Nullable
   private List<Pair<il<djx>, cpb>> h;

   public djw(ib $$0, dmz $$1) {
      super(dki.t, $$0, $$1);
      this.f = ((cyr)$$1.b()).b();
   }

   public djw(ib $$0, dmz $$1, cpb $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static tg a(cqk $$0) {
      tg $$1 = null;
      ta $$2 = cof.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(cqk $$0, cpb $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(cqk $$0) {
      this.g = a($$0);
      this.h = null;
      this.e = $$0.B() ? $$0.z() : null;
   }

   @Override
   public vu ad() {
      return (vu)(this.e != null ? this.e : vu.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public vu af() {
      return this.e;
   }

   public void a(vu $$0) {
      this.e = $$0;
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      if (this.g != null) {
         $$0.a("Patterns", this.g);
      }

      if (this.e != null) {
         $$0.a("CustomName", vu.a.a(this.e));
      }
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.e = vu.a.a($$0.l("CustomName"));
      }

      this.g = $$0.c("Patterns", 10);
      this.h = null;
   }

   public aat a() {
      return aat.a(this);
   }

   @Override
   public ta a(in.a $$0) {
      return this.d($$0);
   }

   public static int c(cqk $$0) {
      ta $$1 = cof.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<il<djx>, cpb>> b() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<il<djx>, cpb>> a(cpb $$0, @Nullable tg $$1) {
      List<Pair<il<djx>, cpb>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(ki.am.g(djy.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            ta $$4 = $$1.a($$3);
            il<djx> $$5 = djx.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, cpb.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(cqk $$0) {
      ta $$1 = cof.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         tg $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         cof.a($$0, dki.t, $$1);
      }
   }

   public cqk c() {
      cqk $$0 = new cqk(czf.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         ta $$1 = new ta();
         $$1.a("Patterns", this.g.e());
         cof.a($$0, this.r(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public cpb f() {
      return this.f;
   }
}

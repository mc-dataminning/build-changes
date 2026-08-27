import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class ddn extends ddx implements bif {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private ui e;
   private cix f;
   @Nullable
   private rz g;
   @Nullable
   private List<Pair<ib<ddo>, cix>> h;

   public ddn(ht $$0, dgb $$1) {
      super(ddz.t, $$0, $$1);
      this.f = ((csq)$$1.b()).b();
   }

   public ddn(ht $$0, dgb $$1, cix $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static rz a(ckj $$0) {
      rz $$1 = null;
      rt $$2 = cic.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(ckj $$0, cix $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(ckj $$0) {
      this.g = a($$0);
      this.h = null;
      this.e = $$0.A() ? $$0.y() : null;
   }

   @Override
   public ui ab() {
      return (ui)(this.e != null ? this.e : ui.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public ui ad() {
      return this.e;
   }

   public void a(ui $$0) {
      this.e = $$0;
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      if (this.g != null) {
         $$0.a("Patterns", this.g);
      }

      if (this.e != null) {
         $$0.a("CustomName", ui.a.a(this.e));
      }
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = ui.a.a($$0.l("CustomName"));
      }

      this.g = $$0.c("Patterns", 10);
      this.h = null;
   }

   public yb a() {
      return yb.a(this);
   }

   @Override
   public rt av_() {
      return this.o();
   }

   public static int c(ckj $$0) {
      rt $$1 = cic.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<ib<ddo>, cix>> c() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<ib<ddo>, cix>> a(cix $$0, @Nullable rz $$1) {
      List<Pair<ib<ddo>, cix>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(jy.am.f(ddp.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            rt $$4 = $$1.a($$3);
            ib<ddo> $$5 = ddo.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, cix.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(ckj $$0) {
      rt $$1 = cic.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         rz $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         cic.a($$0, ddz.t, $$1);
      }
   }

   public ckj f() {
      ckj $$0 = new ckj(ctf.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         rt $$1 = new rt();
         $$1.a("Patterns", this.g.e());
         cic.a($$0, this.u(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public cix g() {
      return this.f;
   }
}

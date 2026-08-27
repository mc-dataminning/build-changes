import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dey extends dfi implements bjf {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private uv e;
   private ckc f;
   @Nullable
   private sj g;
   @Nullable
   private List<Pair<ig<dez>, ckc>> h;

   public dey(hx $$0, dhn $$1) {
      super(dfk.t, $$0, $$1);
      this.f = ((ctw)$$1.b()).b();
   }

   public dey(hx $$0, dhn $$1, ckc $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static sj a(clo $$0) {
      sj $$1 = null;
      sd $$2 = cjh.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(clo $$0, ckc $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(clo $$0) {
      this.g = a($$0);
      this.h = null;
      this.e = $$0.A() ? $$0.y() : null;
   }

   @Override
   public uv ad() {
      return (uv)(this.e != null ? this.e : uv.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public uv af() {
      return this.e;
   }

   public void a(uv $$0) {
      this.e = $$0;
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      if (this.g != null) {
         $$0.a("Patterns", this.g);
      }

      if (this.e != null) {
         $$0.a("CustomName", uv.a.a(this.e));
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = uv.a.a($$0.l("CustomName"));
      }

      this.g = $$0.c("Patterns", 10);
      this.h = null;
   }

   public yo a() {
      return yo.a(this);
   }

   @Override
   public sd ay_() {
      return this.q();
   }

   public static int c(clo $$0) {
      sd $$1 = cjh.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<ig<dez>, ckc>> c() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<ig<dez>, ckc>> a(ckc $$0, @Nullable sj $$1) {
      List<Pair<ig<dez>, ckc>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(kc.an.f(dfa.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            sd $$4 = $$1.a($$3);
            ig<dez> $$5 = dez.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, ckc.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(clo $$0) {
      sd $$1 = cjh.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         sj $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         cjh.a($$0, dfk.t, $$1);
      }
   }

   public clo f() {
      clo $$0 = new clo(cuk.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         sd $$1 = new sd();
         $$1.a("Patterns", this.g.e());
         cjh.a($$0, this.v(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public ckc g() {
      return this.f;
   }
}

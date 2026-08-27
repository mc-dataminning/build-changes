import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dgk extends dgu implements bke {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private vf e;
   private cll f;
   @Nullable
   private st g;
   @Nullable
   private List<Pair<ih<dgl>, cll>> h;

   public dgk(hx $$0, djg $$1) {
      super(dgw.t, $$0, $$1);
      this.f = ((cvg)$$1.b()).b();
   }

   public dgk(hx $$0, djg $$1, cll $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static st a(cmx $$0) {
      st $$1 = null;
      sn $$2 = ckq.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(cmx $$0, cll $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(cmx $$0) {
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

   public static int c(cmx $$0) {
      sn $$1 = ckq.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<ih<dgl>, cll>> c() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<ih<dgl>, cll>> a(cll $$0, @Nullable st $$1) {
      List<Pair<ih<dgl>, cll>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(kd.am.f(dgm.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            sn $$4 = $$1.a($$3);
            ih<dgl> $$5 = dgl.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, cll.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(cmx $$0) {
      sn $$1 = ckq.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         st $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         ckq.a($$0, dgw.t, $$1);
      }
   }

   public cmx f() {
      cmx $$0 = new cmx(cvu.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         sn $$1 = new sn();
         $$1.a("Patterns", this.g.e());
         ckq.a($$0, this.v(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public cll g() {
      return this.f;
   }
}

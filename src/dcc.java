import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dcc extends dcm implements bgu {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private tf e;
   private chm f;
   @Nullable
   private qx g;
   @Nullable
   private List<Pair<he<dcd>, chm>> h;

   public dcc(gu $$0, dfa $$1) {
      super(dco.t, $$0, $$1);
      this.f = ((crd)$$1.b()).a();
   }

   public dcc(gu $$0, dfa $$1, chm $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static qx a(ciy $$0) {
      qx $$1 = null;
      qr $$2 = cgr.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(ciy $$0, chm $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(ciy $$0) {
      this.g = a($$0);
      this.h = null;
      this.e = $$0.A() ? $$0.y() : null;
   }

   @Override
   public tf ab() {
      return (tf)(this.e != null ? this.e : tf.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public tf ad() {
      return this.e;
   }

   public void a(tf $$0) {
      this.e = $$0;
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      if (this.g != null) {
         $$0.a("Patterns", this.g);
      }

      if (this.e != null) {
         $$0.a("CustomName", tf.a.a(this.e));
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = tf.a.a($$0.l("CustomName"));
      }

      this.g = $$0.c("Patterns", 10);
      this.h = null;
   }

   public wx a() {
      return wx.a(this);
   }

   @Override
   public qr ao_() {
      return this.o();
   }

   public static int c(ciy $$0) {
      qr $$1 = cgr.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<he<dcd>, chm>> c() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<he<dcd>, chm>> a(chm $$0, @Nullable qx $$1) {
      List<Pair<he<dcd>, chm>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(jb.al.f(dce.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            qr $$4 = $$1.a($$3);
            he<dcd> $$5 = dcd.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, chm.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(ciy $$0) {
      qr $$1 = cgr.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         qx $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         cgr.a($$0, dco.t, $$1);
      }
   }

   public ciy f() {
      ciy $$0 = new ciy(crs.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         qr $$1 = new qr();
         $$1.a("Patterns", this.g.e());
         cgr.a($$0, this.u(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public chm g() {
      return this.f;
   }
}

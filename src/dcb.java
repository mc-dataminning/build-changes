import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dcb extends dcl implements bgu {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private tf e;
   private chl f;
   @Nullable
   private qx g;
   @Nullable
   private List<Pair<he<dcc>, chl>> h;

   public dcb(gu $$0, dez $$1) {
      super(dcn.t, $$0, $$1);
      this.f = ((crc)$$1.b()).a();
   }

   public dcb(gu $$0, dez $$1, chl $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static qx a(cix $$0) {
      qx $$1 = null;
      qr $$2 = cgq.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).e();
      }

      return $$1;
   }

   public void a(cix $$0, chl $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(cix $$0) {
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
   public qr an_() {
      return this.o();
   }

   public static int c(cix $$0) {
      qr $$1 = cgq.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<he<dcc>, chl>> c() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<he<dcc>, chl>> a(chl $$0, @Nullable qx $$1) {
      List<Pair<he<dcc>, chl>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(jb.al.f(dcd.a), $$0));
      if ($$1 != null) {
         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            qr $$4 = $$1.a($$3);
            he<dcc> $$5 = dcc.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, chl.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(cix $$0) {
      qr $$1 = cgq.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         qx $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }
         }

         $$1.r("id");
         cgq.a($$0, dcn.t, $$1);
      }
   }

   public cix f() {
      cix $$0 = new cix(crr.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         qr $$1 = new qr();
         $$1.a("Patterns", this.g.e());
         cgq.a($$0, this.u(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public chl g() {
      return this.f;
   }
}

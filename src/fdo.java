import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdo extends gwj {
   static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("mco.configure.world.backup");
   static final wy c = wy.c("mco.backup.button.restore");
   static final wy A = wy.c("mco.backup.changes.tooltip");
   private static final wy B = wy.c("mco.backup.nobackups");
   private static final wy C = wy.c("mco.backup.button.download");
   private static final String D = "uploaded";
   private static final int E = 8;
   final fdr F;
   List<fby> G = Collections.emptyList();
   @Nullable
   fdo.a H;
   final flt I = new flt(this);
   private final int J;
   @Nullable
   fig K;
   final fcj L;
   boolean M = false;

   public fdo(fdr $$0, fcj $$1, int $$2) {
      super(b);
      this.F = $$0;
      this.L = $$1;
      this.J = $$2;
   }

   @Override
   public void aP_() {
      this.I.a(b, this.o);
      this.H = this.I.c(new fdo.a());
      flx $$0 = this.I.b(flx.e().a(8));
      this.K = $$0.a(fig.a(C, $$0x -> this.E()).a());
      this.K.j = false;
      $$0.a(fig.a(wx.k, $$0x -> this.d()).a());
      this.I.a($$1 -> {
         fie var10000 = this.c($$1);
      });
      this.c();
      this.D();
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.M && this.H != null) {
         $$0.a(this.o, B, this.m / 2 - this.o.a(B) / 2, this.H.E() + this.H.w() / 2 - 9 / 2, -1, false);
      }
   }

   @Override
   protected void c() {
      this.I.a();
      if (this.H != null) {
         this.H.a(this.m, this.I);
      }
   }

   private void D() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            fbs $$0 = fbs.a();

            try {
               List<fby> $$1 = $$0.e(fdo.this.L.a).a;
               fdo.this.l.execute(() -> {
                  fdo.this.G = $$1;
                  fdo.this.M = fdo.this.G.isEmpty();
                  if (!fdo.this.M && fdo.this.K != null) {
                     fdo.this.K.j = true;
                  }

                  if (fdo.this.H != null) {
                     fdo.this.H.aG_().clear();

                     for (fby $$1x : fdo.this.G) {
                        fdo.this.H.a($$1x);
                     }
                  }
               });
            } catch (fdd var3) {
               fdo.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void d() {
      this.l.a(this.F);
   }

   private void E() {
      this.l
         .a(
            fed.a(
               this,
               wy.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.l.a(new fdx(this.F.g(), new fff(this.L.a, this.J, this.L.c + " (" + this.L.i.get(this.L.n).a(this.L.n) + ")", this)))
            )
         );
   }

   class a extends fim<fdo.b> {
      private static final int m = 36;

      public a() {
         super(fgi.Q(), fdo.this.m, fdo.this.I.d(), fdo.this.I.c(), 36);
      }

      public void a(fby $$0) {
         this.b(fdo.this.new b($$0));
      }

      @Override
      public int a() {
         return this.l() * 36 + this.f;
      }

      @Override
      public int b() {
         return 300;
      }
   }

   class b extends fim.a<fdo.b> {
      private static final int b = 2;
      private final fby c;
      @Nullable
      private fig d;
      @Nullable
      private fig e;
      private final List<fie> f = new ArrayList<>();

      public b(final fby $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fig.a(fdo.A, $$0x -> fdo.this.l.a(new fdn(fdo.this, this.c)))
               .a(8 + fdo.this.o.a(fdo.A))
               .a($$0x -> wx.a(wy.a("mco.backup.narration", this.c()), (wy)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fdo.this.L.j) {
            this.d = fig.a(fdo.c, $$0x -> this.d()).a(8 + fdo.this.o.a(fdo.A)).a($$0x -> wx.a(wy.a("mco.backup.narration", this.c()), (wy)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fby $$0) {
         int $$1 = fdo.this.G.indexOf($$0);
         if ($$1 != fdo.this.G.size() - 1) {
            fby $$2 = fdo.this.G.get($$1 + 1);

            for (String $$3 : $$0.d.keySet()) {
               if (!$$3.contains("uploaded") && $$2.d.containsKey($$3)) {
                  if (!$$0.d.get($$3).equals($$2.d.get($$3))) {
                     this.a($$3);
                  }
               } else {
                  this.a($$3);
               }
            }
         }
      }

      private void a(String $$0) {
         if ($$0.contains("uploaded")) {
            String $$1 = DateFormat.getDateTimeInstance(3, 3).format(this.c.b);
            this.c.e.put($$0, $$1);
            this.c.a(true);
         } else {
            this.c.e.put($$0, this.c.d.get($$0));
         }
      }

      private String c() {
         return DateFormat.getDateTimeInstance(3, 3).format(this.c.b);
      }

      private void d() {
         wy $$0 = fex.a(this.c.b);
         wy $$1 = wy.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fdo.this.l.a(fed.b(fdo.this, $$1, $$0x -> fdo.this.l.a(new fdx(fdo.this.F.g(), new ffn(this.c, fdo.this.L.a, fdo.this.F)))));
      }

      @Override
      public List<? extends fkc> aG_() {
         return this.f;
      }

      @Override
      public List<? extends fma> b() {
         return this.f;
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fdo.this.o, wy.a("mco.backup.entry", fex.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fdo.this.o, this.a(this.c.b), $$3, $$12, 5000268, false);
         int $$14 = 0;
         int $$15 = $$2 + $$5 / 2 - 10;
         if (this.d != null) {
            $$14 += this.d.y() + 8;
            this.d.m($$3 + $$4 - $$14);
            this.d.n($$15);
            this.d.a($$0, $$6, $$7, $$9);
         }

         if (this.e != null) {
            $$14 += this.e.y() + 8;
            this.e.m($$3 + $$4 - $$14);
            this.e.n($$15);
            this.e.a($$0, $$6, $$7, $$9);
         }
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }
   }
}

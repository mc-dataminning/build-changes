import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdc extends gvu {
   static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("mco.configure.world.backup");
   static final wu c = wu.c("mco.backup.button.restore");
   static final wu A = wu.c("mco.backup.changes.tooltip");
   private static final wu B = wu.c("mco.backup.nobackups");
   private static final wu C = wu.c("mco.backup.button.download");
   private static final String D = "uploaded";
   private static final int E = 8;
   final fdf F;
   List<fbk> G = Collections.emptyList();
   @Nullable
   fdc.a H;
   final flh I = new flh(this);
   private final int J;
   @Nullable
   fhu K;
   final fbv L;
   boolean M = false;

   public fdc(fdf $$0, fbv $$1, int $$2) {
      super(b);
      this.F = $$0;
      this.L = $$1;
      this.J = $$2;
   }

   @Override
   public void aP_() {
      this.I.a(b, this.o);
      this.H = this.I.c(new fdc.a());
      fll $$0 = this.I.b(fll.e().a(8));
      this.K = $$0.a(fhu.a(C, $$0x -> this.E()).a());
      this.K.j = false;
      $$0.a(fhu.a(wt.k, $$0x -> this.d()).a());
      this.I.a($$1 -> {
         fhs var10000 = this.c($$1);
      });
      this.c();
      this.D();
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
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
            fbe $$0 = fbe.a();

            try {
               List<fbk> $$1 = $$0.e(fdc.this.L.a).a;
               fdc.this.l.execute(() -> {
                  fdc.this.G = $$1;
                  fdc.this.M = fdc.this.G.isEmpty();
                  if (!fdc.this.M && fdc.this.K != null) {
                     fdc.this.K.j = true;
                  }

                  if (fdc.this.H != null) {
                     fdc.this.H.aG_().clear();

                     for (fbk $$1x : fdc.this.G) {
                        fdc.this.H.a($$1x);
                     }
                  }
               });
            } catch (fcr var3) {
               fdc.a.error("Couldn't request backups", var3);
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
            fdr.a(
               this,
               wu.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.l.a(new fdl(this.F.g(), new fet(this.L.a, this.J, this.L.c + " (" + this.L.i.get(this.L.n).a(this.L.n) + ")", this)))
            )
         );
   }

   class a extends fia<fdc.b> {
      private static final int m = 36;

      public a() {
         super(ffw.Q(), fdc.this.m, fdc.this.I.d(), fdc.this.I.c(), 36);
      }

      public void a(fbk $$0) {
         this.b(fdc.this.new b($$0));
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

   class b extends fia.a<fdc.b> {
      private static final int b = 2;
      private final fbk c;
      @Nullable
      private fhu d;
      @Nullable
      private fhu e;
      private final List<fhs> f = new ArrayList<>();

      public b(final fbk $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fhu.a(fdc.A, $$0x -> fdc.this.l.a(new fdb(fdc.this, this.c)))
               .a(8 + fdc.this.o.a(fdc.A))
               .a($$0x -> wt.a(wu.a("mco.backup.narration", this.c()), (wu)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fdc.this.L.j) {
            this.d = fhu.a(fdc.c, $$0x -> this.d()).a(8 + fdc.this.o.a(fdc.A)).a($$0x -> wt.a(wu.a("mco.backup.narration", this.c()), (wu)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fbk $$0) {
         int $$1 = fdc.this.G.indexOf($$0);
         if ($$1 != fdc.this.G.size() - 1) {
            fbk $$2 = fdc.this.G.get($$1 + 1);

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
         wu $$0 = fel.a(this.c.b);
         wu $$1 = wu.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fdc.this.l.a(fdr.b(fdc.this, $$1, $$0x -> fdc.this.l.a(new fdl(fdc.this.F.g(), new ffb(this.c, fdc.this.L.a, fdc.this.F)))));
      }

      @Override
      public List<? extends fjq> aG_() {
         return this.f;
      }

      @Override
      public List<? extends flo> b() {
         return this.f;
      }

      @Override
      public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fdc.this.o, wu.a("mco.backup.entry", fel.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fdc.this.o, this.a(this.c.b), $$3, $$12, 5000268, false);
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

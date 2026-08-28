import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmg extends hpj {
   static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("mco.configure.world.backup");
   static final wy c = wy.c("mco.backup.button.restore");
   static final wy C = wy.c("mco.backup.changes.tooltip");
   private static final wy D = wy.c("mco.backup.nobackups");
   private static final wy E = wy.c("mco.backup.button.download");
   private static final String F = "uploaded";
   private static final int G = 8;
   final fmj H;
   List<fkp> I = Collections.emptyList();
   @Nullable
   fmg.a J;
   final fvx K = new fvx(this);
   private final int L;
   @Nullable
   fsj M;
   final fla N;
   boolean O = false;

   public fmg(fmj $$0, fla $$1, int $$2) {
      super(b);
      this.H = $$0;
      this.N = $$1;
      this.L = $$2;
   }

   @Override
   public void aO_() {
      this.K.a(b, this.p);
      this.J = this.K.c(new fmg.a());
      fwb $$0 = this.K.b(fwb.e().a(8));
      this.M = $$0.a(fsj.a(E, $$0x -> this.F()).a());
      this.M.j = false;
      $$0.a(fsj.a(wx.k, $$0x -> this.aL_()).a());
      this.K.a($$1 -> {
         fsh var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(frv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.O && this.J != null) {
         $$0.b(this.p, D, this.n / 2 - this.p.a(D) / 2, this.J.G() + this.J.y() / 2 - 9 / 2, -1);
      }
   }

   @Override
   protected void c() {
      this.K.a();
      if (this.J != null) {
         this.J.a(this.n, this.K);
      }
   }

   private void E() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            fjz $$0 = fjz.a();

            try {
               List<fkp> $$1 = $$0.e(fmg.this.N.a).a;
               fmg.this.m.execute(() -> {
                  fmg.this.I = $$1;
                  fmg.this.O = fmg.this.I.isEmpty();
                  if (!fmg.this.O && fmg.this.M != null) {
                     fmg.this.M.j = true;
                  }

                  if (fmg.this.J != null) {
                     fmg.this.J.a(fmg.this.I.stream().map($$0xx -> fmg.this.new b($$0xx)).toList());
                  }
               });
            } catch (flv var3) {
               fmg.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void aL_() {
      this.m.a(this.H);
   }

   private void F() {
      this.m
         .a(
            fmv.a(
               this,
               wy.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m
                     .a(
                        new fmp(
                           this.H.g(),
                           new fnu(this.N.a, this.L, Objects.requireNonNullElse(this.N.c, "") + " (" + this.N.i.get(this.N.p).a(this.N.p) + ")", this)
                        )
                     )
            )
         );
   }

   class a extends fsp<fmg.b> {
      private static final int a = 36;

      public a() {
         super(foz.Q(), fmg.this.n, fmg.this.K.d(), fmg.this.K.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends fsp.a<fmg.b> {
      private static final int b = 2;
      private final fkp c;
      @Nullable
      private fsj d;
      @Nullable
      private fsj e;
      private final List<fsh> f = new ArrayList<>();

      public b(final fkp $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fsj.a(fmg.C, $$0x -> fmg.this.m.a(new fmf(fmg.this, this.c)))
               .a(8 + fmg.this.p.a(fmg.C))
               .a($$0x -> wx.a(wy.a("mco.backup.narration", this.c()), (wy)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fmg.this.N.j) {
            this.d = fsj.a(fmg.c, $$0x -> this.g()).a(8 + fmg.this.p.a(fmg.C)).a($$0x -> wx.a(wy.a("mco.backup.narration", this.c()), (wy)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fkp $$0) {
         int $$1 = fmg.this.I.indexOf($$0);
         if ($$1 != fmg.this.I.size() - 1) {
            fkp $$2 = fmg.this.I.get($$1 + 1);

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

      private void g() {
         wy $$0 = fno.a(this.c.b);
         wy $$1 = wy.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fmg.this.m.a(fmv.b(fmg.this, $$1, $$0x -> fmg.this.m.a(new fmp(fmg.this.H.g(), new fob(this.c, fmg.this.N.a, fmg.this.H)))));
      }

      @Override
      public List<? extends fug> aE_() {
         return this.f;
      }

      @Override
      public List<? extends fwe> b() {
         return this.f;
      }

      @Override
      public void a(frv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.b(fmg.this.p, wy.a("mco.backup.entry", fno.a(this.c.b)), $$3, $$11, $$13);
         $$0.b(fmg.this.p, this.a(this.c.b), $$3, $$12, 5000268);
         int $$14 = 0;
         int $$15 = $$2 + $$5 / 2 - 10;
         if (this.d != null) {
            $$14 += this.d.A() + 8;
            this.d.j($$3 + $$4 - $$14);
            this.d.k($$15);
            this.d.a($$0, $$6, $$7, $$9);
         }

         if (this.e != null) {
            $$14 += this.e.A() + 8;
            this.e.j($$3 + $$4 - $$14);
            this.e.k($$15);
            this.e.a($$0, $$6, $$7, $$9);
         }
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }
   }
}

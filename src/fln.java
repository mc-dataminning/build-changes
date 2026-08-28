import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fln extends hol {
   static final Logger a = LogUtils.getLogger();
   private static final ww b = ww.c("mco.configure.world.backup");
   static final ww c = ww.c("mco.backup.button.restore");
   static final ww C = ww.c("mco.backup.changes.tooltip");
   private static final ww D = ww.c("mco.backup.nobackups");
   private static final ww E = ww.c("mco.backup.button.download");
   private static final String F = "uploaded";
   private static final int G = 8;
   final flq H;
   List<fjw> I = Collections.emptyList();
   @Nullable
   fln.a J;
   final fve K = new fve(this);
   private final int L;
   @Nullable
   frq M;
   final fkh N;
   boolean O = false;

   public fln(flq $$0, fkh $$1, int $$2) {
      super(b);
      this.H = $$0;
      this.N = $$1;
      this.L = $$2;
   }

   @Override
   public void aN_() {
      this.K.a(b, this.p);
      this.J = this.K.c(new fln.a());
      fvi $$0 = this.K.b(fvi.e().a(8));
      this.M = $$0.a(frq.a(E, $$0x -> this.F()).a());
      this.M.j = false;
      $$0.a(frq.a(wv.k, $$0x -> this.aK_()).a());
      this.K.a($$1 -> {
         fro var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
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
            fjg $$0 = fjg.a();

            try {
               List<fjw> $$1 = $$0.e(fln.this.N.a).a;
               fln.this.m.execute(() -> {
                  fln.this.I = $$1;
                  fln.this.O = fln.this.I.isEmpty();
                  if (!fln.this.O && fln.this.M != null) {
                     fln.this.M.j = true;
                  }

                  if (fln.this.J != null) {
                     fln.this.J.a(fln.this.I.stream().map($$0xx -> fln.this.new b($$0xx)).toList());
                  }
               });
            } catch (flc var3) {
               fln.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void aK_() {
      this.m.a(this.H);
   }

   private void F() {
      this.m
         .a(
            fmc.a(
               this,
               ww.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m
                     .a(
                        new flw(
                           this.H.g(),
                           new fnb(this.N.a, this.L, Objects.requireNonNullElse(this.N.c, "") + " (" + this.N.i.get(this.N.p).a(this.N.p) + ")", this)
                        )
                     )
            )
         );
   }

   class a extends frw<fln.b> {
      private static final int a = 36;

      public a() {
         super(fof.Q(), fln.this.n, fln.this.K.d(), fln.this.K.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends frw.a<fln.b> {
      private static final int b = 2;
      private final fjw c;
      @Nullable
      private frq d;
      @Nullable
      private frq e;
      private final List<fro> f = new ArrayList<>();

      public b(final fjw $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = frq.a(fln.C, $$0x -> fln.this.m.a(new flm(fln.this, this.c)))
               .a(8 + fln.this.p.a(fln.C))
               .a($$0x -> wv.a(ww.a("mco.backup.narration", this.c()), (ww)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fln.this.N.j) {
            this.d = frq.a(fln.c, $$0x -> this.g()).a(8 + fln.this.p.a(fln.C)).a($$0x -> wv.a(ww.a("mco.backup.narration", this.c()), (ww)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fjw $$0) {
         int $$1 = fln.this.I.indexOf($$0);
         if ($$1 != fln.this.I.size() - 1) {
            fjw $$2 = fln.this.I.get($$1 + 1);

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
         ww $$0 = fmv.a(this.c.b);
         ww $$1 = ww.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fln.this.m.a(fmc.b(fln.this, $$1, $$0x -> fln.this.m.a(new flw(fln.this.H.g(), new fni(this.c, fln.this.N.a, fln.this.H)))));
      }

      @Override
      public List<? extends ftn> aD_() {
         return this.f;
      }

      @Override
      public List<? extends fvl> b() {
         return this.f;
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.b(fln.this.p, ww.a("mco.backup.entry", fmv.a(this.c.b)), $$3, $$11, $$13);
         $$0.b(fln.this.p, this.a(this.c.b), $$3, $$12, 5000268);
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

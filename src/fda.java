import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fda extends gvs {
   static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("mco.configure.world.backup");
   static final wu c = wu.c("mco.backup.button.restore");
   static final wu A = wu.c("mco.backup.changes.tooltip");
   private static final wu B = wu.c("mco.backup.nobackups");
   private static final wu C = wu.c("mco.backup.button.download");
   private static final String D = "uploaded";
   private static final int E = 8;
   final fdd F;
   List<fbi> G = Collections.emptyList();
   @Nullable
   fda.a H;
   final flf I = new flf(this);
   private final int J;
   @Nullable
   fhs K;
   final fbt L;
   boolean M = false;

   public fda(fdd $$0, fbt $$1, int $$2) {
      super(b);
      this.F = $$0;
      this.L = $$1;
      this.J = $$2;
   }

   @Override
   public void aP_() {
      this.I.a(b, this.o);
      this.H = this.I.c(new fda.a());
      flj $$0 = this.I.b(flj.e().a(8));
      this.K = $$0.a(fhs.a(C, $$0x -> this.F()).a());
      this.K.j = false;
      $$0.a(fhs.a(wt.k, $$0x -> this.d()).a());
      this.I.a($$1 -> {
         fhq var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
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

   private void E() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            fbc $$0 = fbc.a();

            try {
               List<fbi> $$1 = $$0.e(fda.this.L.a).a;
               fda.this.l.execute(() -> {
                  fda.this.G = $$1;
                  fda.this.M = fda.this.G.isEmpty();
                  if (!fda.this.M && fda.this.K != null) {
                     fda.this.K.j = true;
                  }

                  if (fda.this.H != null) {
                     fda.this.H.aG_().clear();

                     for (fbi $$1x : fda.this.G) {
                        fda.this.H.a($$1x);
                     }
                  }
               });
            } catch (fcp var3) {
               fda.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void d() {
      this.l.a(this.F);
   }

   private void F() {
      this.l
         .a(
            fdp.a(
               this,
               wu.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.l.a(new fdj(this.F.g(), new fer(this.L.a, this.J, this.L.c + " (" + this.L.i.get(this.L.n).a(this.L.n) + ")", this)))
            )
         );
   }

   class a extends fhy<fda.b> {
      private static final int m = 36;

      public a() {
         super(fft.Q(), fda.this.m, fda.this.I.d(), fda.this.I.c(), 36);
      }

      public void a(fbi $$0) {
         this.b(fda.this.new b($$0));
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

   class b extends fhy.a<fda.b> {
      private static final int b = 2;
      private final fbi c;
      @Nullable
      private fhs d;
      @Nullable
      private fhs e;
      private final List<fhq> f = new ArrayList<>();

      public b(final fbi $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fhs.a(fda.A, $$0x -> fda.this.l.a(new fcz(fda.this, this.c)))
               .a(8 + fda.this.o.a(fda.A))
               .a($$0x -> wt.a(wu.a("mco.backup.narration", this.c()), (wu)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fda.this.L.j) {
            this.d = fhs.a(fda.c, $$0x -> this.d()).a(8 + fda.this.o.a(fda.A)).a($$0x -> wt.a(wu.a("mco.backup.narration", this.c()), (wu)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fbi $$0) {
         int $$1 = fda.this.G.indexOf($$0);
         if ($$1 != fda.this.G.size() - 1) {
            fbi $$2 = fda.this.G.get($$1 + 1);

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
         wu $$0 = fej.a(this.c.b);
         wu $$1 = wu.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fda.this.l.a(fdp.b(fda.this, $$1, $$0x -> fda.this.l.a(new fdj(fda.this.F.g(), new fez(this.c, fda.this.L.a, fda.this.F)))));
      }

      @Override
      public List<? extends fjo> aG_() {
         return this.f;
      }

      @Override
      public List<? extends flm> b() {
         return this.f;
      }

      @Override
      public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fda.this.o, wu.a("mco.backup.entry", fej.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fda.this.o, this.a(this.c.b), $$3, $$12, 5000268, false);
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

import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fis extends hlf {
   static final Logger a = LogUtils.getLogger();
   private static final wp b = wp.c("mco.configure.world.backup");
   static final wp c = wp.c("mco.backup.button.restore");
   static final wp C = wp.c("mco.backup.changes.tooltip");
   private static final wp D = wp.c("mco.backup.nobackups");
   private static final wp E = wp.c("mco.backup.button.download");
   private static final String F = "uploaded";
   private static final int G = 8;
   final fiv H;
   List<fhb> I = Collections.emptyList();
   @Nullable
   fis.a J;
   final fsi K = new fsi(this);
   private final int L;
   @Nullable
   fou M;
   final fhm N;
   boolean O = false;

   public fis(fiv $$0, fhm $$1, int $$2) {
      super(b);
      this.H = $$0;
      this.N = $$1;
      this.L = $$2;
   }

   @Override
   public void aR_() {
      this.K.a(b, this.p);
      this.J = this.K.c(new fis.a());
      fsm $$0 = this.K.b(fsm.e().a(8));
      this.M = $$0.a(fou.a(E, $$0x -> this.F()).a());
      this.M.j = false;
      $$0.a(fou.a(wo.k, $$0x -> this.aO_()).a());
      this.K.a($$1 -> {
         fos var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(fof $$0, int $$1, int $$2, float $$3) {
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
            fgl $$0 = fgl.a();

            try {
               List<fhb> $$1 = $$0.e(fis.this.N.a).a;
               fis.this.m.execute(() -> {
                  fis.this.I = $$1;
                  fis.this.O = fis.this.I.isEmpty();
                  if (!fis.this.O && fis.this.M != null) {
                     fis.this.M.j = true;
                  }

                  if (fis.this.J != null) {
                     fis.this.J.a(fis.this.I.stream().map($$0xx -> fis.this.new b($$0xx)).toList());
                  }
               });
            } catch (fih var3) {
               fis.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void aO_() {
      this.m.a(this.H);
   }

   private void F() {
      this.m
         .a(
            fjh.a(
               this,
               wp.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m
                     .a(
                        new fjb(
                           this.H.g(),
                           new fkg(this.N.a, this.L, Objects.requireNonNullElse(this.N.c, "") + " (" + this.N.i.get(this.N.p).a(this.N.p) + ")", this)
                        )
                     )
            )
         );
   }

   class a extends fpa<fis.b> {
      private static final int a = 36;

      public a() {
         super(flk.Q(), fis.this.n, fis.this.K.d(), fis.this.K.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends fpa.a<fis.b> {
      private static final int b = 2;
      private final fhb c;
      @Nullable
      private fou d;
      @Nullable
      private fou e;
      private final List<fos> f = new ArrayList<>();

      public b(final fhb $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fou.a(fis.C, $$0x -> fis.this.m.a(new fir(fis.this, this.c)))
               .a(8 + fis.this.p.a(fis.C))
               .a($$0x -> wo.a(wp.a("mco.backup.narration", this.c()), (wp)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fis.this.N.j) {
            this.d = fou.a(fis.c, $$0x -> this.g()).a(8 + fis.this.p.a(fis.C)).a($$0x -> wo.a(wp.a("mco.backup.narration", this.c()), (wp)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fhb $$0) {
         int $$1 = fis.this.I.indexOf($$0);
         if ($$1 != fis.this.I.size() - 1) {
            fhb $$2 = fis.this.I.get($$1 + 1);

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
         wp $$0 = fka.a(this.c.b);
         wp $$1 = wp.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fis.this.m.a(fjh.b(fis.this, $$1, $$0x -> fis.this.m.a(new fjb(fis.this.H.g(), new fkn(this.c, fis.this.N.a, fis.this.H)))));
      }

      @Override
      public List<? extends fqr> aH_() {
         return this.f;
      }

      @Override
      public List<? extends fsp> b() {
         return this.f;
      }

      @Override
      public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.b(fis.this.p, wp.a("mco.backup.entry", fka.a(this.c.b)), $$3, $$11, $$13);
         $$0.b(fis.this.p, this.a(this.c.b), $$3, $$12, 5000268);
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

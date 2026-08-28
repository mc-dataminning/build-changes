import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fiq extends hld {
   static final Logger a = LogUtils.getLogger();
   private static final wp b = wp.c("mco.configure.world.backup");
   static final wp c = wp.c("mco.backup.button.restore");
   static final wp C = wp.c("mco.backup.changes.tooltip");
   private static final wp D = wp.c("mco.backup.nobackups");
   private static final wp E = wp.c("mco.backup.button.download");
   private static final String F = "uploaded";
   private static final int G = 8;
   final fit H;
   List<fgz> I = Collections.emptyList();
   @Nullable
   fiq.a J;
   final fsg K = new fsg(this);
   private final int L;
   @Nullable
   fos M;
   final fhk N;
   boolean O = false;

   public fiq(fit $$0, fhk $$1, int $$2) {
      super(b);
      this.H = $$0;
      this.N = $$1;
      this.L = $$2;
   }

   @Override
   public void aR_() {
      this.K.a(b, this.p);
      this.J = this.K.c(new fiq.a());
      fsk $$0 = this.K.b(fsk.e().a(8));
      this.M = $$0.a(fos.a(E, $$0x -> this.F()).a());
      this.M.j = false;
      $$0.a(fos.a(wo.k, $$0x -> this.aO_()).a());
      this.K.a($$1 -> {
         fop var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(fod $$0, int $$1, int $$2, float $$3) {
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
            fgj $$0 = fgj.a();

            try {
               List<fgz> $$1 = $$0.e(fiq.this.N.a).a;
               fiq.this.m.execute(() -> {
                  fiq.this.I = $$1;
                  fiq.this.O = fiq.this.I.isEmpty();
                  if (!fiq.this.O && fiq.this.M != null) {
                     fiq.this.M.j = true;
                  }

                  if (fiq.this.J != null) {
                     fiq.this.J.a(fiq.this.I.stream().map($$0xx -> fiq.this.new b($$0xx)).toList());
                  }
               });
            } catch (fif var3) {
               fiq.a.error("Couldn't request backups", var3);
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
            fjf.a(
               this,
               wp.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m
                     .a(
                        new fiz(
                           this.H.g(),
                           new fke(this.N.a, this.L, Objects.requireNonNullElse(this.N.c, "") + " (" + this.N.i.get(this.N.p).a(this.N.p) + ")", this)
                        )
                     )
            )
         );
   }

   class a extends foy<fiq.b> {
      private static final int a = 36;

      public a() {
         super(fli.Q(), fiq.this.n, fiq.this.K.d(), fiq.this.K.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends foy.a<fiq.b> {
      private static final int b = 2;
      private final fgz c;
      @Nullable
      private fos d;
      @Nullable
      private fos e;
      private final List<fop> f = new ArrayList<>();

      public b(final fgz $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fos.a(fiq.C, $$0x -> fiq.this.m.a(new fip(fiq.this, this.c)))
               .a(8 + fiq.this.p.a(fiq.C))
               .a($$0x -> wo.a(wp.a("mco.backup.narration", this.c()), (wp)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fiq.this.N.j) {
            this.d = fos.a(fiq.c, $$0x -> this.g()).a(8 + fiq.this.p.a(fiq.C)).a($$0x -> wo.a(wp.a("mco.backup.narration", this.c()), (wp)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fgz $$0) {
         int $$1 = fiq.this.I.indexOf($$0);
         if ($$1 != fiq.this.I.size() - 1) {
            fgz $$2 = fiq.this.I.get($$1 + 1);

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
         wp $$0 = fjy.a(this.c.b);
         wp $$1 = wp.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fiq.this.m.a(fjf.b(fiq.this, $$1, $$0x -> fiq.this.m.a(new fiz(fiq.this.H.g(), new fkl(this.c, fiq.this.N.a, fiq.this.H)))));
      }

      @Override
      public List<? extends fqp> aH_() {
         return this.f;
      }

      @Override
      public List<? extends fsn> b() {
         return this.f;
      }

      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.b(fiq.this.p, wp.a("mco.backup.entry", fjy.a(this.c.b)), $$3, $$11, $$13);
         $$0.b(fiq.this.p, this.a(this.c.b), $$3, $$12, 5000268);
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

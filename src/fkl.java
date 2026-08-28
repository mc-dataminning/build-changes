import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkl extends hne {
   static final Logger a = LogUtils.getLogger();
   private static final wv b = wv.c("mco.configure.world.backup");
   static final wv c = wv.c("mco.backup.button.restore");
   static final wv C = wv.c("mco.backup.changes.tooltip");
   private static final wv D = wv.c("mco.backup.nobackups");
   private static final wv E = wv.c("mco.backup.button.download");
   private static final String F = "uploaded";
   private static final int G = 8;
   final fko H;
   List<fiu> I = Collections.emptyList();
   @Nullable
   fkl.a J;
   final fub K = new fub(this);
   private final int L;
   @Nullable
   fqn M;
   final fjf N;
   boolean O = false;

   public fkl(fko $$0, fjf $$1, int $$2) {
      super(b);
      this.H = $$0;
      this.N = $$1;
      this.L = $$2;
   }

   @Override
   public void aN_() {
      this.K.a(b, this.p);
      this.J = this.K.c(new fkl.a());
      fuf $$0 = this.K.b(fuf.e().a(8));
      this.M = $$0.a(fqn.a(E, $$0x -> this.F()).a());
      this.M.j = false;
      $$0.a(fqn.a(wu.k, $$0x -> this.aK_()).a());
      this.K.a($$1 -> {
         fql var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
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
            fie $$0 = fie.a();

            try {
               List<fiu> $$1 = $$0.e(fkl.this.N.a).a;
               fkl.this.m.execute(() -> {
                  fkl.this.I = $$1;
                  fkl.this.O = fkl.this.I.isEmpty();
                  if (!fkl.this.O && fkl.this.M != null) {
                     fkl.this.M.j = true;
                  }

                  if (fkl.this.J != null) {
                     fkl.this.J.a(fkl.this.I.stream().map($$0xx -> fkl.this.new b($$0xx)).toList());
                  }
               });
            } catch (fka var3) {
               fkl.a.error("Couldn't request backups", var3);
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
            fla.a(
               this,
               wv.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m
                     .a(
                        new fku(
                           this.H.g(),
                           new flz(this.N.a, this.L, Objects.requireNonNullElse(this.N.c, "") + " (" + this.N.i.get(this.N.p).a(this.N.p) + ")", this)
                        )
                     )
            )
         );
   }

   class a extends fqt<fkl.b> {
      private static final int a = 36;

      public a() {
         super(fnd.Q(), fkl.this.n, fkl.this.K.d(), fkl.this.K.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends fqt.a<fkl.b> {
      private static final int b = 2;
      private final fiu c;
      @Nullable
      private fqn d;
      @Nullable
      private fqn e;
      private final List<fql> f = new ArrayList<>();

      public b(final fiu $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fqn.a(fkl.C, $$0x -> fkl.this.m.a(new fkk(fkl.this, this.c)))
               .a(8 + fkl.this.p.a(fkl.C))
               .a($$0x -> wu.a(wv.a("mco.backup.narration", this.c()), (wv)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fkl.this.N.j) {
            this.d = fqn.a(fkl.c, $$0x -> this.g()).a(8 + fkl.this.p.a(fkl.C)).a($$0x -> wu.a(wv.a("mco.backup.narration", this.c()), (wv)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fiu $$0) {
         int $$1 = fkl.this.I.indexOf($$0);
         if ($$1 != fkl.this.I.size() - 1) {
            fiu $$2 = fkl.this.I.get($$1 + 1);

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
         wv $$0 = flt.a(this.c.b);
         wv $$1 = wv.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fkl.this.m.a(fla.b(fkl.this, $$1, $$0x -> fkl.this.m.a(new fku(fkl.this.H.g(), new fmg(this.c, fkl.this.N.a, fkl.this.H)))));
      }

      @Override
      public List<? extends fsk> aD_() {
         return this.f;
      }

      @Override
      public List<? extends fui> b() {
         return this.f;
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.b(fkl.this.p, wv.a("mco.backup.entry", flt.a(this.c.b)), $$3, $$11, $$13);
         $$0.b(fkl.this.p, this.a(this.c.b), $$3, $$12, 5000268);
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

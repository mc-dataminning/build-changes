import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fok extends hrm {
   static final Logger a = LogUtils.getLogger();
   private static final xa b = xa.c("mco.configure.world.backup");
   static final xa c = xa.c("mco.backup.button.restore");
   static final xa C = xa.c("mco.backup.changes.tooltip");
   private static final xa D = xa.c("mco.backup.nobackups");
   private static final xa E = xa.c("mco.backup.button.download");
   private static final String F = "uploaded";
   private static final int G = 8;
   final fon H;
   List<fmt> I = Collections.emptyList();
   @Nullable
   fok.a J;
   final fxz K = new fxz(this);
   private final int L;
   @Nullable
   ful M;
   final fne N;
   boolean O = false;

   public fok(fon $$0, fne $$1, int $$2) {
      super(b);
      this.H = $$0;
      this.N = $$1;
      this.L = $$2;
   }

   @Override
   public void aS_() {
      this.K.a(b, this.p);
      this.J = this.K.c(new fok.a());
      fyd $$0 = this.K.b(fyd.e().a(8));
      this.M = $$0.a(ful.a(E, $$0x -> this.F()).a());
      this.M.j = false;
      $$0.a(ful.a(wz.k, $$0x -> this.aP_()).a());
      this.K.a($$1 -> {
         fuj var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
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
            fmd $$0 = fmd.a();

            try {
               List<fmt> $$1 = $$0.e(fok.this.N.a).a;
               fok.this.m.execute(() -> {
                  fok.this.I = $$1;
                  fok.this.O = fok.this.I.isEmpty();
                  if (!fok.this.O && fok.this.M != null) {
                     fok.this.M.j = true;
                  }

                  if (fok.this.J != null) {
                     fok.this.J.a(fok.this.I.stream().map($$0xx -> fok.this.new b($$0xx)).toList());
                  }
               });
            } catch (fnz var3) {
               fok.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void aP_() {
      this.m.a(this.H);
   }

   private void F() {
      this.m
         .a(
            fpa.a(
               this,
               xa.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m
                     .a(
                        new fou(
                           this.H.g(),
                           new fpz(this.N.a, this.L, Objects.requireNonNullElse(this.N.c, "") + " (" + this.N.i.get(this.N.p).a(this.N.p) + ")", this)
                        )
                     )
            )
         );
   }

   class a extends fur<fok.b> {
      private static final int a = 36;

      public a() {
         super(frd.Q(), fok.this.n, fok.this.K.d(), fok.this.K.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends fur.a<fok.b> {
      private static final int b = 2;
      private final fmt c;
      @Nullable
      private ful d;
      @Nullable
      private ful e;
      private final List<fuj> f = new ArrayList<>();

      public b(final fmt $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = ful.a(fok.C, $$0x -> fok.this.m.a(new foj(fok.this, this.c)))
               .a(8 + fok.this.p.a(fok.C))
               .a($$0x -> wz.a(xa.a("mco.backup.narration", this.c()), (xa)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fok.this.N.j) {
            this.d = ful.a(fok.c, $$0x -> this.g()).a(8 + fok.this.p.a(fok.C)).a($$0x -> wz.a(xa.a("mco.backup.narration", this.c()), (xa)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fmt $$0) {
         int $$1 = fok.this.I.indexOf($$0);
         if ($$1 != fok.this.I.size() - 1) {
            fmt $$2 = fok.this.I.get($$1 + 1);

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
         xa $$0 = fpt.a(this.c.b);
         xa $$1 = xa.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fok.this.m.a(fpa.b(fok.this, $$1, $$0x -> fok.this.m.a(new fou(fok.this.H.g(), new fqg(this.c, fok.this.N.a, fok.this.H)))));
      }

      @Override
      public List<? extends fwi> aI_() {
         return this.f;
      }

      @Override
      public List<? extends fyg> b() {
         return this.f;
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.b(fok.this.p, xa.a("mco.backup.entry", fpt.a(this.c.b)), $$3, $$11, $$13);
         $$0.b(fok.this.p, this.a(this.c.b), $$3, $$12, 5000268);
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

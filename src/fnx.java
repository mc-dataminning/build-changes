import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnx extends hrc {
   static final Logger a = LogUtils.getLogger();
   private static final xg b = xg.c("mco.configure.world.backup");
   static final xg c = xg.c("mco.backup.button.restore");
   static final xg C = xg.c("mco.backup.changes.tooltip");
   private static final xg D = xg.c("mco.backup.nobackups");
   private static final xg E = xg.c("mco.backup.button.download");
   private static final String F = "uploaded";
   private static final int G = 8;
   final foa H;
   List<fmg> I = Collections.emptyList();
   @Nullable
   fnx.a J;
   final fxm K = new fxm(this);
   private final int L;
   @Nullable
   fty M;
   final fmr N;
   boolean O = false;

   public fnx(foa $$0, fmr $$1, int $$2) {
      super(b);
      this.H = $$0;
      this.N = $$1;
      this.L = $$2;
   }

   @Override
   public void aO_() {
      this.K.a(b, this.p);
      this.J = this.K.c(new fnx.a());
      fxq $$0 = this.K.b(fxq.e().a(8));
      this.M = $$0.a(fty.a(E, $$0x -> this.F()).a());
      this.M.j = false;
      $$0.a(fty.a(xf.k, $$0x -> this.aL_()).a());
      this.K.a($$1 -> {
         ftw var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
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
            flq $$0 = flq.a();

            try {
               List<fmg> $$1 = $$0.e(fnx.this.N.a).a;
               fnx.this.m.execute(() -> {
                  fnx.this.I = $$1;
                  fnx.this.O = fnx.this.I.isEmpty();
                  if (!fnx.this.O && fnx.this.M != null) {
                     fnx.this.M.j = true;
                  }

                  if (fnx.this.J != null) {
                     fnx.this.J.a(fnx.this.I.stream().map($$0xx -> fnx.this.new b($$0xx)).toList());
                  }
               });
            } catch (fnm var3) {
               fnx.a.error("Couldn't request backups", var3);
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
            fom.a(
               this,
               xg.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m
                     .a(
                        new fog(
                           this.H.g(),
                           new fpm(this.N.a, this.L, Objects.requireNonNullElse(this.N.c, "") + " (" + this.N.i.get(this.N.p).a(this.N.p) + ")", this)
                        )
                     )
            )
         );
   }

   class a extends fue<fnx.b> {
      private static final int a = 36;

      public a() {
         super(fqq.Q(), fnx.this.n, fnx.this.K.d(), fnx.this.K.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends fue.a<fnx.b> {
      private static final int b = 2;
      private final fmg c;
      @Nullable
      private fty d;
      @Nullable
      private fty e;
      private final List<ftw> f = new ArrayList<>();

      public b(final fmg $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fty.a(fnx.C, $$0x -> fnx.this.m.a(new fnw(fnx.this, this.c)))
               .a(8 + fnx.this.p.a(fnx.C))
               .a($$0x -> xf.a(xg.a("mco.backup.narration", this.c()), (xg)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fnx.this.N.j) {
            this.d = fty.a(fnx.c, $$0x -> this.g()).a(8 + fnx.this.p.a(fnx.C)).a($$0x -> xf.a(xg.a("mco.backup.narration", this.c()), (xg)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fmg $$0) {
         int $$1 = fnx.this.I.indexOf($$0);
         if ($$1 != fnx.this.I.size() - 1) {
            fmg $$2 = fnx.this.I.get($$1 + 1);

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
         xg $$0 = fpg.a(this.c.b);
         xg $$1 = xg.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fnx.this.m.a(fom.b(fnx.this, $$1, $$0x -> fnx.this.m.a(new fog(fnx.this.H.g(), new fpt(this.c, fnx.this.N.a, fnx.this.H)))));
      }

      @Override
      public List<? extends fvv> aE_() {
         return this.f;
      }

      @Override
      public List<? extends fxt> b() {
         return this.f;
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.b(fnx.this.p, xg.a("mco.backup.entry", fpg.a(this.c.b)), $$3, $$11, $$13);
         $$0.b(fnx.this.p, this.a(this.c.b), $$3, $$12, 5000268);
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

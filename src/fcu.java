import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcu extends gvm {
   static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("mco.configure.world.backup");
   static final wu c = wu.c("mco.backup.button.restore");
   static final wu A = wu.c("mco.backup.changes.tooltip");
   private static final wu B = wu.c("mco.backup.nobackups");
   private static final wu C = wu.c("mco.backup.button.download");
   private static final String D = "uploaded";
   private static final int E = 8;
   final fcx F;
   List<fbc> G = Collections.emptyList();
   @Nullable
   fcu.a H;
   final fkz I = new fkz(this);
   private final int J;
   @Nullable
   fhm K;
   final fbn L;
   boolean M = false;

   public fcu(fcx $$0, fbn $$1, int $$2) {
      super(b);
      this.F = $$0;
      this.L = $$1;
      this.J = $$2;
   }

   @Override
   public void aO_() {
      this.I.a(b, this.o);
      this.H = this.I.c(new fcu.a());
      fld $$0 = this.I.b(fld.e().a(8));
      this.K = $$0.a(fhm.a(C, $$0x -> this.F()).a());
      this.K.j = false;
      $$0.a(fhm.a(wt.k, $$0x -> this.d()).a());
      this.I.a($$1 -> {
         fhk var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
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
            faw $$0 = faw.a();

            try {
               List<fbc> $$1 = $$0.e(fcu.this.L.a).a;
               fcu.this.l.execute(() -> {
                  fcu.this.G = $$1;
                  fcu.this.M = fcu.this.G.isEmpty();
                  if (!fcu.this.M && fcu.this.K != null) {
                     fcu.this.K.j = true;
                  }

                  if (fcu.this.H != null) {
                     fcu.this.H.aF_().clear();

                     for (fbc $$1x : fcu.this.G) {
                        fcu.this.H.a($$1x);
                     }
                  }
               });
            } catch (fcj var3) {
               fcu.a.error("Couldn't request backups", var3);
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
            fdj.a(
               this,
               wu.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.l.a(new fdd(this.F.g(), new fel(this.L.a, this.J, this.L.c + " (" + this.L.i.get(this.L.n).a(this.L.n) + ")", this)))
            )
         );
   }

   class a extends fhs<fcu.b> {
      private static final int m = 36;

      public a() {
         super(ffn.Q(), fcu.this.m, fcu.this.I.d(), fcu.this.I.c(), 36);
      }

      public void a(fbc $$0) {
         this.b(fcu.this.new b($$0));
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

   class b extends fhs.a<fcu.b> {
      private static final int b = 2;
      private final fbc c;
      @Nullable
      private fhm d;
      @Nullable
      private fhm e;
      private final List<fhk> f = new ArrayList<>();

      public b(final fbc $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fhm.a(fcu.A, $$0x -> fcu.this.l.a(new fct(fcu.this, this.c)))
               .a(8 + fcu.this.o.a(fcu.A))
               .a($$0x -> wt.a(wu.a("mco.backup.narration", this.c()), (wu)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fcu.this.L.j) {
            this.d = fhm.a(fcu.c, $$0x -> this.d()).a(8 + fcu.this.o.a(fcu.A)).a($$0x -> wt.a(wu.a("mco.backup.narration", this.c()), (wu)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fbc $$0) {
         int $$1 = fcu.this.G.indexOf($$0);
         if ($$1 != fcu.this.G.size() - 1) {
            fbc $$2 = fcu.this.G.get($$1 + 1);

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
         wu $$0 = fed.a(this.c.b);
         wu $$1 = wu.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fcu.this.l.a(fdj.b(fcu.this, $$1, $$0x -> fcu.this.l.a(new fdd(fcu.this.F.g(), new fet(this.c, fcu.this.L.a, fcu.this.F)))));
      }

      @Override
      public List<? extends fji> aF_() {
         return this.f;
      }

      @Override
      public List<? extends flg> b() {
         return this.f;
      }

      @Override
      public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fcu.this.o, wu.a("mco.backup.entry", fed.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fcu.this.o, this.a(this.c.b), $$3, $$12, 5000268, false);
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

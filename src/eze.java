import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eze extends gru {
   static final Logger a = LogUtils.getLogger();
   private static final wi b = wi.c("mco.configure.world.backup");
   static final wi c = wi.c("mco.backup.button.restore");
   static final wi y = wi.c("mco.backup.changes.tooltip");
   private static final wi z = wi.c("mco.backup.nobackups");
   private static final String A = "uploaded";
   private static final int B = 8;
   final ezh C;
   List<exn> D = Collections.emptyList();
   @Nullable
   eze.a E;
   final fhl F = new fhl(this);
   private final int G;
   @Nullable
   fdy H;
   final exy I;
   boolean J = false;

   public eze(ezh $$0, exy $$1, int $$2) {
      super(b);
      this.C = $$0;
      this.I = $$1;
      this.G = $$2;
   }

   @Override
   public void aM_() {
      this.F.a(b, this.m);
      this.E = this.F.c(new eze.a());
      fhp $$0 = this.F.b(fhp.e().a(8));
      this.H = $$0.a(fdy.a(wi.c("mco.backup.button.download"), $$0x -> this.D()).a());
      this.H.j = false;
      $$0.a(fdy.a(wh.k, $$0x -> this.d()).a());
      this.F.a($$1 -> {
         fdw var10000 = this.c($$1);
      });
      this.c();
      this.C();
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.E != null) {
         $$0.a(this.m, z, this.k / 2 - this.m.a(z) / 2, this.E.D() + this.E.v() / 2 - 9 / 2, -1, false);
      }
   }

   @Override
   protected void c() {
      this.F.a();
      if (this.E != null) {
         this.E.a(this.k, this.F);
      }
   }

   private void C() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            exh $$0 = exh.a();

            try {
               List<exn> $$1 = $$0.e(eze.this.I.a).a;
               eze.this.j.execute(() -> {
                  eze.this.D = $$1;
                  eze.this.J = eze.this.D.isEmpty();
                  if (!eze.this.J && eze.this.H != null) {
                     eze.this.H.j = true;
                  }

                  if (eze.this.E != null) {
                     eze.this.E.aE_().clear();

                     for (exn $$1x : eze.this.D) {
                        eze.this.E.a($$1x);
                     }
                  }
               });
            } catch (eyu var3) {
               eze.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void d() {
      this.j.a(this.C);
   }

   private void D() {
      wi $$0 = wi.c("mco.configure.world.restore.download.question.line1");
      wi $$1 = wi.c("mco.configure.world.restore.download.question.line2");
      this.j.a(new ezn($$0x -> {
         if ($$0x) {
            this.j.a(new ezo(this.C.f(), new faw(this.I.a, this.G, this.I.c + " (" + this.I.i.get(this.I.n).a(this.I.n) + ")", this)));
         } else {
            this.j.a(this);
         }
      }, ezn.a.b, $$0, $$1, true));
   }

   class a extends fee<eze.b> {
      private static final int m = 36;

      public a() {
         super(fby.Q(), eze.this.k, eze.this.F.d(), eze.this.F.c(), 36);
      }

      public void a(exn $$0) {
         this.b(eze.this.new b($$0));
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

   class b extends fee.a<eze.b> {
      private static final int b = 2;
      private final exn c;
      @Nullable
      private fdy d;
      @Nullable
      private fdy e;
      private final List<fdw> f = new ArrayList<>();

      public b(exn $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fdy.a(eze.y, $$0x -> eze.this.j.a(new ezd(eze.this, this.c)))
               .a(8 + eze.this.m.a(eze.y))
               .a($$0x -> wh.a(wi.a("mco.backup.narration", this.c()), (wi)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!eze.this.I.j) {
            this.d = fdy.a(eze.c, $$0x -> this.d()).a(8 + eze.this.m.a(eze.y)).a($$0x -> wh.a(wi.a("mco.backup.narration", this.c()), (wi)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(exn $$0) {
         int $$1 = eze.this.D.indexOf($$0);
         if ($$1 != eze.this.D.size() - 1) {
            exn $$2 = eze.this.D.get($$1 + 1);

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
         wi $$0 = fao.a(this.c.b);
         wi $$1 = wi.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         wi $$2 = wi.c("mco.configure.world.restore.question.line2");
         eze.this.j.a(new ezn($$0x -> {
            if ($$0x) {
               eze.this.j.a(new ezo(eze.this.C.f(), new fbe(this.c, eze.this.I.a, eze.this.C)));
            } else {
               eze.this.j.a(eze.this);
            }
         }, ezn.a.a, $$1, $$2, true));
      }

      @Override
      public List<? extends ffu> aE_() {
         return this.f;
      }

      @Override
      public List<? extends fhs> b() {
         return this.f;
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(eze.this.m, wi.a("mco.backup.entry", fao.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(eze.this.m, this.a(this.c.b), $$3, $$12, 5000268, false);
         int $$14 = 0;
         int $$15 = $$2 + $$5 / 2 - 10;
         if (this.d != null) {
            $$14 += this.d.x() + 8;
            this.d.m($$3 + $$4 - $$14);
            this.d.n($$15);
            this.d.a($$0, $$6, $$7, $$9);
         }

         if (this.e != null) {
            $$14 += this.e.x() + 8;
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

import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqo extends ghw {
   static final Logger a = LogUtils.getLogger();
   static final uv b = uv.c("mco.backup.button.restore");
   static final uv c = uv.c("mco.backup.changes.tooltip");
   private static final uv v = uv.c("mco.configure.world.backup");
   private static final uv w = uv.c("mco.backup.nobackups");
   private final eqr x;
   List<eox> y = Collections.emptyList();
   eqo.a z;
   int A = -1;
   private final int B;
   private eve C;
   private eve D;
   private eve E;
   Boolean F = false;
   final epi G;
   private static final String H = "uploaded";

   public eqo(eqr $$0, epi $$1, int $$2) {
      super(v);
      this.x = $$0;
      this.G = $$1;
      this.B = $$2;
   }

   @Override
   public void aQ_() {
      this.z = new eqo.a();
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            eor $$0 = eor.a();

            try {
               List<eox> $$1 = $$0.e(eqo.this.G.a).a;
               eqo.this.f.execute(() -> {
                  eqo.this.y = $$1;
                  eqo.this.F = eqo.this.y.isEmpty();
                  eqo.this.z.v();

                  for (eox $$1x : eqo.this.y) {
                     eqo.this.z.a($$1x);
                  }
               });
            } catch (eqe var3) {
               eqo.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.C = this.d((eve)eve.a(uv.c("mco.backup.button.download"), $$0 -> this.F()).a(this.g - 135, h(1), 120, 20).a());
      this.D = this.d((eve)eve.a(uv.c("mco.backup.button.restore"), $$0 -> this.a(this.A)).a(this.g - 135, h(3), 120, 20).a());
      this.E = this.d((eve)eve.a(uv.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new eqn(this, this.y.get(this.A)));
         this.A = -1;
      }).a(this.g - 135, h(5), 120, 20).a());
      this.d((eve)eve.a(uu.k, $$0 -> this.f.a(this.x)).a(this.g - 100, this.h - 35, 85, 20).a());
      this.e(this.z);
      this.b(this.z);
      this.C();
   }

   @Override
   void C() {
      this.D.j = this.E();
      this.E.j = this.D();
   }

   private boolean D() {
      return this.A == -1 ? false : !this.y.get(this.A).e.isEmpty();
   }

   private boolean E() {
      return this.A == -1 ? false : !this.G.j;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.x);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   void a(int $$0) {
      if ($$0 >= 0 && $$0 < this.y.size() && !this.G.j) {
         this.A = $$0;
         Date $$1 = this.y.get($$0).b;
         String $$2 = DateFormat.getDateTimeInstance(3, 3).format($$1);
         uv $$3 = ery.a($$1);
         uv $$4 = uv.a("mco.configure.world.restore.question.line1", $$2, $$3);
         uv $$5 = uv.c("mco.configure.world.restore.question.line2");
         this.f.a(new eqx($$0x -> {
            if ($$0x) {
               this.H();
            } else {
               this.A = -1;
               this.f.a(this);
            }
         }, eqx.a.a, $$4, $$5, true));
      }
   }

   private void F() {
      uv $$0 = uv.c("mco.configure.world.restore.download.question.line1");
      uv $$1 = uv.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new eqx($$0x -> {
         if ($$0x) {
            this.G();
         } else {
            this.f.a(this);
         }
      }, eqx.a.b, $$0, $$1, true));
   }

   private void G() {
      this.f.a(new eqy(this.x.f(), new esg(this.G.a, this.B, this.G.c + " (" + this.G.i.get(this.G.n).a(this.G.n) + ")", this)));
   }

   private void H() {
      eox $$0 = this.y.get(this.A);
      this.A = -1;
      this.f.a(new eqy(this.x.f(), new esn($$0, this.G.a, this.x)));
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.z.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.F) {
         $$0.a(this.i, w, 20, this.h / 2 - 10, -1, false);
      }

      this.C.i = !this.F;
   }

   class a extends ghv<eqo.b> {
      public a() {
         super(eqo.this.g - 150, eqo.this.h, 32, eqo.this.h - 15, 36);
      }

      public void a(eox $$0) {
         this.a((eqo.b)(eqo.this.new b($$0)));
      }

      @Override
      public int b() {
         return (int)((double)this.e * 0.93);
      }

      @Override
      public int a() {
         return this.k() * 36;
      }

      @Override
      public int c() {
         return this.e - 5;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         this.b($$0);
      }

      public void b(int $$0) {
         eqo.this.A = $$0;
         eqo.this.C();
      }

      public void a(@Nullable eqo.b $$0) {
         super.a($$0);
         eqo.this.A = this.i().indexOf($$0);
         eqo.this.C();
      }
   }

   class b extends ewa.a<eqo.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final ewr d = new ewr(new agm("backup/changes"), new agm("backup/changes_highlighted"));
      private static final ewr e = new ewr(new agm("backup/restore"), new agm("backup/restore_highlighted"));
      private final eox f;
      private final List<evc> g = new ArrayList<>();
      @Nullable
      private evq h;
      @Nullable
      private evq i;

      public b(eox $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!eqo.this.G.j) {
            this.c();
         }
      }

      private void a(eox $$0) {
         int $$1 = eqo.this.y.indexOf($$0);
         if ($$1 != eqo.this.y.size() - 1) {
            eox $$2 = eqo.this.y.get($$1 + 1);

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
            String $$1 = DateFormat.getDateTimeInstance(3, 3).format(this.f.b);
            this.f.e.put($$0, $$1);
            this.f.a(true);
         } else {
            this.f.e.put($$0, this.f.d.get($$0));
         }
      }

      private void b() {
         int $$0 = 9;
         int $$1 = 9;
         int $$2 = eqo.this.z.p() - 9 - 28;
         int $$3 = eqo.this.z.h(eqo.this.y.indexOf(this.f)) + 2;
         this.i = new evq($$2, $$3, 9, 9, d, $$0x -> eqo.this.f.a(new eqn(eqo.this, this.f)), uu.a);
         this.i.a(ewp.a(eqo.c));
         this.g.add(this.i);
      }

      private void c() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = eqo.this.z.p() - 17 - 7;
         int $$3 = eqo.this.z.h(eqo.this.y.indexOf(this.f)) + 2;
         this.h = new evq($$2, $$3, 17, 10, e, $$0x -> eqo.this.a(eqo.this.y.indexOf(this.f)), uu.a);
         this.h.a(ewp.a(eqo.b));
         this.g.add(this.h);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         if (this.i != null) {
            this.i.a($$0, $$1, $$2);
         }

         return true;
      }

      @Override
      public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(eqo.this.i, uv.a("mco.backup.entry", ery.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(eqo.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
         this.g.forEach($$5x -> {
            $$5x.g($$2 + 2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }

      @Override
      public uv a() {
         return uv.a("narrator.select", this.f.b.toString());
      }
   }
}

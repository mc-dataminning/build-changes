import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class evq extends gob {
   static final Logger a = LogUtils.getLogger();
   static final vs b = vs.c("mco.backup.button.restore");
   static final vs c = vs.c("mco.backup.changes.tooltip");
   private static final vs v = vs.c("mco.configure.world.backup");
   private static final vs w = vs.c("mco.backup.nobackups");
   private final evt x;
   List<etz> y = Collections.emptyList();
   evq.a z;
   int A = -1;
   private final int B;
   private fak C;
   private fak D;
   private fak E;
   Boolean F = false;
   final euk G;
   private static final String H = "uploaded";

   public evq(evt $$0, euk $$1, int $$2) {
      super(v);
      this.x = $$0;
      this.G = $$1;
      this.B = $$2;
   }

   @Override
   public void aP_() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            ett $$0 = ett.a();

            try {
               List<etz> $$1 = $$0.e(evq.this.G.a).a;
               evq.this.f.execute(() -> {
                  evq.this.y = $$1;
                  evq.this.F = evq.this.y.isEmpty();
                  evq.this.z.H();

                  for (etz $$1x : evq.this.y) {
                     evq.this.z.a($$1x);
                  }
               });
            } catch (evg var3) {
               evq.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.C = this.c((fak)fak.a(vs.c("mco.backup.button.download"), $$0 -> this.J()).a(this.g - 135, g(1), 120, 20).a());
      this.D = this.c((fak)fak.a(vs.c("mco.backup.button.restore"), $$0 -> this.a(this.A)).a(this.g - 135, g(3), 120, 20).a());
      this.E = this.c((fak)fak.a(vs.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new evp(this, this.y.get(this.A)));
         this.A = -1;
      }).a(this.g - 135, g(5), 120, 20).a());
      this.c((fak)fak.a(vr.k, $$0 -> this.f.a(this.x)).a(this.g - 100, this.h - 35, 85, 20).a());
      this.z = this.c(new evq.a());
      this.E();
   }

   void E() {
      this.D.k = this.I();
      this.E.k = this.H();
   }

   private boolean H() {
      return this.A == -1 ? false : !this.y.get(this.A).e.isEmpty();
   }

   private boolean I() {
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
         vs $$3 = exa.a($$1);
         vs $$4 = vs.a("mco.configure.world.restore.question.line1", $$2, $$3);
         vs $$5 = vs.c("mco.configure.world.restore.question.line2");
         this.f.a(new evz($$0x -> {
            if ($$0x) {
               this.L();
            } else {
               this.A = -1;
               this.f.a(this);
            }
         }, evz.a.a, $$4, $$5, true));
      }
   }

   private void J() {
      vs $$0 = vs.c("mco.configure.world.restore.download.question.line1");
      vs $$1 = vs.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new evz($$0x -> {
         if ($$0x) {
            this.K();
         } else {
            this.f.a(this);
         }
      }, evz.a.b, $$0, $$1, true));
   }

   private void K() {
      this.f.a(new ewa(this.x.f(), new exi(this.G.a, this.B, this.G.c + " (" + this.G.i.get(this.G.n).a(this.G.n) + ")", this)));
   }

   private void L() {
      etz $$0 = this.y.get(this.A);
      this.A = -1;
      this.f.a(new ewa(this.x.f(), new exq($$0, this.G.a, this.x)));
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.F) {
         $$0.a(this.i, w, 20, this.h / 2 - 10, -1, false);
      }

      this.C.j = !this.F;
   }

   class a extends goa<evq.b> {
      public a() {
         super(evq.this.g - 150, evq.this.h - 47, 32, 36);
      }

      public void a(etz $$0) {
         this.a((evq.b)(evq.this.new b($$0)));
      }

      @Override
      public int b() {
         return (int)((double)this.g * 0.93);
      }

      @Override
      public int a() {
         return this.n() * 36;
      }

      @Override
      public int c() {
         return this.g - 5;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         this.b($$0);
      }

      public void b(int $$0) {
         evq.this.A = $$0;
         evq.this.E();
      }

      public void a(@Nullable evq.b $$0) {
         super.a($$0);
         evq.this.A = this.l().indexOf($$0);
         evq.this.E();
      }
   }

   class b extends fbg.a<evq.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final fbx d = new fbx(new ajc("backup/changes"), new ajc("backup/changes_highlighted"));
      private static final fbx e = new fbx(new ajc("backup/restore"), new ajc("backup/restore_highlighted"));
      private final etz f;
      private final List<fai> g = new ArrayList<>();
      @Nullable
      private faw h;
      @Nullable
      private faw i;

      public b(etz $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!evq.this.G.j) {
            this.c();
         }
      }

      private void a(etz $$0) {
         int $$1 = evq.this.y.indexOf($$0);
         if ($$1 != evq.this.y.size() - 1) {
            etz $$2 = evq.this.y.get($$1 + 1);

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
         int $$2 = evq.this.z.r() - 9 - 28;
         int $$3 = evq.this.z.g(evq.this.y.indexOf(this.f)) + 2;
         this.i = new faw($$2, $$3, 9, 9, d, $$0x -> evq.this.f.a(new evp(evq.this, this.f)), vr.a);
         this.i.a(fbv.a(evq.c));
         this.g.add(this.i);
      }

      private void c() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = evq.this.z.r() - 17 - 7;
         int $$3 = evq.this.z.g(evq.this.y.indexOf(this.f)) + 2;
         this.h = new faw($$2, $$3, 17, 10, e, $$0x -> evq.this.a(evq.this.y.indexOf(this.f)), vr.a);
         this.h.a(fbv.a(evq.b));
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
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(evq.this.i, vs.a("mco.backup.entry", exa.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(evq.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
         this.g.forEach($$5x -> {
            $$5x.n($$2 + 2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }

      @Override
      public vs a() {
         return vs.a("narrator.select", this.f.b.toString());
      }
   }
}

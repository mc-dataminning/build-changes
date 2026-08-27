import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eun extends gmw {
   static final Logger a = LogUtils.getLogger();
   static final vq b = vq.c("mco.backup.button.restore");
   static final vq c = vq.c("mco.backup.changes.tooltip");
   private static final vq v = vq.c("mco.configure.world.backup");
   private static final vq w = vq.c("mco.backup.nobackups");
   private final euq x;
   List<esw> y = Collections.emptyList();
   eun.a z;
   int A = -1;
   private final int B;
   private ezh C;
   private ezh D;
   private ezh E;
   Boolean F = false;
   final eth G;
   private static final String H = "uploaded";

   public eun(euq $$0, eth $$1, int $$2) {
      super(v);
      this.x = $$0;
      this.G = $$1;
      this.B = $$2;
   }

   @Override
   public void aQ_() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            esq $$0 = esq.a();

            try {
               List<esw> $$1 = $$0.e(eun.this.G.a).a;
               eun.this.f.execute(() -> {
                  eun.this.y = $$1;
                  eun.this.F = eun.this.y.isEmpty();
                  eun.this.z.H();

                  for (esw $$1x : eun.this.y) {
                     eun.this.z.a($$1x);
                  }
               });
            } catch (eud var3) {
               eun.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.C = this.d((ezh)ezh.a(vq.c("mco.backup.button.download"), $$0 -> this.J()).a(this.g - 135, g(1), 120, 20).a());
      this.D = this.d((ezh)ezh.a(vq.c("mco.backup.button.restore"), $$0 -> this.a(this.A)).a(this.g - 135, g(3), 120, 20).a());
      this.E = this.d((ezh)ezh.a(vq.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new eum(this, this.y.get(this.A)));
         this.A = -1;
      }).a(this.g - 135, g(5), 120, 20).a());
      this.d((ezh)ezh.a(vp.k, $$0 -> this.f.a(this.x)).a(this.g - 100, this.h - 35, 85, 20).a());
      this.z = this.d(new eun.a());
      this.b(this.z);
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
         vq $$3 = evx.a($$1);
         vq $$4 = vq.a("mco.configure.world.restore.question.line1", $$2, $$3);
         vq $$5 = vq.c("mco.configure.world.restore.question.line2");
         this.f.a(new euw($$0x -> {
            if ($$0x) {
               this.L();
            } else {
               this.A = -1;
               this.f.a(this);
            }
         }, euw.a.a, $$4, $$5, true));
      }
   }

   private void J() {
      vq $$0 = vq.c("mco.configure.world.restore.download.question.line1");
      vq $$1 = vq.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new euw($$0x -> {
         if ($$0x) {
            this.K();
         } else {
            this.f.a(this);
         }
      }, euw.a.b, $$0, $$1, true));
   }

   private void K() {
      this.f.a(new eux(this.x.f(), new ewf(this.G.a, this.B, this.G.c + " (" + this.G.i.get(this.G.n).a(this.G.n) + ")", this)));
   }

   private void L() {
      esw $$0 = this.y.get(this.A);
      this.A = -1;
      this.f.a(new eux(this.x.f(), new ewn($$0, this.G.a, this.x)));
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.F) {
         $$0.a(this.i, w, 20, this.h / 2 - 10, -1, false);
      }

      this.C.j = !this.F;
   }

   class a extends gmv<eun.b> {
      public a() {
         super(eun.this.g - 150, eun.this.h - 47, 32, 36);
      }

      public void a(esw $$0) {
         this.a((eun.b)(eun.this.new b($$0)));
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
         eun.this.A = $$0;
         eun.this.E();
      }

      public void a(@Nullable eun.b $$0) {
         super.a($$0);
         eun.this.A = this.l().indexOf($$0);
         eun.this.E();
      }
   }

   class b extends fad.a<eun.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final fau d = new fau(new aiy("backup/changes"), new aiy("backup/changes_highlighted"));
      private static final fau e = new fau(new aiy("backup/restore"), new aiy("backup/restore_highlighted"));
      private final esw f;
      private final List<ezf> g = new ArrayList<>();
      @Nullable
      private ezt h;
      @Nullable
      private ezt i;

      public b(esw $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!eun.this.G.j) {
            this.c();
         }
      }

      private void a(esw $$0) {
         int $$1 = eun.this.y.indexOf($$0);
         if ($$1 != eun.this.y.size() - 1) {
            esw $$2 = eun.this.y.get($$1 + 1);

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
         int $$2 = eun.this.z.r() - 9 - 28;
         int $$3 = eun.this.z.g(eun.this.y.indexOf(this.f)) + 2;
         this.i = new ezt($$2, $$3, 9, 9, d, $$0x -> eun.this.f.a(new eum(eun.this, this.f)), vp.a);
         this.i.a(fas.a(eun.c));
         this.g.add(this.i);
      }

      private void c() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = eun.this.z.r() - 17 - 7;
         int $$3 = eun.this.z.g(eun.this.y.indexOf(this.f)) + 2;
         this.h = new ezt($$2, $$3, 17, 10, e, $$0x -> eun.this.a(eun.this.y.indexOf(this.f)), vp.a);
         this.h.a(fas.a(eun.b));
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
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(eun.this.i, vq.a("mco.backup.entry", evx.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(eun.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
         this.g.forEach($$5x -> {
            $$5x.n($$2 + 2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }

      @Override
      public vq a() {
         return vq.a("narrator.select", this.f.b.toString());
      }
   }
}

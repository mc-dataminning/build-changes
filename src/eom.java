import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eom extends gei {
   private static final Logger a = LogUtils.getLogger();
   private static final tf b = tf.c("selectWorld.unable_to_load");
   static final tf c = tf.c("selectWorld.world");
   static final tf y = tf.c("mco.upload.hardcore").a($$0 -> $$0.a(-65536));
   static final tf z = tf.c("selectWorld.cheats");
   private static final DateFormat A = new SimpleDateFormat();
   private final eol B;
   private final long C;
   private final int D;
   esh E;
   List<eby> F = Lists.newArrayList();
   int G = -1;
   eom.b H;
   private final Runnable I;

   public eom(long $$0, int $$1, eol $$2, Runnable $$3) {
      super(tf.c("mco.upload.select.world.title"));
      this.B = $$2;
      this.C = $$0;
      this.D = $$1;
      this.I = $$3;
   }

   private void B() throws Exception {
      ebx.a $$0 = this.f.l().b();
      this.F = this.f.l().a($$0).join().stream().filter($$0x -> !$$0x.d() && !$$0x.p()).collect(Collectors.toList());

      for (eby $$1 : this.F) {
         this.H.a($$1);
      }
   }

   @Override
   public void aE_() {
      this.H = new eom.b();

      try {
         this.B();
      } catch (Exception var2) {
         a.error("Couldn't load level list", var2);
         this.f.a(new eob(b, tf.a(var2.getMessage()), this.B));
         return;
      }

      this.e(this.H);
      this.E = this.d(esh.a(tf.c("mco.upload.button.name"), $$0 -> this.C()).a(this.g / 2 - 154, this.h - 32, 153, 20).a());
      this.E.i = this.G >= 0 && this.G < this.F.size();
      this.d(esh.a(te.k, $$0 -> this.f.a(this.B)).a(this.g / 2 + 6, this.h - 32, 153, 20).a());
      this.a(new geg(tf.c("mco.upload.select.world.subtitle"), this.g / 2, h(-1), -6250336));
      if (this.F.isEmpty()) {
         this.a(new geg(tf.c("mco.upload.select.world.none"), this.g / 2, this.h / 2 - 20, -1));
      }
   }

   @Override
   public tf e() {
      return te.a(this.m(), this.l());
   }

   private void C() {
      if (this.G != -1 && !this.F.get(this.G).i()) {
         eby $$0 = this.F.get(this.G);
         this.f.a(new eos(this.C, this.D, this.B, $$0, this.I));
      }
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.H.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.B);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static tf a(eby $$0) {
      return $$0.h().d();
   }

   static String b(eby $$0) {
      return A.format(new Date($$0.f()));
   }

   class a extends etd.a<eom.a> {
      private final eby b;
      private final String c;
      private final tf d;
      private final tf e;

      public a(eby $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = tf.a("mco.upload.entry.id", $$0.a(), eom.b($$0));
         tf $$1;
         if ($$0.i()) {
            $$1 = eom.y;
         } else {
            $$1 = eom.a($$0);
         }

         if ($$0.j()) {
            $$1 = tf.a("mco.upload.entry.cheats", $$1.getString(), eom.z);
         }

         this.e = $$1;
      }

      @Override
      public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         eom.this.H.a(eom.this.F.indexOf(this.b));
         return true;
      }

      protected void a(erw $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = eom.c + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(eom.this.i, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(eom.this.i, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(eom.this.i, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public tf a() {
         tf $$0 = te.b(tf.b(this.b.b()), tf.b(eom.b(this.b)), eom.a(this.b));
         return tf.a("narrator.select", $$0);
      }
   }

   class b extends geh<eom.a> {
      public b() {
         super(eom.this.g, eom.this.h, eom.h(0), eom.this.h - 40, 36);
      }

      public void a(eby $$0) {
         this.a((eom.a)(eom.this.new a($$0)));
      }

      @Override
      public int a() {
         return eom.this.F.size() * 36;
      }

      public void a(@Nullable eom.a $$0) {
         super.a($$0);
         eom.this.G = this.i().indexOf($$0);
         eom.this.E.i = eom.this.G >= 0 && eom.this.G < this.k() && !eom.this.F.get(eom.this.G).i();
      }
   }
}

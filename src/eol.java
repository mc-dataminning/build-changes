import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eol extends ger {
   private static final Logger a = LogUtils.getLogger();
   private static final tf b = tf.c("selectWorld.unable_to_load");
   static final tf c = tf.c("selectWorld.world");
   static final tf y = tf.c("mco.upload.hardcore").a($$0 -> $$0.a(-65536));
   static final tf z = tf.c("selectWorld.cheats");
   private static final DateFormat A = new SimpleDateFormat();
   private final eok B;
   private final long C;
   private final int D;
   esg E;
   List<ebx> F = Lists.newArrayList();
   int G = -1;
   eol.b H;
   private final Runnable I;

   public eol(long $$0, int $$1, eok $$2, Runnable $$3) {
      super(tf.c("mco.upload.select.world.title"));
      this.B = $$2;
      this.C = $$0;
      this.D = $$1;
      this.I = $$3;
   }

   private void C() throws Exception {
      ebw.a $$0 = this.f.l().b();
      this.F = this.f.l().a($$0).join().stream().filter($$0x -> !$$0x.d() && !$$0x.p()).collect(Collectors.toList());

      for (ebx $$1 : this.F) {
         this.H.a($$1);
      }
   }

   @Override
   public void aC_() {
      this.H = new eol.b();

      try {
         this.C();
      } catch (Exception var2) {
         a.error("Couldn't load level list", var2);
         this.f.a(new eoa(b, tf.a(var2.getMessage()), this.B));
         return;
      }

      this.e(this.H);
      this.E = this.d(esg.a(tf.c("mco.upload.button.name"), $$0 -> this.D()).a(this.g / 2 - 154, this.h - 32, 153, 20).a());
      this.E.i = this.G >= 0 && this.G < this.F.size();
      this.d(esg.a(te.k, $$0 -> this.f.a(this.B)).a(this.g / 2 + 6, this.h - 32, 153, 20).a());
      this.a(new gep(tf.c("mco.upload.select.world.subtitle"), this.g / 2, h(-1), -6250336));
      if (this.F.isEmpty()) {
         this.a(new gep(tf.c("mco.upload.select.world.none"), this.g / 2, this.h / 2 - 20, -1));
      }
   }

   @Override
   public tf e() {
      return te.a(this.m(), this.l());
   }

   private void D() {
      if (this.G != -1 && !this.F.get(this.G).i()) {
         ebx $$0 = this.F.get(this.G);
         this.f.a(new eor(this.C, this.D, this.B, $$0, this.I));
      }
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
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

   static tf a(ebx $$0) {
      return $$0.h().d();
   }

   static String b(ebx $$0) {
      return A.format(new Date($$0.f()));
   }

   class a extends etc.a<eol.a> {
      private final ebx b;
      private final String c;
      private final tf d;
      private final tf e;

      public a(ebx $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = tf.a("mco.upload.entry.id", $$0.a(), eol.b($$0));
         tf $$1;
         if ($$0.i()) {
            $$1 = eol.y;
         } else {
            $$1 = eol.a($$0);
         }

         if ($$0.j()) {
            $$1 = tf.a("mco.upload.entry.cheats", $$1.getString(), eol.z);
         }

         this.e = $$1;
      }

      @Override
      public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         eol.this.H.a(eol.this.F.indexOf(this.b));
         return true;
      }

      protected void a(erv $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = eol.c + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(eol.this.i, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(eol.this.i, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(eol.this.i, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public tf a() {
         tf $$0 = te.b(tf.b(this.b.b()), tf.b(eol.b(this.b)), eol.a(this.b));
         return tf.a("narrator.select", $$0);
      }
   }

   class b extends geq<eol.a> {
      public b() {
         super(eol.this.g, eol.this.h, eol.h(0), eol.this.h - 40, 36);
      }

      public void a(ebx $$0) {
         this.a((eol.a)(eol.this.new a($$0)));
      }

      @Override
      public int a() {
         return eol.this.F.size() * 36;
      }

      public void a(@Nullable eol.a $$0) {
         super.a($$0);
         eol.this.G = this.i().indexOf($$0);
         eol.this.E.i = eol.this.G >= 0 && eol.this.G < this.k() && !eol.this.F.get(eol.this.G).i();
      }
   }
}

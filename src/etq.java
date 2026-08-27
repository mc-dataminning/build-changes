import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class etq extends gld {
   private static final Logger b = LogUtils.getLogger();
   public static final vg a = vg.c("mco.upload.select.world.title");
   private static final vg c = vg.c("selectWorld.unable_to_load");
   static final vg v = vg.c("selectWorld.world");
   static final vg w = vg.c("mco.upload.hardcore").b(-65536);
   static final vg x = vg.c("selectWorld.cheats");
   private static final DateFormat y = new SimpleDateFormat();
   private final etp z;
   private final long A;
   private final int B;
   exr C;
   List<egw> D = Lists.newArrayList();
   int E = -1;
   etq.b F;

   public etq(long $$0, int $$1, etp $$2) {
      super(a);
      this.z = $$2;
      this.A = $$0;
      this.B = $$1;
   }

   private void E() throws Exception {
      egv.a $$0 = this.f.l().b();
      this.D = this.f.l().a($$0).join().stream().filter($$0x -> !$$0x.d() && !$$0x.p()).collect(Collectors.toList());

      for (egw $$1 : this.D) {
         this.F.a($$1);
      }
   }

   @Override
   public void aP_() {
      this.F = this.d(new etq.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.f.a(new ete(c, vg.a(var2.getMessage()), this.z));
         return;
      }

      this.C = this.d(exr.a(vg.c("mco.upload.button.name"), $$0 -> this.H()).a(this.g / 2 - 154, this.h - 32, 153, 20).a());
      this.C.j = this.E >= 0 && this.E < this.D.size();
      this.d(exr.a(vf.k, $$0 -> this.f.a(this.z)).a(this.g / 2 + 6, this.h - 32, 153, 20).a());
      this.a(new glb(vg.c("mco.upload.select.world.subtitle"), this.g / 2, g(-1), -6250336));
      if (this.D.isEmpty()) {
         this.a(new glb(vg.c("mco.upload.select.world.none"), this.g / 2, this.h / 2 - 20, -1));
      }
   }

   @Override
   public vg i() {
      return vf.a(this.p(), this.o());
   }

   private void H() {
      if (this.E != -1 && !this.D.get(this.E).i()) {
         egw $$0 = this.D.get(this.E);
         this.f.a(new etw(this.A, this.B, this.z, $$0));
      }
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.z);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static vg a(egw $$0) {
      return $$0.h().d();
   }

   static String b(egw $$0) {
      return y.format(new Date($$0.f()));
   }

   class a extends eyn.a<etq.a> {
      private final egw b;
      private final String c;
      private final vg d;
      private final vg e;

      public a(egw $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = vg.a("mco.upload.entry.id", $$0.a(), etq.b($$0));
         vg $$1;
         if ($$0.i()) {
            $$1 = etq.w;
         } else {
            $$1 = etq.a($$0);
         }

         if ($$0.j()) {
            $$1 = vg.a("mco.upload.entry.cheats", $$1.getString(), etq.x);
         }

         this.e = $$1;
      }

      @Override
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         etq.this.F.a(etq.this.D.indexOf(this.b));
         return true;
      }

      protected void a(exe $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = etq.v + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(etq.this.i, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(etq.this.i, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(etq.this.i, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public vg a() {
         vg $$0 = vf.b(vg.b(this.b.b()), vg.b(etq.b(this.b)), etq.a(this.b));
         return vg.a("narrator.select", $$0);
      }
   }

   class b extends glc<etq.a> {
      public b() {
         super(etq.this.g, etq.this.h - 40 - etq.g(0), etq.g(0), 36);
      }

      public void a(egw $$0) {
         this.a((etq.a)(etq.this.new a($$0)));
      }

      @Override
      public int a() {
         return etq.this.D.size() * 36;
      }

      public void a(@Nullable etq.a $$0) {
         super.a($$0);
         etq.this.E = this.l().indexOf($$0);
         etq.this.C.j = etq.this.E >= 0 && etq.this.E < this.n() && !etq.this.D.get(etq.this.E).i();
      }
   }
}

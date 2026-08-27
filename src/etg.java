import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class etg extends gko {
   private static final Logger b = LogUtils.getLogger();
   public static final vf a = vf.c("mco.upload.select.world.title");
   private static final vf c = vf.c("selectWorld.unable_to_load");
   static final vf v = vf.c("selectWorld.world");
   static final vf w = vf.c("mco.upload.hardcore").b(-65536);
   static final vf x = vf.c("selectWorld.cheats");
   private static final DateFormat y = new SimpleDateFormat();
   private final etf z;
   private final long A;
   private final int B;
   exf C;
   List<egm> D = Lists.newArrayList();
   int E = -1;
   etg.b F;

   public etg(long $$0, int $$1, etf $$2) {
      super(a);
      this.z = $$2;
      this.A = $$0;
      this.B = $$1;
   }

   private void D() throws Exception {
      egl.a $$0 = this.f.l().b();
      this.D = this.f.l().a($$0).join().stream().filter($$0x -> !$$0x.d() && !$$0x.p()).collect(Collectors.toList());

      for (egm $$1 : this.D) {
         this.F.a($$1);
      }
   }

   @Override
   public void aN_() {
      this.F = this.d(new etg.b());

      try {
         this.D();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.f.a(new esu(c, vf.a(var2.getMessage()), this.z));
         return;
      }

      this.C = this.d(exf.a(vf.c("mco.upload.button.name"), $$0 -> this.E()).a(this.g / 2 - 154, this.h - 32, 153, 20).a());
      this.C.j = this.E >= 0 && this.E < this.D.size();
      this.d(exf.a(ve.k, $$0 -> this.f.a(this.z)).a(this.g / 2 + 6, this.h - 32, 153, 20).a());
      this.a(new gkm(vf.c("mco.upload.select.world.subtitle"), this.g / 2, g(-1), -6250336));
      if (this.D.isEmpty()) {
         this.a(new gkm(vf.c("mco.upload.select.world.none"), this.g / 2, this.h / 2 - 20, -1));
      }
   }

   @Override
   public vf h() {
      return ve.a(this.o(), this.n());
   }

   private void E() {
      if (this.E != -1 && !this.D.get(this.E).i()) {
         egm $$0 = this.D.get(this.E);
         this.f.a(new etm(this.A, this.B, this.z, $$0));
      }
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
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

   static vf a(egm $$0) {
      return $$0.h().d();
   }

   static String b(egm $$0) {
      return y.format(new Date($$0.f()));
   }

   class a extends eyb.a<etg.a> {
      private final egm b;
      private final String c;
      private final vf d;
      private final vf e;

      public a(egm $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = vf.a("mco.upload.entry.id", $$0.a(), etg.b($$0));
         vf $$1;
         if ($$0.i()) {
            $$1 = etg.w;
         } else {
            $$1 = etg.a($$0);
         }

         if ($$0.j()) {
            $$1 = vf.a("mco.upload.entry.cheats", $$1.getString(), etg.x);
         }

         this.e = $$1;
      }

      @Override
      public void a(ewt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         etg.this.F.a(etg.this.D.indexOf(this.b));
         return true;
      }

      protected void a(ewt $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = etg.v + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(etg.this.i, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(etg.this.i, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(etg.this.i, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public vf a() {
         vf $$0 = ve.b(vf.b(this.b.b()), vf.b(etg.b(this.b)), etg.a(this.b));
         return vf.a("narrator.select", $$0);
      }
   }

   class b extends gkn<etg.a> {
      public b() {
         super(etg.this.g, etg.this.h - 40 - etg.g(0), etg.g(0), 36);
      }

      public void a(egm $$0) {
         this.a((etg.a)(etg.this.new a($$0)));
      }

      @Override
      public int a() {
         return etg.this.D.size() * 36;
      }

      public void a(@Nullable etg.a $$0) {
         super.a($$0);
         etg.this.E = this.l().indexOf($$0);
         etg.this.C.j = etg.this.E >= 0 && etg.this.E < this.n() && !etg.this.D.get(etg.this.E).i();
      }
   }
}

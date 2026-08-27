import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esz extends gkc {
   private static final Logger b = LogUtils.getLogger();
   public static final vd a = vd.c("mco.upload.select.world.title");
   private static final vd c = vd.c("selectWorld.unable_to_load");
   static final vd v = vd.c("selectWorld.world");
   static final vd w = vd.c("mco.upload.hardcore").b(-65536);
   static final vd x = vd.c("selectWorld.cheats");
   private static final DateFormat y = new SimpleDateFormat();
   private final esy z;
   private final long A;
   private final int B;
   ewy C;
   List<egg> D = Lists.newArrayList();
   int E = -1;
   esz.b F;

   public esz(long $$0, int $$1, esy $$2) {
      super(a);
      this.z = $$2;
      this.A = $$0;
      this.B = $$1;
   }

   private void C() throws Exception {
      egf.a $$0 = this.f.l().b();
      this.D = this.f.l().a($$0).join().stream().filter($$0x -> !$$0x.d() && !$$0x.p()).collect(Collectors.toList());

      for (egg $$1 : this.D) {
         this.F.a($$1);
      }
   }

   @Override
   public void aN_() {
      this.F = this.d(new esz.b());

      try {
         this.C();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.f.a(new esn(c, vd.a(var2.getMessage()), this.z));
         return;
      }

      this.C = this.d(ewy.a(vd.c("mco.upload.button.name"), $$0 -> this.D()).a(this.g / 2 - 154, this.h - 32, 153, 20).a());
      this.C.j = this.E >= 0 && this.E < this.D.size();
      this.d(ewy.a(vc.k, $$0 -> this.f.a(this.z)).a(this.g / 2 + 6, this.h - 32, 153, 20).a());
      this.a(new gka(vd.c("mco.upload.select.world.subtitle"), this.g / 2, g(-1), -6250336));
      if (this.D.isEmpty()) {
         this.a(new gka(vd.c("mco.upload.select.world.none"), this.g / 2, this.h / 2 - 20, -1));
      }
   }

   @Override
   public vd h() {
      return vc.a(this.o(), this.n());
   }

   private void D() {
      if (this.E != -1 && !this.D.get(this.E).i()) {
         egg $$0 = this.D.get(this.E);
         this.f.a(new etf(this.A, this.B, this.z, $$0));
      }
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
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

   static vd a(egg $$0) {
      return $$0.h().d();
   }

   static String b(egg $$0) {
      return y.format(new Date($$0.f()));
   }

   class a extends exu.a<esz.a> {
      private final egg b;
      private final String c;
      private final vd d;
      private final vd e;

      public a(egg $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = vd.a("mco.upload.entry.id", $$0.a(), esz.b($$0));
         vd $$1;
         if ($$0.i()) {
            $$1 = esz.w;
         } else {
            $$1 = esz.a($$0);
         }

         if ($$0.j()) {
            $$1 = vd.a("mco.upload.entry.cheats", $$1.getString(), esz.x);
         }

         this.e = $$1;
      }

      @Override
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         esz.this.F.a(esz.this.D.indexOf(this.b));
         return true;
      }

      protected void a(ewm $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = esz.v + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(esz.this.i, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(esz.this.i, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(esz.this.i, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public vd a() {
         vd $$0 = vc.b(vd.b(this.b.b()), vd.b(esz.b(this.b)), esz.a(this.b));
         return vd.a("narrator.select", $$0);
      }
   }

   class b extends gkb<esz.a> {
      public b() {
         super(esz.this.g, esz.this.h - 40 - esz.g(0), esz.g(0), 36);
      }

      public void a(egg $$0) {
         this.a((esz.a)(esz.this.new a($$0)));
      }

      @Override
      public int a() {
         return esz.this.D.size() * 36;
      }

      public void a(@Nullable esz.a $$0) {
         super.a($$0);
         esz.this.E = this.l().indexOf($$0);
         esz.this.C.j = esz.this.E >= 0 && esz.this.E < this.n() && !esz.this.D.get(esz.this.E).i();
      }
   }
}

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esj extends gjl {
   private static final Logger b = LogUtils.getLogger();
   public static final vb a = vb.c("mco.upload.select.world.title");
   private static final vb c = vb.c("selectWorld.unable_to_load");
   static final vb v = vb.c("selectWorld.world");
   static final vb w = vb.c("mco.upload.hardcore").b(-65536);
   static final vb x = vb.c("selectWorld.cheats");
   private static final DateFormat y = new SimpleDateFormat();
   private final esi z;
   private final long A;
   private final int B;
   ewh C;
   List<efv> D = Lists.newArrayList();
   int E = -1;
   esj.b F;

   public esj(long $$0, int $$1, esi $$2) {
      super(a);
      this.z = $$2;
      this.A = $$0;
      this.B = $$1;
   }

   private void C() throws Exception {
      efu.a $$0 = this.f.l().b();
      this.D = this.f.l().a($$0).join().stream().filter($$0x -> !$$0x.d() && !$$0x.p()).collect(Collectors.toList());

      for (efv $$1 : this.D) {
         this.F.a($$1);
      }
   }

   @Override
   public void aP_() {
      this.F = new esj.b();

      try {
         this.C();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.f.a(new erx(c, vb.a(var2.getMessage()), this.z));
         return;
      }

      this.e(this.F);
      this.C = this.d(ewh.a(vb.c("mco.upload.button.name"), $$0 -> this.D()).a(this.g / 2 - 154, this.h - 32, 153, 20).a());
      this.C.i = this.E >= 0 && this.E < this.D.size();
      this.d(ewh.a(va.k, $$0 -> this.f.a(this.z)).a(this.g / 2 + 6, this.h - 32, 153, 20).a());
      this.a(new gjj(vb.c("mco.upload.select.world.subtitle"), this.g / 2, h(-1), -6250336));
      if (this.D.isEmpty()) {
         this.a(new gjj(vb.c("mco.upload.select.world.none"), this.g / 2, this.h / 2 - 20, -1));
      }
   }

   @Override
   public vb h() {
      return va.a(this.m(), this.l());
   }

   private void D() {
      if (this.E != -1 && !this.D.get(this.E).i()) {
         efv $$0 = this.D.get(this.E);
         this.f.a(new esp(this.A, this.B, this.z, $$0));
      }
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.F.a($$0, $$1, $$2, $$3);
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

   static vb a(efv $$0) {
      return $$0.h().d();
   }

   static String b(efv $$0) {
      return y.format(new Date($$0.f()));
   }

   class a extends exd.a<esj.a> {
      private final efv b;
      private final String c;
      private final vb d;
      private final vb e;

      public a(efv $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = vb.a("mco.upload.entry.id", $$0.a(), esj.b($$0));
         vb $$1;
         if ($$0.i()) {
            $$1 = esj.w;
         } else {
            $$1 = esj.a($$0);
         }

         if ($$0.j()) {
            $$1 = vb.a("mco.upload.entry.cheats", $$1.getString(), esj.x);
         }

         this.e = $$1;
      }

      @Override
      public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         esj.this.F.a(esj.this.D.indexOf(this.b));
         return true;
      }

      protected void a(evw $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = esj.v + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(esj.this.i, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(esj.this.i, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(esj.this.i, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public vb a() {
         vb $$0 = va.b(vb.b(this.b.b()), vb.b(esj.b(this.b)), esj.a(this.b));
         return vb.a("narrator.select", $$0);
      }
   }

   class b extends gjk<esj.a> {
      public b() {
         super(esj.this.g, esj.this.h, esj.h(0), esj.this.h - 40, 36);
      }

      public void a(efv $$0) {
         this.a((esj.a)(esj.this.new a($$0)));
      }

      @Override
      public int a() {
         return esj.this.D.size() * 36;
      }

      public void a(@Nullable esj.a $$0) {
         super.a($$0);
         esj.this.E = this.i().indexOf($$0);
         esj.this.C.i = esj.this.E >= 0 && esj.this.E < this.k() && !esj.this.D.get(esj.this.E).i();
      }
   }
}

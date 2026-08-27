import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class erh extends ghw {
   private static final Logger b = LogUtils.getLogger();
   public static final uv a = uv.c("mco.upload.select.world.title");
   private static final uv c = uv.c("selectWorld.unable_to_load");
   static final uv v = uv.c("selectWorld.world");
   static final uv w = uv.c("mco.upload.hardcore").b(-65536);
   static final uv x = uv.c("selectWorld.cheats");
   private static final DateFormat y = new SimpleDateFormat();
   private final erg z;
   private final long A;
   private final int B;
   eve C;
   List<eet> D = Lists.newArrayList();
   int E = -1;
   erh.b F;

   public erh(long $$0, int $$1, erg $$2) {
      super(a);
      this.z = $$2;
      this.A = $$0;
      this.B = $$1;
   }

   private void C() throws Exception {
      ees.a $$0 = this.f.l().b();
      this.D = this.f.l().a($$0).join().stream().filter($$0x -> !$$0x.d() && !$$0x.p()).collect(Collectors.toList());

      for (eet $$1 : this.D) {
         this.F.a($$1);
      }
   }

   @Override
   public void aQ_() {
      this.F = new erh.b();

      try {
         this.C();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.f.a(new eqv(c, uv.a(var2.getMessage()), this.z));
         return;
      }

      this.e(this.F);
      this.C = this.d(eve.a(uv.c("mco.upload.button.name"), $$0 -> this.D()).a(this.g / 2 - 154, this.h - 32, 153, 20).a());
      this.C.i = this.E >= 0 && this.E < this.D.size();
      this.d(eve.a(uu.k, $$0 -> this.f.a(this.z)).a(this.g / 2 + 6, this.h - 32, 153, 20).a());
      this.a(new ghu(uv.c("mco.upload.select.world.subtitle"), this.g / 2, h(-1), -6250336));
      if (this.D.isEmpty()) {
         this.a(new ghu(uv.c("mco.upload.select.world.none"), this.g / 2, this.h / 2 - 20, -1));
      }
   }

   @Override
   public uv h() {
      return uu.a(this.m(), this.l());
   }

   private void D() {
      if (this.E != -1 && !this.D.get(this.E).i()) {
         eet $$0 = this.D.get(this.E);
         this.f.a(new ern(this.A, this.B, this.z, $$0));
      }
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
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

   static uv a(eet $$0) {
      return $$0.h().d();
   }

   static String b(eet $$0) {
      return y.format(new Date($$0.f()));
   }

   class a extends ewa.a<erh.a> {
      private final eet b;
      private final String c;
      private final uv d;
      private final uv e;

      public a(eet $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = uv.a("mco.upload.entry.id", $$0.a(), erh.b($$0));
         uv $$1;
         if ($$0.i()) {
            $$1 = erh.w;
         } else {
            $$1 = erh.a($$0);
         }

         if ($$0.j()) {
            $$1 = uv.a("mco.upload.entry.cheats", $$1.getString(), erh.x);
         }

         this.e = $$1;
      }

      @Override
      public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         erh.this.F.a(erh.this.D.indexOf(this.b));
         return true;
      }

      protected void a(eut $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = erh.v + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(erh.this.i, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(erh.this.i, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(erh.this.i, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public uv a() {
         uv $$0 = uu.b(uv.b(this.b.b()), uv.b(erh.b(this.b)), erh.a(this.b));
         return uv.a("narrator.select", $$0);
      }
   }

   class b extends ghv<erh.a> {
      public b() {
         super(erh.this.g, erh.this.h, erh.h(0), erh.this.h - 40, 36);
      }

      public void a(eet $$0) {
         this.a((erh.a)(erh.this.new a($$0)));
      }

      @Override
      public int a() {
         return erh.this.D.size() * 36;
      }

      public void a(@Nullable erh.a $$0) {
         super.a($$0);
         erh.this.E = this.i().indexOf($$0);
         erh.this.C.i = erh.this.E >= 0 && erh.this.E < this.k() && !erh.this.D.get(erh.this.E).i();
      }
   }
}

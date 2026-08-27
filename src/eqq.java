import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqq extends ghe {
   private static final Logger b = LogUtils.getLogger();
   public static final ur a = ur.c("mco.upload.select.world.title");
   private static final ur c = ur.c("selectWorld.unable_to_load");
   static final ur v = ur.c("selectWorld.world");
   static final ur w = ur.c("mco.upload.hardcore").b(-65536);
   static final ur x = ur.c("selectWorld.cheats");
   private static final DateFormat y = new SimpleDateFormat();
   private final eqp z;
   private final long A;
   private final int B;
   eum C;
   List<eec> D = Lists.newArrayList();
   int E = -1;
   eqq.b F;

   public eqq(long $$0, int $$1, eqp $$2) {
      super(a);
      this.z = $$2;
      this.A = $$0;
      this.B = $$1;
   }

   private void C() throws Exception {
      eeb.a $$0 = this.f.l().b();
      this.D = this.f.l().a($$0).join().stream().filter($$0x -> !$$0x.d() && !$$0x.p()).collect(Collectors.toList());

      for (eec $$1 : this.D) {
         this.F.a($$1);
      }
   }

   @Override
   public void aO_() {
      this.F = new eqq.b();

      try {
         this.C();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.f.a(new eqe(c, ur.a(var2.getMessage()), this.z));
         return;
      }

      this.e(this.F);
      this.C = this.d(eum.a(ur.c("mco.upload.button.name"), $$0 -> this.D()).a(this.g / 2 - 154, this.h - 32, 153, 20).a());
      this.C.i = this.E >= 0 && this.E < this.D.size();
      this.d(eum.a(uq.k, $$0 -> this.f.a(this.z)).a(this.g / 2 + 6, this.h - 32, 153, 20).a());
      this.a(new ghc(ur.c("mco.upload.select.world.subtitle"), this.g / 2, h(-1), -6250336));
      if (this.D.isEmpty()) {
         this.a(new ghc(ur.c("mco.upload.select.world.none"), this.g / 2, this.h / 2 - 20, -1));
      }
   }

   @Override
   public ur h() {
      return uq.a(this.m(), this.l());
   }

   private void D() {
      if (this.E != -1 && !this.D.get(this.E).i()) {
         eec $$0 = this.D.get(this.E);
         this.f.a(new eqw(this.A, this.B, this.z, $$0));
      }
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
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

   static ur a(eec $$0) {
      return $$0.h().d();
   }

   static String b(eec $$0) {
      return y.format(new Date($$0.f()));
   }

   class a extends evi.a<eqq.a> {
      private final eec b;
      private final String c;
      private final ur d;
      private final ur e;

      public a(eec $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = ur.a("mco.upload.entry.id", $$0.a(), eqq.b($$0));
         ur $$1;
         if ($$0.i()) {
            $$1 = eqq.w;
         } else {
            $$1 = eqq.a($$0);
         }

         if ($$0.j()) {
            $$1 = ur.a("mco.upload.entry.cheats", $$1.getString(), eqq.x);
         }

         this.e = $$1;
      }

      @Override
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         eqq.this.F.a(eqq.this.D.indexOf(this.b));
         return true;
      }

      protected void a(eub $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = eqq.v + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(eqq.this.i, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(eqq.this.i, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(eqq.this.i, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public ur a() {
         ur $$0 = uq.b(ur.b(this.b.b()), ur.b(eqq.b(this.b)), eqq.a(this.b));
         return ur.a("narrator.select", $$0);
      }
   }

   class b extends ghd<eqq.a> {
      public b() {
         super(eqq.this.g, eqq.this.h, eqq.h(0), eqq.this.h - 40, 36);
      }

      public void a(eec $$0) {
         this.a((eqq.a)(eqq.this.new a($$0)));
      }

      @Override
      public int a() {
         return eqq.this.D.size() * 36;
      }

      public void a(@Nullable eqq.a $$0) {
         super.a($$0);
         eqq.this.E = this.i().indexOf($$0);
         eqq.this.C.i = eqq.this.E >= 0 && eqq.this.E < this.k() && !eqq.this.D.get(eqq.this.E).i();
      }
   }
}

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezo extends grl {
   private static final Logger b = LogUtils.getLogger();
   public static final wg a = wg.c("mco.upload.select.world.title");
   private static final wg c = wg.c("selectWorld.unable_to_load");
   static final wg y = wg.c("selectWorld.world");
   private static final wg z = wg.c("mco.upload.hardcore").b(-65536);
   private static final wg A = wg.c("selectWorld.commands");
   private static final DateFormat B = new SimpleDateFormat();
   @Nullable
   private final far C;
   private final ezn D;
   private final long E;
   private final int F;
   fdp G;
   List<ems> H = Lists.newArrayList();
   int I = -1;
   ezo.b J;

   public ezo(@Nullable far $$0, long $$1, int $$2, ezn $$3) {
      super(a);
      this.C = $$0;
      this.D = $$3;
      this.E = $$1;
      this.F = $$2;
   }

   private void C() {
      emr.a $$0 = this.j.m().b();
      this.H = this.j.m().a($$0).join().stream().filter(ems::v).collect(Collectors.toList());

      for (ems $$1 : this.H) {
         this.J.a($$1);
      }
   }

   @Override
   public void aN_() {
      this.J = this.c(new ezo.b());

      try {
         this.C();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.j.a(new ezc(c, wg.a(var2.getMessage()), this.D));
         return;
      }

      this.G = this.c(fdp.a(wg.c("mco.upload.button.name"), $$0 -> this.D()).a(this.k / 2 - 154, this.l - 32, 153, 20).a());
      this.G.j = this.I >= 0 && this.I < this.H.size();
      this.c(fdp.a(wf.k, $$0 -> this.j.a(this.D)).a(this.k / 2 + 6, this.l - 32, 153, 20).a());
      this.a(new grj(wg.c("mco.upload.select.world.subtitle"), this.k / 2, g(-1), -6250336));
      if (this.H.isEmpty()) {
         this.a(new grj(wg.c("mco.upload.select.world.none"), this.k / 2, this.l / 2 - 20, -1));
      }
   }

   @Override
   public wg i() {
      return wf.a(this.n(), this.m());
   }

   private void D() {
      if (this.I != -1 && !this.H.get(this.I).i()) {
         ems $$0 = this.H.get(this.I);
         this.j.a(new ezu(this.C, this.E, this.F, this.D, $$0));
      }
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.j.a(this.D);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static wg a(ems $$0) {
      return $$0.h().d();
   }

   static String b(ems $$0) {
      return B.format(new Date($$0.f()));
   }

   class a extends fel.a<ezo.a> {
      private final ems b;
      private final String c;
      private final wg d;
      private final wg e;

      public a(ems $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = wg.a("mco.upload.entry.id", $$0.a(), ezo.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         ezo.this.J.b(ezo.this.H.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fdc $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = ezo.y + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(ezo.this.m, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(ezo.this.m, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(ezo.this.m, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public wg a() {
         wg $$0 = wf.b(wg.b(this.b.b()), wg.b(ezo.b(this.b)), ezo.a(this.b));
         return wg.a("narrator.select", $$0);
      }
   }

   class b extends grk<ezo.a> {
      public b() {
         super(ezo.this.k, ezo.this.l - 40 - ezo.g(0), ezo.g(0), 36);
      }

      public void a(ems $$0) {
         this.a((ezo.a)(ezo.this.new a($$0)));
      }

      @Override
      public int a() {
         return ezo.this.H.size() * 36;
      }

      public void a(@Nullable ezo.a $$0) {
         super.a($$0);
         ezo.this.I = this.aF_().indexOf($$0);
         ezo.this.G.j = ezo.this.I >= 0 && ezo.this.I < this.l() && !ezo.this.H.get(ezo.this.I).i();
      }
   }
}

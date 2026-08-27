import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exh extends gpe {
   private static final Logger b = LogUtils.getLogger();
   public static final vu a = vu.c("mco.upload.select.world.title");
   private static final vu c = vu.c("selectWorld.unable_to_load");
   static final vu v = vu.c("selectWorld.world");
   private static final vu w = vu.c("mco.upload.hardcore").b(-65536);
   private static final vu x = vu.c("selectWorld.commands");
   private static final DateFormat y = new SimpleDateFormat();
   @Nullable
   private final eyk z;
   private final exg A;
   private final long B;
   private final int C;
   fbi D;
   List<ekn> E = Lists.newArrayList();
   int F = -1;
   exh.b G;

   public exh(@Nullable eyk $$0, long $$1, int $$2, exg $$3) {
      super(a);
      this.z = $$0;
      this.A = $$3;
      this.B = $$1;
      this.C = $$2;
   }

   private void E() {
      ekm.a $$0 = this.f.m().b();
      this.E = this.f.m().a($$0).join().stream().filter(ekn::v).collect(Collectors.toList());

      for (ekn $$1 : this.E) {
         this.G.a($$1);
      }
   }

   @Override
   public void aO_() {
      this.G = this.c(new exh.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.f.a(new ewv(c, vu.a(var2.getMessage()), this.A));
         return;
      }

      this.D = this.c(fbi.a(vu.c("mco.upload.button.name"), $$0 -> this.H()).a(this.g / 2 - 154, this.h - 32, 153, 20).a());
      this.D.j = this.F >= 0 && this.F < this.E.size();
      this.c(fbi.a(vt.k, $$0 -> this.f.a(this.A)).a(this.g / 2 + 6, this.h - 32, 153, 20).a());
      this.a(new gpc(vu.c("mco.upload.select.world.subtitle"), this.g / 2, g(-1), -6250336));
      if (this.E.isEmpty()) {
         this.a(new gpc(vu.c("mco.upload.select.world.none"), this.g / 2, this.h / 2 - 20, -1));
      }
   }

   @Override
   public vu i() {
      return vt.a(this.p(), this.o());
   }

   private void H() {
      if (this.F != -1 && !this.E.get(this.F).i()) {
         ekn $$0 = this.E.get(this.F);
         this.f.a(new exn(this.z, this.B, this.C, this.A, $$0));
      }
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.A);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static vu a(ekn $$0) {
      return $$0.h().d();
   }

   static String b(ekn $$0) {
      return y.format(new Date($$0.f()));
   }

   class a extends fce.a<exh.a> {
      private final ekn b;
      private final String c;
      private final vu d;
      private final vu e;

      public a(ekn $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = vu.a("mco.upload.entry.id", $$0.a(), exh.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         exh.this.G.a(exh.this.E.indexOf(this.b));
         return true;
      }

      protected void a(fav $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = exh.v + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(exh.this.i, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(exh.this.i, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(exh.this.i, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public vu a() {
         vu $$0 = vt.b(vu.b(this.b.b()), vu.b(exh.b(this.b)), exh.a(this.b));
         return vu.a("narrator.select", $$0);
      }
   }

   class b extends gpd<exh.a> {
      public b() {
         super(exh.this.g, exh.this.h - 40 - exh.g(0), exh.g(0), 36);
      }

      public void a(ekn $$0) {
         this.a((exh.a)(exh.this.new a($$0)));
      }

      @Override
      public int a() {
         return exh.this.E.size() * 36;
      }

      public void a(@Nullable exh.a $$0) {
         super.a($$0);
         exh.this.F = this.l().indexOf($$0);
         exh.this.D.j = exh.this.F >= 0 && exh.this.F < this.n() && !exh.this.E.get(exh.this.F).i();
      }
   }
}

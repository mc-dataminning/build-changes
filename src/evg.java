import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class evg extends gmw {
   private static final Logger b = LogUtils.getLogger();
   public static final vq a = vq.c("mco.upload.select.world.title");
   private static final vq c = vq.c("selectWorld.unable_to_load");
   static final vq v = vq.c("selectWorld.world");
   static final vq w = vq.c("mco.upload.hardcore").b(-65536);
   static final vq x = vq.c("selectWorld.cheats");
   private static final DateFormat y = new SimpleDateFormat();
   @Nullable
   private final ewj z;
   private final evf A;
   private final long B;
   private final int C;
   ezh D;
   List<eim> E = Lists.newArrayList();
   int F = -1;
   evg.b G;

   public evg(@Nullable ewj $$0, long $$1, int $$2, evf $$3) {
      super(a);
      this.z = $$0;
      this.A = $$3;
      this.B = $$1;
      this.C = $$2;
   }

   private void E() {
      eil.a $$0 = this.f.l().b();
      this.E = this.f.l().a($$0).join().stream().filter(eim::v).collect(Collectors.toList());

      for (eim $$1 : this.E) {
         this.G.a($$1);
      }
   }

   @Override
   public void aQ_() {
      this.G = this.d(new evg.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.f.a(new euu(c, vq.a(var2.getMessage()), this.A));
         return;
      }

      this.D = this.d(ezh.a(vq.c("mco.upload.button.name"), $$0 -> this.H()).a(this.g / 2 - 154, this.h - 32, 153, 20).a());
      this.D.j = this.F >= 0 && this.F < this.E.size();
      this.d(ezh.a(vp.k, $$0 -> this.f.a(this.A)).a(this.g / 2 + 6, this.h - 32, 153, 20).a());
      this.a(new gmu(vq.c("mco.upload.select.world.subtitle"), this.g / 2, g(-1), -6250336));
      if (this.E.isEmpty()) {
         this.a(new gmu(vq.c("mco.upload.select.world.none"), this.g / 2, this.h / 2 - 20, -1));
      }
   }

   @Override
   public vq i() {
      return vp.a(this.p(), this.o());
   }

   private void H() {
      if (this.F != -1 && !this.E.get(this.F).i()) {
         eim $$0 = this.E.get(this.F);
         this.f.a(new evm(this.z, this.B, this.C, this.A, $$0));
      }
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
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

   static vq a(eim $$0) {
      return $$0.h().d();
   }

   static String b(eim $$0) {
      return y.format(new Date($$0.f()));
   }

   class a extends fad.a<evg.a> {
      private final eim b;
      private final String c;
      private final vq d;
      private final vq e;

      public a(eim $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = vq.a("mco.upload.entry.id", $$0.a(), evg.b($$0));
         vq $$1;
         if ($$0.i()) {
            $$1 = evg.w;
         } else {
            $$1 = evg.a($$0);
         }

         if ($$0.j()) {
            $$1 = vq.a("mco.upload.entry.cheats", $$1.getString(), evg.x);
         }

         this.e = $$1;
      }

      @Override
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         evg.this.G.a(evg.this.E.indexOf(this.b));
         return true;
      }

      protected void a(eyu $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = evg.v + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(evg.this.i, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(evg.this.i, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(evg.this.i, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public vq a() {
         vq $$0 = vp.b(vq.b(this.b.b()), vq.b(evg.b(this.b)), evg.a(this.b));
         return vq.a("narrator.select", $$0);
      }
   }

   class b extends gmv<evg.a> {
      public b() {
         super(evg.this.g, evg.this.h - 40 - evg.g(0), evg.g(0), 36);
      }

      public void a(eim $$0) {
         this.a((evg.a)(evg.this.new a($$0)));
      }

      @Override
      public int a() {
         return evg.this.E.size() * 36;
      }

      public void a(@Nullable evg.a $$0) {
         super.a($$0);
         evg.this.F = this.l().indexOf($$0);
         evg.this.D.j = evg.this.F >= 0 && evg.this.F < this.n() && !evg.this.E.get(evg.this.F).i();
      }
   }
}

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjt extends fjx {
   static final ajv b = new ajv("container/slot");
   static final Logger c = LogUtils.getLogger();
   private static final int d = 18;
   private static final int o = 20;
   private static final int p = 1;
   private static final int q = 1;
   private static final int r = 2;
   private static final int s = 2;
   private static final aju<daf> u = dam.b;
   public static final wi a = wi.c("flat_world_preset.unknown");
   private final fis v;
   private wi w;
   private wi x;
   private fjt.a y;
   private fdy z;
   feh A;
   edt B;

   public fjt(fis $$0) {
      super(wi.c("createWorld.customize.presets.title"));
      this.v = $$0;
   }

   @Nullable
   private static edq a(io<dch> $$0, String $$1, int $$2) {
      List<String> $$3 = Splitter.on('*').limit(2).splitToList($$1);
      int $$5;
      String $$4;
      if ($$3.size() == 2) {
         $$4 = $$3.get(1);

         try {
            $$5 = Math.max(Integer.parseInt($$3.get(0)), 0);
         } catch (NumberFormatException var11) {
            c.error("Error while parsing flat world string", var11);
            return null;
         }
      } else {
         $$4 = $$3.get(0);
         $$5 = 1;
      }

      int $$9 = Math.min($$2 + $$5, dta.c);
      int $$10 = $$9 - $$2;

      Optional<in.c<dch>> $$11;
      try {
         $$11 = $$0.a(aju.a(ku.f, new ajv($$4)));
      } catch (Exception var10) {
         c.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         c.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new edq($$10, $$11.get().a());
      }
   }

   private static List<edq> a(io<dch> $$0, String $$1) {
      List<edq> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         edq $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         $$2.add($$6);
         $$4 += $$6.a();
      }

      return $$2;
   }

   public static edt a(io<dch> $$0, io<daf> $$1, io<efw> $$2, io<eeu> $$3, String $$4, edt $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return edt.a($$1, $$2, $$3);
      } else {
         List<edq> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return edt.a($$1, $$2, $$3);
         } else {
            in.c<daf> $$8 = $$1.b(u);
            in<daf> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(ajv.a($$10)).map($$0x -> aju.a(ku.aw, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  c.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(edt $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(aju::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void aM_() {
      this.w = wi.c("createWorld.customize.presets.share");
      this.x = wi.c("createWorld.customize.presets.list");
      this.A = new feh(this.m, 50, 40, this.k - 100, 20, this.w);
      this.A.f(1230);
      fov $$0 = this.v.a.m().k();
      jb $$1 = $$0.a();
      cmn $$2 = $$0.g().b();
      io<daf> $$3 = $$1.b(ku.aw);
      io<efw> $$4 = $$1.b(ku.aI);
      io<eeu> $$5 = $$1.b(ku.aF);
      io<dch> $$6 = $$1.b(ku.f).a($$2);
      this.A.a(a(this.v.l()));
      this.B = this.v.l();
      this.d(this.A);
      this.y = this.c(new fjt.a($$1, $$2));
      this.z = this.c(fdy.a(wi.c("createWorld.customize.presets.select"), $$4x -> {
         edt $$5x = a($$6, $$3, $$4, $$5, this.A.a(), this.B);
         this.v.a($$5x);
         this.j.a(this.v);
      }).a(this.k / 2 - 155, this.l - 28, 150, 20).a());
      this.c(fdy.a(wh.e, $$0x -> this.j.a(this.v)).a(this.k / 2 + 5, this.l - 28, 150, 20).a());
      this.c(this.y.h() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.y.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(fby $$0, int $$1, int $$2) {
      String $$3 = this.A.a();
      this.b($$0, $$1, $$2);
      this.A.a($$3);
   }

   @Override
   public void d() {
      this.j.a(this.v);
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 400.0F);
      $$0.a(this.m, this.i, this.k / 2, 8, 16777215);
      $$0.b(this.m, this.w, 51, 30, 10526880);
      $$0.b(this.m, this.x, 51, 70, 10526880);
      $$0.c().b();
      this.A.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void c(boolean $$0) {
      this.z.j = $$0 || this.A.a().length() > 1;
   }

   class a extends feu<fjt.a.a> {
      public a(jb $$0, cmn $$1) {
         super(fjt.this.j, fjt.this.k, fjt.this.l - 117, 80, 24);

         for (in<edr> $$2 : $$0.d(ku.aC).c(avi.a)) {
            Set<dch> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               fjt.c
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new fjt.a.a($$2));
            }
         }
      }

      public void a(@Nullable fjt.a.a $$0) {
         super.a($$0);
         fjt.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (fhz.a($$0) && this.h() != null) {
               this.h().b();
            }

            return false;
         }
      }

      public class a extends feu.a<fjt.a.a> {
         private static final ajv b = new ajv("textures/gui/container/stats_icons.png");
         private final edr c;
         private final wi d;

         public a(in<edr> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> wi.c($$0x.a().f("flat_world_preset"))).orElse(fjt.a);
         }

         @Override
         public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.a(fjt.this.m, this.d, $$3 + 18 + 5, $$2 + 6, 16777215, false);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            return super.a($$0, $$1, $$2);
         }

         void b() {
            a.this.a(this);
            fjt.this.B = this.c.b();
            fjt.this.A.a(fjt.a(fjt.this.B));
            fjt.this.A.b(false);
         }

         private void a(fdl $$0, int $$1, int $$2, crn $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new crs($$3), $$1 + 2, $$2 + 2);
         }

         private void a(fdl $$0, int $$1, int $$2) {
            $$0.a(fjt.b, $$1, $$2, 0, 18, 18);
         }

         @Override
         public wi a() {
            return wi.a("narrator.select", this.d);
         }
      }
   }
}

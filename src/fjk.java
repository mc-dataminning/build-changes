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

public class fjk extends fjo {
   static final ajt b = new ajt("container/slot");
   static final Logger c = LogUtils.getLogger();
   private static final int d = 18;
   private static final int o = 20;
   private static final int p = 1;
   private static final int q = 1;
   private static final int r = 2;
   private static final int s = 2;
   private static final ajs<czw> u = dad.b;
   public static final wg a = wg.c("flat_world_preset.unknown");
   private final fij v;
   private wg w;
   private wg x;
   private fjk.a y;
   private fdp z;
   fdy A;
   edk B;

   public fjk(fij $$0) {
      super(wg.c("createWorld.customize.presets.title"));
      this.v = $$0;
   }

   @Nullable
   private static edh a(im<dby> $$0, String $$1, int $$2) {
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

      int $$9 = Math.min($$2 + $$5, dsr.c);
      int $$10 = $$9 - $$2;

      Optional<il.c<dby>> $$11;
      try {
         $$11 = $$0.a(ajs.a(ks.f, new ajt($$4)));
      } catch (Exception var10) {
         c.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         c.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new edh($$10, $$11.get().a());
      }
   }

   private static List<edh> a(im<dby> $$0, String $$1) {
      List<edh> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         edh $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         $$2.add($$6);
         $$4 += $$6.a();
      }

      return $$2;
   }

   public static edk a(im<dby> $$0, im<czw> $$1, im<efn> $$2, im<eel> $$3, String $$4, edk $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return edk.a($$1, $$2, $$3);
      } else {
         List<edh> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return edk.a($$1, $$2, $$3);
         } else {
            il.c<czw> $$8 = $$1.b(u);
            il<czw> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(ajt.a($$10)).map($$0x -> ajs.a(ks.av, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  c.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(edk $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(ajs::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void aN_() {
      this.w = wg.c("createWorld.customize.presets.share");
      this.x = wg.c("createWorld.customize.presets.list");
      this.A = new fdy(this.m, 50, 40, this.k - 100, 20, this.w);
      this.A.f(1230);
      fol $$0 = this.v.a.m().k();
      iz $$1 = $$0.a();
      cmg $$2 = $$0.g().b();
      im<czw> $$3 = $$1.b(ks.av);
      im<efn> $$4 = $$1.b(ks.aH);
      im<eel> $$5 = $$1.b(ks.aE);
      im<dby> $$6 = $$1.b(ks.f).a($$2);
      this.A.a(a(this.v.l()));
      this.B = this.v.l();
      this.d(this.A);
      this.y = this.c(new fjk.a($$1, $$2));
      this.z = this.c(fdp.a(wg.c("createWorld.customize.presets.select"), $$4x -> {
         edk $$5x = a($$6, $$3, $$4, $$5, this.A.a(), this.B);
         this.v.a($$5x);
         this.j.a(this.v);
      }).a(this.k / 2 - 155, this.l - 28, 150, 20).a());
      this.c(fdp.a(wf.e, $$0x -> this.j.a(this.v)).a(this.k / 2 + 5, this.l - 28, 150, 20).a());
      this.c(this.y.h() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.y.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(fbp $$0, int $$1, int $$2) {
      String $$3 = this.A.a();
      this.b($$0, $$1, $$2);
      this.A.a($$3);
   }

   @Override
   public void d() {
      this.j.a(this.v);
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
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

   class a extends fel<fjk.a.a> {
      public a(iz $$0, cmg $$1) {
         super(fjk.this.j, fjk.this.k, fjk.this.l - 117, 80, 24);

         for (il<edi> $$2 : $$0.d(ks.aB).c(avg.a)) {
            Set<dby> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               fjk.c
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new fjk.a.a($$2));
            }
         }
      }

      public void a(@Nullable fjk.a.a $$0) {
         super.a($$0);
         fjk.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (fhq.a($$0) && this.h() != null) {
               this.h().b();
            }

            return false;
         }
      }

      public class a extends fel.a<fjk.a.a> {
         private static final ajt b = new ajt("textures/gui/container/stats_icons.png");
         private final edi c;
         private final wg d;

         public a(il<edi> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> wg.c($$0x.a().f("flat_world_preset"))).orElse(fjk.a);
         }

         @Override
         public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.a(fjk.this.m, this.d, $$3 + 18 + 5, $$2 + 6, 16777215, false);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            return super.a($$0, $$1, $$2);
         }

         void b() {
            a.this.a(this);
            fjk.this.B = this.c.b();
            fjk.this.A.a(fjk.a(fjk.this.B));
            fjk.this.A.b(false);
         }

         private void a(fdc $$0, int $$1, int $$2, cre $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new crj($$3), $$1 + 2, $$2 + 2);
         }

         private void a(fdc $$0, int $$1, int $$2) {
            $$0.a(fjk.b, $$1, $$2, 0, 18, 18);
         }

         @Override
         public wg a() {
            return wg.a("narrator.select", this.d);
         }
      }
   }
}

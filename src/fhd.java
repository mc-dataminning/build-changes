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

public class fhd extends fhh {
   static final ajh b = new ajh("container/slot");
   static final Logger c = LogUtils.getLogger();
   private static final int k = 18;
   private static final int l = 20;
   private static final int m = 1;
   private static final int n = 1;
   private static final int o = 2;
   private static final int p = 2;
   private static final ajg<cya> q = cyh.b;
   public static final vu a = vu.c("flat_world_preset.unknown");
   private final fgc r;
   private vu t;
   private vu u;
   private fhd.a v;
   private fbi w;
   fbr x;
   ebh y;

   public fhd(fgc $$0) {
      super(vu.c("createWorld.customize.presets.title"));
      this.r = $$0;
   }

   @Nullable
   private static ebe a(im<dac> $$0, String $$1, int $$2) {
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

      int $$9 = Math.min($$2 + $$5, dqo.c);
      int $$10 = $$9 - $$2;

      Optional<il.c<dac>> $$11;
      try {
         $$11 = $$0.a(ajg.a(kj.f, new ajh($$4)));
      } catch (Exception var10) {
         c.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         c.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new ebe($$10, $$11.get().a());
      }
   }

   private static List<ebe> a(im<dac> $$0, String $$1) {
      List<ebe> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         ebe $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         $$2.add($$6);
         $$4 += $$6.a();
      }

      return $$2;
   }

   public static ebh a(im<dac> $$0, im<cya> $$1, im<edk> $$2, im<eci> $$3, String $$4, ebh $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return ebh.a($$1, $$2, $$3);
      } else {
         List<ebe> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return ebh.a($$1, $$2, $$3);
         } else {
            il.c<cya> $$8 = $$1.b(q);
            il<cya> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(ajh.a($$10)).map($$0x -> ajg.a(kj.au, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  c.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(ebh $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(ajg::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void aO_() {
      this.t = vu.c("createWorld.customize.presets.share");
      this.u = vu.c("createWorld.customize.presets.list");
      this.x = new fbr(this.i, 50, 40, this.g - 100, 20, this.t);
      this.x.f(1230);
      fmf $$0 = this.r.a.o().k();
      iz $$1 = $$0.a();
      clh $$2 = $$0.g().b();
      im<cya> $$3 = $$1.b(kj.au);
      im<edk> $$4 = $$1.b(kj.aG);
      im<eci> $$5 = $$1.b(kj.aD);
      im<dac> $$6 = $$1.b(kj.f).a($$2);
      this.x.a(a(this.r.n()));
      this.y = this.r.n();
      this.d(this.x);
      this.v = this.c(new fhd.a($$1, $$2));
      this.w = this.c(fbi.a(vu.c("createWorld.customize.presets.select"), $$4x -> {
         ebh $$5x = a($$6, $$3, $$4, $$5, this.x.a(), this.y);
         this.r.a($$5x);
         this.f.a(this.r);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.c(fbi.a(vt.e, $$0x -> this.f.a(this.r)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.c(this.v.i() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.v.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ezi $$0, int $$1, int $$2) {
      String $$3 = this.x.a();
      this.b($$0, $$1, $$2);
      this.x.a($$3);
   }

   @Override
   public void d() {
      this.f.a(this.r);
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 400.0F);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.b(this.i, this.t, 51, 30, 10526880);
      $$0.b(this.i, this.u, 51, 70, 10526880);
      $$0.c().b();
      this.x.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void c(boolean $$0) {
      this.w.j = $$0 || this.x.a().length() > 1;
   }

   class a extends fce<fhd.a.a> {
      public a(iz $$0, clh $$1) {
         super(fhd.this.f, fhd.this.g, fhd.this.h - 117, 80, 24);

         for (il<ebf> $$2 : $$0.d(kj.aA).c(aur.a)) {
            Set<dac> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               fhd.c
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new fhd.a.a($$2));
            }
         }
      }

      public void a(@Nullable fhd.a.a $$0) {
         super.a($$0);
         fhd.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (ffj.a($$0) && this.i() != null) {
               this.i().b();
            }

            return false;
         }
      }

      public class a extends fce.a<fhd.a.a> {
         private static final ajh b = new ajh("textures/gui/container/stats_icons.png");
         private final ebf c;
         private final vu d;

         public a(il<ebf> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> vu.c($$0x.a().f("flat_world_preset"))).orElse(fhd.a);
         }

         @Override
         public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.a(fhd.this.i, this.d, $$3 + 18 + 5, $$2 + 6, 16777215, false);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            return true;
         }

         void b() {
            a.this.a(this);
            fhd.this.y = this.c.b();
            fhd.this.x.a(fhd.a(fhd.this.y));
            fhd.this.x.b(false);
         }

         private void a(fav $$0, int $$1, int $$2, cqh $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new cqm($$3), $$1 + 2, $$2 + 2);
         }

         private void a(fav $$0, int $$1, int $$2) {
            $$0.a(fhd.b, $$1, $$2, 0, 18, 18);
         }

         @Override
         public vu a() {
            return vu.a("narrator.select", this.d);
         }
      }
   }
}

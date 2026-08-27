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

public class exx extends eya {
   static final aer b = new aer("container/slot");
   static final Logger c = LogUtils.getLogger();
   private static final int k = 18;
   private static final int l = 20;
   private static final int m = 1;
   private static final int n = 1;
   private static final int o = 2;
   private static final int p = 2;
   private static final aeq<cqj> q = cqq.b;
   public static final tf a = tf.c("flat_world_preset.unknown");
   private final eww s;
   private tf t;
   private tf u;
   private exx.a v;
   private esg w;
   esp x;
   dtb y;

   public exx(eww $$0) {
      super(tf.c("createWorld.customize.presets.title"));
      this.s = $$0;
   }

   @Nullable
   private static dsy a(hf<csl> $$0, String $$1, int $$2) {
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

      int $$9 = Math.min($$2 + $$5, dii.c);
      int $$10 = $$9 - $$2;

      Optional<he.c<csl>> $$11;
      try {
         $$11 = $$0.a(aeq.a(jc.e, new aer($$4)));
      } catch (Exception var10) {
         c.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         c.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new dsy($$10, $$11.get().a());
      }
   }

   private static List<dsy> a(hf<csl> $$0, String $$1) {
      List<dsy> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         dsy $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         $$2.add($$6);
         $$4 += $$6.a();
      }

      return $$2;
   }

   public static dtb a(hf<csl> $$0, hf<cqj> $$1, hf<dve> $$2, hf<duc> $$3, String $$4, dtb $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return dtb.a($$1, $$2, $$3);
      } else {
         List<dsy> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return dtb.a($$1, $$2, $$3);
         } else {
            he.c<cqj> $$8 = $$1.b(q);
            he<cqj> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(aer.a($$10)).map($$0x -> aeq.a(jc.ap, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  c.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(dtb $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(aeq::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void aC_() {
      this.t = tf.c("createWorld.customize.presets.share");
      this.u = tf.c("createWorld.customize.presets.list");
      this.x = new esp(this.i, 50, 40, this.g - 100, 20, this.t);
      this.x.l(1230);
      fcw $$0 = this.s.a.l().k();
      hs $$1 = $$0.a();
      cdu $$2 = $$0.g().b();
      hf<cqj> $$3 = $$1.b(jc.ap);
      hf<dve> $$4 = $$1.b(jc.aB);
      hf<duc> $$5 = $$1.b(jc.ay);
      hf<csl> $$6 = $$1.b(jc.e).a($$2);
      this.x.a(a(this.s.k()));
      this.y = this.s.k();
      this.e(this.x);
      this.v = new exx.a($$1, $$2);
      this.e(this.v);
      this.w = this.d(esg.a(tf.c("createWorld.customize.presets.select"), $$4x -> {
         dtb $$5x = a($$6, $$3, $$4, $$5, this.x.a(), this.y);
         this.s.a($$5x);
         this.f.a(this.s);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(esg.a(te.e, $$0x -> this.f.a(this.s)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.c(this.v.f() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.v.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(eql $$0, int $$1, int $$2) {
      String $$3 = this.x.a();
      this.b($$0, $$1, $$2);
      this.x.a($$3);
   }

   @Override
   public void at_() {
      this.f.a(this.s);
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.v.a($$0, $$1, $$2, $$3);
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
      this.w.i = $$0 || this.x.a().length() > 1;
   }

   class a extends etc<exx.a.a> {
      public a(hs $$0, cdu $$1) {
         super(exx.this.f, exx.this.g, exx.this.h, 80, exx.this.h - 37, 24);

         for (he<dsz> $$2 : $$0.d(jc.av).c(app.a)) {
            Set<csl> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               exx.c
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new exx.a.a($$2));
            }
         }
      }

      public void a(@Nullable exx.a.a $$0) {
         super.a($$0);
         exx.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (ewd.a($$0) && this.f() != null) {
               this.f().b();
            }

            return false;
         }
      }

      public class a extends etc.a<exx.a.a> {
         private static final aer b = new aer("textures/gui/container/stats_icons.png");
         private final dsz c;
         private final tf d;

         public a(he<dsz> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> tf.c($$0x.a().f("flat_world_preset"))).orElse(exx.a);
         }

         @Override
         public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.a(exx.this.i, this.d, $$3 + 18 + 5, $$2 + 6, 16777215, false);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            if ($$2 == 0) {
               this.b();
            }

            return false;
         }

         void b() {
            a.this.a(this);
            exx.this.y = this.c.b();
            exx.this.x.a(exx.a(exx.this.y));
            exx.this.x.b(false);
         }

         private void a(erv $$0, int $$1, int $$2, cis $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new cix($$3), $$1 + 2, $$2 + 2);
         }

         private void a(erv $$0, int $$1, int $$2) {
            $$0.a(exx.b, $$1, $$2, 0, 18, 18);
         }

         @Override
         public tf a() {
            return tf.a("narrator.select", this.d);
         }
      }
   }
}

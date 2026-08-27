import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public class epd {
   public static final String a = "#";
   private static final Logger b = LogUtils.getLogger();
   private final Object2ObjectMap<String, eov> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<epg, List<eov>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, eox> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<eou, eov> f = new EnumMap<>(eou.class);
   private final Object2ObjectMap<String, eoy> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, eoy> h = new Object2ObjectOpenHashMap();

   @Nullable
   public eov a(@Nullable String $$0) {
      return (eov)this.c.get($$0);
   }

   public eov a(String $$0, epg $$1, vq $$2, epg.a $$3, boolean $$4, @Nullable xg $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         eov $$6 = new eov(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(epg $$0, epc $$1, Consumer<epb> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private eox f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new eox());
   }

   public epb c(epc $$0, eov $$1) {
      return this.a($$0, $$1, false);
   }

   public epb a(final epc $$0, final eov $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.c().e();
      eox $$4 = this.f($$0.cy());
      final MutableBoolean $$5 = new MutableBoolean();
      final epa $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new epb() {
         @Override
         public int a() {
            return $$6.a();
         }

         @Override
         public void a(int $$0x) {
            if (!$$3) {
               throw new IllegalStateException("Cannot modify read-only score");
            } else {
               boolean $$1 = $$5.isTrue();
               if ($$1.e()) {
                  vq $$2 = $$0.Q_();
                  if ($$2 != null && !$$2.equals($$6.d())) {
                     $$6.a($$2);
                     $$1 = true;
                  }
               }

               if ($$0 != $$6.a()) {
                  $$6.a($$0);
                  $$1 = true;
               }

               if ($$1) {
                  this.h();
               }
            }
         }

         @Nullable
         @Override
         public vq g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable vq $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable xg $$0x) {
            $$6.b($$0);
            this.h();
         }

         @Override
         public boolean d() {
            return $$6.b();
         }

         @Override
         public void e() {
            this.a(false);
         }

         @Override
         public void f() {
            this.a(true);
         }

         private void a(boolean $$0x) {
            $$6.a($$0);
            if ($$5.isTrue()) {
               this.h();
            }

            epd.this.a($$0, $$1);
         }

         private void h() {
            epd.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public eoz d(epc $$0, eov $$1) {
      eox $$2 = this.e.get($$0.cy());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<eow> i(eov $$0) {
      List<eow> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         epa $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new eow($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<eov> c() {
      return this.c.values();
   }

   public Collection<String> d() {
      return this.c.keySet();
   }

   public Collection<epc> e() {
      return this.e.keySet().stream().map(epc::d).toList();
   }

   public void b(epc $$0) {
      eox $$1 = this.e.remove($$0.cy());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(epc $$0, eov $$1) {
      eox $$2 = this.e.get($$0.cy());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            eox $$4 = this.e.remove($$0.cy());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<eov> c(epc $$0) {
      eox $$1 = this.e.get($$0.cy());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(eov $$0) {
      this.c.remove($$0.b());

      for (eou $$1 : eou.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<eov> $$2 = (List<eov>)this.d.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (eox $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(eou $$0, @Nullable eov $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public eov a(eou $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public eoy b(String $$0) {
      return (eoy)this.g.get($$0);
   }

   public eoy c(String $$0) {
      eoy $$1 = this.b($$0);
      if ($$1 != null) {
         b.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new eoy(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(eoy $$0) {
      this.g.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, eoy $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean d(String $$0) {
      eoy $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, eoy $$1) {
      if (this.e($$0) != $$1) {
         throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + $$1.b() + "'.");
      } else {
         this.h.remove($$0);
         $$1.g().remove($$0);
      }
   }

   public Collection<String> f() {
      return this.g.keySet();
   }

   public Collection<eoy> g() {
      return this.g.values();
   }

   @Nullable
   public eoy e(String $$0) {
      return (eoy)this.h.get($$0);
   }

   public void a(eov $$0) {
   }

   public void b(eov $$0) {
   }

   public void c(eov $$0) {
   }

   protected void a(epc $$0, eov $$1, epa $$2) {
   }

   protected void a(epc $$0, eov $$1) {
   }

   public void a(epc $$0) {
   }

   public void b(epc $$0, eov $$1) {
   }

   public void a(eoy $$0) {
   }

   public void b(eoy $$0) {
   }

   public void c(eoy $$0) {
   }

   public void a(bnq $$0) {
      if (!($$0 instanceof chl) && !$$0.bx()) {
         this.b($$0);
         this.d($$0.cy());
      }
   }

   protected tc h() {
      tc $$0 = new tc();
      this.e.forEach(($$1, $$2) -> $$2.c().forEach(($$2x, $$3) -> {
            sw $$4 = $$3.e();
            $$4.a("Name", $$1);
            $$4.a("Objective", $$2x.b());
            $$0.add($$4);
         }));
      return $$0;
   }

   protected void a(tc $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         sw $$2 = $$0.a($$1);
         epa $$3 = epa.a($$2);
         String $$4 = $$2.l("Name");
         String $$5 = $$2.l("Objective");
         eov $$6 = this.a($$5);
         if ($$6 == null) {
            b.error("Unknown objective {} for name {}, ignoring", $$5, $$4);
         } else {
            this.f($$4).a($$6, $$3);
         }
      }
   }
}

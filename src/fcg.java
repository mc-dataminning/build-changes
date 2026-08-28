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

public class fcg {
   public static final String a = "#";
   private static final Logger b = LogUtils.getLogger();
   private final Object2ObjectMap<String, fby> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<fcj, List<fby>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, fca> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<fbx, fby> f = new EnumMap<>(fbx.class);
   private final Object2ObjectMap<String, fcb> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, fcb> h = new Object2ObjectOpenHashMap();

   @Nullable
   public fby a(@Nullable String $$0) {
      return (fby)this.c.get($$0);
   }

   public fby a(String $$0, fcj $$1, wp $$2, fcj.a $$3, boolean $$4, @Nullable yf $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         fby $$6 = new fby(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(fcj $$0, fcf $$1, Consumer<fce> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private fca f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new fca());
   }

   public fce c(fcf $$0, fby $$1) {
      return this.a($$0, $$1, false);
   }

   public fce a(final fcf $$0, final fby $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.c().e();
      fca $$4 = this.f($$0.cI());
      final MutableBoolean $$5 = new MutableBoolean();
      final fcd $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new fce() {
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
                  wp $$2 = $$0.p_();
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
         public wp g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable wp $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable yf $$0x) {
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

            fcg.this.a($$0, $$1);
         }

         private void h() {
            fcg.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public fcc d(fcf $$0, fby $$1) {
      fca $$2 = this.e.get($$0.cI());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<fbz> i(fby $$0) {
      List<fbz> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         fcd $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new fbz($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<fby> c() {
      return this.c.values();
   }

   public Collection<String> d() {
      return this.c.keySet();
   }

   public Collection<fcf> e() {
      return this.e.keySet().stream().map(fcf::c).toList();
   }

   public void b(fcf $$0) {
      fca $$1 = this.e.remove($$0.cI());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(fcf $$0, fby $$1) {
      fca $$2 = this.e.get($$0.cI());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            fca $$4 = this.e.remove($$0.cI());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<fby> c(fcf $$0) {
      fca $$1 = this.e.get($$0.cI());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(fby $$0) {
      this.c.remove($$0.b());

      for (fbx $$1 : fbx.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<fby> $$2 = (List<fby>)this.d.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (fca $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(fbx $$0, @Nullable fby $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public fby a(fbx $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public fcb b(String $$0) {
      return (fcb)this.g.get($$0);
   }

   public fcb c(String $$0) {
      fcb $$1 = this.b($$0);
      if ($$1 != null) {
         b.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new fcb(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(fcb $$0) {
      this.g.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, fcb $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean d(String $$0) {
      fcb $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, fcb $$1) {
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

   public Collection<fcb> g() {
      return this.g.values();
   }

   @Nullable
   public fcb e(String $$0) {
      return (fcb)this.h.get($$0);
   }

   public void a(fby $$0) {
   }

   public void b(fby $$0) {
   }

   public void c(fby $$0) {
   }

   protected void a(fcf $$0, fby $$1, fcd $$2) {
   }

   protected void a(fcf $$0, fby $$1) {
   }

   public void a(fcf $$0) {
   }

   public void b(fcf $$0, fby $$1) {
   }

   public void a(fcb $$0) {
   }

   public void b(fcb $$0) {
   }

   public void c(fcb $$0) {
   }

   public void a(bum $$0) {
      if (!($$0 instanceof coy) && !$$0.bL()) {
         this.b($$0);
         this.d($$0.cI());
      }
   }

   protected tw a(jt.a $$0) {
      tw $$1 = new tw();
      this.e.forEach(($$2, $$3) -> $$3.c().forEach(($$3x, $$4) -> {
            tq $$5 = $$4.a($$0);
            $$5.a("Name", $$2);
            $$5.a("Objective", $$3x.b());
            $$1.add($$5);
         }));
      return $$1;
   }

   protected void a(tw $$0, jt.a $$1) {
      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         tq $$3 = $$0.a($$2);
         fcd $$4 = fcd.a($$3, $$1);
         String $$5 = $$3.l("Name");
         String $$6 = $$3.l("Objective");
         fby $$7 = this.a($$6);
         if ($$7 == null) {
            b.error("Unknown objective {} for name {}, ignoring", $$6, $$5);
         } else {
            this.f($$5).a($$7, $$4);
         }
      }
   }
}

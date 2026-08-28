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

public class fam {
   public static final String a = "#";
   private static final Logger b = LogUtils.getLogger();
   private final Object2ObjectMap<String, fae> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<fap, List<fae>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, fag> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<fad, fae> f = new EnumMap<>(fad.class);
   private final Object2ObjectMap<String, fah> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, fah> h = new Object2ObjectOpenHashMap();

   @Nullable
   public fae a(@Nullable String $$0) {
      return (fae)this.c.get($$0);
   }

   public fae a(String $$0, fap $$1, xh $$2, fap.a $$3, boolean $$4, @Nullable yx $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         fae $$6 = new fae(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(fap $$0, fal $$1, Consumer<fak> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private fag f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new fag());
   }

   public fak c(fal $$0, fae $$1) {
      return this.a($$0, $$1, false);
   }

   public fak a(final fal $$0, final fae $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.c().e();
      fag $$4 = this.f($$0.cJ());
      final MutableBoolean $$5 = new MutableBoolean();
      final faj $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new fak() {
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
                  xh $$2 = $$0.S_();
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
         public xh g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable xh $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable yx $$0x) {
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

            fam.this.a($$0, $$1);
         }

         private void h() {
            fam.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public fai d(fal $$0, fae $$1) {
      fag $$2 = this.e.get($$0.cJ());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<faf> i(fae $$0) {
      List<faf> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         faj $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new faf($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<fae> c() {
      return this.c.values();
   }

   public Collection<String> d() {
      return this.c.keySet();
   }

   public Collection<fal> e() {
      return this.e.keySet().stream().map(fal::c).toList();
   }

   public void b(fal $$0) {
      fag $$1 = this.e.remove($$0.cJ());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(fal $$0, fae $$1) {
      fag $$2 = this.e.get($$0.cJ());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            fag $$4 = this.e.remove($$0.cJ());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<fae> c(fal $$0) {
      fag $$1 = this.e.get($$0.cJ());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(fae $$0) {
      this.c.remove($$0.b());

      for (fad $$1 : fad.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<fae> $$2 = (List<fae>)this.d.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (fag $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(fad $$0, @Nullable fae $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public fae a(fad $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public fah b(String $$0) {
      return (fah)this.g.get($$0);
   }

   public fah c(String $$0) {
      fah $$1 = this.b($$0);
      if ($$1 != null) {
         b.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new fah(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(fah $$0) {
      this.g.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, fah $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean d(String $$0) {
      fah $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, fah $$1) {
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

   public Collection<fah> g() {
      return this.g.values();
   }

   @Nullable
   public fah e(String $$0) {
      return (fah)this.h.get($$0);
   }

   public void a(fae $$0) {
   }

   public void b(fae $$0) {
   }

   public void c(fae $$0) {
   }

   protected void a(fal $$0, fae $$1, faj $$2) {
   }

   protected void a(fal $$0, fae $$1) {
   }

   public void a(fal $$0) {
   }

   public void b(fal $$0, fae $$1) {
   }

   public void a(fah $$0) {
   }

   public void b(fah $$0) {
   }

   public void c(fah $$0) {
   }

   public void a(btz $$0) {
      if (!($$0 instanceof coh) && !$$0.bM()) {
         this.b($$0);
         this.d($$0.cJ());
      }
   }

   protected up a(jr.a $$0) {
      up $$1 = new up();
      this.e.forEach(($$2, $$3) -> $$3.c().forEach(($$3x, $$4) -> {
            uj $$5 = $$4.a($$0);
            $$5.a("Name", $$2);
            $$5.a("Objective", $$3x.b());
            $$1.add($$5);
         }));
      return $$1;
   }

   protected void a(up $$0, jr.a $$1) {
      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         uj $$3 = $$0.a($$2);
         faj $$4 = faj.a($$3, $$1);
         String $$5 = $$3.l("Name");
         String $$6 = $$3.l("Objective");
         fae $$7 = this.a($$6);
         if ($$7 == null) {
            b.error("Unknown objective {} for name {}, ignoring", $$6, $$5);
         } else {
            this.f($$5).a($$7, $$4);
         }
      }
   }
}

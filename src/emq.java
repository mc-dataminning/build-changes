import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
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

public class emq {
   public static final String a = "#";
   private static final Logger b = LogUtils.getLogger();
   private final Map<String, emi> c = Maps.newHashMap();
   private final Map<emt, List<emi>> d = Maps.newHashMap();
   private final Map<String, emk> e = Maps.newHashMap();
   private final Map<emh, emi> f = new EnumMap<>(emh.class);
   private final Map<String, eml> g = Maps.newHashMap();
   private final Map<String, eml> h = Maps.newHashMap();

   @Nullable
   public emi a(@Nullable String $$0) {
      return this.c.get($$0);
   }

   public emi a(String $$0, emt $$1, vd $$2, emt.a $$3, boolean $$4, @Nullable wt $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         emi $$6 = new emi(this, $$0, $$1, $$2, $$3, $$4, $$5);
         this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList()).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(emt $$0, emp $$1, Consumer<emo> $$2) {
      this.d.getOrDefault($$0, Collections.emptyList()).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private emk f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new emk());
   }

   public emo c(emp $$0, emi $$1) {
      return this.a($$0, $$1, false);
   }

   public emo a(final emp $$0, final emi $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.c().e();
      emk $$4 = this.f($$0.cy());
      final MutableBoolean $$5 = new MutableBoolean();
      final emn $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new emo() {
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
                  vd $$2 = $$0.Q_();
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
         public vd g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable vd $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable wt $$0x) {
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

            emq.this.a($$0, $$1);
         }

         private void h() {
            emq.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public emm d(emp $$0, emi $$1) {
      emk $$2 = this.e.get($$0.cy());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<emj> i(emi $$0) {
      List<emj> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         emn $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new emj($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<emi> c() {
      return this.c.values();
   }

   public Collection<String> d() {
      return this.c.keySet();
   }

   public Collection<emp> e() {
      return this.e.keySet().stream().map(emp::d).toList();
   }

   public void b(emp $$0) {
      emk $$1 = this.e.remove($$0.cy());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(emp $$0, emi $$1) {
      emk $$2 = this.e.get($$0.cy());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            emk $$4 = this.e.remove($$0.cy());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<emi> c(emp $$0) {
      emk $$1 = this.e.get($$0.cy());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(emi $$0) {
      this.c.remove($$0.b());

      for (emh $$1 : emh.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<emi> $$2 = this.d.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (emk $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(emh $$0, @Nullable emi $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public emi a(emh $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public eml b(String $$0) {
      return this.g.get($$0);
   }

   public eml c(String $$0) {
      eml $$1 = this.b($$0);
      if ($$1 != null) {
         b.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new eml(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(eml $$0) {
      this.g.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, eml $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean d(String $$0) {
      eml $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, eml $$1) {
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

   public Collection<eml> g() {
      return this.g.values();
   }

   @Nullable
   public eml e(String $$0) {
      return this.h.get($$0);
   }

   public void a(emi $$0) {
   }

   public void b(emi $$0) {
   }

   public void c(emi $$0) {
   }

   protected void a(emp $$0, emi $$1, emn $$2) {
   }

   protected void a(emp $$0, emi $$1) {
   }

   public void a(emp $$0) {
   }

   public void b(emp $$0, emi $$1) {
   }

   public void a(eml $$0) {
   }

   public void b(eml $$0) {
   }

   public void c(eml $$0) {
   }

   public void a(blp $$0) {
      if (!($$0 instanceof cfb) && !$$0.bx()) {
         this.b($$0);
         this.d($$0.cy());
      }
   }

   protected sr h() {
      sr $$0 = new sr();
      this.e.forEach(($$1, $$2) -> $$2.c().forEach(($$2x, $$3) -> {
            sl $$4 = $$3.e();
            $$4.a("Name", $$1);
            $$4.a("Objective", $$2x.b());
            $$0.add($$4);
         }));
      return $$0;
   }

   protected void a(sr $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         sl $$2 = $$0.a($$1);
         emn $$3 = emn.a($$2);
         String $$4 = $$2.l("Name");
         String $$5 = $$2.l("Objective");
         emi $$6 = this.a($$5);
         if ($$6 == null) {
            b.error("Unknown objective {} for name {}, ignoring", $$5, $$4);
         } else {
            this.f($$4).a($$6, $$3);
         }
      }
   }
}

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

public class emx {
   public static final String a = "#";
   private static final Logger b = LogUtils.getLogger();
   private final Object2ObjectMap<String, emp> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<ena, List<emp>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, emr> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<emo, emp> f = new EnumMap<>(emo.class);
   private final Object2ObjectMap<String, ems> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, ems> h = new Object2ObjectOpenHashMap();

   @Nullable
   public emp a(@Nullable String $$0) {
      return (emp)this.c.get($$0);
   }

   public emp a(String $$0, ena $$1, vf $$2, ena.a $$3, boolean $$4, @Nullable wv $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         emp $$6 = new emp(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(ena $$0, emw $$1, Consumer<emv> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private emr f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new emr());
   }

   public emv c(emw $$0, emp $$1) {
      return this.a($$0, $$1, false);
   }

   public emv a(final emw $$0, final emp $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.c().e();
      emr $$4 = this.f($$0.cy());
      final MutableBoolean $$5 = new MutableBoolean();
      final emu $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new emv() {
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
                  vf $$2 = $$0.Q_();
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
         public vf g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable vf $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable wv $$0x) {
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

            emx.this.a($$0, $$1);
         }

         private void h() {
            emx.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public emt d(emw $$0, emp $$1) {
      emr $$2 = this.e.get($$0.cy());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<emq> i(emp $$0) {
      List<emq> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         emu $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new emq($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<emp> c() {
      return this.c.values();
   }

   public Collection<String> d() {
      return this.c.keySet();
   }

   public Collection<emw> e() {
      return this.e.keySet().stream().map(emw::d).toList();
   }

   public void b(emw $$0) {
      emr $$1 = this.e.remove($$0.cy());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(emw $$0, emp $$1) {
      emr $$2 = this.e.get($$0.cy());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            emr $$4 = this.e.remove($$0.cy());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<emp> c(emw $$0) {
      emr $$1 = this.e.get($$0.cy());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(emp $$0) {
      this.c.remove($$0.b());

      for (emo $$1 : emo.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<emp> $$2 = (List<emp>)this.d.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (emr $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(emo $$0, @Nullable emp $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public emp a(emo $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public ems b(String $$0) {
      return (ems)this.g.get($$0);
   }

   public ems c(String $$0) {
      ems $$1 = this.b($$0);
      if ($$1 != null) {
         b.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new ems(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(ems $$0) {
      this.g.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, ems $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean d(String $$0) {
      ems $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, ems $$1) {
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

   public Collection<ems> g() {
      return this.g.values();
   }

   @Nullable
   public ems e(String $$0) {
      return (ems)this.h.get($$0);
   }

   public void a(emp $$0) {
   }

   public void b(emp $$0) {
   }

   public void c(emp $$0) {
   }

   protected void a(emw $$0, emp $$1, emu $$2) {
   }

   protected void a(emw $$0, emp $$1) {
   }

   public void a(emw $$0) {
   }

   public void b(emw $$0, emp $$1) {
   }

   public void a(ems $$0) {
   }

   public void b(ems $$0) {
   }

   public void c(ems $$0) {
   }

   public void a(blv $$0) {
      if (!($$0 instanceof cfi) && !$$0.bx()) {
         this.b($$0);
         this.d($$0.cy());
      }
   }

   protected st h() {
      st $$0 = new st();
      this.e.forEach(($$1, $$2) -> $$2.c().forEach(($$2x, $$3) -> {
            sn $$4 = $$3.e();
            $$4.a("Name", $$1);
            $$4.a("Objective", $$2x.b());
            $$0.add($$4);
         }));
      return $$0;
   }

   protected void a(st $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         sn $$2 = $$0.a($$1);
         emu $$3 = emu.a($$2);
         String $$4 = $$2.l("Name");
         String $$5 = $$2.l("Objective");
         emp $$6 = this.a($$5);
         if ($$6 == null) {
            b.error("Unknown objective {} for name {}, ignoring", $$5, $$4);
         } else {
            this.f($$4).a($$6, $$3);
         }
      }
   }
}

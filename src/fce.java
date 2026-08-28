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

public class fce {
   public static final String a = "#";
   private static final Logger b = LogUtils.getLogger();
   private final Object2ObjectMap<String, fbw> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<fch, List<fbw>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, fby> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<fbv, fbw> f = new EnumMap<>(fbv.class);
   private final Object2ObjectMap<String, fbz> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, fbz> h = new Object2ObjectOpenHashMap();

   @Nullable
   public fbw a(@Nullable String $$0) {
      return (fbw)this.c.get($$0);
   }

   public fbw a(String $$0, fch $$1, wp $$2, fch.a $$3, boolean $$4, @Nullable yf $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         fbw $$6 = new fbw(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(fch $$0, fcd $$1, Consumer<fcc> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private fby f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new fby());
   }

   public fcc c(fcd $$0, fbw $$1) {
      return this.a($$0, $$1, false);
   }

   public fcc a(final fcd $$0, final fbw $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.c().e();
      fby $$4 = this.f($$0.cI());
      final MutableBoolean $$5 = new MutableBoolean();
      final fcb $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new fcc() {
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

            fce.this.a($$0, $$1);
         }

         private void h() {
            fce.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public fca d(fcd $$0, fbw $$1) {
      fby $$2 = this.e.get($$0.cI());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<fbx> i(fbw $$0) {
      List<fbx> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         fcb $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new fbx($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<fbw> c() {
      return this.c.values();
   }

   public Collection<String> d() {
      return this.c.keySet();
   }

   public Collection<fcd> e() {
      return this.e.keySet().stream().map(fcd::c).toList();
   }

   public void b(fcd $$0) {
      fby $$1 = this.e.remove($$0.cI());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(fcd $$0, fbw $$1) {
      fby $$2 = this.e.get($$0.cI());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            fby $$4 = this.e.remove($$0.cI());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<fbw> c(fcd $$0) {
      fby $$1 = this.e.get($$0.cI());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(fbw $$0) {
      this.c.remove($$0.b());

      for (fbv $$1 : fbv.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<fbw> $$2 = (List<fbw>)this.d.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (fby $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(fbv $$0, @Nullable fbw $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public fbw a(fbv $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public fbz b(String $$0) {
      return (fbz)this.g.get($$0);
   }

   public fbz c(String $$0) {
      fbz $$1 = this.b($$0);
      if ($$1 != null) {
         b.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new fbz(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(fbz $$0) {
      this.g.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, fbz $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean d(String $$0) {
      fbz $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, fbz $$1) {
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

   public Collection<fbz> g() {
      return this.g.values();
   }

   @Nullable
   public fbz e(String $$0) {
      return (fbz)this.h.get($$0);
   }

   public void a(fbw $$0) {
   }

   public void b(fbw $$0) {
   }

   public void c(fbw $$0) {
   }

   protected void a(fcd $$0, fbw $$1, fcb $$2) {
   }

   protected void a(fcd $$0, fbw $$1) {
   }

   public void a(fcd $$0) {
   }

   public void b(fcd $$0, fbw $$1) {
   }

   public void a(fbz $$0) {
   }

   public void b(fbz $$0) {
   }

   public void c(fbz $$0) {
   }

   public void a(buk $$0) {
      if (!($$0 instanceof cow) && !$$0.bL()) {
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
         fcb $$4 = fcb.a($$3, $$1);
         String $$5 = $$3.l("Name");
         String $$6 = $$3.l("Objective");
         fbw $$7 = this.a($$6);
         if ($$7 == null) {
            b.error("Unknown objective {} for name {}, ignoring", $$6, $$5);
         } else {
            this.f($$5).a($$7, $$4);
         }
      }
   }
}

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

public class ezx {
   public static final String a = "#";
   private static final Logger b = LogUtils.getLogger();
   private final Object2ObjectMap<String, ezp> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<faa, List<ezp>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, ezr> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<ezo, ezp> f = new EnumMap<>(ezo.class);
   private final Object2ObjectMap<String, ezs> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, ezs> h = new Object2ObjectOpenHashMap();

   @Nullable
   public ezp a(@Nullable String $$0) {
      return (ezp)this.c.get($$0);
   }

   public ezp a(String $$0, faa $$1, xd $$2, faa.a $$3, boolean $$4, @Nullable yt $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         ezp $$6 = new ezp(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(faa $$0, ezw $$1, Consumer<ezv> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private ezr f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new ezr());
   }

   public ezv c(ezw $$0, ezp $$1) {
      return this.a($$0, $$1, false);
   }

   public ezv a(final ezw $$0, final ezp $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.c().e();
      ezr $$4 = this.f($$0.cF());
      final MutableBoolean $$5 = new MutableBoolean();
      final ezu $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new ezv() {
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
                  xd $$2 = $$0.Q_();
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
         public xd g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable xd $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable yt $$0x) {
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

            ezx.this.a($$0, $$1);
         }

         private void h() {
            ezx.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public ezt d(ezw $$0, ezp $$1) {
      ezr $$2 = this.e.get($$0.cF());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<ezq> i(ezp $$0) {
      List<ezq> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         ezu $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new ezq($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<ezp> c() {
      return this.c.values();
   }

   public Collection<String> d() {
      return this.c.keySet();
   }

   public Collection<ezw> e() {
      return this.e.keySet().stream().map(ezw::c).toList();
   }

   public void b(ezw $$0) {
      ezr $$1 = this.e.remove($$0.cF());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(ezw $$0, ezp $$1) {
      ezr $$2 = this.e.get($$0.cF());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            ezr $$4 = this.e.remove($$0.cF());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<ezp> c(ezw $$0) {
      ezr $$1 = this.e.get($$0.cF());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(ezp $$0) {
      this.c.remove($$0.b());

      for (ezo $$1 : ezo.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<ezp> $$2 = (List<ezp>)this.d.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (ezr $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(ezo $$0, @Nullable ezp $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public ezp a(ezo $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public ezs b(String $$0) {
      return (ezs)this.g.get($$0);
   }

   public ezs c(String $$0) {
      ezs $$1 = this.b($$0);
      if ($$1 != null) {
         b.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new ezs(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(ezs $$0) {
      this.g.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, ezs $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean d(String $$0) {
      ezs $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, ezs $$1) {
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

   public Collection<ezs> g() {
      return this.g.values();
   }

   @Nullable
   public ezs e(String $$0) {
      return (ezs)this.h.get($$0);
   }

   public void a(ezp $$0) {
   }

   public void b(ezp $$0) {
   }

   public void c(ezp $$0) {
   }

   protected void a(ezw $$0, ezp $$1, ezu $$2) {
   }

   protected void a(ezw $$0, ezp $$1) {
   }

   public void a(ezw $$0) {
   }

   public void b(ezw $$0, ezp $$1) {
   }

   public void a(ezs $$0) {
   }

   public void b(ezs $$0) {
   }

   public void c(ezs $$0) {
   }

   public void a(bto $$0) {
      if (!($$0 instanceof cnu) && !$$0.bI()) {
         this.b($$0);
         this.d($$0.cF());
      }
   }

   protected ul a(jp.a $$0) {
      ul $$1 = new ul();
      this.e.forEach(($$2, $$3) -> $$3.c().forEach(($$3x, $$4) -> {
            uf $$5 = $$4.a($$0);
            $$5.a("Name", $$2);
            $$5.a("Objective", $$3x.b());
            $$1.add($$5);
         }));
      return $$1;
   }

   protected void a(ul $$0, jp.a $$1) {
      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         uf $$3 = $$0.a($$2);
         ezu $$4 = ezu.a($$3, $$1);
         String $$5 = $$3.l("Name");
         String $$6 = $$3.l("Objective");
         ezp $$7 = this.a($$6);
         if ($$7 == null) {
            b.error("Unknown objective {} for name {}, ignoring", $$6, $$5);
         } else {
            this.f($$5).a($$7, $$4);
         }
      }
   }
}

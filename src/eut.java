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

public class eut {
   public static final String a = "#";
   private static final Logger b = LogUtils.getLogger();
   private final Object2ObjectMap<String, eul> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<euw, List<eul>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, eun> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<euk, eul> f = new EnumMap<>(euk.class);
   private final Object2ObjectMap<String, euo> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, euo> h = new Object2ObjectOpenHashMap();

   @Nullable
   public eul a(@Nullable String $$0) {
      return (eul)this.c.get($$0);
   }

   public eul a(String $$0, euw $$1, wu $$2, euw.a $$3, boolean $$4, @Nullable yk $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         eul $$6 = new eul(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(euw $$0, eus $$1, Consumer<eur> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private eun f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new eun());
   }

   public eur c(eus $$0, eul $$1) {
      return this.a($$0, $$1, false);
   }

   public eur a(final eus $$0, final eul $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.c().e();
      eun $$4 = this.f($$0.cz());
      final MutableBoolean $$5 = new MutableBoolean();
      final euq $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new eur() {
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
                  wu $$2 = $$0.O_();
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
         public wu g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable wu $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable yk $$0x) {
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

            eut.this.a($$0, $$1);
         }

         private void h() {
            eut.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public eup d(eus $$0, eul $$1) {
      eun $$2 = this.e.get($$0.cz());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<eum> i(eul $$0) {
      List<eum> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         euq $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new eum($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<eul> c() {
      return this.c.values();
   }

   public Collection<String> d() {
      return this.c.keySet();
   }

   public Collection<eus> e() {
      return this.e.keySet().stream().map(eus::c).toList();
   }

   public void b(eus $$0) {
      eun $$1 = this.e.remove($$0.cz());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(eus $$0, eul $$1) {
      eun $$2 = this.e.get($$0.cz());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            eun $$4 = this.e.remove($$0.cz());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<eul> c(eus $$0) {
      eun $$1 = this.e.get($$0.cz());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(eul $$0) {
      this.c.remove($$0.b());

      for (euk $$1 : euk.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<eul> $$2 = (List<eul>)this.d.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (eun $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(euk $$0, @Nullable eul $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public eul a(euk $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public euo b(String $$0) {
      return (euo)this.g.get($$0);
   }

   public euo c(String $$0) {
      euo $$1 = this.b($$0);
      if ($$1 != null) {
         b.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new euo(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(euo $$0) {
      this.g.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, euo $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean d(String $$0) {
      euo $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, euo $$1) {
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

   public Collection<euo> g() {
      return this.g.values();
   }

   @Nullable
   public euo e(String $$0) {
      return (euo)this.h.get($$0);
   }

   public void a(eul $$0) {
   }

   public void b(eul $$0) {
   }

   public void c(eul $$0) {
   }

   protected void a(eus $$0, eul $$1, euq $$2) {
   }

   protected void a(eus $$0, eul $$1) {
   }

   public void a(eus $$0) {
   }

   public void b(eus $$0, eul $$1) {
   }

   public void a(euo $$0) {
   }

   public void b(euo $$0) {
   }

   public void c(euo $$0) {
   }

   public void a(brh $$0) {
      if (!($$0 instanceof clh) && !$$0.bB()) {
         this.b($$0);
         this.d($$0.cz());
      }
   }

   protected ug a(iy.a $$0) {
      ug $$1 = new ug();
      this.e.forEach(($$2, $$3) -> $$3.c().forEach(($$3x, $$4) -> {
            ua $$5 = $$4.a($$0);
            $$5.a("Name", $$2);
            $$5.a("Objective", $$3x.b());
            $$1.add($$5);
         }));
      return $$1;
   }

   protected void a(ug $$0, iy.a $$1) {
      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         ua $$3 = $$0.a($$2);
         euq $$4 = euq.a($$3, $$1);
         String $$5 = $$3.l("Name");
         String $$6 = $$3.l("Objective");
         eul $$7 = this.a($$6);
         if ($$7 == null) {
            b.error("Unknown objective {} for name {}, ignoring", $$6, $$5);
         } else {
            this.f($$5).a($$7, $$4);
         }
      }
   }
}

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eio {
   private static final Logger a = LogUtils.getLogger();
   private final Map<String, eil> b = Maps.newHashMap();
   private final Map<eir, List<eil>> c = Maps.newHashMap();
   private final Map<String, Map<eil, ein>> d = Maps.newHashMap();
   private final Map<eik, eil> e = new EnumMap<>(eik.class);
   private final Map<String, eim> f = Maps.newHashMap();
   private final Map<String, eim> g = Maps.newHashMap();

   @Nullable
   public eil b(@Nullable String $$0) {
      return this.b.get($$0);
   }

   public eil a(String $$0, eir $$1, tn $$2, eir.a $$3) {
      if (this.b.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         eil $$4 = new eil(this, $$0, $$1, $$2, $$3);
         this.c.computeIfAbsent($$1, $$0x -> Lists.newArrayList()).add($$4);
         this.b.put($$0, $$4);
         this.a($$4);
         return $$4;
      }
   }

   public final void a(eir $$0, String $$1, Consumer<ein> $$2) {
      this.c.getOrDefault($$0, Collections.emptyList()).forEach($$2x -> $$2.accept(this.c($$1, $$2x)));
   }

   public boolean b(String $$0, eil $$1) {
      Map<eil, ein> $$2 = this.d.get($$0);
      if ($$2 == null) {
         return false;
      } else {
         ein $$3 = $$2.get($$1);
         return $$3 != null;
      }
   }

   public ein c(String $$0, eil $$1) {
      Map<eil, ein> $$2 = this.d.computeIfAbsent($$0, $$0x -> Maps.newHashMap());
      return $$2.computeIfAbsent($$1, $$1x -> {
         ein $$2x = new ein(this, $$1x, $$0);
         $$2x.b(0);
         return $$2x;
      });
   }

   public Collection<ein> i(eil $$0) {
      List<ein> $$1 = Lists.newArrayList();

      for (Map<eil, ein> $$2 : this.d.values()) {
         ein $$3 = $$2.get($$0);
         if ($$3 != null) {
            $$1.add($$3);
         }
      }

      $$1.sort(ein.a);
      return $$1;
   }

   public Collection<eil> c() {
      return this.b.values();
   }

   public Collection<String> d() {
      return this.b.keySet();
   }

   public Collection<String> e() {
      return Lists.newArrayList(this.d.keySet());
   }

   public void d(String $$0, @Nullable eil $$1) {
      if ($$1 == null) {
         Map<eil, ein> $$2 = this.d.remove($$0);
         if ($$2 != null) {
            this.a($$0);
         }
      } else {
         Map<eil, ein> $$3 = this.d.get($$0);
         if ($$3 != null) {
            ein $$4 = $$3.remove($$1);
            if ($$3.size() < 1) {
               Map<eil, ein> $$5 = this.d.remove($$0);
               if ($$5 != null) {
                  this.a($$0);
               }
            } else if ($$4 != null) {
               this.a($$0, $$1);
            }
         }
      }
   }

   public Map<eil, ein> c(String $$0) {
      Map<eil, ein> $$1 = this.d.get($$0);
      if ($$1 == null) {
         $$1 = Maps.newHashMap();
      }

      return $$1;
   }

   public void j(eil $$0) {
      this.b.remove($$0.b());

      for (eik $$1 : eik.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<eil> $$2 = this.c.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (Map<eil, ein> $$3 : this.d.values()) {
         $$3.remove($$0);
      }

      this.c($$0);
   }

   public void a(eik $$0, @Nullable eil $$1) {
      this.e.put($$0, $$1);
   }

   @Nullable
   public eil a(eik $$0) {
      return this.e.get($$0);
   }

   @Nullable
   public eim d(String $$0) {
      return this.f.get($$0);
   }

   public eim e(String $$0) {
      eim $$1 = this.d($$0);
      if ($$1 != null) {
         a.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new eim(this, $$0);
         this.f.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(eim $$0) {
      this.f.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.g.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, eim $$1) {
      if (this.g($$0) != null) {
         this.f($$0);
      }

      this.g.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean f(String $$0) {
      eim $$1 = this.g($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, eim $$1) {
      if (this.g($$0) != $$1) {
         throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + $$1.b() + "'.");
      } else {
         this.g.remove($$0);
         $$1.g().remove($$0);
      }
   }

   public Collection<String> f() {
      return this.f.keySet();
   }

   public Collection<eim> g() {
      return this.f.values();
   }

   @Nullable
   public eim g(String $$0) {
      return this.g.get($$0);
   }

   public void a(eil $$0) {
   }

   public void b(eil $$0) {
   }

   public void c(eil $$0) {
   }

   public void a(ein $$0) {
   }

   public void a(String $$0) {
   }

   public void a(String $$0, eil $$1) {
   }

   public void a(eim $$0) {
   }

   public void b(eim $$0) {
   }

   public void c(eim $$0) {
   }

   public void a(bis $$0) {
      if (!($$0 instanceof cbw) && !$$0.bv()) {
         String $$1 = $$0.cw();
         this.d($$1, null);
         this.f($$1);
      }
   }

   protected re h() {
      re $$0 = new re();
      this.d.values().stream().map(Map::values).forEach($$1 -> $$1.forEach($$1x -> {
            qy $$2 = new qy();
            $$2.a("Name", $$1x.e());
            $$2.a("Objective", $$1x.d().b());
            $$2.a("Score", $$1x.b());
            $$2.a("Locked", $$1x.g());
            $$0.add($$2);
         }));
      return $$0;
   }

   protected void a(re $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         qy $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         String $$4 = $$2.l("Objective");
         eil $$5 = this.b($$4);
         if ($$5 == null) {
            a.error("Unknown objective {} for name {}, ignoring", $$4, $$3);
         } else {
            ein $$6 = this.c($$3, $$5);
            $$6.b($$2.h("Score"));
            if ($$2.e("Locked")) {
               $$6.a($$2.q("Locked"));
            }
         }
      }
   }
}

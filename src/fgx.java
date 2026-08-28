import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
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

public class fgx {
   public static final String b = "#";
   private static final Logger a = LogUtils.getLogger();
   private final Object2ObjectMap<String, fgp> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<fha, List<fgp>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, fgr> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<fgo, fgp> f = new EnumMap<>(fgo.class);
   private final Object2ObjectMap<String, fgs> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, fgs> h = new Object2ObjectOpenHashMap();

   @Nullable
   public fgp a(@Nullable String $$0) {
      return (fgp)this.c.get($$0);
   }

   public fgp a(String $$0, fha $$1, xc $$2, fha.a $$3, boolean $$4, @Nullable ys $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         fgp $$6 = new fgp(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(fha $$0, fgw $$1, Consumer<fgv> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private fgr f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new fgr());
   }

   public fgv c(fgw $$0, fgp $$1) {
      return this.a($$0, $$1, false);
   }

   public fgv a(final fgw $$0, final fgp $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.d().e();
      fgr $$4 = this.f($$0.cI());
      final MutableBoolean $$5 = new MutableBoolean();
      final fgu $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new fgv() {
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
               if ($$1.f()) {
                  xc $$2 = $$0.m_();
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
         public xc g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable xc $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable ys $$0x) {
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

            fgx.this.a($$0, $$1);
         }

         private void h() {
            fgx.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public fgt d(fgw $$0, fgp $$1) {
      fgr $$2 = this.e.get($$0.cI());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<fgq> i(fgp $$0) {
      List<fgq> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         fgu $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new fgq($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<fgp> b() {
      return this.c.values();
   }

   public Collection<String> c() {
      return this.c.keySet();
   }

   public Collection<fgw> d() {
      return this.e.keySet().stream().map(fgw::c).toList();
   }

   public void b(fgw $$0) {
      fgr $$1 = this.e.remove($$0.cI());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(fgw $$0, fgp $$1) {
      fgr $$2 = this.e.get($$0.cI());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            fgr $$4 = this.e.remove($$0.cI());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<fgp> c(fgw $$0) {
      fgr $$1 = this.e.get($$0.cI());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(fgp $$0) {
      this.c.remove($$0.c());

      for (fgo $$1 : fgo.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<fgp> $$2 = (List<fgp>)this.d.get($$0.d());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (fgr $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(fgo $$0, @Nullable fgp $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public fgp a(fgo $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public fgs b(String $$0) {
      return (fgs)this.g.get($$0);
   }

   public fgs c(String $$0) {
      fgs $$1 = this.b($$0);
      if ($$1 != null) {
         a.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new fgs(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(fgs $$0) {
      this.g.remove($$0.c());

      for (String $$1 : $$0.h()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, fgs $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.h().add($$0);
   }

   public boolean d(String $$0) {
      fgs $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, fgs $$1) {
      if (this.e($$0) != $$1) {
         throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + $$1.c() + "'.");
      } else {
         this.h.remove($$0);
         $$1.h().remove($$0);
      }
   }

   public Collection<String> e() {
      return this.g.keySet();
   }

   public Collection<fgs> f() {
      return this.g.values();
   }

   @Nullable
   public fgs e(String $$0) {
      return (fgs)this.h.get($$0);
   }

   public void a(fgp $$0) {
   }

   public void b(fgp $$0) {
   }

   public void c(fgp $$0) {
   }

   protected void a(fgw $$0, fgp $$1, fgu $$2) {
   }

   protected void a(fgw $$0, fgp $$1) {
   }

   public void a(fgw $$0) {
   }

   public void b(fgw $$0, fgp $$1) {
   }

   public void a(fgs $$0) {
   }

   public void b(fgs $$0) {
   }

   public void c(fgs $$0) {
   }

   public void a(bwv $$0) {
      if (!($$0 instanceof crz) && !$$0.bJ()) {
         this.b($$0);
         this.d($$0.cI());
      }
   }

   protected List<fgx.a> g() {
      return this.e.entrySet().stream().flatMap($$0 -> {
         String $$1 = $$0.getKey();
         return $$0.getValue().c().entrySet().stream().map($$1x -> new fgx.a($$1, ((fgp)$$1x.getKey()).c(), (fgu)$$1x.getValue()));
      }).toList();
   }

   protected void a(fgx.a $$0) {
      fgp $$1 = this.a($$0.c);
      if ($$1 == null) {
         a.error("Unknown objective {} for name {}, ignoring", $$0.c, $$0.b);
      } else {
         this.f($$0.b).a($$1, $$0.d);
      }
   }

   protected void a(fgs.a $$0) {
      fgs $$1 = this.c($$0.a());
      $$0.b().ifPresent($$1::a);
      $$0.c().ifPresent($$1::a);
      $$1.a($$0.d());
      $$1.b($$0.e());
      $$1.b($$0.f());
      $$1.c($$0.g());
      $$1.a($$0.h());
      $$1.b($$0.i());
      $$1.a($$0.j());

      for (String $$2 : $$0.k()) {
         this.a($$2, $$1);
      }
   }

   protected void a(fgp.a $$0) {
      this.a($$0.a(), $$0.b(), $$0.c(), $$0.d(), $$0.e(), $$0.f().orElse(null));
   }

   public static record a(String b, String c, fgu d) {
      public static final Codec<fgx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("Name").forGetter(fgx.a::a), Codec.STRING.fieldOf("Objective").forGetter(fgx.a::b), fgu.a.forGetter(fgx.a::c))
               .apply($$0, fgx.a::new)
      );

      public String a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public fgu c() {
         return this.d;
      }
   }
}

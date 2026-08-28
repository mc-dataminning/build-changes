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

public class ffn {
   public static final String b = "#";
   private static final Logger a = LogUtils.getLogger();
   private final Object2ObjectMap<String, fff> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<ffq, List<fff>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, ffh> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<ffe, fff> f = new EnumMap<>(ffe.class);
   private final Object2ObjectMap<String, ffi> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, ffi> h = new Object2ObjectOpenHashMap();

   @Nullable
   public fff a(@Nullable String $$0) {
      return (fff)this.c.get($$0);
   }

   public fff a(String $$0, ffq $$1, wy $$2, ffq.a $$3, boolean $$4, @Nullable yo $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         fff $$6 = new fff(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(ffq $$0, ffm $$1, Consumer<ffl> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private ffh f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new ffh());
   }

   public ffl c(ffm $$0, fff $$1) {
      return this.a($$0, $$1, false);
   }

   public ffl a(final ffm $$0, final fff $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.d().e();
      ffh $$4 = this.f($$0.cI());
      final MutableBoolean $$5 = new MutableBoolean();
      final ffk $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new ffl() {
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
                  wy $$2 = $$0.m_();
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
         public wy g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable wy $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable yo $$0x) {
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

            ffn.this.a($$0, $$1);
         }

         private void h() {
            ffn.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public ffj d(ffm $$0, fff $$1) {
      ffh $$2 = this.e.get($$0.cI());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<ffg> i(fff $$0) {
      List<ffg> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         ffk $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new ffg($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<fff> b() {
      return this.c.values();
   }

   public Collection<String> c() {
      return this.c.keySet();
   }

   public Collection<ffm> d() {
      return this.e.keySet().stream().map(ffm::c).toList();
   }

   public void b(ffm $$0) {
      ffh $$1 = this.e.remove($$0.cI());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(ffm $$0, fff $$1) {
      ffh $$2 = this.e.get($$0.cI());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            ffh $$4 = this.e.remove($$0.cI());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<fff> c(ffm $$0) {
      ffh $$1 = this.e.get($$0.cI());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(fff $$0) {
      this.c.remove($$0.c());

      for (ffe $$1 : ffe.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<fff> $$2 = (List<fff>)this.d.get($$0.d());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (ffh $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(ffe $$0, @Nullable fff $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public fff a(ffe $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public ffi b(String $$0) {
      return (ffi)this.g.get($$0);
   }

   public ffi c(String $$0) {
      ffi $$1 = this.b($$0);
      if ($$1 != null) {
         a.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new ffi(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(ffi $$0) {
      this.g.remove($$0.c());

      for (String $$1 : $$0.h()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, ffi $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.h().add($$0);
   }

   public boolean d(String $$0) {
      ffi $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, ffi $$1) {
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

   public Collection<ffi> f() {
      return this.g.values();
   }

   @Nullable
   public ffi e(String $$0) {
      return (ffi)this.h.get($$0);
   }

   public void a(fff $$0) {
   }

   public void b(fff $$0) {
   }

   public void c(fff $$0) {
   }

   protected void a(ffm $$0, fff $$1, ffk $$2) {
   }

   protected void a(ffm $$0, fff $$1) {
   }

   public void a(ffm $$0) {
   }

   public void b(ffm $$0, fff $$1) {
   }

   public void a(ffi $$0) {
   }

   public void b(ffi $$0) {
   }

   public void c(ffi $$0) {
   }

   public void a(bwd $$0) {
      if (!($$0 instanceof cqy) && !$$0.bK()) {
         this.b($$0);
         this.d($$0.cI());
      }
   }

   protected List<ffn.a> g() {
      return this.e.entrySet().stream().flatMap($$0 -> {
         String $$1 = $$0.getKey();
         return $$0.getValue().c().entrySet().stream().map($$1x -> new ffn.a($$1, ((fff)$$1x.getKey()).c(), (ffk)$$1x.getValue()));
      }).toList();
   }

   protected void a(ffn.a $$0) {
      fff $$1 = this.a($$0.c);
      if ($$1 == null) {
         a.error("Unknown objective {} for name {}, ignoring", $$0.c, $$0.b);
      } else {
         this.f($$0.b).a($$1, $$0.d);
      }
   }

   protected void a(ffi.a $$0) {
      ffi $$1 = this.c($$0.a());
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

   protected void a(fff.a $$0) {
      this.a($$0.a(), $$0.b(), $$0.c(), $$0.d(), $$0.e(), $$0.f().orElse(null));
   }

   public static record a(String b, String c, ffk d) {
      public static final Codec<ffn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("Name").forGetter(ffn.a::a), Codec.STRING.fieldOf("Objective").forGetter(ffn.a::b), ffk.a.forGetter(ffn.a::c))
               .apply($$0, ffn.a::new)
      );

      public String a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public ffk c() {
         return this.d;
      }
   }
}

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class al implements Comparable<al> {
   private static final DateTimeFormatter b = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z", Locale.ROOT);
   private static final Codec<Instant> c = ayu.a(b).xmap(Instant::from, $$0 -> $$0.atZone(ZoneId.systemDefault()));
   private static final Codec<Map<String, as>> d = Codec.unboundedMap(Codec.STRING, c)
      .xmap(
         $$0 -> ag.a($$0, as::new),
         $$0 -> $$0.entrySet()
               .stream()
               .filter($$0x -> ((as)$$0x.getValue()).a())
               .collect(Collectors.toMap(Entry::getKey, $$0x -> Objects.requireNonNull(((as)$$0x.getValue()).d())))
      );
   public static final Codec<al> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(d.optionalFieldOf("criteria", Map.of()).forGetter($$0x -> $$0x.e), Codec.BOOL.fieldOf("done").orElse(true).forGetter(al::a))
            .apply($$0, ($$0x, $$1) -> new al(new HashMap<>($$0x)))
   );
   private final Map<String, as> e;
   private am f = am.b;

   private al(Map<String, as> $$0) {
      this.e = $$0;
   }

   public al() {
      this.e = Maps.newHashMap();
   }

   public void a(am $$0) {
      Set<String> $$1 = $$0.c();
      this.e.entrySet().removeIf($$1x -> !$$1.contains($$1x.getKey()));

      for (String $$2 : $$1) {
         this.e.putIfAbsent($$2, new as());
      }

      this.f = $$0;
   }

   public boolean a() {
      return this.f.a(this::d);
   }

   public boolean b() {
      for (as $$0 : this.e.values()) {
         if ($$0.a()) {
            return true;
         }
      }

      return false;
   }

   public boolean a(String $$0) {
      as $$1 = this.e.get($$0);
      if ($$1 != null && !$$1.a()) {
         $$1.b();
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      as $$1 = this.e.get($$0);
      if ($$1 != null && $$1.a()) {
         $$1.c();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "AdvancementProgress{criteria=" + this.e + ", requirements=" + this.f + "}";
   }

   public void a(vu $$0) {
      $$0.a(this.e, vu::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static al b(vu $$0) {
      Map<String, as> $$1 = $$0.a(vu::p, as::b);
      return new al($$1);
   }

   @Nullable
   public as c(String $$0) {
      return this.e.get($$0);
   }

   private boolean d(String $$0) {
      as $$1 = this.c($$0);
      return $$1 != null && $$1.a();
   }

   public float c() {
      if (this.e.isEmpty()) {
         return 0.0F;
      } else {
         float $$0 = (float)this.f.a();
         float $$1 = (float)this.h();
         return $$1 / $$0;
      }
   }

   @Nullable
   public wy d() {
      if (this.e.isEmpty()) {
         return null;
      } else {
         int $$0 = this.f.a();
         if ($$0 <= 1) {
            return null;
         } else {
            int $$1 = this.h();
            return wy.a("advancements.progress", $$1, $$0);
         }
      }
   }

   private int h() {
      return this.f.b(this::d);
   }

   public Iterable<String> e() {
      List<String> $$0 = Lists.newArrayList();

      for (Entry<String, as> $$1 : this.e.entrySet()) {
         if (!$$1.getValue().a()) {
            $$0.add($$1.getKey());
         }
      }

      return $$0;
   }

   public Iterable<String> f() {
      List<String> $$0 = Lists.newArrayList();

      for (Entry<String, as> $$1 : this.e.entrySet()) {
         if ($$1.getValue().a()) {
            $$0.add($$1.getKey());
         }
      }

      return $$0;
   }

   @Nullable
   public Instant g() {
      return this.e.values().stream().map(as::d).filter(Objects::nonNull).min(Comparator.naturalOrder()).orElse(null);
   }

   public int a(al $$0) {
      Instant $$1 = this.g();
      Instant $$2 = $$0.g();
      if ($$1 == null && $$2 != null) {
         return 1;
      } else if ($$1 != null && $$2 == null) {
         return -1;
      } else {
         return $$1 == null && $$2 == null ? 0 : $$1.compareTo($$2);
      }
   }
}

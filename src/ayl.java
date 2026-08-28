import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.SequencedSet;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ayl<T> {
   private static final Logger a = LogUtils.getLogger();
   final ayl.a<T> b;
   private final String c;

   public ayl(ayl.a<T> $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Map<alz, List<ayl.b>> a(avv $$0) {
      Map<alz, List<ayl.b>> $$1 = new HashMap<>();
      als $$2 = als.a(this.c);

      for (Entry<alz, List<avt>> $$3 : $$2.b($$0).entrySet()) {
         alz $$4 = $$3.getKey();
         alz $$5 = $$2.b($$4);

         for (avt $$6 : $$3.getValue()) {
            try (Reader $$7 = $$6.e()) {
               JsonElement $$8 = JsonParser.parseReader($$7);
               List<ayl.b> $$9 = $$1.computeIfAbsent($$5, $$0x -> new ArrayList<>());
               ayj $$10 = (ayj)ayj.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow();
               if ($$10.b()) {
                  $$9.clear();
               }

               String $$11 = $$6.b();
               $$10.a().forEach($$2x -> $$9.add(new ayl.b($$2x, $$11)));
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), var17});
            }
         }
      }

      return $$1;
   }

   private Either<List<ayl.b>, List<T>> a(ayi.a<T> $$0, List<ayl.b> $$1) {
      SequencedSet<T> $$2 = new LinkedHashSet<>();
      List<ayl.b> $$3 = new ArrayList<>();

      for (ayl.b $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right(List.copyOf($$2)) : Either.left($$3);
   }

   public Map<alz, List<T>> a(Map<alz, List<ayl.b>> $$0) {
      final Map<alz, List<T>> $$1 = new HashMap<>();
      ayi.a<T> $$2 = new ayi.a<T>() {
         @Nullable
         @Override
         public T a(alz $$0, boolean $$1x) {
            return (T)ayl.this.b.get($$0, $$1).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> a(alz $$0) {
            return $$1.get($$0);
         }
      };
      azj<alz, ayl.d> $$3 = new azj<>();
      $$0.forEach(($$1x, $$2x) -> $$3.a($$1x, new ayl.d($$2x)));
      $$3.a(
         ($$2x, $$3x) -> this.a($$2, $$3x.a)
               .ifLeft(
                  $$1xx -> a.error(
                        "Couldn't load tag {} as it is missing following references: {}",
                        $$2x,
                        $$1xx.stream().map(Objects::toString).collect(Collectors.joining(", "))
                     )
               )
               .ifRight($$2xx -> $$1.put($$2x, $$2xx))
      );
      return $$1;
   }

   public static <T> void a(aym.a $$0, km<T> $$1) {
      $$0.a($$1).b.forEach($$1::a);
   }

   public static List<kd.a<?>> a(avv $$0, ke $$1) {
      return $$1.a().map($$1x -> a($$0, $$1x.b())).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
   }

   public static <T> void a(avv $$0, km<T> $$1) {
      aly<? extends kd<T>> $$2 = $$1.g();
      ayl<jq<T>> $$3 = new ayl<>(ayl.a.a($$1), mb.d($$2));
      $$3.a($$3.a($$0)).forEach(($$2x, $$3x) -> $$1.a(ayk.a($$2, $$2x), $$3x));
   }

   private static <T> Map<ayk<T>, List<jq<T>>> a(aly<? extends kd<T>> $$0, Map<alz, List<jq<T>>> $$1) {
      return $$1.entrySet().stream().collect(Collectors.toUnmodifiableMap($$1x -> ayk.a($$0, (alz)$$1x.getKey()), Entry::getValue));
   }

   private static <T> Optional<kd.a<T>> a(avv $$0, kd<T> $$1) {
      aly<? extends kd<T>> $$2 = $$1.g();
      ayl<jq<T>> $$3 = new ayl<>((ayl.a<jq<T>>)ayl.a.a($$1), mb.d($$2));
      ayl.c<T> $$4 = new ayl.c<>($$2, a($$1.g(), $$3.a($$3.a($$0))));
      return $$4.b().isEmpty() ? Optional.empty() : Optional.of($$1.a($$4));
   }

   public static List<js.b<?>> a(ke.b $$0, List<kd.a<?>> $$1) {
      List<js.b<?>> $$2 = new ArrayList<>();
      $$0.a().forEach($$2x -> {
         kd.a<?> $$3 = a($$1, $$2x.a());
         $$2.add((js.b<?>)($$3 != null ? $$3.c() : $$2x.b()));
      });
      return $$2;
   }

   @Nullable
   private static kd.a<?> a(List<kd.a<?>> $$0, aly<? extends kd<?>> $$1) {
      for (kd.a<?> $$2 : $$0) {
         if ($$2.a() == $$1) {
            return $$2;
         }
      }

      return null;
   }

   public interface a<T> {
      Optional<? extends T> get(alz var1, boolean var2);

      static <T> ayl.a<? extends jq<T>> a(kd<T> $$0) {
         return ($$1, $$2) -> $$0.c($$1);
      }

      static <T> ayl.a<jq<T>> a(km<T> $$0) {
         jr<T> $$1 = $$0.p();
         return ($$2, $$3) -> ((jr<T>)($$3 ? $$1 : $$0)).a(aly.a($$0.g(), $$2));
      }
   }

   public static record b(ayi a, String b) {

      @Override
      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }

   public static record c<T>(aly<? extends kd<T>> a, Map<ayk<T>, List<jq<T>>> b) {
   }

   static record d(List<ayl.b> a) implements azj.a<alz> {

      @Override
      public void a(Consumer<alz> $$0) {
         this.a.forEach($$1 -> $$1.a.a($$0));
      }

      @Override
      public void b(Consumer<alz> $$0) {
         this.a.forEach($$1 -> $$1.a.b($$0));
      }
   }
}

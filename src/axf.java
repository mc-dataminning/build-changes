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

public class axf<T> {
   private static final Logger a = LogUtils.getLogger();
   final axf.a<T> b;
   private final String c;

   public axf(axf.a<T> $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Map<aku, List<axf.b>> a(auo $$0) {
      Map<aku, List<axf.b>> $$1 = new HashMap<>();
      akn $$2 = akn.a(this.c);

      for (Entry<aku, List<aum>> $$3 : $$2.b($$0).entrySet()) {
         aku $$4 = $$3.getKey();
         aku $$5 = $$2.b($$4);

         for (aum $$6 : $$3.getValue()) {
            try (Reader $$7 = $$6.e()) {
               JsonElement $$8 = JsonParser.parseReader($$7);
               List<axf.b> $$9 = $$1.computeIfAbsent($$5, $$0x -> new ArrayList<>());
               axd $$10 = (axd)axd.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow();
               if ($$10.b()) {
                  $$9.clear();
               }

               String $$11 = $$6.b();
               $$10.a().forEach($$2x -> $$9.add(new axf.b($$2x, $$11)));
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), var17});
            }
         }
      }

      return $$1;
   }

   private Either<List<axf.b>, List<T>> a(axc.a<T> $$0, List<axf.b> $$1) {
      SequencedSet<T> $$2 = new LinkedHashSet<>();
      List<axf.b> $$3 = new ArrayList<>();

      for (axf.b $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right(List.copyOf($$2)) : Either.left($$3);
   }

   public Map<aku, List<T>> a(Map<aku, List<axf.b>> $$0) {
      final Map<aku, List<T>> $$1 = new HashMap<>();
      axc.a<T> $$2 = new axc.a<T>() {
         @Nullable
         @Override
         public T a(aku $$0, boolean $$1x) {
            return (T)axf.this.b.get($$0, $$1).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> a(aku $$0) {
            return $$1.get($$0);
         }
      };
      ayd<aku, axf.d> $$3 = new ayd<>();
      $$0.forEach(($$1x, $$2x) -> $$3.a($$1x, new axf.d($$2x)));
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

   public static <T> void a(axg.a $$0, kn<T> $$1) {
      $$0.a($$1).b.forEach($$1::a);
   }

   public static List<ke.a<?>> a(auo $$0, kf $$1) {
      return $$1.a().map($$1x -> a($$0, $$1x.b())).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
   }

   public static <T> void a(auo $$0, kn<T> $$1) {
      akt<? extends ke<T>> $$2 = $$1.g();
      axf<jr<T>> $$3 = new axf<>(axf.a.a($$1), mc.d($$2));
      $$3.a($$3.a($$0)).forEach(($$2x, $$3x) -> $$1.a(axe.a($$2, $$2x), $$3x));
   }

   private static <T> Map<axe<T>, List<jr<T>>> a(akt<? extends ke<T>> $$0, Map<aku, List<jr<T>>> $$1) {
      return $$1.entrySet().stream().collect(Collectors.toUnmodifiableMap($$1x -> axe.a($$0, (aku)$$1x.getKey()), Entry::getValue));
   }

   private static <T> Optional<ke.a<T>> a(auo $$0, ke<T> $$1) {
      akt<? extends ke<T>> $$2 = $$1.g();
      axf<jr<T>> $$3 = new axf<>((axf.a<jr<T>>)axf.a.a($$1), mc.d($$2));
      axf.c<T> $$4 = new axf.c<>($$2, a($$1.g(), $$3.a($$3.a($$0))));
      return $$4.b().isEmpty() ? Optional.empty() : Optional.of($$1.a($$4));
   }

   public static List<jt.b<?>> a(kf.b $$0, List<ke.a<?>> $$1) {
      List<jt.b<?>> $$2 = new ArrayList<>();
      $$0.a().forEach($$2x -> {
         ke.a<?> $$3 = a($$1, $$2x.a());
         $$2.add((jt.b<?>)($$3 != null ? $$3.c() : $$2x.b()));
      });
      return $$2;
   }

   @Nullable
   private static ke.a<?> a(List<ke.a<?>> $$0, akt<? extends ke<?>> $$1) {
      for (ke.a<?> $$2 : $$0) {
         if ($$2.a() == $$1) {
            return $$2;
         }
      }

      return null;
   }

   public interface a<T> {
      Optional<? extends T> get(aku var1, boolean var2);

      static <T> axf.a<? extends jr<T>> a(ke<T> $$0) {
         return ($$1, $$2) -> $$0.c($$1);
      }

      static <T> axf.a<jr<T>> a(kn<T> $$0) {
         js<T> $$1 = $$0.p();
         return ($$2, $$3) -> ((js<T>)($$3 ? $$1 : $$0)).a(akt.a($$0.g(), $$2));
      }
   }

   public static record b(axc a, String b) {

      @Override
      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }

   public static record c<T>(akt<? extends ke<T>> a, Map<axe<T>, List<jr<T>>> b) {
   }

   static record d(List<axf.b> a) implements ayd.a<aku> {

      @Override
      public void a(Consumer<aku> $$0) {
         this.a.forEach($$1 -> $$1.a.a($$0));
      }

      @Override
      public void b(Consumer<aku> $$0) {
         this.a.forEach($$1 -> $$1.a.b($$0));
      }
   }
}

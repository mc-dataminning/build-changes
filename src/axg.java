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

public class axg<T> {
   private static final Logger a = LogUtils.getLogger();
   final axg.a<T> b;
   private final String c;

   public axg(axg.a<T> $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Map<akv, List<axg.b>> a(aup $$0) {
      Map<akv, List<axg.b>> $$1 = new HashMap<>();
      ako $$2 = ako.a(this.c);

      for (Entry<akv, List<aun>> $$3 : $$2.b($$0).entrySet()) {
         akv $$4 = $$3.getKey();
         akv $$5 = $$2.b($$4);

         for (aun $$6 : $$3.getValue()) {
            try (Reader $$7 = $$6.e()) {
               JsonElement $$8 = JsonParser.parseReader($$7);
               List<axg.b> $$9 = $$1.computeIfAbsent($$5, $$0x -> new ArrayList<>());
               axe $$10 = (axe)axe.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow();
               if ($$10.b()) {
                  $$9.clear();
               }

               String $$11 = $$6.b();
               $$10.a().forEach($$2x -> $$9.add(new axg.b($$2x, $$11)));
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), var17});
            }
         }
      }

      return $$1;
   }

   private Either<List<axg.b>, List<T>> a(axd.a<T> $$0, List<axg.b> $$1) {
      SequencedSet<T> $$2 = new LinkedHashSet<>();
      List<axg.b> $$3 = new ArrayList<>();

      for (axg.b $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right(List.copyOf($$2)) : Either.left($$3);
   }

   public Map<akv, List<T>> a(Map<akv, List<axg.b>> $$0) {
      final Map<akv, List<T>> $$1 = new HashMap<>();
      axd.a<T> $$2 = new axd.a<T>() {
         @Nullable
         @Override
         public T a(akv $$0, boolean $$1x) {
            return (T)axg.this.b.get($$0, $$1).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> a(akv $$0) {
            return $$1.get($$0);
         }
      };
      aye<akv, axg.d> $$3 = new aye<>();
      $$0.forEach(($$1x, $$2x) -> $$3.a($$1x, new axg.d($$2x)));
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

   public static <T> void a(axh.a $$0, kn<T> $$1) {
      $$0.a($$1).b.forEach($$1::a);
   }

   public static List<ke.a<?>> a(aup $$0, kf $$1) {
      return $$1.a().map($$1x -> a($$0, $$1x.b())).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
   }

   public static <T> void a(aup $$0, kn<T> $$1) {
      aku<? extends ke<T>> $$2 = $$1.g();
      axg<jr<T>> $$3 = new axg<>(axg.a.a($$1), mc.d($$2));
      $$3.a($$3.a($$0)).forEach(($$2x, $$3x) -> $$1.a(axf.a($$2, $$2x), $$3x));
   }

   private static <T> Map<axf<T>, List<jr<T>>> a(aku<? extends ke<T>> $$0, Map<akv, List<jr<T>>> $$1) {
      return $$1.entrySet().stream().collect(Collectors.toUnmodifiableMap($$1x -> axf.a($$0, (akv)$$1x.getKey()), Entry::getValue));
   }

   private static <T> Optional<ke.a<T>> a(aup $$0, ke<T> $$1) {
      aku<? extends ke<T>> $$2 = $$1.g();
      axg<jr<T>> $$3 = new axg<>((axg.a<jr<T>>)axg.a.a($$1), mc.d($$2));
      axg.c<T> $$4 = new axg.c<>($$2, a($$1.g(), $$3.a($$3.a($$0))));
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
   private static ke.a<?> a(List<ke.a<?>> $$0, aku<? extends ke<?>> $$1) {
      for (ke.a<?> $$2 : $$0) {
         if ($$2.a() == $$1) {
            return $$2;
         }
      }

      return null;
   }

   public interface a<T> {
      Optional<? extends T> get(akv var1, boolean var2);

      static <T> axg.a<? extends jr<T>> a(ke<T> $$0) {
         return ($$1, $$2) -> $$0.c($$1);
      }

      static <T> axg.a<jr<T>> a(kn<T> $$0) {
         js<T> $$1 = $$0.p();
         return ($$2, $$3) -> ((js<T>)($$3 ? $$1 : $$0)).a(aku.a($$0.g(), $$2));
      }
   }

   public static record b(axd a, String b) {

      @Override
      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }

   public static record c<T>(aku<? extends ke<T>> a, Map<axf<T>, List<jr<T>>> b) {
   }

   static record d(List<axg.b> a) implements aye.a<akv> {

      @Override
      public void a(Consumer<akv> $$0) {
         this.a.forEach($$1 -> $$1.a.a($$0));
      }

      @Override
      public void b(Consumer<akv> $$0) {
         this.a.forEach($$1 -> $$1.a.b($$0));
      }
   }
}

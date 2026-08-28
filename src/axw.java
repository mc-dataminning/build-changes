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

public class axw<T> {
   private static final Logger a = LogUtils.getLogger();
   final axw.a<T> b;
   private final String c;

   public axw(axw.a<T> $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Map<alk, List<axw.b>> a(avh $$0) {
      Map<alk, List<axw.b>> $$1 = new HashMap<>();
      ald $$2 = ald.a(this.c);

      for (Entry<alk, List<avf>> $$3 : $$2.b($$0).entrySet()) {
         alk $$4 = $$3.getKey();
         alk $$5 = $$2.b($$4);

         for (avf $$6 : $$3.getValue()) {
            try (Reader $$7 = $$6.e()) {
               JsonElement $$8 = JsonParser.parseReader($$7);
               List<axw.b> $$9 = $$1.computeIfAbsent($$5, $$0x -> new ArrayList<>());
               axu $$10 = (axu)axu.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow();
               if ($$10.b()) {
                  $$9.clear();
               }

               String $$11 = $$6.b();
               $$10.a().forEach($$2x -> $$9.add(new axw.b($$2x, $$11)));
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), var17});
            }
         }
      }

      return $$1;
   }

   private Either<List<axw.b>, List<T>> a(axt.a<T> $$0, List<axw.b> $$1) {
      SequencedSet<T> $$2 = new LinkedHashSet<>();
      List<axw.b> $$3 = new ArrayList<>();

      for (axw.b $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right(List.copyOf($$2)) : Either.left($$3);
   }

   public Map<alk, List<T>> a(Map<alk, List<axw.b>> $$0) {
      final Map<alk, List<T>> $$1 = new HashMap<>();
      axt.a<T> $$2 = new axt.a<T>() {
         @Nullable
         @Override
         public T a(alk $$0, boolean $$1x) {
            return (T)axw.this.b.get($$0, $$1).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> a(alk $$0) {
            return $$1.get($$0);
         }
      };
      ayu<alk, axw.d> $$3 = new ayu<>();
      $$0.forEach(($$1x, $$2x) -> $$3.a($$1x, new axw.d($$2x)));
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

   public static <T> void a(axx.a $$0, kc<T> $$1) {
      $$0.a($$1).b.forEach($$1::a);
   }

   public static List<jt.a<?>> a(avh $$0, ju $$1) {
      return $$1.a().map($$1x -> a($$0, $$1x.b())).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
   }

   public static <T> void a(avh $$0, kc<T> $$1) {
      alj<? extends jt<T>> $$2 = $$1.g();
      axw<jg<T>> $$3 = new axw<>(axw.a.a($$1), mi.d($$2));
      $$3.a($$3.a($$0)).forEach(($$2x, $$3x) -> $$1.a(axv.a($$2, $$2x), $$3x));
   }

   private static <T> Map<axv<T>, List<jg<T>>> a(alj<? extends jt<T>> $$0, Map<alk, List<jg<T>>> $$1) {
      return $$1.entrySet().stream().collect(Collectors.toUnmodifiableMap($$1x -> axv.a($$0, (alk)$$1x.getKey()), Entry::getValue));
   }

   private static <T> Optional<jt.a<T>> a(avh $$0, jt<T> $$1) {
      alj<? extends jt<T>> $$2 = $$1.g();
      axw<jg<T>> $$3 = new axw<>((axw.a<jg<T>>)axw.a.a($$1), mi.d($$2));
      axw.c<T> $$4 = new axw.c<>($$2, a($$1.g(), $$3.a($$3.a($$0))));
      return $$4.b().isEmpty() ? Optional.empty() : Optional.of($$1.a($$4));
   }

   public static List<ji.b<?>> a(ju.b $$0, List<jt.a<?>> $$1) {
      List<ji.b<?>> $$2 = new ArrayList<>();
      $$0.a().forEach($$2x -> {
         jt.a<?> $$3 = a($$1, $$2x.a());
         $$2.add((ji.b<?>)($$3 != null ? $$3.c() : $$2x.b()));
      });
      return $$2;
   }

   @Nullable
   private static jt.a<?> a(List<jt.a<?>> $$0, alj<? extends jt<?>> $$1) {
      for (jt.a<?> $$2 : $$0) {
         if ($$2.a() == $$1) {
            return $$2;
         }
      }

      return null;
   }

   public interface a<T> {
      Optional<? extends T> get(alk var1, boolean var2);

      static <T> axw.a<? extends jg<T>> a(jt<T> $$0) {
         return ($$1, $$2) -> $$0.c($$1);
      }

      static <T> axw.a<jg<T>> a(kc<T> $$0) {
         jh<T> $$1 = $$0.p();
         return ($$2, $$3) -> ((jh<T>)($$3 ? $$1 : $$0)).a(alj.a($$0.g(), $$2));
      }
   }

   public static record b(axt a, String b) {

      @Override
      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }

   public static record c<T>(alj<? extends jt<T>> a, Map<axv<T>, List<jg<T>>> b) {
   }

   static record d(List<axw.b> a) implements ayu.a<alk> {

      @Override
      public void a(Consumer<alk> $$0) {
         this.a.forEach($$1 -> $$1.a.a($$0));
      }

      @Override
      public void b(Consumer<alk> $$0) {
         this.a.forEach($$1 -> $$1.a.b($$0));
      }
   }
}

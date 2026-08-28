import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class ath {
   private static final Logger b = LogUtils.getLogger();
   public static Consumer<ath> a = $$0 -> {
   };
   private static final Map<ate, Path> c = af.a(() -> {
      synchronized (atg.class) {
         Builder<ate, Path> $$0 = ImmutableMap.builder();

         for (ate $$1 : ate.values()) {
            String $$2 = "/" + $$1.a() + "/.mcassetsroot";
            URL $$3 = atg.class.getResource($$2);
            if ($$3 == null) {
               b.error("File {} does not exist in classpath", $$2);
            } else {
               try {
                  URI $$4 = $$3.toURI();
                  String $$5 = $$4.getScheme();
                  if (!"jar".equals($$5) && !"file".equals($$5)) {
                     b.warn("Assets URL '{}' uses unexpected schema", $$4);
                  }

                  Path $$6 = a($$4);
                  $$0.put($$1, $$6.getParent());
               } catch (Exception var12) {
                  b.error("Couldn't resolve path to vanilla assets", var12);
               }
            }
         }

         return $$0.build();
      }
   });
   private final Set<Path> d = new LinkedHashSet<>();
   private final Map<ate, Set<Path>> e = new EnumMap<>(ate.class);
   private asu f = asu.a();
   private final Set<String> g = new HashSet<>();

   private static Path a(URI $$0) throws IOException {
      try {
         return Paths.get($$0);
      } catch (FileSystemNotFoundException var3) {
      } catch (Throwable var4) {
         b.warn("Unable to get path for: {}", $$0, var4);
      }

      try {
         FileSystems.newFileSystem($$0, Collections.emptyMap());
      } catch (FileSystemAlreadyExistsException var2) {
      }

      return Paths.get($$0);
   }

   private boolean b(Path $$0) {
      if (!Files.exists($$0)) {
         return false;
      } else if (!Files.isDirectory($$0)) {
         throw new IllegalArgumentException("Path " + $$0.toAbsolutePath() + " is not directory");
      } else {
         return true;
      }
   }

   private void c(Path $$0) {
      if (this.b($$0)) {
         this.d.add($$0);
      }
   }

   private void b(ate $$0, Path $$1) {
      if (this.b($$1)) {
         this.e.computeIfAbsent($$0, $$0x -> new LinkedHashSet<>()).add($$1);
      }
   }

   public ath a() {
      c.forEach(($$0, $$1) -> {
         this.c($$1.getParent());
         this.b($$0, $$1);
      });
      return this;
   }

   public ath a(ate $$0, Class<?> $$1) {
      Enumeration<URL> $$2 = null;

      try {
         $$2 = $$1.getClassLoader().getResources($$0.a() + "/");
      } catch (IOException var8) {
      }

      while ($$2 != null && $$2.hasMoreElements()) {
         URL $$3 = $$2.nextElement();

         try {
            URI $$4 = $$3.toURI();
            if ("file".equals($$4.getScheme())) {
               Path $$5 = Paths.get($$4);
               this.c($$5.getParent());
               this.b($$0, $$5);
            }
         } catch (Exception var7) {
            b.error("Failed to extract path from {}", $$3, var7);
         }
      }

      return this;
   }

   public ath b() {
      a.accept(this);
      return this;
   }

   public ath a(Path $$0) {
      this.c($$0);

      for (ate $$1 : ate.values()) {
         this.b($$1, $$0.resolve($$1.a()));
      }

      return this;
   }

   public ath a(ate $$0, Path $$1) {
      this.c($$1);
      this.b($$0, $$1);
      return this;
   }

   public ath a(asu $$0) {
      this.f = $$0;
      return this;
   }

   public ath a(String... $$0) {
      this.g.addAll(Arrays.asList($$0));
      return this;
   }

   public atg a(atb $$0) {
      return new atg($$0, this.f, Set.copyOf(this.g), a(this.d), af.a(ate.class, $$0x -> a(this.e.getOrDefault($$0x, Set.of()))));
   }

   private static List<Path> a(Collection<Path> $$0) {
      List<Path> $$1 = new ArrayList<>($$0);
      Collections.reverse($$1);
      return List.copyOf($$1);
   }
}

import com.google.common.base.Charsets;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import org.slf4j.Logger;

public class flm {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 50;
   private static final String c = "command_history.txt";
   private final Path d;
   private final ayh<String> e = new ayh<>(50);

   public flm(Path $$0) {
      this.d = $$0.resolve("command_history.txt");
      if (Files.exists(this.d)) {
         try (BufferedReader $$1 = Files.newBufferedReader(this.d, Charsets.UTF_8)) {
            this.e.addAll($$1.lines().toList());
         } catch (Exception var7) {
            a.error("Failed to read {}, command history will be missing", "command_history.txt", var7);
         }
      }
   }

   public void a(String $$0) {
      if (!$$0.equals(this.e.peekLast())) {
         if (this.e.size() >= 50) {
            this.e.removeFirst();
         }

         this.e.addLast($$0);
         this.b();
      }
   }

   private void b() {
      try (BufferedWriter $$0 = Files.newBufferedWriter(this.d, Charsets.UTF_8)) {
         for (String $$1 : this.e) {
            $$0.write($$1);
            $$0.newLine();
         }
      } catch (IOException var6) {
         a.error("Failed to write {}, command history will be missing", "command_history.txt", var6);
      }
   }

   public Collection<String> a() {
      return this.e;
   }
}

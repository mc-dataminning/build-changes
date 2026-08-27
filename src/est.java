import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public enum est {
   a("icons"),
   b("icons", "snapshot");

   private final String[] c;

   private est(String... $$0) {
      this.c = $$0;
   }

   public List<asg<InputStream>> a(ara $$0) throws IOException {
      return List.of(
         this.a($$0, "icon_16x16.png"),
         this.a($$0, "icon_32x32.png"),
         this.a($$0, "icon_48x48.png"),
         this.a($$0, "icon_128x128.png"),
         this.a($$0, "icon_256x256.png")
      );
   }

   public asg<InputStream> b(ara $$0) throws IOException {
      return this.a($$0, "minecraft.icns");
   }

   private asg<InputStream> a(ara $$0, String $$1) throws IOException {
      String[] $$2 = (String[])ArrayUtils.add(this.c, $$1);
      asg<InputStream> $$3 = $$0.a($$2);
      if ($$3 == null) {
         throw new FileNotFoundException(String.join("/", $$2));
      } else {
         return $$3;
      }
   }
}

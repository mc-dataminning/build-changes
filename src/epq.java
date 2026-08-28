import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Map;
import java.util.function.BiFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epq {
   private static final Logger a = LogUtils.getLogger();
   private final Map<String, epc> b = Maps.newHashMap();
   private final DataFixer c;
   private final jk.a d;
   private final File e;

   public epq(File $$0, DataFixer $$1, jk.a $$2) {
      this.c = $$1;
      this.e = $$0;
      this.d = $$2;
   }

   private File a(String $$0) {
      return new File(this.e, $$0 + ".dat");
   }

   public <T extends epc> T a(epc.a<T> $$0, String $$1) {
      T $$2 = this.b($$0, $$1);
      if ($$2 != null) {
         return $$2;
      } else {
         T $$3 = (T)$$0.a().get();
         this.a($$1, $$3);
         return $$3;
      }
   }

   @Nullable
   public <T extends epc> T b(epc.a<T> $$0, String $$1) {
      epc $$2 = this.b.get($$1);
      if ($$2 == null && !this.b.containsKey($$1)) {
         $$2 = this.a($$0.b(), $$0.c(), $$1);
         this.b.put($$1, $$2);
      }

      return (T)$$2;
   }

   @Nullable
   private <T extends epc> T a(BiFunction<us, jk.a, T> $$0, bag $$1, String $$2) {
      try {
         File $$3 = this.a($$2);
         if ($$3.exists()) {
            us $$4 = this.a($$2, $$1, aa.b().d().c());
            return $$0.apply($$4.p("data"), this.d);
         }
      } catch (Exception var6) {
         a.error("Error loading saved data: {}", $$2, var6);
      }

      return null;
   }

   public void a(String $$0, epc $$1) {
      this.b.put($$0, $$1);
   }

   public us a(String $$0, bag $$1, int $$2) throws IOException {
      File $$3 = this.a($$0);

      us var9;
      try (
         InputStream $$4 = new FileInputStream($$3);
         PushbackInputStream $$5 = new PushbackInputStream(new ayi($$4), 2);
      ) {
         us $$6;
         if (this.a($$5)) {
            $$6 = vf.a($$5, vb.a());
         } else {
            try (DataInputStream $$7 = new DataInputStream($$5)) {
               $$6 = vf.a($$7);
            }
         }

         int $$10 = vh.b($$6, 1343);
         var9 = $$1.a(this.c, $$6, $$10, $$2);
      }

      return var9;
   }

   private boolean a(PushbackInputStream $$0) throws IOException {
      byte[] $$1 = new byte[2];
      boolean $$2 = false;
      int $$3 = $$0.read($$1, 0, 2);
      if ($$3 == 2) {
         int $$4 = ($$1[1] & 255) << 8 | $$1[0] & 255;
         if ($$4 == 35615) {
            $$2 = true;
         }
      }

      if ($$3 != 0) {
         $$0.unread($$1, 0, $$3);
      }

      return $$2;
   }

   public void a() {
      this.b.forEach(($$0, $$1) -> {
         if ($$1 != null) {
            $$1.a(this.a($$0), this.d);
         }
      });
   }
}

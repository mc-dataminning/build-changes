import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dpj implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dpi> c = new Long2ObjectLinkedOpenHashMap();
   private final Path d;
   private final boolean e;

   dpj(Path $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private dpi b(cvl $$0) throws IOException {
      long $$1 = cvl.c($$0.h(), $$0.i());
      dpi $$2 = (dpi)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dpi)this.c.removeLast()).close();
         }

         v.c(this.d);
         Path $$3 = this.d.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dpi $$4 = new dpi($$3, this.d, this.e);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public sy a(cvl $$0) throws IOException {
      dpi $$1 = this.b($$0);

      sy var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = tl.a($$2);
      }

      return var4;
   }

   public void a(cvl $$0, ts $$1) throws IOException {
      dpi $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            tl.a((DataInput)$$3, $$1, th.a());
         }
      }
   }

   protected void a(cvl $$0, @Nullable sy $$1) throws IOException {
      dpi $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            tl.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      avt<IOException> $$0 = new avt<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dpi $$1 = (dpi)var2.next();

         try {
            $$1.close();
         } catch (IOException var5) {
            $$0.a(var5);
         }
      }

      $$0.a();
   }

   public void a() throws IOException {
      ObjectIterator var1 = this.c.values().iterator();

      while (var1.hasNext()) {
         dpi $$0 = (dpi)var1.next();
         $$0.b();
      }
   }
}

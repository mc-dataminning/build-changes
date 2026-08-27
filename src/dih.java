import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dih implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dig> c = new Long2ObjectLinkedOpenHashMap();
   private final Path d;
   private final boolean e;

   dih(Path $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private dig b(cox $$0) throws IOException {
      long $$1 = cox.c($$0.h(), $$0.i());
      dig $$2 = (dig)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dig)this.c.removeLast()).close();
         }

         v.c(this.d);
         Path $$3 = this.d.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dig $$4 = new dig($$3, this.d, this.e);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public qu a(cox $$0) throws IOException {
      dig $$1 = this.b($$0);

      qu var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = re.a((DataInput)$$2);
      }

      return var4;
   }

   public void a(cox $$0, rk $$1) throws IOException {
      dig $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            re.a((DataInput)$$3, $$1);
         }
      }
   }

   protected void a(cox $$0, @Nullable qu $$1) throws IOException {
      dig $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            re.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      ara<IOException> $$0 = new ara<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dig $$1 = (dig)var2.next();

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
         dig $$0 = (dig)var1.next();
         $$0.a();
      }
   }
}

import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class doo implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<don> c = new Long2ObjectLinkedOpenHashMap();
   private final Path d;
   private final boolean e;

   doo(Path $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private don b(cuy $$0) throws IOException {
      long $$1 = cuy.c($$0.h(), $$0.i());
      don $$2 = (don)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((don)this.c.removeLast()).close();
         }

         v.c(this.d);
         Path $$3 = this.d.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         don $$4 = new don($$3, this.d, this.e);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public sw a(cuy $$0) throws IOException {
      don $$1 = this.b($$0);

      sw var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = tj.a($$2);
      }

      return var4;
   }

   public void a(cuy $$0, tq $$1) throws IOException {
      don $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            tj.a((DataInput)$$3, $$1, tf.a());
         }
      }
   }

   protected void a(cuy $$0, @Nullable sw $$1) throws IOException {
      don $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            tj.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      avp<IOException> $$0 = new avp<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         don $$1 = (don)var2.next();

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
         don $$0 = (don)var1.next();
         $$0.b();
      }
   }
}

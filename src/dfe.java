import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dfe implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dfd> c = new Long2ObjectLinkedOpenHashMap();
   private final Path d;
   private final boolean e;

   dfe(Path $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private dfd b(clt $$0) throws IOException {
      long $$1 = clt.c($$0.h(), $$0.i());
      dfd $$2 = (dfd)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dfd)this.c.removeLast()).close();
         }

         v.c(this.d);
         Path $$3 = this.d.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dfd $$4 = new dfd($$3, this.d, this.e);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public qr a(clt $$0) throws IOException {
      dfd $$1 = this.b($$0);

      qr var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = rb.a((DataInput)$$2);
      }

      return var4;
   }

   public void a(clt $$0, rh $$1) throws IOException {
      dfd $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            rb.a((DataInput)$$3, $$1);
         }
      }
   }

   protected void a(clt $$0, @Nullable qr $$1) throws IOException {
      dfd $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            rb.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      aoh<IOException> $$0 = new aoh<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dfd $$1 = (dfd)var2.next();

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
         dfd $$0 = (dfd)var1.next();
         $$0.a();
      }
   }
}

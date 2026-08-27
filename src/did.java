import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class did implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dic> c = new Long2ObjectLinkedOpenHashMap();
   private final Path d;
   private final boolean e;

   did(Path $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private dic b(cot $$0) throws IOException {
      long $$1 = cot.c($$0.h(), $$0.i());
      dic $$2 = (dic)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dic)this.c.removeLast()).close();
         }

         v.c(this.d);
         Path $$3 = this.d.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dic $$4 = new dic($$3, this.d, this.e);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public qr a(cot $$0) throws IOException {
      dic $$1 = this.b($$0);

      qr var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = rb.a((DataInput)$$2);
      }

      return var4;
   }

   public void a(cot $$0, rh $$1) throws IOException {
      dic $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            rb.a((DataInput)$$3, $$1);
         }
      }
   }

   protected void a(cot $$0, @Nullable qr $$1) throws IOException {
      dic $$2 = this.b($$0);
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
      aqx<IOException> $$0 = new aqx<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dic $$1 = (dic)var2.next();

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
         dic $$0 = (dic)var1.next();
         $$0.a();
      }
   }
}

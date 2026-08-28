import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dvy implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dvx> c = new Long2ObjectLinkedOpenHashMap();
   private final dwa d;
   private final Path e;
   private final boolean f;

   dvy(dwa $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private dvx b(dbn $$0) throws IOException {
      long $$1 = dbn.c($$0.h(), $$0.i());
      dvx $$2 = (dvx)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dvx)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dvx $$4 = new dvx(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public tx a(dbn $$0) throws IOException {
      dvx $$1 = this.b($$0);

      tx var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = uk.a($$2);
      }

      return var4;
   }

   public void a(dbn $$0, ur $$1) throws IOException {
      dvx $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            uk.a((DataInput)$$3, $$1, ug.a());
         }
      }
   }

   protected void a(dbn $$0, @Nullable tx $$1) throws IOException {
      dvx $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            uk.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      axn<IOException> $$0 = new axn<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dvx $$1 = (dvx)var2.next();

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
         dvx $$0 = (dvx)var1.next();
         $$0.b();
      }
   }
}

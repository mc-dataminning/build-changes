import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dvr implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dvq> c = new Long2ObjectLinkedOpenHashMap();
   private final dvt d;
   private final Path e;
   private final boolean f;

   dvr(dvt $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private dvq b(dbk $$0) throws IOException {
      long $$1 = dbk.c($$0.h(), $$0.i());
      dvq $$2 = (dvq)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dvq)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dvq $$4 = new dvq(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public tx a(dbk $$0) throws IOException {
      dvq $$1 = this.b($$0);

      tx var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = uk.a($$2);
      }

      return var4;
   }

   public void a(dbk $$0, ur $$1) throws IOException {
      dvq $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            uk.a((DataInput)$$3, $$1, ug.a());
         }
      }
   }

   protected void a(dbk $$0, @Nullable tx $$1) throws IOException {
      dvq $$2 = this.b($$0);
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
      axl<IOException> $$0 = new axl<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dvq $$1 = (dvq)var2.next();

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
         dvq $$0 = (dvq)var1.next();
         $$0.b();
      }
   }
}

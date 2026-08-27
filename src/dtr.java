import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dtr implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dtq> c = new Long2ObjectLinkedOpenHashMap();
   private final dtt d;
   private final Path e;
   private final boolean f;

   dtr(dtt $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private dtq b(czk $$0) throws IOException {
      long $$1 = czk.c($$0.h(), $$0.i());
      dtq $$2 = (dtq)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dtq)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dtq $$4 = new dtq(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public ua a(czk $$0) throws IOException {
      dtq $$1 = this.b($$0);

      ua var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = un.a($$2);
      }

      return var4;
   }

   public void a(czk $$0, uu $$1) throws IOException {
      dtq $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            un.a((DataInput)$$3, $$1, uj.a());
         }
      }
   }

   protected void a(czk $$0, @Nullable ua $$1) throws IOException {
      dtq $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            un.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      axg<IOException> $$0 = new axg<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dtq $$1 = (dtq)var2.next();

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
         dtq $$0 = (dtq)var1.next();
         $$0.b();
      }
   }
}

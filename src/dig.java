import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dig implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dif> c = new Long2ObjectLinkedOpenHashMap();
   private final Path d;
   private final boolean e;

   dig(Path $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private dif b(cpi $$0) throws IOException {
      long $$1 = cpi.c($$0.h(), $$0.i());
      dif $$2 = (dif)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dif)this.c.removeLast()).close();
         }

         v.c(this.d);
         Path $$3 = this.d.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dif $$4 = new dif($$3, this.d, this.e);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public qw a(cpi $$0) throws IOException {
      dif $$1 = this.b($$0);

      qw var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = rh.a((DataInput)$$2);
      }

      return var4;
   }

   public void a(cpi $$0, rn $$1) throws IOException {
      dif $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            rh.a((DataInput)$$3, $$1, rf.a());
         }
      }
   }

   protected void a(cpi $$0, @Nullable qw $$1) throws IOException {
      dif $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            rh.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      ari<IOException> $$0 = new ari<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dif $$1 = (dif)var2.next();

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
         dif $$0 = (dif)var1.next();
         $$0.a();
      }
   }
}
